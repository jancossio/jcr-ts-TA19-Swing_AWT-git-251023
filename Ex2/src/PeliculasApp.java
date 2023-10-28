
public class PeliculasApp {

	public static void main(String[] args) {
		
		try {
			Peliculas peliculas = new Peliculas();
			peliculas.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
