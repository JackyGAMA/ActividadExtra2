package org.example;

public class LeerArchivo {
    public void leer(String ruta) throws IOException{
         
         BufferedReader reader = new BufferedReader(new FileReader(ruta));
         String line ="";
         while((line = reader.readLine())!=null){
               System.out.println("Info:"+Line);
        }  
       
    }

}
  public void metodoUno(String ruta) throws IOException{
      this.metodoDos(ruta);
   
}
  public void metodoDos(String ruta) throws IOException{
       this.leer(ruta);

  }
}