package br.com.teste.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class IndexController {

	private final Result result;

	@Inject
	public IndexController(Result result) {
		this.result = result;
	}

	/**
	 * @deprecated CDI eyes only
	 */
	public IndexController() {
		this(null);
	}
	
	@Path("/")
	public void index() {
		result.include("vraptor", "VRaptor is working!");
	}
	
}