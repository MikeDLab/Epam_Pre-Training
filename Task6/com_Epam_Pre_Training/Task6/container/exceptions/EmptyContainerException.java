package com_Epam_Pre_Training.Task6.container.exceptions;

public class EmptyContainerException extends RuntimeException {
	public EmptyContainerException()
	{
		
	}
	public EmptyContainerException(String message)
	{
		super(message);
	}
}
