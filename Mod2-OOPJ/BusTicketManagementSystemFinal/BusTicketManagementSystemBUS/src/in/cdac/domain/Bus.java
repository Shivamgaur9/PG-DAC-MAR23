package in.cdac.domain;

import java.util.Objects;

public class Bus {
	private int busNo;
	private String bName;
	private String routeFrom;
	private String routeTo;
	private String arrival;
	private String departure;
	private int totalSeats;
	private int availSeats;
	private float fare;

	public Bus(int busNo, String bName, String routeFrom, String routeTo, String arrival, String departure,
			int totalSeats, int availSeats, float fare) {
		super();
		this.busNo = busNo;
		this.bName = bName;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.arrival = arrival;
		this.departure = departure;
		this.totalSeats = totalSeats;
		this.availSeats = availSeats;
		this.fare = fare;
	}

	public Bus() {
		super();
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

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getAvailSeats() {
		return availSeats;
	}

	public void setAvailSeats(int availSeats) {
		this.availSeats = availSeats;
	}

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Bus bus = (Bus) o;
		return busNo == bus.busNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(busNo);
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", bName=" + bName + ", routeFrom=" + routeFrom + ", routeTo=" + routeTo
				+ ", bType=" + ", arrival=" + arrival + ", departure=" + departure + ", totalSeats=" + totalSeats
				+ ", availSeats=" + availSeats + ", fare=" + fare + "]";
	}

}
