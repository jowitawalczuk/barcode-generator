# Barcode Generator

>Simple bar-code generating app created with Java. 
>The inspiration behind this app was poorly integrated parking and loyalty card system in one of the Warsaw's shopping malls.
>The goal is to create some-kind-of simplified solution to this problem.

Status: in progress

## Screenshots

<p align="center">
  <img src="codeForReg.png" alt="Barcode Example" width="300"/>
</p>


## Table od Contents
  * [About](#barcode-generator)
  * [Screenshots](#screenshots)
  * [Set-up](#set-up)
  * [Functionality](#functionality)
  * [Folder Structure](#folder-structure)
  * [License](#license)
## Set-up

In order to make this program to work I used listed below .jar files. 

* junit-jupiter-api
* junit-platform-console
* core-3.5.3
* javase-3.5.3
* postgresql-42.7.7
  

<pre>
curl -L -o junit-jupiter-api-5.10.0.jar https://repo1.maven.org/maven2/org/junit/jupiter/junit-jupiter-api/5.10.0/junit-jupiter-api-5.10.0.jar

curl -L -o junit-platform-console-standalone-1.10.0.jar https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.10.0/junit-platform-console-standalone-1.10.0.jar

curl -L -o core-3.5.3.jar https://repo1.maven.org/maven2/com/google/zxing/core/3.5.3/core-3.5.3.jar

curl -L -o javase-3.5.3.jar https://repo1.maven.org/maven2/com/google/zxing/javase/3.5.3/javase-3.5.3.jar

and than compile the program with listed dependencies:

javac -cp ".;lib/*" <ProgramName>.java
</pre>

You can download it from [_mvn repository_](https://mvnrepository.com/) and here [ pgJDBC ](https://jdbc.postgresql.org/download/).

If you are using IntelliJ IDEA IDE adding those into your project takes place as follows:
-> File -> Project Structure... -> Modules -> Dependencies -> + -> JARs and Directiories -> ...

## Functionality
The parent functionality comes down to:

- generating single barcode image for given data as command-line argument
- running unit test on main class

Note: this program does not have GUI, and comes down only to functionality. 

## Folder Structure

The workspace contains folders by default, where:

- `src`: the folder to maintain sources
- `test`: the folder to maintain tests
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.
## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

* [ZXing](https://github.com/zxing/zxing) library, which is licensed under the Apache License 2.0. (barcode generation)
Please refer to the [ZXing LICENSE](https://github.com/zxing/zxing/blob/master/LICENSE) for more details.

* [JUnit 5](https://junit.org/junit5/) library, which is licensed under the Eclipse Public License 2.0 (unit testing)
Please refer to the [JUnit 5 LICENSE](https://github.com/junit-team/junit5/blob/main/LICENSE) for more details.
