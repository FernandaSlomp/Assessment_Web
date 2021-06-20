package br.edu.infnet.consumirapi.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.consumirapi.model.Api;
import br.edu.infnet.consumirapi.model.Result;

@FeignClient(url = "https://api.rawg.io/api/games", name = "ResultServiceId")
public interface ResultServiceId {
	@GetMapping("/{id}/achievements?key=eceec62a2f4b4f7c995e2f6a71af1e40")
	Api apiSearch(@PathVariable("id") int intId);

}
