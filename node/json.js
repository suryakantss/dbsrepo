
let product = {
    id:'P1',
    name:'Mouse',
    price : 500
};

let {id,price} = product;
console.log(id + ", " + price)

let nprod = {...product,price:400,stock:100};
console.log(nprod);