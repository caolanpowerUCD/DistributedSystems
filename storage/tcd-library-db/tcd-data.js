//Create and uses books-db
db = db.getSiblingDB('library-db')
//Create and add to books collection
db.books.insertMany([
  { title: "Book1", author: "Author1" },
  { title: "Book2", author: "Author1" },
  { title: "Book6", author: "Author3" },
  { title: "Book7", author: "Author4" },
  { title: "Book8", author: "Author5" }
])

db.loans.insertMany([
    { user: "User1", title: "Book1" },
    { user: "User4", title: "Book6" },
    { user: "User5", title: "Book7" }
])


