package org.tyaa.springcontextdemo2.implementations;

import java.util.Collection;

import org.tyaa.springcontextdemo2.builder.Unit;
import org.tyaa.springcontextdemo2.interfaces.IUnitPool;

public class WarriorPool implements IUnitPool {
	
	private Collection<Unit> mUnitCollection;
	
	public WarriorPool() {
		super();
	}

	public WarriorPool(Collection<Unit> _unitCollection) {
		super();
		mUnitCollection = _unitCollection;
	}

	@Override
	public Collection<Unit> getUnitCollection() {
		return mUnitCollection;
	}

	public void setUnitCollection(Collection<Unit> _unitCollection) {
		mUnitCollection = _unitCollection;
	}

	public void testActions() {
		
		mUnitCollection.forEach((u) -> {u.testActions();});
	}
}
