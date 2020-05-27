package org.tyaa.springcontextdemo2.implementations;

import org.tyaa.springcontextdemo2.builder.Unit;
import org.tyaa.springcontextdemo2.interfaces.ICreator;

public abstract class House implements ICreator{

	@Override
	public abstract WarriorPool createUnit();
}
