package com.example.assignment1gc200474224;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;

public class NuclearTableController {

    @FXML
    private TreeTableColumn<?, Integer> amountOfWeapons;

    @FXML
    private TreeTableColumn<?, String> country;

    @FXML
    private TreeTableColumn<?, String> countryCode;

    @FXML
    private TreeTableView<?> tableView;

    @FXML
    private Label totalNukesLabel;

    @FXML
    private TreeTableColumn<?, Integer> year;

}
