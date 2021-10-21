package com.techprimers.springbatchexample1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.techprimers.springbatchexample1.batch.Processor;
import com.techprimers.springbatchexample1.model.User;

public class ProcessorTest {
	
	@InjectMocks
	private Processor processor;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void processTest() throws Exception{
		
		User us1=new User(001,"Virat","Technology",30000);
		User us2=new User(002,"Mahi","Operation",15000);
		
		Assertions.assertNotNull(processor.process(us1));
		Assertions.assertNull(processor.process(us2));
	}

}
