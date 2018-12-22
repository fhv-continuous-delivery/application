# Application
Generated application with additional custom code for the business logic

# Build
## Local build
Run the following maven command to build the artifact locally:

```
mvn install
```

## Remote build
Travis CI app is used to build the application. The build needs the following environment variables set in order to work:
* TRAVIS_GITHUB_TOKEN: This token is used to update the documentation of the project
