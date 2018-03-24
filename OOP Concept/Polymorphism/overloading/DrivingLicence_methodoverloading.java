class DrivingLicence_methodoverloading{
	void License(int NIC, int TelNum, String Name){
		System.out.println("good - Having all info");
	}
	void License(String Name){
		System.out.println("Need to Submit More and NIC is must");
	}
	void License(int NIC){
		System.out.println("partially ok");
	}
	void License(){
		System.out.println("Field is empty");
	}
	
	public static void main(String args[]){
		DrivingLicence_methodoverloading dm = new DrivingLicence_methodoverloading();
		dm.License();
		dm.License(9420,07506,"siraj");
		dm.License(2323);
	}
	
}