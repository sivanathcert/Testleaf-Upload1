package org.system;

public class Desktop extends Computer {
	
	// Creating desktopSize() method with details and Desktop class inherits Computer class
	
	//Creating desktopsize() method and contents
	public void desktopSize() {
		System.out.println("-----------------------------------------\n");
		System.out.println("\t Desktop Size Information \n");
		System.out.println("15.6' Window Size");
		System.out.println("16GB RAM / 512 GB Memory");
		System.out.println("512 GB Memory");
		System.out.println("\n-----------------------------------------");
	}
	public static void main(String[] args) {
		
		//Creating object to call methods of Desktop & Computer
		Desktop compInfo = new Desktop();
		compInfo.computerModule();
		compInfo.desktopSize();
	}
}
