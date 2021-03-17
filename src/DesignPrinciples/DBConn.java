package DesignPrinciples;


public class DBConn {
	    private static DBConn instance;
	    public String s;
	    
	    private DBConn(){
	        s = "Hello I am a string part of Singleton class";
	    }

	    public static DBConn getInstance(){
	        if(instance==null){
	            instance= new DBConn();
	        }
	        return instance;
	    }

	    public static void main(String[] args) {
	        DBConn x = DBConn.getInstance();
	        x.s = (x.s).toUpperCase();
	        System.out.print("Accessing Singleton Class: " + x.s);
	    }
	}
