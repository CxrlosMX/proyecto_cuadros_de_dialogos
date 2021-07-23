/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marco;

import javax.swing.JFrame;
import lamina.Lamina;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 20/07/2021
 * 
 */
public class miMarco extends JFrame{
    
    public miMarco(){
        setVisible(true);
        setBounds(400, 150, 600, 600);
        setTitle("Prueba de Dialogos");
        Lamina lamina=new Lamina();
        add(lamina);
        
    }
}
