package in.cdac.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import in.cdac.domain.Bus;
import in.cdac.domain.Customer;
import in.cdac.domain.Ticket;

public class Tester {
	private static Scanner sc = new Scanner(System.in);

	private List<Bus> busList = new ArrayList<>();
	private List<Customer> customerList = new ArrayList<>();

	public void addBus(Bus[] arr) {
		if (arr != null) {
			for (Bus bus : arr) {
				this.busList.add(bus);
			}
		}
	}

	public void showBuses() {
		if (this.busList != null) {
			this.busList.forEach(System.out::println);
		}

	}

	public Bus findBus() {
		System.out.print("| Enter the Bus Number:  ");
		int num = sc.nextInt();
		if (this.busList != null) {
			Bus key = new Bus();
			key.setBusNo(num);
			if (this.busList.contains(key)) {
				int index = this.busList.indexOf(key);
				Bus value = this.busList.get(index);
				return value;
			}
		}

		return null;
	}

	private int index = 26584;

	public Ticket bookTicket(Bus bus) {
		System.out.print("| Enter Number Of Seat: ");
		int seat = sc.nextInt();
		float calPrice = bus.getFare() * seat;
		if (bus != null && seat <= bus.getAvailSeats()) {
			Ticket ticket = new Ticket();
			ticket.setFare(calPrice);
			ticket.setTicketId(index = index * 10 / 5 + 2);
			ticket.setBusNo(bus.getBusNo());
			ticket.setbName(bus.getbName());
			ticket.setRouteFrom(bus.getRouteFrom());
			ticket.setRouteTo(bus.getRouteTo());
			ticket.setArrival(bus.getArrival());
			ticket.setDeparture(bus.getDeparture());
			ticket.setSeat(seat);
			ticket.setAvailSeats(bus.getAvailSeats() - seat);
			ticket.setTotalSeats(bus.getTotalSeats());

			return ticket;
		}
		System.out.println(seat + "              <<<< Seat Not Avalilable >>>>               ");
		return null;
	}

	public void addCustomerTicket(Customer customer) {
		if (customer != null) {
			this.customerList.add(customer);
		}

	}

	public void printTicket() {
		if (customerList != null) {
			this.customerList.forEach(System.out::println);
		}
	}

	public Ticket findTicket() {
		System.out.print("customer id for cancle ticket :-> ");
		int id = sc.nextInt();

		if (this.customerList != null) {
			Customer customer = new Customer();
			customer.setCusId(id);
			if (this.customerList.contains(customer)) {
				int index = this.customerList.indexOf(customer);
				Customer value = this.customerList.get(index);
				Ticket t = value.getTicket();
				return t;
			}
		}
		return null;
	}

	public void cancleTicket(Ticket ticket, Bus bus) {
		System.out.print("Enter Number of seat : ");
		int seat = sc.nextInt();
		if (ticket != null) {
			ticket.setSeat(ticket.getSeat() - seat);
			ticket.setFare((float) (ticket.getFare() - seat * bus.getFare()));
			ticket.setSeat(ticket.getSeat());
			ticket.setAvailSeats(ticket.getAvailSeats() + seat);

		}

	}

}
