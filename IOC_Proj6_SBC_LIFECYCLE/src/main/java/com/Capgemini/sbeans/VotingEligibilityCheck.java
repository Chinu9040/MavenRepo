package com.Capgemini.sbeans;

import java.time.LocalDate;
import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("VotingEligibilityCheck")
public class VotingEligibilityCheck {
	@Value("${Voter.age}")
	private int votingAge;
	@Value("${Voter.name}")
	private String votingName;
	private LocalDate votingDate;
	
	@PostConstruct
	public void init()
	{
		System.out.println("Custom init executed");
		votingDate=LocalDate.now();
		if(votingAge<=0)
			throw new IllegalArgumentException("Age is not Valid");
		
	}
		
	public void checkEligibility()
	{
		if(votingAge<18)
			System.out.println("Sir/Madam "+votingName+" you are not eligible for Votinng in India as of "+votingDate);
		else
			System.out.println("Sir/Madam "+votingName+" you are eligible for Votinng in India as of "+votingDate);
	}
	
	@PreDestroy
	public void destroy()
	{
		votingAge=0;votingDate=null;votingName=null;
		System.out.println("Custom Destroy executed");
	}
}
