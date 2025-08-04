import { useEffect, useState } from "react";
import './users.css';
import { UsersService } from "../services/usersservice";

export default function Users() {
    let [users, setUsers] = useState([]);
    useEffect(() => {
     getData();
     console.log("data fetched....")
    }, []);

    function getData() {
       UsersService.getUsers().then(u=>{
        setUsers(u.data);
       }).catch(err=>{
            console.log(err);
       });
       
    }

    return (
        <div>
            <h3>Users Data</h3>
            <table>
                <thead>
                    <tr><th>Id</th><th>Name</th><th>Username</th><th>Email</th></tr>
                </thead>
                <tbody>
                    {users.map(u => <tr key={u.id}><td>{u.id}</td><td>{u.name}</td><td>{u.username}</td><td>{u.email}</td></tr>)}
                </tbody>
            </table>

        </div>
    )
}