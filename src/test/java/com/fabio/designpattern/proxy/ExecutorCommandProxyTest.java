package com.fabio.designpattern.proxy;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ExecutorCommandProxyTest {

    @Test
    public void testExecuteCommandAsAdmin() throws Exception {
        ExecutorCommandProxy ex = new ExecutorCommandProxy("fabio","123");
        ex.execute("DELETE");
    }

    @Test
    public void testExecuteCommandDeleteNonUserFail() throws Exception {
        ExecutorCommandProxy ex = new ExecutorCommandProxy("fabio-error","123");
        try {
            ex.execute("DELETE");
            Assert.fail();
        }catch (Exception e){
            Assert.assertEquals("delete not allowed for non-admin users",e.getMessage());

        }

    }

}