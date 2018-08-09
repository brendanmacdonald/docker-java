# Dependencies

### Java
Java v1.7 is required.

##INITIAL SET-UP
1. Clone this repository
2. Open in an IDE
3. Start the selenium hub with 2 nodes via Docker
The -d is optional - without it you will see the grid/node outputs in the terminal window
```
docker-compose -f docker-compose.yml up -d
```
4. Execute the tests
'''
mvn clean test
'''
5. Stop docker
```
docker-compose stop
```
