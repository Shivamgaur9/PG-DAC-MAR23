package in.cdac.acts.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Restaurant {
	
	MenuItem[] arr = new MenuItem[5];

	public Restaurant() {
		this.arr[0]= new MenuItem("Idli",68.00,170);
		this.arr[1]= new MenuItem("Idli",69.00,102);
		this.arr[2]= new MenuItem("Idli",60.00,104);
		this.arr[3]= new MenuItem("Idli",67.00,165);
		this.arr[4]= new MenuItem("Idli",66.00,198);
	}

	public void printArray() {
		
		for(MenuItem menuitem : arr )
			System.out.println(menuitem);	
		System.out.println();
	}
}
