package com.fabio.designpattern.proxy;

public class ProxyExecutorImpl implements ProxyExecutor{
    @Override
    public void execute(String command) throws Exception {
        System.out.println("Going to execute command: " + command);
    }
}
