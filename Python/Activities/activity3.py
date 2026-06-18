player1 = input("Player 1, enter rock, paper, or scissors: ")
player2 = input("Player 2, enter rock, paper, or scissors: ")
if player1 == player2:
    print("It's a tie!")
elif player1 == "rock" and player2 == "scissors":
    print("Player 1 wins!")
elif player1 == "scissors" and player2 == "paper":
    print("Player 1 wins!")
elif player1 == "paper" and player2 == "rock":
    print("Player 1 wins!")
else:
    print("Player 2 wins!")