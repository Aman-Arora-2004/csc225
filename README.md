Assignment 3 of my Data Structures and Algorithms 1 class. The rest of them were handwritten and submitted.

Implemented an arraymatch function using JAVA. 

Two arrays, 𝑨 and 𝑩, of size n, are defined to be matches of one another if at least one of the following two
conditions is satisfied:

I.
𝑨 = 𝑩 (the arrays have the same elements at each index)

II.
  If 𝒏 is divisible by 2, 𝑨 and 𝑩 are divided into two sub-arrays 
  of equal size (𝑨 is divided into 𝑨𝟏 and 𝑨𝟐, 𝑩 into 𝑩𝟏 and 𝑩𝟐). 
  Then, at least one of the following conditions is satisfied:
  a) (𝑨𝟏 matches 𝑩𝟏) AND (𝑨𝟐 matches 𝑩𝟐)
  b) (𝑨𝟏 matches 𝑩𝟏) AND (𝑨𝟏 matches 𝑩𝟐)
  c) (𝑨𝟐 matches 𝑩𝟏) AND (𝑨𝟐 matches 𝑩𝟐)
  Note: if 𝒏 is not divisible by 2, condition II is not satisfied.

  Outpets YES if they match and NO if they do not match.
