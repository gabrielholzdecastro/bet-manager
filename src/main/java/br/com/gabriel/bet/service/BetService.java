package br.com.gabriel.bet.service;

import br.com.gabriel.bet.model.Bet;
import br.com.gabriel.bet.repository.BetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BetService {

	@Autowired
	private BetRepository betRepository;

	public Bet save(Bet bet) {
		return betRepository.save(bet);
	}

	public void deleteById(Long id) {
		betRepository.deleteById(id);
	}

}
