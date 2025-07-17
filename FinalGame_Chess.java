//Name: Adarshkrishna Thoduvakkal
//Date: July 17
//Purpose: Shipwrecked

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;

public class FinalGame_Chess extends Applet implements ActionListener
{
    Panel p_card;  //to hold all of the screens
    Panel card1, card2, card3, card4, card5, card6; //the two screens
    CardLayout cdLayout = new CardLayout ();

    //turns
    JLabel turnpic;
    char turn = 'w';
    int last = -1;

    //choose colors (for later, make it so pieces can swap. some things need to change in select Pawn for this to happen



    //grid
    int row = 8;
    int col = 8;
    JButton a[] = new JButton [row * col];
    char piece[] [] = {{'r', 'n', 'b', 'k', 'q', 'b', 'n', 'r'}, {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},  //pieces
	    {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'}, {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'},
	    {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'}, {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'},
	    {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'}, {'r', 'n', 'b', 'k', 'q', 'b', 'n', 'r'}};

    char piecebackup[] [] = {{'r', 'n', 'b', 'k', 'q', 'b', 'n', 'r'}, {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},  //for reset
	    {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'}, {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'},
	    {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'}, {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'},
	    {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'}, {'r', 'n', 'b', 'k', 'q', 'b', 'n', 'r'}};

    char select[] [] = {{'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u'}, {'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u'},  //for selected squares
	    {'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u'}, {'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u'},
	    {'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u'}, {'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u'},
	    {'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u'}, {'u', 'u', 'u', 'u', 'u', 'u', 'u', 'u'}};

    char colour[] [] = {{'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}, {'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'},  //piece colour
	    {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'}, {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'},
	    {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'}, {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'},
	    {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'}, {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'}};
    char colourbackup[] [] = {{'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}, {'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'},  //for reset
	    {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'}, {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'},
	    {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'}, {'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x'},
