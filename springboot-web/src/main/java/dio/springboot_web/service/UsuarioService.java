package dio.springboot_web.service;

import dio.springboot_web.model.Usuario;

public interface UsuarioService {
    Iterable<Usuario> buscarTodos();

    void inserir(Usuario usuario);

    void alterar(Integer id, Usuario usuario);

    void excluir(Integer id);
}
