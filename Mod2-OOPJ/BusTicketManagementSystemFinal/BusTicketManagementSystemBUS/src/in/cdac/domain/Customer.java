package in.cdac.domain;

import java.util.Objects;

public class Customer {
	private Ticket ticket;
	private int cusId;
	private String firstName;
	private String lastName;
	private String address;
	private long mobile;

	public Customer() {
		super();
	}

	public Customer(Ticket ticket, int cusId, String firstName, String lastName, String address, long mobile) {
		super();
		this.ticket = ticket;
		this.cusId = cusId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Customer customer = (Customer) o;
		return cusId == customer.cusId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cusId);
	}

	@Override
	public String toString() {
		return "Customer [ticket=" + ticket + ", cusId=" + cusId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", mobile=" + mobile + "]";
	}

}