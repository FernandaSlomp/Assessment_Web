package br.edu.infnet.consumirapi;

import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.infnet.consumirapi.model.Result;
import br.edu.infnet.consumirapi.model.Api;
import br.edu.infnet.consumirapi.model.PalavraChave;
import br.edu.infnet.consumirapi.service.ResultService;
import br.edu.infnet.consumirapi.service.ResultServiceId;

@EnableFeignClients
@Controller
public class MainController {

	@Autowired
	private ResultService resultService;

	@Autowired
	private ResultServiceId resultServiceId;


	@RequestMapping("/busca")
	public String home(Model model) {
		System.out.println("Going home...");
		Api api = resultService.pegarApi();
		List<Result> results = api.getResults();
		System.out.println(results.get(1).getName());
		model.addAttribute("results", results);
		PalavraChave id = new PalavraChave();
		model.addAttribute("id", id);
		return "busca";
	}

	@PostMapping("/result")
	String submitForm(@ModelAttribute("id") PalavraChave id, Model model) {
		int intId = Integer.parseInt(id.getPalavra());// fazer conversao
		Api api2 = resultServiceId.apiSearch(intId);
		List<Result> results2 = api2.getResults();
		System.out.println(results2.get(1).getName());
		model.addAttribute("result2", results2);
		return "result";
	}

}
