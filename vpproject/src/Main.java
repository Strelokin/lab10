public class Main {
    public static void main (String[] args) {
        University university = new University();

        Employee dean = new AdministrativeEmployee(123, "Dean", "dean@example.com");
        Faculty faculty = new Faculty("Faculty of Computer Science", dean);
        university.addFaculty(faculty);

        Institute institute = new Institute("Institute of Physics", "765");
        faculty.addInstitute(institute);

        ResearchAssociate researcher = new ResearchAssociate(456, "John Doe", "john@example.com", "Physics");
        institute.setResearchAssociate(researcher);

        university.displayFaculties();
        university.getFaculty().get(0).displayInstitutes();
        faculty.displayInstitutes();
    }
}
