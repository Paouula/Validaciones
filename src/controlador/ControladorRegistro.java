package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import vista.frmRegistro;

//3.Importar de la clase MouseListener
public class ControladorRegistro implements MouseListener{
    
    //1.Mando a llamar a las otras capas
    frmRegistro vista;
    
    //2.Constructor
    public ControladorRegistro(frmRegistro Vista){
        this.vista = Vista;

        vista.btnRegistrar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() ==vista.btnRegistrar){
            //Validaciones
            
            //1.Campos vacios 
            if(vista.txtNomre.getText().isEmpty()){
                JOptionPane.showMessageDialog(vista, "Llene el campo del nombre");
            }
            
            //2.Validacion de Correo
            if(!vista.txtCorreo.getText().contains("@") || !vista.txtCorreo.getText().contains(".com")){
            }
            
            //Validacion "Llenar Campos Correo"
             if(vista.txtCorreo.getText().isEmpty()){
                 JOptionPane.showMessageDialog(vista, "Llene el campo del correo");
            }
            
            //Validacion "Llenar Campos Contraseña"
             if(vista.txtContra.getText().isEmpty()){
                 JOptionPane.showMessageDialog(vista, "Llene el campo de la contraseña");
            }
             
             //3.Contraseña contenga mas de 6 caracteres 
            if(vista.txtContra.getText().length() < 6){
                JOptionPane.showMessageDialog(vista, "La contraseña debe tener mas de 6 caracteres");
            }
            
            //4.Edad
            
            //Validacion "Llenar Campos Edad"
             if(vista.txtEdad.getText().isEmpty()){
                 JOptionPane.showMessageDialog(vista, "Llene el campo de la edad");
            }
             
             try {
                int edadNumerica = Integer.parseInt(vista.txtEdad.getText());
             }
             catch(Exception ex) {
                JOptionPane.showMessageDialog(vista, "Ingrese Numeros");
                return;
            }
             
              //3.Que la edad no sea invalida
              //Corregir bien pq sale invalido todo XD
            if(vista.txtEdad.getText().length() < 100 ){
                JOptionPane.showMessageDialog(vista, "La edad es invalida");
            }

           
            }
            
        }

    /**
     *
     * @param e
     */
    @Override
    public void mousePressed(MouseEvent e) {
    }

    /**
     *
     * @param e
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    /**
     *
     * @param e
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    /**
     *
     * @param e
     */
    @Override
    public void mouseExited(MouseEvent e) {
        
    }}


