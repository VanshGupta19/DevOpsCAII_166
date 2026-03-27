function validateForm() {

    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();
    let mobile = document.getElementById("mobile").value.trim();
    let department = document.getElementById("department").value;
    let feedback = document.getElementById("feedback").value.trim();
    let gender = document.querySelector('input[name="gender"]:checked');
    let error = document.getElementById("error");

    error.innerHTML = "";

    // Name validation
    if (name === "") {
        error.innerHTML = "Name cannot be empty";
        return false;
    }

    // Email validation
    let emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
    if (!email.match(emailPattern)) {
        error.innerHTML = "Invalid Email format";
        return false;
    }

    // Mobile validation
    if (!/^[0-9]{10}$/.test(mobile)) {
        error.innerHTML = "Mobile must be 10 digits";
        return false;
    }

    // Gender validation
    if (!gender) {
        error.innerHTML = "Please select gender";
        return false;
    }

    // Department validation
    if (department === "") {
        error.innerHTML = "Please select department";
        return false;
    }

    // Feedback validation (minimum 10 words)
    let wordCount = feedback.split(/\s+/).length;
    if (feedback === "" || wordCount < 10) {
        error.innerHTML = "Feedback must contain at least 10 words";
        return false;
    }

    alert("Form submitted successfully!");
    return true;
}