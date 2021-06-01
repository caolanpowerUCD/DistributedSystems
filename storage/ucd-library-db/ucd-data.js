//Create and uses books-db
db = db.getSiblingDB('library-db')
//Create and add to books collection
db.books.insertMany([
  { title: "Book1", author: "Author1" },
  { title: "Book2", author: "Author1" },
  { title: "Book3", author: "Author2" },
  { title: "Book4", author: "Author2" },
  { title: "Book5", author: "Author3" }
])


//Create and add loans collection
db.loans.insertMany([
    { user: "User1", title: "Book1" },
    { user: "User2", title: "Book2" },
    { user: "User3", title: "Book3" }
])


