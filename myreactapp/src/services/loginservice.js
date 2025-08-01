function checklogin(login,password){
    if(login =='James' && password=='Bond')
            return true;
        else
           return false;
}

export const LoginService = {checklogin};
