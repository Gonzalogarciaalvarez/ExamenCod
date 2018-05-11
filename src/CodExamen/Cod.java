/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodExamen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        // TODO implement action body
        
    }
}
