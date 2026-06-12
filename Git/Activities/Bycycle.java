package com.activities;

//Interface 1
interface BicycleParts {
 int tyres = 2;          // number of tyres
 int maxSpeed = 60;      // maximum speed
}

//Interface 2
interface BicycleOperations {
 void applyBrake(int decrement);
 void speedUp(int increment);
}

//Class implementing both interfaces (Hybrid Inheritance)
class Bicycle implements BicycleParts, BicycleOperations {

 int speed = 0;

 // Implement applyBrake
 public void applyBrake(int decrement) {
     speed = speed - decrement;
     if (speed < 0) speed = 0;
     System.out.println("Speed after brake: " + speed);
 }

 // Implement speedUp
 public void speedUp(int increment) {
     speed = speed + increment;
     if (speed > maxSpeed) speed = maxSpeed;
     System.out.println("Speed after speeding up: " + speed);
 }

 // Display details
 public void display() {
     System.out.println("Tyres: " + tyres);
     System.out.println("Max Speed: " + maxSpeed);
 }


 
}
