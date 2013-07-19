/*
 * Created on 02-feb-2007 by azabala
 *
 */
package org.fastcatgroup.documentFilter.autocad.dwg.readers.objreaders.v1314;

import java.util.List;

import org.fastcatgroup.documentFilter.autocad.dwg.CorruptedDwgEntityException;
import org.fastcatgroup.documentFilter.autocad.dwg.DwgObject;
import org.fastcatgroup.documentFilter.autocad.dwg.DwgUtil;
import org.fastcatgroup.documentFilter.autocad.dwg.objects.DwgXRecord;


/**
 * @author alzabord
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DwgXrecordReader1314 extends AbstractDwg1314Reader {

	/* (non-Javadoc)
	 * @see com.iver.cit.jdwglib.dwg.readers.IDwgObjectReader#readSpecificObj(int[], int, com.iver.cit.jdwglib.dwg.DwgObject)
	 */
	public void readSpecificObj(int[] data, int offset, DwgObject dwgObj)
			throws RuntimeException, CorruptedDwgEntityException {
		 if(! (dwgObj instanceof DwgXRecord))
	    	throw new RuntimeException("ArcReader 14 solo puede leer DwgXrecord");
		 DwgXRecord v = (DwgXRecord) dwgObj;
		 int bitPos = offset;
		 
		 List val = DwgUtil.getBitLong(data, bitPos);
		 bitPos = ((Integer) val.get(0)).intValue();
		 int numReactors = ((Integer) val.get(1)).intValue();
		 
		 val = DwgUtil.getBitLong(data, bitPos);
		 bitPos = ((Integer) val.get(0)).intValue();
		 int numDataBytes = ((Integer) val.get(1)).intValue();
		 
		 //FIXME More stuff here....
	}

}
