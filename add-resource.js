const BASE_URL = "http://localhost:8080/resources";

document.querySelector('form').addEventListener('submit', function (e) {
  e.preventDefault();

  // Get form values
  const name = document.getElementById('name').value.trim();
  const type = document.getElementById('type').value.trim();
  const quantity = document.getElementById('quantity').value.trim();
  const description = document.getElementById('description').value.trim();

  // Build JSON data
  const resourceData = {
    name: name,
    type: type,
    quantity: quantity,
    description: description
  };

  // Send POST request
  fetch(`${BASE_URL}/add`, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(resourceData)
  })
    .then(res => res.text())
    .then(text => {
      if (text.includes("successfully")) {
        alert("✅ Resource added successfully!");
         window.location.href = "View Resourses.html";
        document.querySelector('form').reset();
       
      } else {
        alert("⚠️ " + text);
      }
    })
    .catch(() => {
      alert("🚫 Something went wrong. Please try again.");
    });
});
