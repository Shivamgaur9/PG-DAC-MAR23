package in.cdac.domain;

public class Ticket {
	private int ticketId;
	private int busNo;
	private String bName;
	private String routeFrom;
	private String routeTo;
	private String arrival;
	private String departure;
	private float fare;
	private int seat;
	private int availSeats;
	private int totalSeats;

	public Ticket() {
		super();
	}

	public Ticket(int ticketId, int busNo, String bName, String routeFrom, String routeTo, String arrival,
			String departure, float fare, int totalSeats, int availSeats, int seat) {
		super();
		this.ticketId = ticketId;
		this.busNo = busNo;
		this.bName = bName;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.arrival = arrival;
		this.departure = departure;
		this.fare = fare;
		this.totalSeats = totalSeats;
		this.availSeats = availSeats;
		this.seat = seat;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getRouteFrom() {
		return routeFrom;
	}

	public void setRouteFrom(String routeFrom) {
		this.routeFrom = routeFrom;
	}

	public String getRouteTo() {
		return routeTo;
	}

	public void setRouteTo(String routeTo) {
		this.routeTo = routeTo;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public int getAvailSeats() {
		return availSeats;
	}

	public void setAvailSeats(int availSeats) {
		this.availSeats = availSeats;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	@Override
	public String toString() {
		return "Ticket{" + "ticketId=" + ticketId + ", busNo=" + busNo + ", bName='" + bName + '\'' + ", routeFrom='"
				+ routeFrom + '\'' + ", routeTo='" + routeTo + '\'' + ", arrival='" + arrival + '\'' + ", departure='"
				+ departure + '\'' + ", fare=" + fare + ", seat=" + seat + ", availSeats=" + availSeats
				+ ", totalSeats=" + totalSeats + '}';
	}
}
