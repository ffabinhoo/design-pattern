package com.fabio.designpattern.chainOfResponsability;

public class SamlAuthenticationProcessor extends AuthenticationProcessor {

    public SamlAuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {

        if (authProvider instanceof SamlTokenProvider) {
            return Boolean.TRUE;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        } else {
            return Boolean.FALSE;
        }
    }
}

