package com.Capgemini.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Cagemini.confgs.ApppConfig;
import com.Capgemini.sbeans.VotingEligibilityCheck;

/**
 * Hello world!
 *
 */
public class CheckExecution 
{
    public static void main( String[] args )
    {
      AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(ApppConfig.class);
      VotingEligibilityCheck vec=container.getBean("VotingEligibilityCheck",VotingEligibilityCheck.class);
      vec.checkEligibility();
      container.close();
    }
}
