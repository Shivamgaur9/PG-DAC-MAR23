package in.cdac.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import in.cdac.en.mainMenu;
import in.cdac.en.subMenu;
import in.cdac.domain.Bus;
import in.cdac.domain.Customer;
import in.cdac.domain.Ticket;
import in.cdac.test.Tester;

public class Program {
	private static Tester test = new Tester();
	private static Customer customer = null;
	private static Bus bus = null;
	private static Scanner sc = new Scanner(System.in);

	private static int custId = 16324;
	public static int custIdGen(){
		custId = custId *10/6 -5 +10;
		return custId;
	}

	public static Bus[] getBuses() {
		Bus[] arr = new Bus[5];
		arr[0] = new Bus(21, "TARZAN", "DELHIi", "MUMBAI", "9:00 PM", "8:00 AM", 30, 15, 2000.00f);
		arr[1] = new Bus(22, "TRON", "PUNE", "MUMBAI", "8:00 PM", "9:00 AM", 30, 25, 2220.00f);
		arr[2] = new Bus(23, "AAKASH", "MATHURA", "VRINDAVAN", "11:00 PM", "6:00 AM", 30, 25, 200.00f);
		arr[3] = new Bus(24, "VYOM", "DELHI", "AGRA", "11:00 PM", "8:00 AM", 30, 5, 500.00f);
		arr[4] = new Bus(25, "AGNI", "NASIK", "HARIDWAR", "9:00 PM", "8:00 AM", 30, 5, 1000.00f);
		return arr;
	}

	private static void acceptUser() throws InputMismatchException {
		System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------|");
		customer = new Customer();
		sc.nextLine();
		System.out.print("|Enter firstName : ");
		customer.setFirstName(sc.nextLine());
		System.out.print("|Enter lastName  : ");
		customer.setLastName(sc.nextLine());
		System.out.print("|Enter address   : ");
		customer.setAddress(sc.nextLine());
		while (true) {

			System.out.print("|Enter mobile Number    : ");
			long number = sc.nextLong();
			if (number > 999_999_999L && number < 999_999_999_9L) {
				customer.setMobile(number);
				break;
			}else {
				System.out.println("Invalid number !! try again --!");
			}
		}

		Effetcs.loadEffect("Customer Id is generating :");
		customer.setCusId(Program.custIdGen() );
		System.out.println("Your Customer ID -> "+ customer.getCusId());
		System.out.println();
		System.out.println("|                                          <<Your Details>>                                                                          ");
		Program.printUser();
		System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------|");
	}
	private static void printUser() {
		System.out.println("|  "+customer.toString());

	}


	private static mainMenu menuList() throws ArrayIndexOutOfBoundsException{
		System.out.println("|-----------------------------------------------------------------------------------------|");
		System.out.println("|                            0.Exit                                                       |");
		System.out.println("|                            1.Enter Your Details :                                       |");
		System.out.println("|                            2.Enter TO <<< BOOK SYSTEM >>>                               |");
		System.out.print("|                            *.Enter your Choice :->                                      |");
		System.out.println();
		System.out.println("|-----------------------------------------------------------------------------------------|");
		System.out.println();
		return mainMenu.values()[sc.nextInt()];

	}


	private static subMenu subMenuList()throws ArrayIndexOutOfBoundsException {
		System.out.println("|-----------------------------------------------------------------------------------------|");
		System.out.println("|                               [0]->  Exit                                               |");
		System.out.println("|                               [1]->  Book Ticket                                        |");
		System.out.println("|                               [2]->  Cancle Ticket                                      |");
		System.out.println("|                               [3]->  Display Ticket                                     |");
		System.out.print("|                                 Enter Choice :                                          |");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------");
		return subMenu.values()[sc.nextInt()];
	}

	@SuppressWarnings("incomplete-switch")
	public static void main(String[] args) {
		System.out.println();
		System.out.println("|-----------------------------------------------------------------------------------------|");
		System.out.println("|                                                                                         |");
		System.out.println("|                           Enter The Team Bus Booking System                             |");
		System.out.println("|                                                                                         |");
		System.out.println("|-----------------------------------------------------------------------------------------|");
		System.out.println();
		mainMenu choice;
		subMenu subchoice;
		test.addBus(Program.getBuses());
		while (true) {
			try {
				choice = Program.menuList();
				if (choice == mainMenu.EXIT)
					break;
				switch (choice) {
					case ENTER_DETAILS:
						Program.acceptUser();
						break;
					case BOOKING_SYSTEM:
						while (true) {
							try {
								subchoice = Program.subMenuList();
								if (subchoice == subMenu.EXIT)
									break;
								switch (subchoice) {
									case BOOK_TICKET:
										System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------|");
										test.showBuses();
										System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------|");
										bus = test.findBus();
										Ticket ticket = test.bookTicket(bus);
										if (ticket != null) {
											if(customer != null) {
												customer.setTicket(ticket);
												test.addCustomerTicket(customer);
											}
											else {
												System.out.println("|                    <<<Cutomer is not Created>>>");
											}
										} else {
											System.out.println("|                        <<<Ticket Not Booked>>>   ");
										}
										break;
									case CANCEL_TICKET:
										Ticket ticket1 = test.findTicket();
										if(ticket1 != null) {
											test.cancleTicket(ticket1, bus);
										}else
											System.out.println("                       <<<<Ticket Not Found>>>>     ");
										break;
									case DISPLAY_TICKET:
										test.printTicket();
										break;
									default:
										System.out.println("<<<<<<<<<<<<<<<<<<<<< InValid Input >>>>>>>>>>>>>>>>>>>>");
										break;
								}
							}
							catch (InputMismatchException e) {
								sc.nextLine();
								System.out.println("Invalid Input");

							}
							catch ( ArrayIndexOutOfBoundsException e){
								sc.nextLine();
								System.out.println("Invalid Input");
							}
						}
						break;
					default:
						break;
				}
			}
			catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Invalid Input");

			}
			catch ( ArrayIndexOutOfBoundsException e){
				sc.nextLine();
				System.out.println("Invalid Input");
			}
		}
	}

}
