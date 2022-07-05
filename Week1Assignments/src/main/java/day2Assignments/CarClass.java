package day2Assignments;

public class CarClass {

		public static void main(String[] args) {
			CarClass carObj = new CarClass();
			System.out.println(carObj.switchOnAc());
			System.out.println(carObj.applyGear());
			String breakStatus = carObj.applyBreak();
			System.out.println(breakStatus);
			carObj.applyAcclerate();
			
		}
		
			public String applyBreak() {
				return "Applied Break";
			}
			public String applyGear() {
				return "Applied 4th Gear";
			}
			public boolean switchOnAc() {
				return true;
			}
			public void applyAcclerate() {
				System.out.println("Accelreated Car");
			}

	}


