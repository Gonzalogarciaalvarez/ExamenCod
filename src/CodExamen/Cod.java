/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodExamen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "CodExamen.Cod"
)
@ActionRegistration(
        iconBase = "CodExamen/descarga.png",
        displayName = "#CTL_Cod"
)
@ActionReference(path = "Toolbars/File", position = 0)
@Messages("CTL_Cod=Contornos")
public final class Cod implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      //Declaramos y lanzamos una ventana para obtener el valor de cada variable
      String outdir = JOptionPane.showInputDialog("Direccion de salida(outdir)");
      String outfile = JOptionPane.showInputDialog("Nombre del archivo (outfile)");
      String categoria = JOptionPane.showInputDialog("Categoria (category)");
      String srcdir = JOptionPane.showInputDialog("Direccion del src (srcdir)");
      String srcfiles = JOptionPane.showInputDialog("Archivo .jar (srcfiles)"); 
      String clase = JOptionPane.showInputDialog("Clase de la aplicacion (appclass)");
      String titulo = JOptionPane.showInputDialog("Titulo y nombre de la app");
      
      //Ahora que ya tenemos los datos necesarios, creamos la linea del comando para crear el .deb
      //y la metemos en un string
      
      String comando ="javapackager -deploy -native deb"+" -Bcategory="+categoria+" -outdir "+outdir+" -outfile "+outfile+" -srcdir "+srcdir+" -srcfiles "+srcfiles+" -appclass "+clase+" -name "+titulo+" -title "+titulo;
      //Ahora que tenemos formada la linea de codigo que queremos introducir en la consola
      //Tenemos que crear el metodo que ejecute el comando
      try{
          //Creacion de un objeto tipo runtime
          Runtime rt = Runtime.getRuntime();
          //Aqui le decimos que comando tiene que ejecutar
          Process pr = rt.exec(comando);
          String linea =null;
          //El bufferedReader lee texto de una secuencia de entrada de caracteres
          BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
          
            while((linea = input.readLine())!=null){
               System.out.println(linea); 
            }
 
      } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
