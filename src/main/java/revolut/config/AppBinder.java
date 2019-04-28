package revolut.config;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import revolut.infrastructure.repositories.AccountRepository;
import revolut.infrastructure.repositories.AccountRepositoryImpl;
import revolut.infrastructure.rest.MoneyTransferEndpoints;
import revolut.infrastructure.rest.MoneyTransferEndpointsImpl;
import revolut.domain.service.MoneyTransferService;
import revolut.domain.service.MoneyTransferServiceImpl;

public class AppBinder extends AbstractBinder {
    
    @Override
    protected void configure() {
        
        bind(MoneyTransferEndpointsImpl.class).to(MoneyTransferEndpoints.class);
        bind(MoneyTransferServiceImpl.class).to(MoneyTransferService.class);
        bind(AccountRepositoryImpl.class).to(AccountRepository.class);
    }
}