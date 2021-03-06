package revolut.infrastructure.persistence;

import revolut.domain.exception.TransactionException;
import revolut.domain.model.Account;

import java.math.BigDecimal;

public interface AccountDao {
    Account findBy(Integer AccountNumber) throws TransactionException;
    
    void transferBalance(Integer sourceAccountNumber, Integer targetAccountNumber, BigDecimal transactionAmount) throws TransactionException;;
}
