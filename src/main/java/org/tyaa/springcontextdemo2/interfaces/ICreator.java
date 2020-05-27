package org.tyaa.springcontextdemo2.interfaces;

import org.tyaa.springcontextdemo2.builder.Unit;
import org.tyaa.springcontextdemo2.implementations.WarriorPool;

public interface ICreator {

	WarriorPool createUnit();
}
