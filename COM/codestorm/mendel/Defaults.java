/** * * @(#) Defaults.java *   *   *  @author   Reginald Braithwaite-Lee *  @version  1.0 ***/ package COM.codestorm.mendel;import java.util.*;import java.io.*; public final class Defaults {private static Properties mendelDefaults = new Properties();private static Properties mendelProperties = new Properties(mendelDefaults);private static Properties mimeDefaults = new Properties();private static Properties mimeProperties = new Properties(mimeDefaults);private static Hashtable fileSuffixes = new Hashtable();public static String kTopInDirectory = "kTopInDirectory";public static String kTopOutDirectory = "kTopOutDirectory";public static String kTopOutUrl = "kTopOutUrl";public static String kDynamicUrl = "kDynamicUrl";public static String kPropertiesSuffix = "kPropertiesSuffix";public static String kIndexName = "kIndexName";public static String kJPEGSuffix = "kJPEGSuffix";public static String kGIFSuffix = "kGIFSuffix";public static String kTextSuffix = "kTextSuffix";public static String kURLPrefix = "kURLPrefix";public static String kURLSeparator = "kURLSeparator";public static String kSeparator = "kSeparator";public static String kHTMLSuffix = "kHTMLSuffix";public static String kWindowWidth = "kWindowWidth";public static String kWindowHeight = "kWindowHeight";public static String kOpenHTMLTag = "kOpenHTMLTag";public static String kCloseHTMLTag = "kCloseHTMLTag";public static String kCloseTag = "kCloseTag";public static String kPublishFlag = "kPublishFlag";public static String kLiteralPrefix = "kLiteralPrefix";public static String kDefaultLiteral = "kDefaultLiteral";public static String kThisName = "kThisName";public static String kContainerName = "kContainerName";public static String kParentName = "kParentName";public static String kMIMEHTML = "kMIMEHTML";public static String kMIMEText = "kMIMEText";public static String kMIMEGif = "kMIMEGif";public static String kMIMEJpeg = "kMIMEJpeg";public static String openHTML;public static String closeTag;public static String closeHTML;public static String rootPath;public static int openHTMLLength;public static int closeHTMLLength;static {	mendelDefaults.put(	kTopInDirectory,		"Mendel In"							);	mendelDefaults.put(	kTopOutDirectory,		"Mendel Out"						);	mendelDefaults.put(	kTopOutUrl,				"http://www.codestorm.com/mendel/"	);	mendelDefaults.put(	kIndexName,				"index"								);		mendelDefaults.put(	kOpenHTMLTag,			"<HTML"								);	mendelDefaults.put(	kCloseTag,				">"									);	mendelDefaults.put(	kCloseHTMLTag,			"</HTML>"							);	mendelDefaults.put(	kPublishFlag,			"PUBLISH"							);		mendelDefaults.put(	kMIMEHTML,				"text/html"							);	mendelDefaults.put(	kMIMEText,				"text/plain"						);	mendelDefaults.put(	kMIMEGif,				"image/gif"							);	mendelDefaults.put(	kMIMEJpeg,				"image/jpeg"						);		mendelDefaults.put(	kLiteralPrefix,			kDefaultLiteral						);	mendelDefaults.put(	kDefaultLiteral+"1",	".jpg"								);	mendelDefaults.put(	kDefaultLiteral+"2",	".jpeg"								);	mendelDefaults.put(	kDefaultLiteral+"3",	".gif"								);	mendelDefaults.put(	kDefaultLiteral+"4",	".class"							);	mendelDefaults.put(	kDefaultLiteral+"5",	".cgi"								);	mendelDefaults.put(	kDefaultLiteral+"6",	".acgi"								);	mendelDefaults.put(	kThisName,				"this"								);	mendelDefaults.put(	kContainerName,			"container"							);	mendelDefaults.put(	kParentName,			"super"								);		mendelDefaults.put(	kURLSeparator,			"/"									);	mendelDefaults.put(	kSeparator,				"."									);	mendelDefaults.put(	kJPEGSuffix,			".jpg"								);	mendelDefaults.put(	kGIFSuffix,				".gif"								);	mendelDefaults.put(	kTextSuffix,			".txt"								);	mendelDefaults.put(	kHTMLSuffix,			".html"								);	mendelDefaults.put(	kPropertiesSuffix,		".properties"						);		mendelDefaults.put(	kURLPrefix,				"file:"								);		mendelDefaults.put(	kWindowWidth,			"30"								);	mendelDefaults.put(	kWindowHeight,			"15"								);		try {		FileInputStream propertiesFile = new FileInputStream("Mendel Properties");		mendelProperties.load(propertiesFile);	}	catch (java.io.FileNotFoundException fnfe) {		saveDefaults();	}	catch (java.io.IOException ioe) {}		mimeDefaults.put( ".htm", "text/html" ); // Text	mimeDefaults.put( ".html", "text/html" ); // Text	mimeDefaults.put( ".mdl", "text/html" ); // Text	mimeDefaults.put( ".txt", "text/plain" ); // Text		mimeDefaults.put( ".gz", "application/x-gzip" ); // Binary	mimeDefaults.put( ".z", "application/x-compress" ); // Binary		mimeDefaults.put( ".pac", "application/x-ns-proxy-autoconfig" ); // Binary		mimeDefaults.put( ".jf", "application/x-javascript" ); // Binary	mimeDefaults.put( ".ls", "application/x-javascript" ); // Binary	mimeDefaults.put( ".mocha", "application/x-javascript" ); // Binary		mimeDefaults.put( ".tcl", "application/x-tcl" ); // Binary	mimeDefaults.put( ".csh", "application/x-csh" ); // Binary	mimeDefaults.put( ".ai", "application/postscript" ); // Binary	mimeDefaults.put( ".eps", "application/postscript" ); // Binary	mimeDefaults.put( ".ps", "application/postscript" ); // Binary	mimeDefaults.put( ".exe", "application/octet-stream" ); // Binary	mimeDefaults.put( ".bin", "application/octet-stream" ); // Binary	mimeDefaults.put( ".cpio", "application/x-cpio" ); // Binary	mimeDefaults.put( ".gtar", "application/x-gtar" ); // Binary	mimeDefaults.put( ".tar", "application/x-tar" ); // Binary	mimeDefaults.put( ".shar", "appliation/x-shar" ); // Binary	mimeDefaults.put( ".zip", "application/x-zip-compressed" ); // Binary	mimeDefaults.put( ".sit", "application/x-stuffit" ); // Binary	mimeDefaults.put( ".hqx", "application/mac-binhex40" ); // Binary		mimeDefaults.put( ".avi", "video/x-msvideo" ); // Binary	mimeDefaults.put( ".qt", "video/quicktime" ); // Binary	mimeDefaults.put( ".mov", "video/quicktime" ); // Binary	mimeDefaults.put( ".mpeg", "video/mpeg" ); // Binary	mimeDefaults.put( ".mpg", "video/mpeg" ); // Binary	mimeDefaults.put( ".mpe", "video/mpeg" ); // Binary		mimeDefaults.put( ".wav", "audio/x-wav" ); // Binary	mimeDefaults.put( ".aif", "audio/x-aiff" ); // Binary	mimeDefaults.put( ".aiff", "audio/x-aiff" ); // Binary	mimeDefaults.put( ".aifc", "audio/x-aiff" ); // Binary	mimeDefaults.put( ".au", "audio/basic" ); // Binary	mimeDefaults.put( ".snd", "audio/basic" ); // Binary		mimeDefaults.put( ".fif", "application/fractals" ); // Binary		mimeDefaults.put( ".gif", "image/gif" ); // Binary	mimeDefaults.put( ".ief", "image/ief" ); // Binary	mimeDefaults.put( ".bmp", "image/x-MS-bmp" ); // Binary	mimeDefaults.put( ".rgb", "image/x-rgb" ); // Binary	mimeDefaults.put( ".ppm", "image/x-portable-pixmap" ); // Binary	mimeDefaults.put( ".pbm", "image/x-portable-bitmap" ); // Binary	mimeDefaults.put( ".pnm", "image/x-portable-anymap" ); // Binary	mimeDefaults.put( ".xwd", "image/xwindowdump" ); // Binary	mimeDefaults.put( ".xpm", "image/x-pixmap" ); // Binary	mimeDefaults.put( ".xbm", "image/x-bitmap" ); // Binary	mimeDefaults.put( ".ras", "image/x-cmu-raster" ); // Binary	mimeDefaults.put( ".tiff", "image/tiff" ); // Binary	mimeDefaults.put( ".tif", "image/tiff" ); // Binary		mimeDefaults.put( ".texi", "application/x-texinfo" ); // Binary	mimeDefaults.put( ".texinfo", "application/x-texinfo" ); // Binary	mimeDefaults.put( ".dvi", "application/x-dvi" ); // Binary	mimeDefaults.put( ".latex", "application/x-latex" ); // Binary	mimeDefaults.put( ".tex", "application/x-tex" ); // Binary	mimeDefaults.put( ".rtf", "application/rtf" ); // Binary		mimeDefaults.put( ".hpp", "application/x-mendel-frame" ); // Frame	mimeDefaults.put( ".tab", "application/x-mendel-ordcollection" ); // Ordered Collection	mimeDefaults.put( ".tbn", "application/x-mendel-ordcollection" ); // Ordered Collection with Field Names	mimeDefaults.put( ".shtml", "application/x-mendel-html" ); // HTML with embedded MendelScript		resetMIMETypes();		try {		FileInputStream propertiesFile = new FileInputStream("MIME Types");		mimeProperties.load(propertiesFile);	}	catch (java.io.FileNotFoundException fnfe) {		try {			FileOutputStream out = new FileOutputStream("MIME Types");			mimeProperties.save(out,"Factory MIME Types");		}		catch (java.io.FileNotFoundException fnf2e) {}		catch (java.io.IOException io2e) {}	}	catch (java.io.IOException ioe) {}		openHTML = mendelProperties.getProperty(kOpenHTMLTag);	closeTag = mendelProperties.getProperty(kCloseTag);	closeHTML = mendelProperties.getProperty(kCloseHTMLTag);	openHTMLLength = openHTML.length();	closeHTMLLength = closeHTML.length();}public static String getRootPath () {	return (new File(mendelProperties.getProperty(kTopInDirectory))).getAbsolutePath();}public static String getProperty (String aProperty) {	return mendelProperties.getProperty(aProperty);}public static String getProperty (String aProperty, String defaultValue) {	return mendelProperties.getProperty(aProperty,defaultValue);}public static void putProperty (String aProperty, String aValue) {	mendelProperties.put(aProperty,aValue);}public static void putDefault (String aProperty, String aValue) {	mendelDefaults.put(aProperty,aValue);}public static void saveDefaults () {	try {		FileOutputStream out = new FileOutputStream("Mendel Properties");		mendelDefaults.save(out,"Factory Mendel Properties");		out = new FileOutputStream("MIME Types");		mimeProperties.save(out,"Factory MIME Types");	}	catch (java.io.FileNotFoundException fnf2e) {}	catch (java.io.IOException io2e) {}}public static String toURLString (String anURL) {	StringBuffer outBuf = new StringBuffer();	int radix = 16;		for (int i = 0; i < anURL.length(); i++) {		char c = anURL.charAt(i);				if ( (c == '%') && ((i+2) <= anURL.length())) {			int decimal = ((anURL.charAt(i+1)-'0') * 16) + anURL.charAt(i+2)-'0';			i = i+2;			c = (char) (decimal & 0xFF);		}		if (			Character.isSpace(c)			|| (c == '<')			|| (c == '>')			|| (c == '&')		) {			outBuf.append( "%" + Integer.toString(c,radix).toUpperCase() );		}		else outBuf.append(c);	}		return outBuf.toString();}public static String getFileSuffix (String mimeType) {	String suffix = (String) fileSuffixes.get(mimeType.toLowerCase());	if ( suffix == null )		return null;	else return suffix.toLowerCase();}public static String getMIMEType (String fileSuffix) {	String mimeType = mimeProperties.getProperty(fileSuffix.toLowerCase());	if ( mimeType == null )		return null;	else return mimeType.toLowerCase();}private static void resetMIMETypes () {	Enumeration e = mimeProperties.propertyNames();	fileSuffixes = new Hashtable();	while ( e.hasMoreElements() ) {		String fileSuffix = (String) e.nextElement();		String mimeType = getMIMEType(fileSuffix);		fileSuffixes.put(mimeType,fileSuffix);	}	}}