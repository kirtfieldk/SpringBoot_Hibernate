## Homes Server

This RestAPI returns information on home's data that stored in a 
Postgres database. Uses `Hibernate` Framework. 


To start up use cmd `docker-compose up --build` to start up the postgres image
and the Spring server.


### Tables
- Neighborhood
- School -> many to one with Neighborhood
- Home -> many to one with Neighborhood, School, and Agent
- Agent 
`No home can be listed without and agent`
`All homes should be in a Neighborhood and school`

Contains Generic Database Object
```java
public class Database<T> {
    private SessionFactory factory;
    private Session session;
    public Database(SessionFactory factory){
        this.factory=factory;
    }
...
```

Each object has associated routes, Log in as agent and create 
neighborhoods, schools, and home listings!

