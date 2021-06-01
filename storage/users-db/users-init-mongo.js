// db.getSiblingDB () is equivalent to 'use users-db;'
db.getSiblingDB('users-db')
  .createUser({
    user: 'user',
    pwd: 'user',
    roles: ['readWrite']
  });
