# JDBC-SpringDAO


# => JDBC :-
	= JDBC full form is Java Database Connectivity
	= JDBC is the technology by which we can integrate java application with database
	= JDBC is an API which contains pre-defined packages, classes and interfaces which helps to communicate with database
	= JDBC contains 2 main packages :-
		1. "java.sql"  package
		2. "javax.sql"  package

==================

# => How to declare packages in Java ?

Company : Smart Programming
Domain : www.smartprogramming.in

Client : ICICI Bank
Project Name : Loan
Modules : Car Loan, Home Loan, Education loan etc

-----------------------

in.smartprogramming.icicibank.loan.carloan
in.smartprogramming.icicibank.loan.homeloan
in.smartprogramming.icicibank.loan.educationloan


=============

# SQL Queries :-


=> CREATE DATABASE my_demo_db

=> SHOW DATABASES;

=> DROP DATABASE my_demo_db;

=> USE my_demo_db;

-------------------------

=> CREATE TABLE register(name VARCHAR(100), email VARCHAR(100), password VARCHAR(100), gender VARCHAR(100), city VARCHAR(100));

=> SHOW TABLES;

=> DESC register;

=> SELECT * FROM register;

=> INSERT INTO register VALUES('aaa', 'aaa@gmail.com' ,'aaa123', 'Female', 'Delhi');

=> UPDATE register SET name='Aa' WHERE email='aaa@gmail.com';

=> DELETE FROM register WHERE email='aaa@gmail.com';

====================


