package co.edu.uniquindio.poo.viewController;


    /**
     * Sample Skeleton for 'CrudReserva.fxml' Controller Class
     */
    
    import java.net.URL;
    import java.util.ResourceBundle;
    import javafx.fxml.FXML;
    import javafx.scene.control.Button;
    import javafx.scene.control.ComboBox;
    import javafx.scene.control.DatePicker;
    import javafx.event.ActionEvent;
    public class ReservaViewController {
    
        @FXML // ResourceBundle that was given to the FXMLLoader
        private ResourceBundle resources;
    
        @FXML // URL location of the FXML file that was given to the FXMLLoader
        private URL location;
    
        @FXML // fx:id="ButonEliminar"
        private Button ButonEliminar; // Value injected by FXMLLoader
    
        @FXML // fx:id="ButonAgregar"
        private Button ButonAgregar; // Value injected by FXMLLoader
    
        @FXML // fx:id="CoxCliente"
        private ComboBox<?> CoxCliente; // Value injected by FXMLLoader
    
        @FXML // fx:id="DateInicio"
        private DatePicker DateInicio; // Value injected by FXMLLoader
    
        @FXML // fx:id="CoxVehiculo"
        private ComboBox<?> CoxVehiculo; // Value injected by FXMLLoader
    
        @FXML // fx:id="DateFinal"
        private DatePicker DateFinal; // Value injected by FXMLLoader
    
        @FXML
        void MostrarListaVehiculos(ActionEvent event) {
    
        }
    
        @FXML
        void MostrarListaClientes(ActionEvent event) {
    
        }
    
        @FXML
        void InicioReserva(ActionEvent event) {
    
        }
    
        @FXML
        void FinalReserva(ActionEvent event) {
    
        }
    
        @FXML
        void AgregarReserva(ActionEvent event) {
    
        }
    
        @FXML
        void EliminarReserva(ActionEvent event) {
    
        }
    
        @FXML // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
            assert ButonEliminar != null : "fx:id=\"ButonEliminar\" was not injected: check your FXML file 'CrudReserva.fxml'.";
            assert ButonAgregar != null : "fx:id=\"ButonAgregar\" was not injected: check your FXML file 'CrudReserva.fxml'.";
            assert CoxCliente != null : "fx:id=\"CoxCliente\" was not injected: check your FXML file 'CrudReserva.fxml'.";
            assert DateInicio != null : "fx:id=\"DateInicio\" was not injected: check your FXML file 'CrudReserva.fxml'.";
            assert CoxVehiculo != null : "fx:id=\"CoxVehiculo\" was not injected: check your FXML file 'CrudReserva.fxml'.";
            assert DateFinal != null : "fx:id=\"DateFinal\" was not injected: check your FXML file 'CrudReserva.fxml'.";
        }
    }

    



