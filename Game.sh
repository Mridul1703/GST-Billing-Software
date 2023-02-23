function checkPosition()
{
    case $Position in
    2)
        newPosition=25
        ;;
    6)
        newPosition=45
        ;;
    13)
        newPosition=10
        ;;
    20)
        newPosition=59
        ;;
    30)
        newPosition=95
        ;;
    39)
        newPosition=60
        ;;
    43)
        newPosition=17
        ;;
    50)
        newPosition=5
        ;;
    56)
        newPosition=8
        ;;
    52)
        newPosition=72
        ;;
    57)
        newPosition=96
        ;;
    71)
        newPosition=92
        ;;
    73)
        newPosition=15
        ;;
    79)
        newPosition=63
        ;;
    84)
        newPosition=58
        ;;
    87)
        newPosition=49
        ;;
    94)
        newPosition=86
        ;;
    98)
        newPosition=40
        ;;
    *)
        newPosition=$Position
        ;;
    esac
}


printf "Would you like to:\n    1)Read the rules\n    2)Play the game\n\n"
read choice

if ((choice == 1))
then
    printf "\nThe rules are simple: \n   You press enter to roll the die\n   You are then told which space you have landed on\n   If you land on a snake you will move down the board\n   If you land on a ladder then you will move up it\n   In order to win you must land on 100 exactly\n   If you go over 100 then your imaginary piece will be moved backwards for the remainder of your dice roll\n\n Good Luck\n\n"
fi
  
if ((choice == 1 || choice == 2))
then
    printf "\nWelcome to Snakes and Ladders.\n"
    printf "\n100  99  98  97  96  95  94  93  92  91      1=Start           2=Ladder to 25\n"
    printf "81  82  83  84  85  86  87  88  89  90         6=Ladder to 45    50=Snake  to 5\n"
    printf "80  79  78  77  76  75  74  73  72  71         20=Ladder to 59    56=Snake  to 8\n"
    printf "61  62  63  64  65  66  67  68  69  70         43=Snake  to 17     52=Ladder to 72\n"
    printf "60  59  58  57  56  55  54  53  52  51         57=Ladder to 96    87=Snake  to 49\n"
    printf "41  42  43  44  45  46  47  48  49  50         98=Snake  to 40    84=Snake  to 58\n"
    printf "40  39  38  37  36  35  34  33  32  31         73=Snake  to 15     71=Ladder to 92\n"
    printf "21  22  23  24  25  26  27  28  29  30         79=Snake  to 63    13=Snake  to 10\n"
    printf "20  19  18  17  16  15  14  13  12  11         30=Ladder to 95    94=Snake  to 86\n"
    printf " 1   2   3   4   5   6   7   8   9   10        39=Ladder to 60    100=End\n"

    while ((Position < 100))
    do
    
    echo -e "\n\nPlease press enter to roll\n\n"
    read ch
    
    dice=$(echo "$RANDOM%6+1" | bc)

    echo -e "\nYou have rolled a $dice.\n"
      
    Position=$((Position+dice))
      
    if (($Position > 100))
        then
        above=$((Position-100))
        Position=$((100-above))
    fi
      
    echo -e "\nYou have landed on space $Position.\n"
      
    checkPosition
    
        if ((Position < newPosition))
    then
        echo -e "\nWell done, you have landed on a ladder. You are now on space $newPosition."
    fi
      
    if ((Position > newPosition))
    then
        echo -e "\nUnlucky, you have landed on a snake. You are now on space $newPosition."
    fi
      
    Position=$newPosition
    done
      
    printf "Congratulations, you have won!"

fi
