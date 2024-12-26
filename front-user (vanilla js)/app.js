const apiURL = "http://localhost:8080/frontUser";

// Input fields
const name = document.getElementById("createName");
const email = document.getElementById("createEmail");
const password = document.getElementById("createPassword");
const updateButton = document.getElementById("updateButton");
const createButton = document.getElementById("createButton");
const userList = document.getElementById("userList");

// Delete a user
async function deleteUser(id) {
  try {
    await fetch(`${apiURL}/${id}`, { method: "DELETE" });
    getUsers();
  } catch (error) {
    console.error("Error deleting user:", error);
  }
}

// Edit a user
async function editUser(id) {
  try {
    const response = await fetch(`${apiURL}/${id}`);
    const data = await response.json();

    name.value = data.name;
    email.value = data.email;
    password.value = data.password;

    updateButton.style.display = "inline-block";
    updateButton.onclick = () =>
      updateUser(id, name.value, email.value, password.value);
  } catch (error) {
    console.error("Error editing user:", error);
  }
}

// Fetch and display all users
async function getUsers() {
  try {
    const response = await fetch(apiURL);
    const users = await response.json();

    userList.innerHTML = "";
    users.forEach((user) => {
      userList.innerHTML += `
            <tr>
              <td>${user.id}</td>
              <td>${user.name}</td>
              <td>${user.email}</td>
              <td>${user.password}</td>
              <td>
                <button onclick="deleteUser(${user.id})">Delete</button>
                <button onclick="editUser(${user.id})">Edit</button>
              </td>
            </tr>`;
    });
  } catch (error) {
    console.error("Error fetching users:", error);
  }
}

// Create a new user
async function createUser(name, email, password) {
  try {
    const response = await fetch(apiURL, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ name, email, password }),
    });
    await response.json();
    getUsers();
    clearInputs();
  } catch (error) {
    console.error("Error creating user:", error);
  }
}

// Update a user
async function updateUser(id, name, email, password) {
  try {
    const updatedUser = { name, email, password };

    await fetch(`${apiURL}/${id}`, {
      method: "PUT",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(updatedUser),
    });

    getUsers();
    clearInputs();
    updateButton.style.display = "none";
  } catch (error) {
    console.error("Error updating user:", error);
  }
}

// Clear input fields
function clearInputs() {
  name.value = "";
  email.value = "";
  password.value = "";
}

// Event listeners
createButton.addEventListener("click", () => {
  const nameValue = name.value;
  const emailValue = email.value;
  const passwordValue = password.value;

  createUser(nameValue, emailValue, passwordValue);
});

// Initial fetch of users
getUsers();
