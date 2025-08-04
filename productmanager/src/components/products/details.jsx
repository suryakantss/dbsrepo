import { useEffect, useState } from "react";
import { useParams } from "react-router"
import { ProductService } from "../../services/productservice";

export function Details() {
    let params = useParams();
    let [product, setProduct] = useState({});
    useEffect(() => {
        ProductService.getProductsById(params.id).then(res => {
          
            setProduct(res.data);
        }).catch(err => {
            console.log(err);
        });

    }, [params.id])

    return (
        <div>
            <h4>Details : {params.id}</h4>
            <hr></hr>
            <h3>Id: {product.id}</h3>
            <h3>Name: {product.name}</h3>
            <h3>Price: {product.price}</h3>
        </div>
    )
}