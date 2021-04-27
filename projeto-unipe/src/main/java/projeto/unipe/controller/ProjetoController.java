package projeto.unipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import projeto.unipe.model.Conversor;

@Controller
public class ProjetoController {
	
	
	@RequestMapping(value = "/formulario", method = RequestMethod.GET)
	public ModelAndView formulario(Model model)
	{
		model.addAttribute("conversor", new Conversor());
		return new ModelAndView("formulario");
	}
	
	@RequestMapping(value = "/formulario", method = RequestMethod.POST)
	public ModelAndView exibelocal(@ModelAttribute Conversor conversor)
	{
		ModelAndView view = new ModelAndView("formulario");
		
		view.addObject("mensagem", "O valor em Ienes é: " + conversor.getReal() * conversor.getDollar());
		view.addObject("mensagem2", "O valor em Euro é: " + conversor.getEuro() * conversor.getIene());
		
		return view;
	}
	
	

}
