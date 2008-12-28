package org.mockito.internal.util;

public class MockitoLoggerImpl implements MockitoLogger {

    /* (non-Javadoc)
     * @see org.mockito.internal.util.Logger#print(java.lang.Object)
     */
    public void print(Object what) {
        System.out.println("[Mockito] " + what.toString());
    }

    public void print() {
        System.out.println();
    }
}