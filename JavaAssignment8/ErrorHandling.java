public class ErrorHandling
{
    public void exceptionHandling() throws Exception1,Exception2,Exception3
    {

    }
    public static void main(String args[])
    {
        ErrorHandling eh = new ErrorHandling();
        try
        {
            eh.exceptionHandling();
        }
        catch(Exception1 | Exception2 | Exception3 e)
        {
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }

        finally
        {
            System.out.println("The code is executed successfully");
        }
    }
}
