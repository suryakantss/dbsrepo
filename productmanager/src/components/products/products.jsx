import { useEffect, useRef, useState } from "react"
import { ProductService } from "../../services/productservice";
import { Link, Outlet } from "react-router";

export function Products() {
    let [products, setProducts] = useState([]);
    let idref=useRef();
    let nameref=useRef();
    let priceref=useRef();
    
    useEffect(() => {
        getData();

    }, [])
    function getData() {
        ProductService.getProducts().then(res => {
            setProducts(res.data);
        }).catch(err => {
            console.log(err);
        });
    }
     function delProduct(id){
            ProductService.delProduct(id).then(res=>{
                alert(res.data.id + " deleted...");
                getData();
            }).catch(err=>{
                console.log(err);
            });
        }
    function addProduct(){
        let nproduct = {id:idref.current.value,name:nameref.current.value,price:priceref.current.value};
        ProductService.addProduct(nproduct).then(res=>{
            alert(res.data.name + " saved..");
            idref.current.value='';
            nameref.current.value='';
            priceref.current.value='';
            getData();
        }).catch(err=>{

        });

       

    }
    return (
        <div>
            <h3>Product Manager</h3>
            <table>
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Price</th>
                    </tr>
                </thead>
                <tbody>
                    {products.map(p => <tr key={p.id}><td><Link to={`details/${p.id}`}>{p.id}</Link><button onClick={()=>delProduct(p.id)}>X</button></td><td>{p.name}</td><td>{p.price}</td></tr>)}
                    <tr><th><input ref={idref}></input></th><th><input ref={nameref}></input></th><th><input ref={priceref}></input></th></tr>
                    <tr><th colSpan="3"><button onClick={addProduct}>Add</button></th></tr>
                </tbody>
            </table>
            <div>
                <Outlet></Outlet>
            </div>
        </div>
    )
}