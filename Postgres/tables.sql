create table if not exists neighborhood(
    neighborhood_id serial PRIMARY KEY,
    zip integer NOT NULL,
    name varchar(200) NOT NULL
 );
 create table agent(
    agent_id serial PRIMARY KEY,
    name varchar(200) NOT NULL,
    agency varchar(200) NOT NULL

);
CREATE TABLE IF NOT EXISTS login_creds(
    login_id serial PRIMARY KEY,
    agent_id integer references agent(agent_id),
    password varchar(200) NOT NULL,
    username varchar(200) NOT NULL
);

create table  school(
    name varchar(200) NOT NULL,
    neighborhood integer references neighborhood(neighborhood_id),
    address varchar(200) NOT NULL,
    school_id serial PRIMARY KEY
 );



create table if not exists home(
    home_id serial PRIMARY KEY,
    address varchar(200) NOT NULL,
      floors integer,
      sqft integer,
      neghborhood integer references neighborhood(neighborhood_id),
      school integer references school(school_id),
      agent integer references agent(agent_id),
      price integer NOT NULL
);
