package sample.multimodule.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sample.multimodule.model.domain.entity.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
	Account findByNumber(String number);
}