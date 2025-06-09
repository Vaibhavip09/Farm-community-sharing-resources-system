const apiBase = "http://localhost:8080/join";

function fetchJoinRequests() {
  fetch(`${apiBase}/all`)
    .then(response => response.json())
    .then(data => {
      const table = document.getElementById("requestsTable");
      table.innerHTML = ""; // Clear old data

      data.forEach(request => {
        const row = document.createElement("tr");

        row.innerHTML = `
          <td>${request.fullName}</td>
          <td>${request.email}</td>
          <td>${request.phone}</td>
          <td>${request.message}</td>
          <td>${request.status}</td>
          <td>
            <button class="approve" onclick="updateStatus(${request.id}, 'Approved')">Approve</button>
            <button class="reject" onclick="updateStatus(${request.id}, 'Rejected')">Reject</button>
            <button class="delete" onclick="deleteRequest(${request.id})">Delete</button>
          </td>
        `;

        table.appendChild(row);
      });
    })
    .catch(error => {
      console.error("Error fetching join requests:", error);
    });
}

function updateStatus(id, status) {
  fetch(`${apiBase}/update-status?id=${id}&status=${status}`, {
    method: "PUT"
  })
    .then(response => response.json())
    .then(data => {
      alert(`Status updated to ${status}`);
      fetchJoinRequests();
    })
    .catch(error => {
      console.error("Error updating status:", error);
    });
}

function deleteRequest(id) {
  if (confirm("Are you sure you want to delete this request?")) {
    fetch(`${apiBase}/delete/${id}`, {
      method: "DELETE"
    })
      .then(() => {
        alert("Request deleted.");
        fetchJoinRequests();
      })
      .catch(error => {
        console.error("Error deleting request:", error);
      });
  }
}

// Load data on page load
document.addEventListener("DOMContentLoaded", fetchJoinRequests);
