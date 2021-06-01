//Create and uses books-db
db = db.getSiblingDB('users-db')
db.users.insertMany([
    { name: "User1" },
    { name: "User2" },
    { name: "User3" }
])