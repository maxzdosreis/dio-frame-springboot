package dio.spring_configuration_properties.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner{
    @Autowired
	private Remetente rementente;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mensagem enviada por: " + rementente.getNome()
				+ "\nE-mail:" + rementente.getEmail() + "\nCom telefones para contato: "
				+ rementente.getTelefones());
		System.out.println("Seu cadastro foi aprovado");
	}
}
