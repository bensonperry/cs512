// -------------------------------// adapted from Kevin T. Manley// CSE 593// -------------------------------package ResImpl;import java.io.*;// Resource manager data itempublic abstract class RMItem implements Serializable, Cloneable{    RMItem() {			super();    }    public RMItem copy()    {    	try    	{    		return (RMItem)this.clone();    	}    	catch(CloneNotSupportedException e)    	{    		return null;    	}    }}