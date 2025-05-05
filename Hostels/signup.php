<?php
// Connect to the database
$servername = "localhost";  // Server name (if running locally)
$username = "root";  // MySQL username
$password = "";  // MySQL password
$dbname = "hostel_system";  // Database name

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    // Get form data
    $student_number = $_POST['student_number'];
    $last_name = $_POST['last_name'];
    $first_name = $_POST['first_name'];
    $gender = $_POST['gender'];
    $college = $_POST['college'];
    $year_of_study = $_POST['year_of_study'];
    $intake = $_POST['intake'];
    $username = $_POST['username'];
    $email = $_POST['email'];
    $password = password_hash($_POST['password'], PASSWORD_BCRYPT); // Hash the password for security

    // Prepare the SQL statement
    $sql = "INSERT INTO users (student_number, last_name, first_name, gender, college, year_of_study, intake, username, email, password)
            VALUES ('$student_number', '$last_name', '$first_name', '$gender', '$college', '$year_of_study', '$intake', '$username', '$email', '$password')";

    // Execute the query
    if ($conn->query($sql) === TRUE) {
        echo "Registration successful!";
    } else {
        echo "Error: " . $sql . "<br>" . $conn->error;
    }
}

// Close the connection
$conn->close();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hostel Management System - Sign Up</title>
    <link rel="stylesheet" href="style.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
</head>
<style>
   * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Roboto', sans-serif;
}

body {
    background-image: url('https://www.example.com/background-image.jpg');
    background-size: cover;
    background-position: center;
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
}

.container {
    background-color: rgba(255, 255, 255, 0.8);
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
    text-align: center;
    width: 650px;
}

.logo img {
    max-width: 100px;
    margin-bottom: 10px;
}

h2 {
    margin-bottom: 20px;
    font-size: 22px;
    color: #333;
}

form {
    display: flex;
    flex-wrap: wrap;
    justify-content: space-between;
}

.form-group {
    width: 100%;
    display: flex;
    justify-content: space-between;
    margin-bottom: 15px;
}

form input {
    width: 32%;
    padding: 10px;
    margin: 10px 0;
    border: 1px solid #ccc;
    border-radius: 5px;
}

form button {
    width: 100%;
    padding: 10px;
    background-color: #28a745;
    border: none;
    border-radius: 5px;
    color: white;
    font-size: 16px;
    cursor: pointer;
}

form button:hover {
    background-color: #218838;
}

</style>
<body>
    <div class="container"></div>
        <div class="signup-box">
            <div class="logo">
                <img src="download (1).png">
                <h2>Hostel Management System</h2>
            </div>
            <form action="signup.php" method="post">
        <input type="text" name="student_number" placeholder="Student Number" required><br>
        <input type="text" name="last_name" placeholder="Last Name" required><br>
        <input type="text" name="first_name" placeholder="First Name" required><br>
        <input type="text" name="gender" placeholder="Gender" required><br>
        <input type="text" name="college" placeholder="College" required><br>
        <input type="number" name="year_of_study" placeholder="Year of Study" required><br>
        <input type="text" name="intake" placeholder="Intake" required><br>
        <input type="text" name="username" placeholder="Username" required><br>
        <input type="email" name="email" placeholder="Email" required><br>
        <input type="password" name="password" placeholder="Password" required><br>
        <button type="submit">Sign Up</button>
    </form>
</body>
</html>

