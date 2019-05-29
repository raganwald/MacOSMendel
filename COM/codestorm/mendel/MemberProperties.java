/* * MemberProperties.java * * Copyright (c) 1996, 1997 Codestorm Inc. All rights reserved. * */package COM.codestorm.mendel;import java.util.*;public class MemberProperties extends Properties {public Properties getDefaults () {	return defaults;}public void setDefaults (Properties someDefaults) {	defaults = someDefaults;}public String toString () {	if ( this.isEmpty() ) {		return "";	} else {		int max = size() - 1;		StringBuffer buf = new StringBuffer();		Enumeration k = keys();		Enumeration e = elements();		for (int i = 0; i <= max; i++) {			String s1 = k.nextElement().toString();			Object ee = e.nextElement();						if (!s1.startsWith("__") || !s1.endsWith("__")) {			    String s2 = ee.toString();			    buf.append(" " + s1 + "=\"" + s2 + "\"");		    }		}		return buf.toString();	}}}