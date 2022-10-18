package com.example.assignment1gc200474224;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class NuclearTableController implements Initializable {

    @FXML
    private TableColumn<NuclearArms, Integer> amountOfWeapons;

    @FXML
    private TableColumn<NuclearArms, String> country;

    @FXML
    private TableColumn<NuclearArms, String> countryCode;

    @FXML
    private TableColumn<NuclearArms, Integer> id;

    @FXML
    private TableView<NuclearArms> tableView;

    @FXML
    private TableColumn<NuclearArms, Integer> year;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        year.setCellValueFactory(new PropertyValueFactory<>("year"));
        countryCode.setCellValueFactory(new PropertyValueFactory<>("countryCode"));
        country.setCellValueFactory(new PropertyValueFactory<>("country"));
        amountOfWeapons.setCellValueFactory(new PropertyValueFactory<>("amountOfWeapons"));

        tableView.getItems().addAll(DBUtility.getNukesFromDB());
    }
}
