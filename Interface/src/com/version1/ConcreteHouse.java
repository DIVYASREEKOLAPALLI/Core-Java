package com.version1;

public abstract class ConcreteHouse {
	    // Abstract methods to be implemented by concrete subclasses
	    public abstract void basement();
	    public abstract void pillars();
	    public abstract void walls();
	    public abstract void windows();

	    // A concrete method in the abstract class (optional but common)
	    public void roof() {
	        System.out.println("House: Standard roof construction methods.");
	    }

	    // Template method defining the sequence of building a house
	    public final void buildHouse() {
	        System.out.println("--- Starting House Construction ---");
	        basement();
	        pillars();
	        walls();
	        windows();
	        roof();
	        System.out.println("--- House Construction Complete ---\n");
	    }
	}