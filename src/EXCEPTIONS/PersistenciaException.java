package EXCEPTIONS;

/**
 * CAMADA que trata das excecoes que pederao ser lancadas pela
 * nossa aplicacao. Nessa camada poderemos encapsular nossas excecoes
 * personalizando em nosso estilo dessa forma estamos criando essa classe que
 * manipula erros e trata da forma que o programador achar melhor.
 */
public class PersistenciaException extends Exception {

	
	//construtor padr�o 
	public PersistenciaException(String msg) {
		super(msg);
	}
	
	
	//construtor sobrecarregado 
	public PersistenciaException(String msg, Exception exception) {
		super(msg,exception);
	}
	
	
}
