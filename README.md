# flights-rest-app

External company is providing data about competitor's fares.
Said company will be pushing the data to our application. We aggregate the data and at any given point, we
can see what are our competitors up to. Just by looking at the statistics.



-  **path ="/market/markets" method GET** - return overall statistics in form of json

-  **path ="/market" method POST** - pushes single competitor fare data to our application
     as json data 



# Run the application

- #### To run the application, execute:

```
    ./gradlew build && java -jar build/libs/demo-0.0.1-SNAPSHOT.jar
```
- #### If you are using Maven, execute:
```
    mvn package && java -jar target/demo-0.0.1-SNAPSHOT.jar
```

