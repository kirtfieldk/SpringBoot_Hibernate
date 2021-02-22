create table if not exists neighborhood(
    neighborhood_id serial PRIMARY KEY,
    zip integer,
    name varchar(200));
create table  school(
    name varchar(200),
    neighborhood integer references neighborhood(neighborhood_id),
    address varchar(200),
    school_id serial PRIMARY KEY
 );


create table agent(
    agent_id serial PRIMARY KEY,
    name varchar(200),
    agency varchar(200),
    neighborhood integer references neighborhood(neighborhood_id)
);

create table if not exists home(
    home_id serial PRIMARY KEY,
    address varchar(200),
      floors integer,
      sqft integer,
      neghborhood integer references neighborhood(neighborhood_id),
      school integer references school(school_id),
      agent integer references agent(agent_id),
      price integer
);
