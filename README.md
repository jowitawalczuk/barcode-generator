# Barcode Generator

>Simple bar-code generating app created with Java.

## Table od Contents

*[The goal behind it](#purpose)
*[Technologies](#technologies)
*[Set-up](#setup)
*[Functionality](#functionality)
*
---
## Purpose

Educational purpose only, inspired by real-world problems.

 The inspiration behind this app was poorly integrated parking and loyalty card system observed in one of the Warsaw's shopping malls.
 
 The goal is to create some-kind-of simplified solution to this problem.
---
##Technologies


Chosen coding type: PDF417

This acronym stands for Portable Data File and 417 indicates every code word consists of 4 bars and 17 modules, which allows to encode large amount of data. The app is going to be developed soon, and the code will need to contain much more than single input String data.
---
##Set-up
To run this project, install...
---
##Functionality

-generating single barcode image for given data as command-line argument

 * Note: this program does not have GUI, and comes down only to functionality. 

---

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

---

## Dependency Management



---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## Third-party Libraries

This project uses the [ZXing](https://github.com/zxing/zxing) library, which is licensed under the Apache License 2.0.

Please refer to the [ZXing LICENSE](https://github.com/zxing/zxing/blob/master/LICENSE) for more details.
