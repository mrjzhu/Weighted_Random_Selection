# Weighted_Random_Selection

## Function

Implemented a Weighted Random Sampling algorithm.

Weighted Random sampling
Given n item, each one has weight w[i], these weights form the unnormalized probability
distribution we want to sample from, each item should have probability w[i]/sum(w) of
being chosen.


## How to Run
1.
```
git clone https://github.com/mrjzhu/food-delivery-service.git
```
2.
```
cd Weighted_Random_Selection/src
```
3.
```
javac weighted_random_sampling/Weighted_Random_Sampling_Algorithm.java
```
4.
```
java weighted_random_sampling.Weighted_Random_Sampling_Algorithm
```

## Result

For test, set three items which each has weight weight[i], set Random selection times == 10000,

The result will be like:

```
Test:
Red weight:    0.2
Blue weight:   0.3
Yellow weight: 0.5
===================
Red count:    2020,    20.2%
Blue count:   3017,    30.17%
Yellow count: 4963,    49.63%
```

