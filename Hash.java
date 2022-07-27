public class Hash {

	public static void main(String[] args) {
		country countries = new country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("Sri Lanka");
		countries.saveCountryNames("China");

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("USA: " + countries.getCountry("USA"));		
	}

}