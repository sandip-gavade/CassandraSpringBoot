# CassandraSpringBoot
First SpringBoot Cassandra project


cqlsh>
create keyspace springbootcassandra with replication={'class':'SimpleStrategy','replication_factor':1};

use springbootcassandra

CREATE TABLE user (
id int PRIMARY KEY,
name text,
address text,
age int
);
