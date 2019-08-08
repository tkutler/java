public class ProjectTest{
    public static void main(String[] args){
        Project newProject = new Project("birdhouse", "building a birdhouse");
        String mProject = newProject.getName();
        System.out.println(mProject);
        String mDesc = newProject.getDescription();
        System.out.println(mDesc); 
        Project secondProject = new Project(); 
        secondProject.setName("baking cake");
        String CakeName = secondProject.getName();
        System.out.println(CakeName);
        secondProject.setDescription("yum this should be a ton of fun");
        String CakeDes = secondProject.getDescription();
        System.out.println(CakeDes);
        String Elavator = newProject.elevatorPitch(); 
        System.out.println(Elavator);
        Project thirdProject = new Project();
        String Null = thirdProject.getName();
        System.out.println(Null);

    }
}