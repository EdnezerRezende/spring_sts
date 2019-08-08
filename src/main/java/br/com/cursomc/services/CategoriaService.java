package br.com.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursomc.domain.Categoria;
import br.com.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaDao;
	
	public Categoria buscar(Integer id)  {
		Optional<Categoria> categoria =  categoriaDao.findById(id);
		return categoria.orElseThrow(() -> new br.com.cursomc.services.exceptions.ObjectNotFoundException(
				"Objeto não encontrado! id: "  + id + ", tipo: " + Categoria.class.getName()));
	}
}
