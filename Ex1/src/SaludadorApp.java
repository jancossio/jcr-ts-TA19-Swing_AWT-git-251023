
public class SaludadorApp {

	public static void main(String[] args) {
		
		try {
			Saludar aplicacion = new Saludar();
			aplicacion.setVisible(true);
		}catch(Exception e) {
			//System.out.println("Error: "+e);
			e.printStackTrace();

		}
	}
	
}
