/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoxml;

import Modelo.Empleado;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author johana.mosquera
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label ltitulo;
    @FXML
    private Label lnombre;
    @FXML
    private Label ldir;
    @FXML
    private Label ledad;
    @FXML
    private Label lcodigo;
    @FXML
    private Label ldepto;
    
    @FXML
    private TextField tnombre;
    @FXML
    private TextField tdir;
    @FXML
    private TextField tedad;
    @FXML
    private TextField tcodigo;
    @FXML
    private TextField tdepto;
    
    LinkedList<Empleado> listaEmpleados;
    
    
    @FXML
    private void agregarEmpleadoLista(ActionEvent event) {
        // System.out.println("You clicked me!");
        // label.setText("Hello World!");
        
        String nombre = tnombre.getText();
        String direccion = tdir.getText();
        int edad = Integer.parseInt(tedad.getText());
        String codigoEmpleado = tcodigo.getText();
        String departamento = tdepto.getText();
        
        Empleado objE = new Empleado(codigoEmpleado, departamento, nombre, direccion, edad);
        
        listaEmpleados.add(objE);
        
        tnombre.setText("");
        tdir.setText("");
        tedad.setText("");
        tcodigo.setText("");
        tdepto.setText("");
        
        JOptionPane.showMessageDialog(null, "Se agregó un empleado");
        
    }
    
    @FXML
    private void crearArchivoXML(ActionEvent event) {
        Empleado objE = new Empleado();
        boolean guardar = objE.crearFileXML(listaEmpleados);
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        listaEmpleados = new LinkedList<>();
        
    }    
    
}
