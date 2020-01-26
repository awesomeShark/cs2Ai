public class gradeMove {

    Board board;
    Location loc;
    int oneInARow, twoInARow, threeInARow, fourInARow, score, opOne, opTwo, opThree, opFour;
    char opL;

    public gradeMove(Board bd, Location loc, char letter)
    {
        this.board = bd;
        this.loc = loc;

        if(letter=='X')
            opL = 'O';
        else
            opL = 'X';

        //col
        int count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[loc.getSheet()][loc.getRow()][x]=='-')
                continue;
            else if(board.getData()[loc.getSheet()][loc.getRow()][x]==letter) {
                count++;
            }
            else if(board.getData()[loc.getSheet()][loc.getRow()][x]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        //row
        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[loc.getSheet()][x][loc.getCol()]=='-')
                continue;
            else if(board.getData()[loc.getSheet()][x][loc.getCol()]==letter) {
                count++;
            }
            else if(board.getData()[loc.getSheet()][x][loc.getCol()]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        //sheet
        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][loc.getRow()][loc.getCol()]=='-')
                continue;
            else if(board.getData()[x][loc.getRow()][loc.getCol()]==letter) {
                count++;
            }
            else if(board.getData()[x][loc.getRow()][loc.getCol()]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        //topback to bottomfront
        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][x][loc.getCol()]=='-')
                continue;
            else if(board.getData()[x][x][loc.getCol()]==letter) {
                count++;
            }
            else if(board.getData()[x][x][loc.getCol()]==opL)
            {
                count = 0;
                break;
            }
        }
        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        //

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][3-x][loc.getCol()]=='-')
                continue;
            else if(board.getData()[x][3-x][loc.getCol()]==letter) {
                count++;
            }
            else if(board.getData()[x][3-x][loc.getCol()]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[3-x][x][loc.getCol()]=='-')
                continue;
            else if(board.getData()[3-x][x][loc.getCol()]==letter) {
                count++;
            }
            else if(board.getData()[3-x][x][loc.getCol()]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        //same sheet - upper left to bottom right

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[loc.getSheet()][x][x]=='-')
                continue;
            else if(board.getData()[loc.getSheet()][x][x]==letter) {
                count++;
            }
            else if(board.getData()[loc.getSheet()][x][x]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[loc.getSheet()][3-x][x]=='-')
                continue;
            else if(board.getData()[loc.getSheet()][3-x][x]==letter) {
                count++;
            }
            else if(board.getData()[loc.getSheet()][3-x][x]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[loc.getSheet()][x][3-x]=='-')
                continue;
            else if(board.getData()[loc.getSheet()][x][3-x]==letter) {
                count++;
            }
            else if(board.getData()[loc.getSheet()][x][3-x]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        //backsheet top-left corner to front sheet top right corner

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][loc.getRow()][x]=='-')
                continue;
            else if(board.getData()[x][loc.getRow()][x]==letter) {
                count++;
            }
            else if(board.getData()[x][loc.getRow()][x]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[3-x][loc.getRow()][x]=='-')
                continue;
            else if(board.getData()[3-x][loc.getRow()][x]==letter) {
                count++;
            }
            else if(board.getData()[3-x][loc.getRow()][x]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][loc.getRow()][3-x]=='-')
                continue;
            else if(board.getData()[x][loc.getRow()][3-x]==letter) {
                count++;
            }
            else if(board.getData()[x][loc.getRow()][3-x]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        //back sheet top left corner to front sheet bottom right corner - might be issue because not based on location
        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][x][x]=='-')
                continue;
            else if(board.getData()[x][x][x]==letter) {
                count++;
            }
            else if(board.getData()[x][x][x]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[3-x][x][x]=='-')
                continue;
            else if(board.getData()[3-x][x][x]==letter) {
                count++;
            }
            else if(board.getData()[3-x][x][x]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][3-x][x]=='-')
                continue;
            else if(board.getData()[x][3-x][x]==letter) {
                count++;
            }
            else if(board.getData()[x][3-x][x]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][x][3-x]=='-')
                continue;
            else if(board.getData()[x][x][3-x]==letter) {
                count++;
            }
            else if(board.getData()[x][x][3-x]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[3-x][3-x][x]=='-')
                continue;
            else if(board.getData()[3-x][3-x][x]==letter) {
                count++;
            }
            else if(board.getData()[3-x][3-x][x]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][3-x][3-x]=='-')
                continue;
            else if(board.getData()[x][3-x][3-x]==letter) {
                count++;
            }
            else if(board.getData()[x][3-x][3-x]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[3-x][x][3-x]=='-')
                continue;
            else if(board.getData()[3-x][x][3-x]==letter) {
                count++;
            }
            else if(board.getData()[3-x][x][3-x]==opL)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                oneInARow++;
                break;
            case 2:
                twoInARow++;
                break;
            case 3:
                threeInARow++;
                break;
            case 4:
                fourInARow++;
                break;
        }

        //break







        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[loc.getSheet()][loc.getRow()][x]=='-')
                continue;
            else if(board.getData()[loc.getSheet()][loc.getRow()][x]==opL) {
                count++;
            }
            else if(board.getData()[loc.getSheet()][loc.getRow()][x]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        //row
        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[loc.getSheet()][x][loc.getCol()]=='-')
                continue;
            else if(board.getData()[loc.getSheet()][x][loc.getCol()]==opL) {
                count++;
            }
            else if(board.getData()[loc.getSheet()][x][loc.getCol()]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        //sheet
        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][loc.getRow()][loc.getCol()]=='-')
                continue;
            else if(board.getData()[x][loc.getRow()][loc.getCol()]==opL) {
                count++;
            }
            else if(board.getData()[x][loc.getRow()][loc.getCol()]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }


        //topback to bottomfront
        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][x][loc.getCol()]=='-')
                continue;
            else if(board.getData()[x][x][loc.getCol()]==opL) {
                count++;
            }
            else if(board.getData()[x][x][loc.getCol()]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][3-x][loc.getCol()]=='-')
                continue;
            else if(board.getData()[x][3-x][loc.getCol()]==opL) {
                count++;
            }
            else if(board.getData()[x][3-x][loc.getCol()]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        count =1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[3-x][x][loc.getCol()]=='-')
                continue;
            else if(board.getData()[3-x][x][loc.getCol()]==opL) {
                count++;
            }
            else if(board.getData()[3-x][x][loc.getCol()]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        //same sheet - upper left to bottom right

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[loc.getSheet()][x][x]=='-')
                continue;
            else if(board.getData()[loc.getSheet()][x][x]==opL) {
                count++;
            }
            else if(board.getData()[loc.getSheet()][x][x]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[loc.getSheet()][3-x][x]=='-')
                continue;
            else if(board.getData()[loc.getSheet()][3-x][x]==opL) {
                count++;
            }
            else if(board.getData()[loc.getSheet()][3-x][x]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[loc.getSheet()][x][3-x]=='-')
                continue;
            else if(board.getData()[loc.getSheet()][x][3-x]==opL) {
                count++;
            }
            else if(board.getData()[loc.getSheet()][x][3-x]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        //backsheet top-left corner to front sheet top right corner

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][loc.getRow()][x]=='-')
                continue;
            else if(board.getData()[x][loc.getRow()][x]==opL) {
                count++;
            }
            else if(board.getData()[x][loc.getRow()][x]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[3-x][loc.getRow()][x]=='-')
                continue;
            else if(board.getData()[3-x][loc.getRow()][x]==opL) {
                count++;
            }
            else if(board.getData()[3-x][loc.getRow()][x]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][loc.getRow()][3-x]=='-')
                continue;
            else if(board.getData()[x][loc.getRow()][3-x]==opL) {
                count++;
            }
            else if(board.getData()[x][loc.getRow()][3-x]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        //back sheet top left corner to front sheet bottom right corner - might be issue because not based on location
        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][x][x]=='-')
                continue;
            else if(board.getData()[x][x][x]==opL) {
                count++;
            }
            else if(board.getData()[x][x][x]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[3-x][x][x]=='-')
                continue;
            else if(board.getData()[3-x][x][x]==opL) {
                count++;
            }
            else if(board.getData()[3-x][x][x]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][3-x][x]=='-')
                continue;
            else if(board.getData()[x][3-x][x]==opL) {
                count++;
            }
            else if(board.getData()[x][3-x][x]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][x][3-x]=='-')
                continue;
            else if(board.getData()[x][x][3-x]==opL) {
                count++;
            }
            else if(board.getData()[x][x][3-x]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[3-x][3-x][x]=='-')
                continue;
            else if(board.getData()[3-x][3-x][x]==opL) {
                count++;
            }
            else if(board.getData()[3-x][3-x][x]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[x][3-x][3-x]=='-')
                continue;
            else if(board.getData()[x][3-x][3-x]==opL) {
                count++;
            }
            else if(board.getData()[x][3-x][3-x]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }

        count = 1;

        for (int x = 0; x < 4; x++) {
            if(board.getData()[3-x][x][3-x]=='-')
                continue;
            else if(board.getData()[3-x][x][3-x]==opL) {
                count++;
            }
            else if(board.getData()[3-x][x][3-x]==letter)
            {
                count = 0;
                break;
            }
        }

        count++;

        switch (count)
        {
            case 1:
                opOne++;
                break;
            case 2:
                opTwo++;
                break;
            case 3:
                opThree++;
                break;
            case 4:
                opFour++;
                break;
        }



        score = oneInARow+twoInARow*10+threeInARow*1000+fourInARow*10000-opOne-opTwo*10-opThree*100-opFour*1000;

        if(fourInARow>0)
            score = 100000000;

        //take winning move at all costs, but also block his winning move
        //add option for 2 lines of attack - optional
        //in case of tie, check number of 3 in rows, so multiple lines of attack
        //some two in a row don't count: others need to check if opponent is blocking
        //use square as base for calculations

        /*
        r-0 = num back rep
        4-r = num forward check
        ^^^ also for col (and sheets?)
         */
    }

    public int getScore() {
        return score;
    }
}