![image](https://github.com/Nishita-Maheshwari/JDBC-SpringDAO/assets/47790697/73a1e252-4740-46f5-b6c2-05fbc0df1250)


![image](https://github.com/Nishita-Maheshwari/JDBC-SpringDAO/assets/47790697/fe73aadd-b561-4c78-b8a5-6ff75116273f)















=> JDBC
	= Introduction
	= Programs (Select, Insert)
	= Programs (Update, Delete)
	= Development Level Coding
	= Task (BankApp)

=========================================================

=> CRUD Operations :-
	= C : Create
	= R : Read
	= U : Update
	= D : Delete

=========================================================

=> BankApp :-

----------------Welcome to SP Bank App--------------

Choose one option below :-
1. Admin Login
2. Customer Login
3. Exit

1

Enter Admin Email ID :
admin@gmail.com
Enter Admin Password :
admin12

-----------Invalid Admin Credentials----------

Choose one option below :-
1. Admin Login
2. Customer Login
3. Exit

1

Enter Admin Email ID :
admin@gmail.com
Enter Admin Password :
admin123

-------------Welcome Admin--------------

Choose one option below :-
1. Open Account
2. Close Account
3. Logout

1

Enter Customer Name :
deepak
Enter Customer Account No :
123456

-------------Invalid Account No. (account no should be of 10 digits)---------------

Enter Customer Account No :
1234567890
Enter Phone No :
9876543210
Enter Amount :
2000

------------Invalid funds (amount should be 5000rs or more)-----------------------

Enter Amount :
5000

--------------Account opened successfully------------------------------

Choose one option below :-
1. Open Account
2. Close Account
3. Logout

2

Enter Customer Account No :
1234567890

--------------Account closed successfully-----------------------

Choose one option below :-
1. Open Account
2. Close Account
3. Logout

3

Choose one option below :-
1. Admin Login
2. Customer Login
3. Exit
















# Exception Handling

try
{
	// risky code
}
catch(----)
{
	// handling code
}
finally
{
	// resource closing code
}

================

try(-; -; -; )
{

}
catch(----)
{

}

















# Spring DAO (Including JDBC)







#  Design Patterns (Singleton,Factory Method DAO)




# => Design Patterns :-
	-> Design Patterns are the strategies or say coding solutions to perform any task
	-> In design patterns we provide relationships or interactions between classes and objects in order to perform any particular task
	
	-> A book i.e. "Design Patterns : Elements of Reusable Object-Oriented Software" was written in 1994 and its best selling book for design patterns
	-> This book was written by 4 authors i.e. Erich Gamma, Ralph Johnson, John Vlissides and Richard Heml and they all 4 are known as Gang Of Four (GOF)
	-> They categorized all the design patterns into 3 parts :-
		1. Creational Design Patterns
		2. Structural Design Patterns
		3. Behavioral Design Patterns
		
-------------------------

# => Creational Design Patterns :-
	-> It provides the ways to instantiate single object or group of related objects
	-> There are 5 Creational Design Patterns :-
		1. Singleton Design Pattern
		2. Factory Method Design Pattern
		3. Abstract Factory Design Pattern
		4. Prototype Design Pattern
		5. Builder Design Pattern
		
		
# => Structural Design Patterns :-
	-> It provides a manner to define the relationship between classes and objects
	-> There are 7 types of Structural Design Patterns :-
		1. Adaptor Design Pattern
		2. Bridge Design Pattern
		3. Composite Design Pattern
		4. Decorator Design Pattern
		5. Facade Design Pattern
		6. Flyweight Design Pattern
		7. Proxy Design Pattern
		
		
# => Behavioral Design Patterns :-
	-> It defines the manner of communication between classes and objects
	-> There are 11 types of Behavioral Design Patterns :-
		1. Chain of Responsibility Design Pattern
		2. Command Design Pattern
		3. Interpreter Design Pattern
		4. Iterator Design Pattern
		5. Mediator Design Pattern
		6. Memento Design Pattern
		7. Observer Design Pattern
		8. State Design Pattern
		9. Strategy Design Pattern
		10. Template Method Design Pattern
		11. Visitor Design Pattern


# => Miscellaneous Design Patterns :-
	-> These are not defined in the above mentioned book
	-> Some examples are :-
		1. Dependency Injection Design Pattern
		2. DAO Design Pattern
		3. MVC Design Pattern
		   etc
		   
-----------------------------

# => For example 1 :-
	
	-> Requirement :-
		= We want to create a class for which one one instance or object should be created and that object can be used by all other classes
		
	-> Solution :-
		= For this we have to use Singleton Design Pattern
		
	-> There are 2 forms of Singleton Design Pattern :-
		1. Early Instantiation : instance is created at loading time
		2. Lazy Instantiation : instance is created when we have the requirement
		
	-> How to achieve Singleton Design Pattern :-
		1. Declare all the constructors as private
		2. Provide a static method that will return the class instance or static block
		3. The instance should be stored as a private static variable
		
	-> Advantage of Singleton Design Pattern :-
		= Memory optimization, only one object is created and used again and again so memory is saved
		
	-> Usage of Singleton Design Pattern :-
		= Database applications
		= Multithreaded applications
		= Caching
		= Thread pools
		= Logging
		= Configuration settings
		  etc
		  
		  
-------------------------

# => For example 2 :-
	
	-> Requirement :-
		= We want to hide the object creation logic
		
	-> Solution :-
		= In this case we can use Factory Method Design Pattern
		
	-> Usage of Factory Method Design Pattern :-
		= getInstance() method of java.util.Calender class
		= getInstance() method of NumberFromat class
		= valueOf() method of all wrapper classes
		  etc

============

# => DAO Design Pattern :-
	-> DAO stands for Data Access Object
	-> It is used to separate the data persistence logic into a separate layer. This way, the service layer does not know 
          how the low-level operations are performed to access the database

=========

# => Task :-
	-> Create proper CRUD application using DAO, Factory design pattern
	
============





# FactoryDesignPattern

![image](https://github.com/Nishita-Maheshwari/JDBC-SpringDAO/assets/47790697/a7814670-c17b-4f77-b321-2c8c9f7c4281)






# DAO Design Pattern

![image](https://github.com/Nishita-Maheshwari/JDBC-SpringDAO/assets/47790697/17b205b7-4e45-49f2-94b9-f42a33f6419e)











# DAO Pattern Program

#DAO Design Pattern
![image](https://github.com/Nishita-Maheshwari/JDBC-SpringDAO/assets/47790697/b280ada9-e46d-472a-8b57-3983e383a9db)




#JDBC Template (Insert , Update ,Delete,Select Queries)


# => RowMapper :-
	-> It is an interface which is used to fetch the records from the database using the query() method JdbcTemplate class
	-> It is callback interface i.e. it is called for each row and maps the row of relations with the instances to the bean/model class
	-> Method of RowMapper :-
		= public <T> mapRow(ResultSet rs, int arg1) throws SQLException


![image](https://github.com/Nishita-Maheshwari/JDBC-SpringDAO/assets/47790697/d6c02961-2c64-41aa-804c-466f9a81b64b)









# Named Parameter JDBC Template




# => What is difference between Plain-JDBC and Spring-JDBC ?
	
	1. In Plain-JDBC we have to get the connection object manually
	   In Spring-JDBC, connection object is automatically provided by JdbcTemplate class (org.springframework.jdbc)
	   
	2. Steps for Plain-JDBC database accessability :-
		= Load and register driver class
			Class.forName("-----");
		= Create connection
			Connection con = DriverManager.getConnection("-------", "-", "-");
		= Create Statement or PreparedStatement or CallableStatement
			Statement st = con.createStatement();
		= Write and execute SQL query
			st.executeQuery("------sql query------");
		= Close the connection
			con.close();
		-> NOTE : Above 1, 2, 3 and 5th steps are common and 4th step is variable. These common steps (1,2,3,5) are known as boiler-plate code. We have to write the poiler-plate code again and again
		
		In Spring-JDBC, we dont need to write boiler-plate code.
		
	3. In Plain-JDBC we have to handle the compile time exceptions using try-catch block or throws keyword
	   In Spring-JDBC we dont need to handle the exceptions because it converts the compile time exceptions into run-time exceptions
	   
	4. In Plain-JDBC, select query will retrieve and store the records in ResultSet
	   In Spring-JDBC, select query can retrieve and store the result in the form of Collection objects and Bean Object
	   
	5. In Plain-JDBC, as result is stored in ResultSet which is non-serialized and thus it cannot be transfered over the network
	   In Spring-JDBC, as result is stored in Collection object which are serialized and thus it can be transfered over the network
	
	6. In Plain-JDBC, if we want to store the result in bean object then we have to provide the explicite code
	   In Spring-JDBC, if we want to store the result in bean object then we can use Mapper class
	   
	7. Plain-JDBC provides less support for transaction management
	   Spring-JDBC provides good support for transaction management
	   
	   
------------------------

# => Plain-JDBC and Spring-JDBC classes and interfaces :-
	-> Diagram
	   
======================

# => NamedParameterJdbcTemplate :-
	-> Why we need NamedParameterJdbcTemplate ?
		= In JdbcTemplate, we have to provide positional parameters. If there are a lot of positional parameters then it can create confusion. To remove that confusion Spring-JDBC has provided one approch i.e. NamedParameterJdbcTemplate
	
	-> NamedParameterJdbcTemplate is the class in which we provide "Named Parameters" in place of "Positional Parameters"
	
	-> We can achieve "Named Parameters" approch by 2 ways :-
		1. By using Map <interface>
			= We use implemented class of Map interface for eg. HashMap etc
		2. By using SqlParameterSource <interface>
			= We use implemented class of SqlParameterSource interface
				a. MapSqlParameterSource
				b. BeanPropertySqlParameterSource
    ===============================================
    
    
    
   
# Plain JDBC vs Spring JDBC

![image](https://github.com/Nishita-Maheshwari/JDBC-SpringDAO/assets/47790697/118c636f-f936-4ba8-965f-85263d5f2b61)



















# Simple JDBC DAO Support Class


# => SimpleJdbcTemplate :-
	-> SimpleJdbcTemplate is the class which includes all the features and functionalities of JdbcTemplate class including Java 5 features i.e. var-args and autoboxing
	-> All the features of SimpleJdbcTemplate have been added to JdbcTemplate and thus SimpleJdbcTemplate has been depricated from Spring 3.x version
	
	-> NOTE :-
		= Spring 2.0 version supports JDK 1.4 version features
		= Spring 2.5 version supports JDK 1.5 version features
		
==============

# => Spring DAO :-
	-> Spring DAO is a concept (design pattern) to work with database technologies i.e. JDBC, Hibernate, JPA etc in an easy way
	-> For this Spring has provided DAO Support Classes :-
		1. JdbcDaoSupport
		2. NamedParameterJdbcDaoSupport
		3. SimpleJdbcDaoSupport
		
# => DAO Support Classes :-
	-> Spring provides a set of abstract DAO classes (XxxDaoSupport) that have method i.e. getXxxTemplate() for returning data-source object and any other configuration settings that are specific to the relevant data-access technology
	-> DAO Support classes :-
		1. JdbcDaoSupport (org.springframework.jdbc.core.support)
			= public JdbcTemplate getJdbcTemplate();
		2. NamedParameterJdbcDaoSupport (org.springframework.jdbc.core.namedparam)
			= public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate();
		3. SimpleJdbcDaoSupport (org.springframework.jdbc.core.simple)
			= public SimpleJdbcTemplate getSimpleJdbcTemplate();
			
====================


#DAO Design Pattern

![image](https://github.com/Nishita-Maheshwari/JDBC-SpringDAO/assets/47790697/52045b21-6562-4867-9066-5021a7305f8f)






















# Simple JDBC Stored Producers
# => SimpleJdbcInsert :-
	-> SimpleJdbcInsert is the class which is present in "org.springframework.jdbc.core.simple" package
	-> The object provided by SimpleJdbcInsert is multithreaded and reusable object which provides an easy way to insert values in database
	
========================
# => Stored Procedure :-
	-> It is prepared SQL query that is saved at database side so that we can use it again and again
	-> We need to to compile the query again and again, we can call it directly
	
	-> We can provide 3 parameters in stored procedure :-
		1. IN
		2. OUT
		3. INOUT
		
	-> Syntax :-
		= CREATE PROCEDURE procedureName(parameters)
			BEGIN
				-----sql query-----
			END //
	
		1. select query stored procedure :-
			CREATE PROCEDURE getAllStudents()
			BEGIN
				select * from marks;
			END //
			
		2. select query stored procedure :-
			CREATE PROCEDURE getStudentDetails(IN std_email VARCHAR(100))
			BEGIN
				select * from marks where email=std_email;
			END //
			
		3. select query stored procedure :-
			CREATE PROCEDURE getStudentName(IN std_email VARCHAR(100), OUT std_name VARCHAR(100))
			BEGIN
				select name from marks where email=std_email;
			END //
			
		4. show all procedures :-
			SHOW PROCEDURE STATUS WHERE db='database_name';
			
		5. delete procedure :-
			DROP PROCEDURE procedureName;
			
		6. call procedure at mysql :-
			CALL procedureName();
			
		7. insert query stored procedure :-
			CREATE PROCEDURE insertStdDetails(IN name1 VARCHAR(100), IN email1 VARCHAR(100), IN marks1 INT)
			BEGIN
				insert into marks values(name1, email1, marks1);
			END //
			
		

-----------------------------------------

# => Stored Functions :-
	-> Syntax :-
		CREATE FUNCTION functionName(parameters)
		RETURNS return_type
		BEGIN
			---------statements-------------
		END //
		
	-> NOTE : If it provides any error then execute following command :-
		SET GLOBAL log_bin_trust_function_creators = 1;
		
	-> How to execute functions :-
		SELECT functionName();
		
	-> For example :-
		1. display name :-
			CREATE FUNCTION display()
			RETURNS VARCHAR(100)
			BEGIN
				RETURN 'hello deepak...!!';
			END
			//
			
		2. addition :-
			CREATE FUNCTION addition(no1 INT, no2 INT)
			RETURNS INT
			BEGIN
				RETURN no1+no2;
			END
			//
			
	
# 	-> Difference between Stored Procedure and Stored Functions :-
		
		1. STORED PROCEDURE does not have any return type
		   STORED FUNCTIONS have return type
		   
		2. STORED PROCEDURE has IN, OUT and INOUT type parameters
		   STORED FUNCTIONS does not have IN, OUT and INOUT type parameters
		   
		3. STORED PROCEDURE can be used with insert, select, update, delete etc queries
		   STORED FUNCTIONS can be used only for select query
		   
------------------------------


#JAVA Database

![image](https://github.com/Nishita-Maheshwari/JDBC-SpringDAO/assets/47790697/d8967d8b-bc53-4cb2-a44d-3fb884cb3d23)





# => SimpleJdbcCall :-
	-> It is used to call Stored Procedure and Stored Functions
	-> It is the class which is present in "org.springframework.jdbc.core.simple" package
	-> To call Stored Procedure and Stored Functions we have to use following methods :-
		1. withProcedureName(-)
		2. withFunctionName(-)
		
		3. execute(-)
		
		
================

# => Create new procedures :-

	CREATE PROCEDURE insertStdMarkDetails(IN name1 VARCHAR(100), IN email1 VARCHAR(100), IN marks1 INT)
	BEGIN
		insert into marks values(name1, email1, marks1);
	END //

















# Batch Updates in JDBC

# => Batch Updates :-
	-> Batch Updates is the process by which we group multiple SQL queries together and execute them at single time rather than executing all SQL queries one by one
	-> By using batch updates, application performance increases
	
	-> NOTE : Batch Updates can be used only for insert, update and delete SQL queries not for select query
	
	-> In Plain-JDBC, for batch updates we use following methods of Statement and PreparedStatement :-
		1. addBatch(-)
		2. executeBatch(-)
		3. clearBatch(-)
		
	-> In Spring-JDBC, for batch updates we use one method of JdbcTemplate :-
		1. batchUpdate(-)
		

===================

# => BLOB Data Types :-
	-> BLOB full form is "Binary Large Object"
	-> BLOB data-types are used to store large amount of "binary data" for eg. images (jpg, png etc), videos (mp3, mov etc), audio (mp3), graphics (gif) etc
	
	-> There are 4 types of BOLB Data-Types available :-
		1. TINYBLOB - 255 bytes
		2. BLOB - 64KB
		3. MEDIUMBLOB - 16MB
		4. LONGBLOB - 4GB
		
		= All 4 above are pre-defined data-type of databases


# => CLOB Data Types :-
	-> CLOB full form is "Character Large Object"
	-> CLOB data-types are used to store "character data" for eg. docx, pdf, txt, xml files etc
	
	-> There are 4 types of CLOB data-types available :-
		1. TINYTEXT - 255 characters
		2. TEXT - 65535 characters
		3. MEDIUMTEXT - ----
		4. LONGTEXT - ----

==========

# => Task :-
	- Insert any file into database and download that file from database
	
==================

















# BLOB Data type : BLOB and CLOB spring framework

# => To insert and retrieve BLOB and CLOB data in spring we have following classes and interfaces :-
	1. AbstractLobCreatingPreparedStatementCallback
	2. LobCreator
	
	3. AbstractLobStreamingResultSetExtractor
	4. LobHandler
	
---------------------------------------------------------------------

# => AbstractLobCreatingPreparedStatementCallback :-
	-> It is used to store BLOB and CLOB related data in database
	-> It is an abstract class which is present in "org.springframework.jdbc.core.support" package
	-> Method :-
		1. setValues(PreparedStatement ps, LobCreator lc)
		
---------------------------------------------------------------------

# => LobCreator :-
	-> It provides Binary Stream and Character Stream in order to write/insert BLOB and BLOB data into the database.
	-> LobCreator is an interface which is present in "org.springframework.jdbc.support.lob" package
	-> Methods :-
		1. setBlobAsBinaryStream(PreparedStatement ps, int i, InputStream in, int i1)
		2. setClobAsCharacterStream(PreparedStatement ps, int i, Reader reader, int i1)
		3. setBlobAsBytes(PreparedStatement ps, int i, byte[] bytes)
		4. setClobAsString(PreparedStatement ps, int i, String string)
		5. setClobAsAsciiStream(PreparedStatement ps, int i, InputStream in, int i1)
		   etc
		   
---------------------------------------------------------------------

# => AbstractLobStreamingResultSetExtractor :-
	-> It is used to retrieve BLOB and CLOB data from database
	-> It is an abstract class which is present in "org.springframework.jdbc.core.support" package
	-> Methods :-
		1. streamData(ResultSet rs)
		
---------------------------------------------------------------------

# => LobHandler :-
	-> It provides Binary Stream and Character Stream in order to read/retrieve BLOB and CLOB data from database
	-> It is an interface which is present in "org.springframework.jdbc.support.lob" package
	-> Methods :-
		1. getBlobAsBytes(ResultSet rs, -)
		2. getBlobAsBinaryStream(ResultSet rs, -)
		3. getClobAsString(ResultSet rs, -)
		4. getClobAsAsciiStream(ResultSet rs, -)
		5. getClobAsCharacterStream(ResultSet rs, -)
		   etc
		   
---------------------------------------------------------------------





















# Connection Pooling


# => Connection Pooling :-
	-> Connection Pooling is the technique of creating and managing a group of reusable connection objects in the pool which are used by any thread that requires the connection.
	-> Connection Pooling is well known Data Access Pattern
	
  # -> Why we need Connection Pooling ?
		= Creating a connection object is an expensive and time-consuming operation because everytime following steps are executed :-
			1. Opening connection to the database
			2. Authentication of the user before establishing the connection
			3. Creating a TCP socket for reading/writing data
			4. Sending/receiving data over the socket
			5. Closing the connection
			6. Closing the TCP socket
		= By using connection pooling technique we can remove these expensive and time-consuming steps for each and every thread
		
# 	-> Advantages of Connection Pooling :-
		1. Fast performance
		2. Easy to maintain
		3. Easy to analyse
		
# 	-> How to achieve Connection Pooling :-
		= We can achieve connection pooling by following ways :-
			1. By Default connection pooling provided by database vendors for example MySQL provides one class i.e. MysqlDataSource or Oracle provides one class i.e. OracleDataSource etc
			2. By using third party connection pooling mechanism
				a. Apache Commons DBCP (BasicDataSource)
				b. Tomcat JDBC (PoolProperties)
				c. C3P0 (ComboPooledDataSource)
				d. Proxool (ProxoolDataSource)
				e. HikariCP (HikariDataSource)
				   etc
			3. By using Application Server
		
# 		= NOTE : We normally use third party connection pooling mechanisms because they provide very good documentation, easy to configure and having good performance. Third party connection pooling mechanism uses external jar files
		
# 	-> How many connection objects we have to create in connection pool ?
		= There is no fix number for connection objects, it depends on many factors like no of threads, CPU, Disk (HD or SSD), Network etc
		= For example we dont know no of threads, we have 4-core machine and 1 hard disk, then we can use one formula i.e.
			no_of_connection_objects = ((2 * 4-core machine) + 1 HD ) ----> 9
		= If we want to get the exact size of connection pool for our applications then we have to create "load test scripts" using tools i.e. Apache JMeter, The Grinder tool etc
		
==========================




#connection pooling
![image](https://github.com/Nishita-Maheshwari/JDBC-SpringDAO/assets/47790697/35da5bfe-afcf-440d-b48b-97c6b3242232)

		
	

