class Customer {
    constructor(name, email) {
        this.name = name;
        this.email = email;
    }
    show() {
        setTimeout(()=> {
        console.log(this.name + ", " + this.email);
        }, 3000);
    }
}
var customer = new Customer("jack","sparrow@msn.com");
customer.show();