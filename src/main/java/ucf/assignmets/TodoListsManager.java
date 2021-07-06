package ucf.assignmets;

public class TodoListsManager {

    public static void addList(){
        //Create string array List
        //Format the string array List with the categories of Title, Due Date, and Description
        //Output the string array to a new output file
        //save file to drive
    }

    public static void removeList(){
       //retrieve file location of list
        // declare file pointer
        //use file library function to delete file
    }

    public static void editTitleofaList(){
        //open text field for the title of current list in sceneview
        //allow user input to edit title in window
        //display results of change
        //save new title to file storage
    }

    public static void editDescriptionofItem(){
        //open text field for the description of item selected in current list in sceneview
        //allow user input to edit description
        //display results of change
        //save new description of item to file storage
    }

    public static void markAnItem(){
        //allow user input to type in what item needs to be checked
        //match string from list to user entered string
        //mark item with symbol or other method to track
        //display results of change
        //save list to file storage
    }

    public static void editDueDateofItem(){
        //allow user input to type in what item needs to be changed and from which list
        //match list and item
        //allow user input to input new date and change in current list
        //display results of change
    }

    public static void DisplayAllofCurrentList(){
        //find current list being used in program or desired by user
        //use current list from program and display in scene
    }

    public static void DisplayCompletedTasks(){
        //use tracker to see which items are marked with completion
        //bring incomplete items to a new list
        //display list to user in new window or scene
    }

    public static void DisplayIncompletedTasks(){
        //use tracker to see which items are not marked with completion
        //bring incomplete items to a new list
        //display list to user in new window or scene
    }

    public static void SaveItemsofListtoStorage(){
        //move current list from view into string array list for each of the following title, due date, description
        //use file pointer to find the correct file being used c
        //output append the changes to overwrite the same file

    }

    public static void saveAllListstoStorage(){
        //find current lists open in scenes or multiple views
        //select all lists in program currently opened by user
        //save all changes or no changes to file location
        //display results in small window popup

    }

    public static void LoadLists(){
        //open file manager window to locate lists that need to be open
        //display lists into window of scene or multiple windows
    }

    public static void LoadMultipleLists(){
        //open file manager window to locate lists that need to be open
        //display lists into window of scene or multiple windows\
    }

    public static void removeItem(){
        //ask for user input or allow user to select in table view item to delete
        // allow for manipulation or change selection
        //save changes to file
    }

    public static void addNewItem(){
        //allow user to click on item to be changed
        //open text field into table view of item that needs to be replaced
        //allow text field manipulation to change item
    }


}
