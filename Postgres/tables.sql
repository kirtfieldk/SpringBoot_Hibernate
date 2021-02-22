create table if not exists school (name varchar(200), city varchar(200),
                    address varchar(200), id serial PRIMARY KEY );

create table if not exists neighborhood(id serial PRIMARY KEY, zip integer, name varchar(200));

create table if not exists home(
    id serial PRIMARY KEY,
    address varchar(200),
      floors integer,
      sqft integer,
      neghborhood integer references neighborhood(id),
      school integer references school(id),
      price integer
);