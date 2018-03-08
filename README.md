# java-getting-started

[![CircleCI](https://circleci.com/gh/heroku/java-getting-started.svg?style=svg)](https://circleci.com/gh/heroku/java-getting-started)

A barebones Java app, which can easily be deployed to Heroku.

This application supports the [Getting Started with Java on Heroku](https://devcenter.heroku.com/articles/getting-started-with-java) article - check it out.

[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

## Running Locally

Make sure you have Java and Maven installed.  Also, install the [Heroku CLI](https://cli.heroku.com/).

```sh
$ git clone https://github.com/heroku/java-getting-started.git
$ cd java-getting-started
$ mvn install
$ heroku local:start
```

Your app should now be running on [localhost:5000](http://localhost:5000/).

If you're going to use a database, ensure you have a local `.env` file that reads something like this:

```
DATABASE_URL=postgres://localhost:5432/java_database_name
```

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

## Documentation

For more information about using Java on Heroku, see these Dev Center articles:

- [Java on Heroku](https://devcenter.heroku.com/categories/java)

## Instruction:(setting the site up in a local Environment)
- git clone https://github.com/msaAbabneh/Task.git
- cd Task
- mvn clean install
- heroku local web

Your app should now be running on http://localhost:5000/


## Environment Comments: 

- TO Add new searchable field dynamically ,  add it's name and label in the    	serchableFields.properties and increment the NUMBER_OF_FIELDS in the same 	file by 1.

- The Application was built and deployed by Travis-ci.

- After every commit the Travis-ci will get the source code and build 
  it and deploy it on the HEROKU based on the .travis.yml file content.


- The system is built as a simple site.

- The validation on the client input didn't considered.


 