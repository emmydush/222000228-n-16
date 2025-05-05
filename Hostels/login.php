<?php
// Connect to the database
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "hostel_system";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $username = $_POST['username'];
    $password = $_POST['password'];

    // Prepare and execute the query
    $sql = "SELECT * FROM users WHERE username = '$username' OR email = '$username'";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        // Fetch the user data
        $user = $result->fetch_assoc();
        // Verify the password
        if (password_verify($password, $user['password'])) {
            echo "Login successful!";
            // Redirect the user to a protected page
            // header("Location: dashboard.php");
        } else {
            echo "Invalid password!";
        }
    } else {
        echo "No user found with that username or email!";
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
    <title>Hostel Management System - Login</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <div class="login-box">
            <div class="logo">
                <img src="download.png" alt="">
                <h2>Hostel Management System</h2>
            </div>
            <form>
                <form action="login.php" method="post">
                    <input type="text" name="username" placeholder="Username or Email" required><br>
                    <input type="password" name="password" placeholder="Password" required><br>
                    <button type="submit">Login</button>
                </form>
                    <a href="#">Forget Password</a>
                </div>
                <div class="signup-link">
                    <p>Need an account? <a href="signup.html">Sign up!</a></p> <!-- Link to Sign Up Page -->
                </div>
            </form>
        </div>
    </div>
</body>
</html>

