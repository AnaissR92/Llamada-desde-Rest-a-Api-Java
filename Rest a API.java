


//Crear una solicitud Get a API usando la clase 
URLConnection.

@autor Anaiss Reyes Orta
/
public class ClienteServicioWebRest {
    
    public static void main(String[] args) {
        
        final String URL_API = "https://jsonplaceholder.typicode.com/todos";
        
        try {
            
            // Inicio de la conexion:
            URL url = new URL(URL_API)
            URLConnection conexion = url.openConnection()
            
            // Lectura del contenido de la respuesta:
            Reader r = new InputStreamReader(conexion.getInputStream());
            BufferedReader br = new BufferedReader(r):
            
            String linea;
            
            while(linea = br.readLine()) != null){
                System.out.println(linea);
        
        } catch (Exception e) {
            System.err.print("Error de I/O: + e.getMessage() ");
            
        }
}
