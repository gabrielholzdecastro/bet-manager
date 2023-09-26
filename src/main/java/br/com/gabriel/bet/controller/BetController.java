package br.com.gabriel.bet.controller;

import br.com.gabriel.bet.model.Bet;
import br.com.gabriel.bet.service.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bets")
public class BetController {

	@Autowired
	private BetService betService;

	@PostMapping
	public Bet save(@RequestBody Bet bet) {
		return betService.save(bet);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		betService.deleteById(id);
	}

}
