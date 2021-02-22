#This is the setup for the postgres image. We place out .sql file into the
#script startup


FROM postgres
COPY tables.sql ./docker-entrypoint-initdb.d
EXPOSE 5432