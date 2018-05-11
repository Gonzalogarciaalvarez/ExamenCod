/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodExamen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
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
      // System.console().writer().println("javapackager -deploy -native exe packges -outfile Cod -srcdir dist -srcfiles Cod.jar -appclass Cod.java -name Cod -title Cod");
      //Declaramos y lanzamos una ventana para obtener el valor de cada variable
      String outdir = JOptionPane.showInputDialog("Direccion de salida(outdir)");
      String outfile = JOptionPane.showInputDialog("Nombre del archivo (outfile)");
      String categoria = JOptionPane.showInputDialog("Categoria (category)");
      String srcdir = JOptionPane.showInputDialog("Direccion del src (srcdir)");
      String srcfiles = JOptionPane.showInputDialog("Archivo .jar (srcfiles)"); 
      String clase = JOptionPane.showInputDialog("Clase de la aplicacion (appclass)");
      String titulo = JOptionPane.showInputDialog("Titulo y nombre de la app");
      
      //Ahora que ya tenemos los datos necesarios, creamos la linea del comando para crear el .deb
      
      String comando ="javapackager -deploy -native deb"+" -Bcategory="+categoria+" -outdir "+outdir+" -outfile "+outfile+" -srcdir "+srcdir+" -srcfiles "+srcfiles+" -appclass "+clase+" -name "+titulo+" -title "+titulo;

    }
}
