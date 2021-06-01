// db.getSiblingDB () is equivalent to use 'library-db;'
db.getSiblingDB('library-db')
  .createUser({
    user: 'user',
    pwd: 'user',
    roles: ['readWrite']
  });
