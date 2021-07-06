package ucf.assignmets;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TodoListController {


    @FXML
    public void addListClicked(ActionEvent actionEvent) {

        TodoListsManager.addList();
    }

    @FXML
    public void removeListClicked(ActionEvent actionEvent) {

        TodoListsManager.removeList();
    }

    @FXML
    public void editTitleofAlistClicked(ActionEvent actionEvent) {

        TodoListsManager.editTitleofaList();
    }

    @FXML
    public void editDescriptionofIteminListClicked(ActionEvent actionEvent) {
        TodoListsManager.editDescriptionofItem();
    }

    @FXML
    public void markAnItemclicked(ActionEvent actionEvent) {

        TodoListsManager.markAnItem();
    }

    @FXML
    public void editDueDateofItemclicked(ActionEvent actionEvent) {

        TodoListsManager.editDueDateofItem();
    }

    @FXML
    public void DisplayAllofCurrentListclicked(ActionEvent actionEvent) {

        TodoListsManager.DisplayAllofCurrentList();
    }

    @FXML
    public void DisplaycompletedTasksClicked(ActionEvent actionEvent) {

        TodoListsManager.DisplayCompletedTasks();
    }

    @FXML
    public void DisplayIncompletedTasksClicked(ActionEvent actionEvent) {

        TodoListsManager.DisplayIncompletedTasks();
    }

    @FXML
    public void SaveItemsofListtoStorageclicked(ActionEvent actionEvent) {
        TodoListsManager.SaveItemsofListtoStorage();

    }

    @FXML
    public void saveAllListstoStorageClicked(ActionEvent actionEvent) {

        TodoListsManager.saveAllListstoStorage();
    }

    @FXML
    public void LoadListsClicked(ActionEvent actionEvent) {

        TodoListsManager.LoadLists();
    }

    @FXML
    public void LoadMultipleListsClicked(ActionEvent actionEvent) {

        TodoListsManager.LoadMultipleLists();
    }

    @FXML
    public void removeItemclicked(ActionEvent actionEvent) {

        TodoListsManager.removeItem();
    }

    @FXML
    public void addNewItemClicked(ActionEvent actionEvent) {
       TodoListsManager.addNewItem();

    }
}
