# Diceyy 

## Overview

Diceyy is a basic Android application that simulates the rolling of two dice. When the user clicks the "Roll" button, two dice are rolled, and the results are displayed as random numbers and corresponding dice images. If both dice show the same number, a fun vibration effect is triggered to let the user know they got lucky.

The application demonstrates how to create a simple Android app with interactive features and a basic user interface.

## Features

- Roll two dice by tapping the "Roll" button.
- Display the random numbers rolled on the dice.
- Show dice images corresponding to the rolled numbers.
- Provide a vibration effect when both dice show the same number.

## Components

### `Dice` Class

- A class representing a single die with a specified number of sides.
- Contains a `roll` method that generates a random number between 1 and the number of sides.

### `MainActivity` Class

- The main activity class of the application.
- Initializes the user interface and handles dice rolling functionality.
- Utilizes the `Dice` class to simulate dice rolls.
- Displays the results of the rolls on the user interface.
- Triggers a vibration effect if both dice show the same number.

## Usage

1. Launch the Diceyy application on an Android device or emulator.
2. Click the "Roll" button to roll two dice.
3. Observe the random numbers and dice images displayed on the screen.
4. If both dice show the same number, the device will vibrate briefly.
