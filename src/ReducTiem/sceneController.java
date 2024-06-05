package ReducTiem;

import com.sun.deploy.uitoolkit.impl.fx.HostServicesFactory;
import com.sun.javafx.application.HostServicesDelegate;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import sun.security.krb5.internal.crypto.Des;

import java.io.IOException;
import java.util.Optional;

import java.awt.Desktop;
import java.net.URI;

public class sceneController {



    @FXML
        private Button createBtn;
    @FXML
        private Button aboutBtn;
    @FXML
        private Button exitBtn;
    @FXML
        private Button backBtn;
    @FXML
        private Button termsBtn;
    @FXML
        private Button appBtn;


    private String directory = "main menu.fxml";

    public void loadScene(ActionEvent e) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(directory));

        if (directory.equals("create Planner.fxml"))
        {
            planMaker pm = loader.getController();
        }

        Parent next = (Parent) loader.load();
        Scene scene = new Scene(next);

        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void toCreateScene(ActionEvent e) throws IOException
    {
        directory = "create planner.fxml";
        loadScene(e);
    }

    public void toAboutScene(ActionEvent e) throws IOException
    {
        directory = "about.fxml";
        loadScene(e);
    }

    public void toTermsScene(ActionEvent e) throws IOException
    {
        directory = "terminology.fxml";
        loadScene(e);
    }

    public void redirectLink(ActionEvent e) throws Exception
    {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://www.projectmanager.com/pert-chart"));
    }

    public void exitProgram(ActionEvent e) throws IOException
    {
        Alert confirmation = new Alert(Alert.AlertType.CONFIRMATION);
        confirmation.setTitle("Exit Program");
        confirmation.setHeaderText("Do you want to exit?");
        confirmation.setContentText("Clicking \"Yes\" will exit the program.");

        Optional<ButtonType> result = confirmation.showAndWait();
        if (result.get() == ButtonType.OK)
        {
            System.exit(0);
        }
    }

}
