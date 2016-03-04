
/**
 * Write a description of class TestAgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestAgendaTelefonica
{
     private int numeroTestsFallados;

    /**
     * Constructor for objects of class TestArrayListInt
     */
    public TestAgendaTelefonica()
    {
       
        
        AgendaTelefonica agenda = new AgendaTelefonica();        
         
      
        
        agenda.enterNumber("Luis", "666555222");
        agenda.enterNumber("Antonio", "666444222");
        agenda.lookupNumber("Luis");
        agenda.lookupNumber("Antonio");
        
       
    }

    
}
