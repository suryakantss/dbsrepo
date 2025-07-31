
function Customer(name,email){
this.name=name;
this.email=email;
this.show = function(){
    console.log(this.name + ", " + this.email);
}
}

var customer = new Customer("Jai","jai@msn.com");
customer.show();
