package com.poc.olingo.ta;

import javax.ws.rs.Path;

import org.apache.olingo.odata2.api.ODataServiceFactory;
import org.apache.olingo.odata2.core.rest.ODataRootLocator;

import com.poc.olingo.ta.factory.AccountsODataJPAServiceFactory;

@Path("/")
public class AccountsRootLocator extends ODataRootLocator {
    private AccountsODataJPAServiceFactory serviceFactory;
    public AccountsRootLocator(AccountsODataJPAServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }
 
    @Override
    public ODataServiceFactory getServiceFactory() {
       return this.serviceFactory;
    } 
}
