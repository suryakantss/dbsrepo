import { useEffect, useState } from "react"
import { ProductService } from "../../services/productservice";
import { Link, Outlet } from "react-router";

export function Products(){
    let [products,setProducts] = useState([]);
    useEffect(()=>{
     getData();

    },[])
    function getData(){
        ProductService.getProducts().then(res=>{
            setProducts(res.data);
        }).catch(err=>{
            console.log(err);
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
                    {products.map(p => <tr key={p.id}><td><Link to={`details/${p.id}`}>{p.id}</Link></td><td>{p.name}</td><td>{p.price}</td></tr>)}
                </tbody>
            </table>
            <div>
                <Outlet></Outlet>
            </div>
        </div>
    )
}