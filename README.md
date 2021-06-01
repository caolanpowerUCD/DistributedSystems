For looking into mongodb and checking what is stored.
Run docker-compose up -d
Go into Docker Dashboard, and find the containers.
When you hover over the container (ie. books-mongo) You will be able to access the CLI.
From there write:
mongo -u user -p user --authenticationDatabase admin

Within the mongo command, you can see all of the dbs, with show dbs.
To find all entires in books:
    use books-db
    show collections        - will show books.
    db.books.find()


