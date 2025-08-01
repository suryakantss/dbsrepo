function add(a, b) {
    let p = new Promise((resolve, reject) => {
        if (a < 0 || b < 0)
            reject('Neg. # not allowed..');
        else
            resolve(a + b);
    });
    return p;
}

add(10, -30).then((res) => {
    console.log(res);
}).catch((err) => {
    console.log(err);
});

console.log('Happy Learning!!!!');

