package com.poc.olingo.ta.config;

import javax.persistence.EntityManagerFactory;
import javax.ws.rs.ApplicationPath;

import org.apache.olingo.odata2.core.rest.ODataRootLocator;
import org.apache.olingo.odata2.core.rest.app.ODataApplication;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.poc.olingo.ta.AccountsRootLocator;
import com.poc.olingo.ta.EntityManagerFilter;
import com.poc.olingo.ta.factory.AccountsODataJPAServiceFactory;

@Component
@ApplicationPath("/odata")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(AccountsODataJPAServiceFactory serviceFactory, EntityManagerFactory emf) {        
        ODataApplication app = new ODataApplication();        
        app
          .getClasses()
          .forEach( c -> {
              if ( !ODataRootLocator.class.isAssignableFrom(c)) {
                  register(c);
              }
          });
         
        register(new AccountsRootLocator(serviceFactory)); 
        register(new EntityManagerFilter(emf));
    }
     
    // ... other methods omitted
}

