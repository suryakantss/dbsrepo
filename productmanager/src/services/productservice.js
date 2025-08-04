import  Axios  from "axios";
let url="http://localhost:8080/products";
function getProducts(){
    return Axios.get(url);
}

function getProductsById(id){
    return Axios.get(url+"/"+id);
}

function addProduct(product){
    return Axios.post(url,product);
}


export const ProductService = {getProducts,getProductsById,addProduct};

