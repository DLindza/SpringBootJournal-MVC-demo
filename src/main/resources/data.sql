#this is a Hibernate feature and has nothing to do with Spring Boot
#a file named import.sql in the root of the classpath will be executed on startup.
# This can be useful for demos and for testing if you are careful,
# but probably not something you want to be on the classpath in production.

--USERS IN JOURNAL
INSERT INTO ACCOUNT(account_name, password) VALUES('springboot', 'isawesome');
INSERT INTO ACCOUNT(account_name, password) VALUES('springsecurity', 'isawesometoo');

--JOURNAL DATA
INSERT INTO ENTRY (title,summary,created) VALUES ('Get to know Spring Boot', 'Today I will learn Spring Boot', ' 2016-10-30 00:00:00.00');
INSERT INTO ENTRY (title,summary,created) VALUES ('Simple Spring Boot Project', 'I will do my first Spring Boot project', ' 2016-10-30 00:00:00.00');
INSERT INTO ENTRY (title,summary,created) VALUES ('Spring Boot Reading', 'Read more About Spring Boot', ' 2016-10-30 00:00:00.00');
INSERT INTO ENTRY (title,summary,created) VALUES ('Spring Boot in the Cloud', 'Learn Spring Boot using Cloud Foundry', ' 2016-10-30 00:00:00.00');