import Axios from "axios";
function getUsers() {
    let url = 'https://jsonplaceholder.typicode.com/users';
    return Axios.get(url);
}
export const UsersService = { getUsers };


