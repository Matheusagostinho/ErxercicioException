
public class TestaMaterial {
    
    public static void main(String[] args) {
        
        
        try{
            
            Material m= new Material("Prego", -5);
            
        }catch(QuantidadeInvalidaException ex){
        
            System.err.println(ex.getMessage());
        }
    }
    
}
