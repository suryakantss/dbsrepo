async function add(a, b) {
    if (a < 0 || b < 0)
        throw new Error('Invalid Nos.');
    else
        return a + b;
}


add(10, -30).then((res) => {
    console.log(res);
}).catch((err) => {
    console.log(err);
});

console.log("Hello DBS!!!!");