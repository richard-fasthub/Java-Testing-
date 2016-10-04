/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fasthubfirstproject;

/**
 *
 * @author Richie
 */

import java.util.Scanner;
class TotalSales
{
public static void main( String args[] )
{
Scanner input = new Scanner( System.in );

// sales array holds data on number of each product sold
// by each salesperson


double sales[][] = new double[ 5 ][ 4 ];

System.out.print( "Enter salesperson number (-1 to end): " );
int person = input.nextInt();

while ( person != -1 )
{
System.out.print( "Enter product number: " );
int product = input.nextInt();
System.out.print( "Enter sales amount: " );
double amount = input.nextDouble();

// error-check the input
if ( person >= 1 && person < 5 &&
product >= 1 && product < 6 && amount >= 0 )
sales[ product - 1 ][ person - 1 ] += amount;
else
System.out.println( "Invalid input!" );

System.out.print( "Enter salesperson number (-1 to end): " );
person = input.nextInt();
} // end while



// total for each salesperson

double salesPersonTotal[] = new double[ 4 ];

// display the table
for ( int column = 0; column < 4; column++ )
salesPersonTotal[ column ] = 0;

System.out.printf( "%8s%14s%14s%14s%14s%10s\n",
"Product", "Salesperson 1", "Salesperson 2",
"Salesperson 3", "Salesperson 4", "Total" );

// for each column of each row, print the appropriate

// the value representing a person's sales of a product
for ( int row = 0; row < 5; row++ )
{
double productTotal = 0.0;
System.out.printf( "%8d", ( row + 1 ) );
-1
        
for ( int column = 0; column < 4; column++ ) {
System.out.printf( "%14.2f", sales[ row ][ column ] );
productTotal += sales[ row ][ column ];
salesPersonTotal[ column ] += sales[ row ][ column ];
}

System.out.printf( "%10.2f\n", productTotal );
}

System.out.printf( "%8s", "Total" );

for ( int column = 0; column < 4; column++ )
System.out.printf( "%14.2f", salesPersonTotal[ column ] );

System.out.println();
}
}
