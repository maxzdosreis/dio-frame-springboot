package dio.springboot_web.service.impl;

import dio.springboot_web.model.Usuario;
import dio.springboot_web.repository.UsuarioRepository;
import dio.springboot_web.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Iterable<Usuario> buscarTodos(){
        return usuarioRepository.listAll();
    }

    @Override
    public void inserir(Usuario usuario){
        if(usuario != null){
            usuarioRepository.save(usuario);
        }else{
            System.out.println("Problema ao inserir usuário");
        }
    }

    @Override
    public void alterar(Integer id, Usuario usuario){
        Optional<Usuario> usuarioBd = Optional.ofNullable(usuarioRepository.finById(id));
        if(usuarioBd.isPresent()){
            usuarioRepository.save(usuario);
        }
    }

    @Override
    public void excluir(Integer id){
        if(id > 0){
            usuarioRepository.remove(id);
        }else{
            System.out.println("Valor não compatível com id");
        }
    }
}
