function playGame() {
  // Step 1: Ask the user if they want to play
  let playAgain = confirm("Do you want to play the game?");
  
  while (playAgain) {
    // Step 2: Ask for input to guess
    let userGuess = prompt("Enter your guess:");

    // Step 3: Check if the input is the same as the guess
    if (userGuess === correctAnswer) {
      alert("You win!");
    } else {
      alert("You lose!");
    }

    // Step 5: Ask again if they want to play
    playAgain = confirm("Do you want to play again?");
  }

  // End the game
  alert("Thanks for playing!");
}

// Start the game
playGame();