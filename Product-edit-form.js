import ProductController from './ProductController.js';

const currentProducts = new ProductController();
console.log(currentProducts.getproducts());

let currentProductList = JSON.parse(localStorage.getItem("products"));
//console.log(currentProductList)
for (let i = 0; i < currentProductList.length; i++){
//    console.log(typeof currentProductList[i])
//    console.log(Object.keys(currentProductList[i]))
}
let id = (id) => document.getElementById(id);

let productId = id("productId"),
    productname = id("productName"),
    price = id("price"),
    description = id("productDescription"),
    img = id("img"),
    editform = id("edit-form")
const productIdvalue = parseInt(productId.value);

editform.addEventListener("submit", (e) => {
  e.preventDefault();
//  for (let i = 0; i < currentProductList.length; i++){
//    if (productId === currentProductList[i]){
//        edit(productname.value, price.value, description.value, img.value);
//        window.location.href = "./products.html";
//    }
   edit(productId.value, productname.value, price.value, description.value, img.value);
   window.location.href = "./products.html";
 });

//const formData = new FormData();
//
//formData.append('productname', 'new name 113');
//formData.append('productprice', '3');
//formData.append('productdescription', 'some desc 113');
//formData.append('productImageURL', 'hhtp://');
//
//formData.append('productId', '113');

function edit(productId, productname, productprice, productdescription, productImageURL) {
  const data = {productId: productIdvalue, name : productname, price: productprice, description: productdescription, image: productImageURL};
  fetch('http://localhost:8080/update/${productId}', {
        method:'PUT',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data)
    })
    .then(response => response.json())
    .then(data => {
        console.log('Success:', data);
    })
    .catch((error) => {
        console.log('Error:', error);
    });
}



