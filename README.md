# **Sin Number**

## Instructions
---


### How a Sin Number Works

<br>

- In the nine-digit Social Insurance Number (SIN) given to each person having a job or filing an income tax return in Canada, the ninth digit is a check digit that is used to test the validity of the other digits in the SIN.  The ninth digit is determined by the following procedure.

  1. Double the 2<sup>nd</sup>, 4<sup>th</sup>, 6<sup>th</sup>, and 8<sup>th</sup> digits
  2. Add the *digits* of the numbers found in step (a)
  3. Add the 1<sup>st</sup>, 3<sup>rd</sup>, 5<sup>th</sup>, and 7<sup>th</sup> digits
  4. Add the numbers found in steps (b) and (c)
  5. Subtract the units digit of the result of step (d) from 10 and note the units digit of the result. For the SIN to be valid, its ninth digit must have this value.



## Objective
---
<br>

- Write a program that repeatedly reads nine-digit numbers and determines whether or not each number is a valid SIN. The program should stop when it reads the value 999999999.

- Has In.java
- Used Java version 1.2 ~~(*is updated though*)~~

<br></br>

***Made on April 4th, 2023***\
***By: Aaron Prince Anu***


<sub>*Temporary?*</sub>