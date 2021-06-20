package br.edu.infnet.consumirapi.service;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.consumirapi.model.Api;
import br.edu.infnet.consumirapi.model.Result;

@FeignClient(url = "https://api.rawg.io/api/games/3498/achievements?key=eceec62a2f4b4f7c995e2f6a71af1e40", name = "ResultService")
public interface ResultService {
	@GetMapping("")
	Api pegarApi();
}
