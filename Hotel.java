import java.util.Scanner;
public class Hotel{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double grandtotal = 0;
        char choice;
		do{
		System.out.println("=======================================");
        System.out.println("       Welcome to KARUR EXPRESS        ");
		System.out.println("=======================================");
		System.out.println("               Menu Card               ");
        System.out.println("=======================================");
		System.out.println("1. Fried Rice");
		System.out.println("2. Noodles");
		System.out.println("3. Side dish");
        System.out.println("=======================================");
		System.out.print("Choose the category:");
		int category=sc.nextInt();
		switch(category)
		{
			case 1:
			System.out.println("1. Veg Fried Rice       - Rs. 50\n2. Egg Fried Rice       - Rs. 70\n3. Chicken Fried Rice   - Rs. 100");
			break;
			case 2:
			System.out.println("1. Veg Noodles          - Rs. 40\n2. Chicken Noodles      - Rs. 60\n3. Egg Noodles          - Rs. 80");
			break;
			case 3:
			System.out.println("1. Chicken Chilli       - Rs. 100\n2. Grill Chicken        - Rs. 150\n3. Paneer Manchurian    - Rs. 120");
			break;
			default:
			System.out.println("Choose a valid category");
		}
		System.out.print("Choose the sub category:");
        int subcategory=sc.nextInt();
		System.out.print("Enter the quantity:");
		int quantity=sc.nextInt();
		double Rate=0.0;
		if(category==1){
		switch(subcategory)
		{
			case 1:
			Rate=50;
			break;
			case 2:
			Rate=70;
			break;
			case 3:
			Rate=100;
			break;
			default:
			System.out.println("Choose a valid option");
		}
	}
	else if(category==2){
		switch(subcategory){
		case 1:
			Rate=40;
			break;
			case 2:
			Rate=60;
			break;
			case 3:
			Rate=80;
			break;
			default:
			System.out.println("Choose a valid option");
	}
}
	else if(category==3){
		switch(subcategory){
		case 1:
			Rate=100;
			break;
			case 2:
			Rate=150;
			break;
			case 3:
			Rate=120;
			break;
			default:
			System.out.println("Choose a valid option");
	}
}
	else
	{
		System.out.println("Choose a valid Category");
	}
		System.out.println("Rate of 1 Quantity: Rs."+Rate);
		double Amount= Rate*quantity;
		System.out.println("Rate of "+ quantity+" Quantity: Rs."+Amount);
		grandtotal+=Amount;
		System.out.print("\nDo you want to order another item? (yes/no): ");
        choice = sc.next().charAt(0);
        System.out.println();
	} while (choice == 'y' || choice == 'Y');
		System.out.println("===============================================");
		System.out.println("Total Bill Amount: Rs."+grandtotal);
		 System.out.println("===============================================");
        System.out.println("    Thank You for Visiting KARUR EXPRESS   ");
        System.out.println("            !!!Have a Great Day!!!   ");
        System.out.println("===============================================");

    }
}