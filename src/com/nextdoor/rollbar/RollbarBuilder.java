package com.nextdoor.rollbar;

import java.io.Serializable;

/**
 * 
 * @author Sampath Ekanayake created on Jun 18, 2018
 * This is a custom class created for LOG4J2 configuraion.
 */
public class RollbarBuilder implements Serializable{

    private static final long serialVersionUID = 2470302916971739839L;
    
    private String env;
    
    public static RollbarBuilder builder = null;
    
    private RollbarBuilder(String env) {
        this.env = env;
    }
    
    /**
     * 
     * @param env
     * @return A singelton instance of RollbarBuilder based on the environment set for the first instance.
     */
    public static RollbarBuilder init(String env) {
        if (builder==null) {
            builder = new RollbarBuilder(env);
        }
        
        return builder;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
    
}
