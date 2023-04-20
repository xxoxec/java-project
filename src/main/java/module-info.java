module com.lion.javaproject {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.lion.javaproject to javafx.fxml;
    exports com.lion.javaproject;
}