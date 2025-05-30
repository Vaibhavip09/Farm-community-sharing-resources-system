const BASE_URL = "http://localhost:8080/api";

document.querySelector('form').addEventListener('submit', function(e) {
  e.preventDefault();

  const username = document.getElementById('username').value.trim();
  const password = document.getElementById('password').value.trim();

  fetch(`${BASE_URL}/login`, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ username, password })
  })
  .then(res => res.text())
  .then(text => {
    if (text === "Login Successful!") {
      alert("Login Successful!");
       window.location.href = "Home.html";
    } else {
      alert("Invalid credentials");
    }
  })
  .catch(() => {
    alert("🚫 Something went wrong. Please try again.");
  });
});
