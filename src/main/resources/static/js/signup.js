var uname = document.getElementById("name");
var username = document.getElementById("username");
var password = document.getElementById("pass");
var confirmpassword = document.getElementById("passconfirm");
var phone = document.getElementById("phone");
var dob = document.getElementById("dob");
var blood = document.getElementById("blood");



var obj = {
    name : uname.value,
    username : username.value,
    password : password.value,
    phone : phone.value,
    dob : dob.value,
    blood : blood.value
};

fetch('http://localhost:8080/p',{
    method: "POST",
    headers: {
        "Content-type": "application/json"
    },
    body: JSON.stringify(obj)
});


function a(){
    console.log(name,username,password,confirmpassword,phone,dob,blood);
}
