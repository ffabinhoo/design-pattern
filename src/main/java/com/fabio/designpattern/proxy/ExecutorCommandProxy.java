package com.fabio.designpattern.proxy;

public class ExecutorCommandProxy implements ProxyExecutor{
    boolean isAdmin;
    ProxyExecutorImpl proxyExecutor;

    public ExecutorCommandProxy(String name, String pass) {
        if (name.equals("fabio") && pass.equals("123")){
            isAdmin = true;
            proxyExecutor = new ProxyExecutorImpl();
        }
    }

    @Override
    public void execute(String command) throws Exception {
        if (isAdmin){
            proxyExecutor.execute(command);
        }else{
            if (command.toLowerCase().equals("delete")){
                throw new Exception("delete not allowed for non-admin users");
            }
        }
    }
}
