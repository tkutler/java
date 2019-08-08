public class Project {
    private String name;
    private String description; 
    public String getName (){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setDescription(String newDescription){
        description = newDescription;
    }
    public String elevatorPitch(){
        return (this.name + this.description);
    }
    public Project (){

    }
    public Project(String name) {
        this.name = name;
    }
    public Project (String name , String description){
        this.name = name; 
        this.description = description;
    }

} 