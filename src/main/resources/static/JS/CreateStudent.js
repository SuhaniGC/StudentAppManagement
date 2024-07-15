function formValidation() {
    var Sname = document.getElementById("Sname");
    var Phnno = document.getElementById("Phnno");
    var Emailid = document.getElementById("Email");


    // Student Name validation
    if (Sname.value.trim() == "" || !isNaN(Sname.value)) {
        document.getElementById("Sname-error").innerHTML = "Please enter a valid student name";
        Sname.focus();
        return false;
    } else {
        document.getElementById("Sname-error").innerHTML = "";
    }

    // Mobile Number validation
    var phonePattern = /^[6-9]\d{9}$/;
    if (Phnno.value.trim() == "" || !phonePattern.test(Phnno.value)) {
        document.getElementById("Phnno-error").innerHTML = "Please enter a valid mobile number";
        Phnno.focus();
        return false;
    } else {
        document.getElementById("Phnno-error").innerHTML = "";
    }

    // Email Id validation
    var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
    if (Emailid.value.trim() == "" || !emailPattern.test(Emailid.value)) {
        document.getElementById("Emailid-error").innerHTML = "Please enter a valid email id";
        Emailid.focus();
        return false;
    } else {
        document.getElementById("Emailid-error").innerHTML = "";
    }

    return true;
}
