function add(a,b,cb){
    //async - non blocking
    setTimeout(()=>{
        cb(a+b);
    },3000);
}

function sq(n,callback) {
     callback(n*n);
}

add(10,20,(res)=>{
console.log(res);
});
console.log("Hello DBS!!!!!");

sq(10,(res)=> console.log(res));
