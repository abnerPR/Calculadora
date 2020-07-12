
package org.abnerpiox.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    float dato1, dato2, resultado;
    int op;
    int contador = 0;
    int acumulador;
        
    @FXML Button btnMasMenos;
    @FXML Button btnCero;
    @FXML Button btnPunto;
    @FXML Button btnIgual;
    @FXML Button btnUno;
    @FXML Button btnDos;
    @FXML Button btnTres;
    @FXML Button btnSuma;
    @FXML Button btnCuatro;
    @FXML Button btnCinco;
    @FXML Button btnSeis;
    @FXML Button btnResta;
    @FXML Button btnSiete;
    @FXML Button btnOcho;
    @FXML Button btnNueve;
    @FXML Button btnMultiplicacion;
    @FXML Button btnCE;
    @FXML Button btnC;
    @FXML Button btnDivision;
    @FXML Button btnPorcentaje;
    @FXML Button btnRaiz;
    @FXML Button btnCuadrado;
    @FXML Button btnUnoX;
    @FXML TextField txtValores;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnUno)
            txtValores.setText(txtValores.getText() + "1");
        
        else if (event.getSource() == btnDos)
            txtValores.setText(txtValores.getText() + "2");
        
        else if(event.getSource() == btnTres)
            txtValores.setText(txtValores.getText() + "3");
        
        else if(event.getSource() == btnCuatro)
            txtValores.setText(txtValores.getText() + "4");
        
        else if(event.getSource() == btnCinco)
            txtValores.setText(txtValores.getText() + "5");
        
        else if(event.getSource() == btnSeis)
            txtValores.setText(txtValores.getText() + "6");
        
        else if(event.getSource() == btnSiete)
            txtValores.setText(txtValores.getText() + "7");
        
        else if(event.getSource() == btnOcho)
            txtValores.setText(txtValores.getText() + "8");
        
        else if(event.getSource() == btnNueve)
            txtValores.setText(txtValores.getText() + "9");
        
        else if(event.getSource() == btnCero)
            txtValores.setText(txtValores.getText() + "0");
        
        if(event.getSource() == btnSuma){
            
            if(contador == 0){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            contador = contador + 1;
            op = 1;
            }
            
            else if(contador != 0){
                dato2 = Float.parseFloat(txtValores.getText());
                resultado = dato1 + dato2;
                txtValores.setText("");
                dato1 = resultado;
                dato2 = 0;
            }
        }
        
  
        else if(event.getSource() == btnResta){
            
            if(contador == 0){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            contador = contador + 1;
            op = 2;
            }
            else if(contador != 0){
                dato2 = Float.parseFloat(txtValores.getText());
                txtValores.setText("");
                resultado = dato1 - dato2;
                dato1 = resultado;
                dato2 = 0;
            }
        }
        
       else if(event.getSource() == btnMultiplicacion){
           
           if(contador == 0){
           dato1 = Float.parseFloat(txtValores.getText());
           txtValores.setText("");
           contador = contador + 1;
           op = 3;
           }
           else if(contador != 0){
               dato2 = Float.parseFloat(txtValores.getText());
               txtValores.setText("");
               resultado = dato1 * dato2;
               dato1 = resultado;
           }
           
       }
       
       else if(event.getSource() == btnDivision){
           
           if(contador == 0){
           dato1 = Float.parseFloat(txtValores.getText());
           txtValores.setText("");
           contador =   contador + 1;
           op = 4;
           }
           else if(contador != 0){
               dato2 = Float.parseFloat(txtValores.getText());
               txtValores.setText("");
               resultado = dato1 / dato2;
               dato1 = resultado;
           }
       }
       
       else if(event.getSource() == btnIgual){
            contador = 0;
           
            if(txtValores.getText().length() != 0){
                dato2 = Float.parseFloat(txtValores.getText());
            switch(op){
                case 1:
                resultado = dato1 + dato2;
                txtValores.setText(String.valueOf(resultado));
                break;
                
                case 2:
                resultado = dato1 - dato2;
                txtValores.setText(String.valueOf(resultado));
                break;  
                
                case 3:
                resultado = dato1 * dato2;
                txtValores.setText(String.valueOf(resultado));
                break;
                
                case 4:
                resultado = dato1 / dato2;
                txtValores.setText(String.valueOf(resultado));
                break;
                }
            }else 
                txtValores.setText("ERROR");
                
       }
        
        
        else if(event.getSource() == btnPorcentaje){
           if(contador == 0){
              dato1 = Float.parseFloat(txtValores.getText());
              resultado = dato1 / 100;
              txtValores.setText(String.valueOf(resultado));
           }else if(contador != 0){
              dato2 = Float.parseFloat(txtValores.getText());
              resultado = dato1 * (dato2 / 100);
              txtValores.setText(String.valueOf(resultado));
              contador = 0;
           }    
       }
        else if(event.getSource() == btnRaiz){
           dato1 = Float.parseFloat(txtValores.getText());
           txtValores.setText(String.valueOf(Math.sqrt(dato1)));
       }
        
        else if(event.getSource() == btnCuadrado){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText(String.valueOf(dato1 * dato1));
        }
        
        else if(event.getSource() == btnUnoX){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText(String.valueOf(1 / dato1));
        }
        
        else if(event.getSource() == btnCE){
            txtValores.setText("");
        }
        
        else if(event.getSource() == btnC){
            txtValores.setText("");
            dato1 = 0;
            dato2 = 0;
            resultado = 0;
            
        }
        
        else if(event.getSource() == btnMasMenos){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText(String.valueOf((dato1 * -1)));
        }
        
        else if(event.getSource() == btnPunto){
            
            
            if(txtValores.getText().contains("."))
                ;
            
            else{
            if(txtValores.getText().length() != 0)
                txtValores.setText(txtValores.getText() + ".");
            else
                txtValores.setText("0.");         
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
