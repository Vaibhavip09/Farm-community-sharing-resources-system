const BASE_URL = "http://localhost:8080/API";

document.querySelector('form').addEventListener('submit', function (e) {
  e.preventDefault();

  const username = document.getElementById('username').value.trim();
  const email = document.getElementById('email').value.trim();
  const password = document.getElementById('password').value.trim();
  const confirmPassword = document.getElementById('confirm-password').value.trim();

  if (password !== confirmPassword) {
    alert("❗ Passwords do not match.");
    return;
  }

  const userData = {
    username: username,
    email: email,
    password: password
  };

  fetch(`${BASE_URL}/Register`, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(userData)
  })
    .then(res => res.text())
    .then(text => {
      if (text === "Registration successful!") {
        alert("✅ Registration successful!");
        window.location.href = "login.html";
      } else {
        alert("⚠️ " + text);
      }
    })
    .catch(() => {
      alert("🚫 Something went wrong. Please try again.");
    });
});
