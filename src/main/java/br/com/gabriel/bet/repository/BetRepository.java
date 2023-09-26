package br.com.gabriel.bet.repository;

import br.com.gabriel.bet.model.Bet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BetRepository extends JpaRepository<Bet, Long> {
}
