package EXCEPTIONS;

public class ValidacaoException extends Exception{
	
	//construtor padr�o 
	public ValidacaoException(String msg) {
		super(msg);
	}
	
	
	//construtor sobrecarregado 
	public ValidacaoException(String msg, Exception exception) {
		super(msg,exception);
	}
	
}
