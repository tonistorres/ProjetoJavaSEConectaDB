package EXCEPTIONS;

public class NegocioException extends Exception{
	
	
	//construtor padr�o 
	public NegocioException(String msg) {
		super(msg);
	}
	
	
	//construtor sobrecarregado 
	public NegocioException(String msg, Exception exception) {
		super(msg,exception);
	}
	
}
