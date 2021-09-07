package com.fabio.designpattern.chainOfResponsability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChainOfResponsibilityTest {

    private static AuthenticationProcessor getChainOfAllProcessor() {
        AuthenticationProcessor samlProcessor = new SamlAuthenticationProcessor(new OAuthProcessor(null));
        return new UsernamePasswordProcessor(samlProcessor);
    }

    private static AuthenticationProcessor getChainOfSamlProcessor() {
        AuthenticationProcessor samlProcessor = new SamlAuthenticationProcessor(null);
        return new UsernamePasswordProcessor(samlProcessor);
    }

    @Test
    public void givenOAuthProvider_whenCheckingAuthorized_thenSuccess() {
        AuthenticationProcessor authProcessorChain = getChainOfAllProcessor();
        assertTrue(authProcessorChain.isAuthorized(new OAuthTokenProvider()));
    }

    @Test
    public void givenSamlProvider_whenCheckingAuthorized_thenFailSuccess() {
        AuthenticationProcessor authProcessorChain = getChainOfAllProcessor();
        assertTrue(authProcessorChain.isAuthorized(new SamlTokenProvider()));
    }

    @Test
    public void givenSamlProvider_whenCheckingAuthorized_thenSuccess() {
        AuthenticationProcessor authProcessorChain = getChainOfSamlProcessor();
        assertTrue(authProcessorChain.isAuthorized(new SamlTokenProvider()));
    }
}