//Create and uses books-db
db = db.getSiblingDB('library-db')
//Create and add to books collection
db.books.insertMany([
  { title: "Book1", author: "Author1" },
  { title: "Book8", author: "Author5" },
  { title: "Book9", author: "Author4" }
])

//Create and add loans collection
db.loans.insertMany([
    { user: "User1", title: "Book9" },
    { user: "User4", title: "Book8" },
    { user: "User6", title: "Book1" }
])


