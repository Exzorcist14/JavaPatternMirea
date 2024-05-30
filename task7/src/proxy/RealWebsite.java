package proxy;

public class RealWebsite implements Website{
    @Override
    public String getAnswer(String request) {
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "Hello "+request;
    }
}
