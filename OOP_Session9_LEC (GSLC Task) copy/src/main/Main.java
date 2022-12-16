package main;

import java.util.Scanner;

// ===== SHAPE AREA & VOLUME CALCULATOR (Program) =====

public class Main {
	
	// 30-line input separator
	public void separator() {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println();
		}
	}

	public Main() {
		// TODO Auto-generated constructor stub
		
		Scanner scan = new Scanner(System.in);
		Controller c = new Controller();
		
		
		boolean onApp = true;
		while (onApp) {
			// negative initial assumptions for menu's do-while loop
			int choose = -1;
			boolean check = false; // checking if input is INTEGER ONLY

			do {
				separator();
				System.out.println(" ===== SHAPE AREA & VOLUME CALCULATOR ===== ");
				System.out.println("1. Square");
				System.out.println("2. Rectangle");
				System.out.println("3. Triangle");
				System.out.println("4. Circle");
				System.out.println("5. Exit");
				try {
					System.out.print("Choose: ");
					choose = scan.nextInt();
					// if NO EXCEPTION after input -> it runs past this stage
					check = true; 
				}catch(Exception e){
					System.out.print("Please input Integer!");
					scan.nextLine();
				}
				scan.nextLine();
			}while(choose < 1 || choose > 5 || !check); // while check = FALSE

			// MENU
			separator();
			switch (choose) {
			case 1:
				c.calculateSquare();;
				break;
			case 2:
				c.calculateRectangle();
				break;
			case 3:
				c.calculateTriangle();
				break;
			case 4:
				c.calculateCircle();
				break;
			case 5:
				onApp = false; // EXIT while(onApp) loop
				System.out.println("Thank you for using our application!");
				System.out.println("Press ENTER to end...");
				scan.nextLine();
				break;

			}
			// SYSTEM INPUT EXAMPLE
//			Shape s1 = new Circle("Black", 2.2);
//			System.out.println(s1.toString());
//			
//			Shape s2 = new Rectangle("White", 4, 5);
//			System.out.println(s2.toString());
			
		}
		scan.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}


/*
 * Session 9 topic: Interface AND Abstract
 
 * TASK DESC:

Buatlah Program menggunakan Interface dan Abstract dengan Syarat Sebagai Berikut :

- Program Memiliki Context dan Tujuan yang jelas

- Memiliki Leibh dari 5 Kelas

- Memiliki Komentar Kode yang baik menggunakan bahasa inggris atau bahasa indonesia

- Silahkan dikumpulkan link githubnya disini

- Memiliki Program dengan context dan tujuan yang jelas


Program ini akan dijadikan sebagai nilai baseline tugas kalian



Belajar program: ada Encapsulation (Get & Set), Inheritance(super keyword in Subclass Constructor), Polymorphism(Override & Overload), Interface(abstract-only class), dan Abstract(method dkk defined at each subclass and not at superclass). Coba pakai menu dan random ID generation. Validation: endsWith, isDigit, etc

plus keyword2 kayak final dan static...dan implementation nya di sebuah attribute, method, or class

Static vs Final: https://stackoverflow.com/questions/13772827/difference-between-static-and-final


Inheritance: ada nilai/method default di superclass (Optional to define in subclass)
Abstract: TIDAK ADA/PERLU nilai/method default di superclass (MUST DEFINE IN SUBCLASS)
Abstract class: Bisa nampung both Abstact and Normal method

Polymorphism (Override & Overload)
Override: nama sama dan parameter sama
Overload: nama function sama tapi parameter beda2
Inheritance (super keyword in Subclass Constructor)

Adding a component to an arrayList -> must use an Object...and insert in full
Static: dipakai di ArrayList yang filenya beda (bukan di main)
Syntax: Class.variable, Class.method()

XAMPP(PHPmyAdmin)

 */
