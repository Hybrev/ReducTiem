package ReducTiem;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.ResourceBundle;

public class planMaker implements Initializable
{
    sceneController sc = new sceneController();

    @FXML
        private Button backBtn;
    @FXML
        private Button addInputs;
    @FXML
        private Button addPredBtn;
    @FXML
        private Button clearPredList;
    @FXML
        private Button saveXlsx;

    @FXML
        private Text resultsTxt;

    @FXML
        private TextField predList;
    @FXML
        private TextField taskName;
    @FXML
        private TextField optTime;
    @FXML
        private TextField probTime;
    @FXML
        private TextField pesTime;

    @FXML
        private TableView<PertTable> taskList;
    @FXML
        private TableColumn<PertTable, String> codeCol;
    @FXML
        private TableColumn<PertTable, String> taskCol;
    @FXML
        private TableColumn<PertTable, String> predCol;
    @FXML
        private TableColumn<PertTable, Integer> otCol;
    @FXML
        private TableColumn<PertTable, Integer> mtCol;
    @FXML
        private TableColumn<PertTable, Integer> ptCol;
    @FXML
        private TableColumn<PertTable, Integer> etCol;
    @FXML
        private TableColumn<PertTable, Integer> esCol;
    @FXML
        private TableColumn<PertTable, Integer> efCol;
    @FXML
        private TableColumn<PertTable, Integer> lsCol;
    @FXML
        private TableColumn<PertTable, Integer> lfCol;
    @FXML
        private TableColumn<PertTable, Integer> slCol;



    private ArrayList<String> codes = new ArrayList<>();
    private ArrayList<String> predecessors = new ArrayList<>();

    private int code_ctr = 0;

    public void toMain(ActionEvent e) throws IOException
    {
        sc.loadScene(e);
    }

    public void addPredecessors(ActionEvent e)
    {
        TextInputDialog popup = new TextInputDialog();
        popup.setTitle("Adding predecessors");
        popup.getDialogPane().setContentText("Enter the predecessor's Code:");
        Optional<String> input = popup.showAndWait();

        predList.setText(popup.getEditor().getText());
        predecessors.add(String.valueOf(input));

    }

    public void clearPredList(ActionEvent e)
    {
        predecessors.clear();
        predList.clear();
    }

    public void addToTable(ActionEvent e)
    {
        PertTable items_row = new PertTable(code_ctr, taskName.getText(), predList.getText(),
                Integer.parseInt(optTime.getText()), Integer.parseInt(probTime.getText()), Integer.parseInt(pesTime.getText()));
        taskList.getItems().add(items_row);
        code_ctr++;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        codeCol.setCellValueFactory(new PropertyValueFactory<>("Code"));
        taskCol.setCellValueFactory(new PropertyValueFactory<>("Task_name"));
        predCol.setCellValueFactory(new PropertyValueFactory<>("Predecessors"));
        otCol.setCellValueFactory(new PropertyValueFactory<>("Ot"));
        mtCol.setCellValueFactory(new PropertyValueFactory<>("Mt"));
        ptCol.setCellValueFactory(new PropertyValueFactory<>("Pt"));
        etCol.setCellValueFactory(new PropertyValueFactory<>("Et"));
        esCol.setCellValueFactory(new PropertyValueFactory<>("Es"));
        efCol.setCellValueFactory(new PropertyValueFactory<>("Ef"));
        lsCol.setCellValueFactory(new PropertyValueFactory<>("Ls"));
        lfCol.setCellValueFactory(new PropertyValueFactory<>("Lf"));
        slCol.setCellValueFactory(new PropertyValueFactory<>("Sl"));

        taskList.setItems(observableList);

        predList.setEditable(false);
    }

    ObservableList<PertTable> observableList = FXCollections.observableArrayList(
            new PertTable(0,"yes","none",0,0,0, 0, 0, 0, 0, 0, 0)
    );

}
