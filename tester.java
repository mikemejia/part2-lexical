/* The following code was generated by JFlex 1.6.1 */

import java.util.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>LexicalAnalyzer.flex</tt>
 */
class tester {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\41\1\2\1\54\1\54\1\1\22\0\1\41\1\52\6\0"+
    "\1\55\1\56\1\27\1\16\1\30\1\25\1\42\1\26\1\44\11\43"+
    "\3\0\1\60\3\0\1\33\1\3\1\53\1\12\1\10\1\7\1\21"+
    "\1\51\1\6\2\3\1\45\1\34\1\11\1\32\1\31\1\57\1\23"+
    "\1\46\1\17\6\3\6\0\1\37\1\3\1\53\1\15\1\13\1\5"+
    "\1\22\1\51\1\4\2\3\1\47\1\40\1\14\1\36\1\35\1\3"+
    "\1\24\1\50\1\20\6\3\12\0\1\54\u1fa2\0\1\54\1\54\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\5\2\1\3\2\2\1\4\1\5\1\6"+
    "\1\7\1\2\1\10\1\0\2\11\1\12\1\13\1\14"+
    "\1\2\1\6\2\2\1\10\1\0\1\15\11\2\7\0"+
    "\1\10\2\2\1\0\1\2\2\16\1\2\1\16\4\2"+
    "\10\0\2\2\1\17\3\2\1\20\2\2\1\21\2\2"+
    "\1\22\1\23\1\24\1\25\1\26\1\0\1\27\1\30"+
    "\3\2\1\31\1\32\1\33\1\2\1\34\3\2\1\35"+
    "\2\2\1\36\1\37";

  private static int [] zzUnpackAction() {
    int [] result = new int[104];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\u0157"+
    "\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u01b9\0\u01b9\0\u01b9\0\u01b9"+
    "\0\u024c\0\u01b9\0\u027d\0\u02ae\0\u01b9\0\u01b9\0\u01b9\0\u01b9"+
    "\0\u02df\0\u0310\0\u0341\0\u0372\0\u03a3\0\u0310\0\304\0\u03d4"+
    "\0\u0405\0\u0436\0\u0467\0\u0498\0\u04c9\0\u04fa\0\u052b\0\u055c"+
    "\0\u058d\0\u05be\0\u05ef\0\u0620\0\u0651\0\u0682\0\u06b3\0\u06e4"+
    "\0\u0715\0\u0746\0\u0777\0\u07a8\0\u07d9\0\304\0\u080a\0\u083b"+
    "\0\u086c\0\u089d\0\u08ce\0\u08ff\0\u0930\0\u0961\0\u0992\0\u09c3"+
    "\0\u09f4\0\u0a25\0\u0a56\0\u0a87\0\u0ab8\0\u0ae9\0\u01b9\0\u0b1a"+
    "\0\u0b4b\0\u0b7c\0\304\0\u0bad\0\u0bde\0\304\0\u0c0f\0\u0c40"+
    "\0\u01b9\0\u01b9\0\u01b9\0\u01b9\0\u01b9\0\u0c71\0\u01b9\0\u01b9"+
    "\0\u0ca2\0\u0cd3\0\u0d04\0\304\0\304\0\u01b9\0\u0d35\0\u01b9"+
    "\0\u0d66\0\u0d97\0\u0dc8\0\u01b9\0\u0df9\0\u0e2a\0\304\0\304";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[104];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\3\1\4\1\5\1\6\1\5\1\7\1\5"+
    "\1\10\2\5\1\11\2\5\1\12\2\13\2\5\2\14"+
    "\1\15\1\16\1\17\1\20\1\21\3\5\1\21\3\5"+
    "\1\22\1\23\1\24\1\25\5\5\1\0\1\5\1\0"+
    "\1\26\1\27\1\5\1\30\1\0\1\3\1\4\1\5"+
    "\1\6\1\5\1\7\1\5\1\10\1\5\1\31\1\11"+
    "\1\5\1\31\1\12\2\13\2\5\2\14\1\15\1\16"+
    "\1\32\1\20\1\33\3\5\1\34\3\5\1\35\1\23"+
    "\1\24\1\25\5\5\1\36\1\31\1\0\1\26\1\27"+
    "\1\5\1\30\2\0\1\4\57\0\1\3\1\4\61\0"+
    "\13\5\1\0\6\5\4\0\10\5\2\0\7\5\1\0"+
    "\1\5\3\0\1\5\4\0\2\5\1\37\3\5\1\40"+
    "\2\5\1\40\1\5\1\0\6\5\4\0\10\5\2\0"+
    "\7\5\1\0\1\5\3\0\1\5\4\0\4\5\1\37"+
    "\1\5\1\40\2\5\1\40\1\5\1\0\6\5\4\0"+
    "\10\5\2\0\7\5\1\0\1\5\3\0\1\5\4\0"+
    "\6\5\1\41\2\5\1\42\1\5\1\0\6\5\4\0"+
    "\10\5\2\0\2\5\1\43\4\5\1\0\1\5\3\0"+
    "\1\5\4\0\6\5\1\42\2\5\1\44\1\5\1\0"+
    "\6\5\4\0\10\5\2\0\4\5\1\45\2\5\1\0"+
    "\1\5\3\0\1\5\65\0\13\5\1\0\6\5\4\0"+
    "\10\5\2\0\6\5\1\46\1\0\1\5\3\0\1\5"+
    "\4\0\5\5\1\47\2\5\1\47\2\5\1\0\6\5"+
    "\4\0\10\5\2\0\7\5\1\0\1\5\3\0\1\5"+
    "\4\0\13\5\1\0\4\5\2\50\4\0\10\5\2\0"+
    "\7\5\1\0\1\5\3\0\1\5\11\0\1\51\1\52"+
    "\7\0\1\53\10\0\1\54\1\55\11\0\1\56\56\0"+
    "\2\24\14\0\1\36\1\57\1\60\13\31\1\36\6\31"+
    "\4\36\10\31\2\36\7\31\1\36\1\31\1\0\2\36"+
    "\1\31\2\36\1\57\1\60\51\36\1\0\4\36\3\0"+
    "\13\5\1\0\4\5\1\61\1\50\4\0\10\5\2\0"+
    "\7\5\1\0\1\5\3\0\1\5\4\0\13\5\1\0"+
    "\4\5\1\50\1\62\4\0\10\5\2\0\7\5\1\0"+
    "\1\5\3\0\1\5\13\0\1\63\2\0\1\63\46\0"+
    "\13\5\1\0\2\64\4\5\4\0\10\5\2\0\7\5"+
    "\1\0\1\5\3\0\1\5\4\0\7\5\1\65\2\5"+
    "\1\66\1\0\6\5\4\0\10\5\2\0\7\5\1\0"+
    "\1\5\3\0\1\5\4\0\7\5\1\66\2\5\1\66"+
    "\1\0\6\5\4\0\10\5\2\0\7\5\1\0\1\5"+
    "\3\0\1\5\4\0\13\5\1\0\6\5\4\0\10\5"+
    "\2\0\3\5\1\67\3\5\1\0\1\5\3\0\1\5"+
    "\4\0\7\5\1\66\2\5\1\70\1\0\6\5\4\0"+
    "\10\5\2\0\7\5\1\0\1\5\3\0\1\5\4\0"+
    "\13\5\1\0\6\5\4\0\10\5\2\0\5\5\1\71"+
    "\1\5\1\0\1\5\3\0\1\5\4\0\5\5\1\72"+
    "\2\5\1\72\2\5\1\0\6\5\4\0\10\5\2\0"+
    "\7\5\1\0\1\5\3\0\1\5\4\0\13\5\1\0"+
    "\6\5\4\0\2\5\1\73\3\5\1\73\1\5\2\0"+
    "\7\5\1\0\1\5\3\0\1\5\4\0\1\5\1\74"+
    "\1\5\1\74\7\5\1\0\6\5\4\0\10\5\2\0"+
    "\7\5\1\0\1\5\3\0\1\5\60\0\1\75\11\0"+
    "\1\76\60\0\1\77\6\0\1\100\64\0\1\101\46\0"+
    "\1\102\57\0\1\103\6\0\1\104\43\0\1\60\57\0"+
    "\1\57\1\60\61\0\1\5\1\74\1\5\1\74\7\5"+
    "\1\0\6\5\4\0\1\5\1\105\6\5\2\0\7\5"+
    "\1\0\1\5\3\0\1\5\4\0\1\5\1\74\1\5"+
    "\1\74\7\5\1\0\6\5\4\0\5\5\1\106\2\5"+
    "\2\0\7\5\1\0\1\5\3\0\1\5\33\0\1\107"+
    "\3\0\1\107\25\0\5\5\1\110\2\5\1\110\2\5"+
    "\1\0\6\5\4\0\10\5\2\0\7\5\1\0\1\5"+
    "\3\0\1\5\4\0\3\5\1\111\3\5\1\112\3\5"+
    "\1\0\6\5\4\0\10\5\2\0\7\5\1\0\1\5"+
    "\3\0\1\5\4\0\5\5\1\113\5\5\1\0\6\5"+
    "\4\0\10\5\2\0\7\5\1\0\1\5\3\0\1\5"+
    "\4\0\1\5\1\114\10\5\1\115\1\0\6\5\4\0"+
    "\10\5\2\0\7\5\1\0\1\5\3\0\1\5\4\0"+
    "\10\5\1\113\2\5\1\0\6\5\4\0\10\5\2\0"+
    "\7\5\1\0\1\5\3\0\1\5\4\0\6\5\1\116"+
    "\2\5\1\116\1\5\1\0\6\5\4\0\10\5\2\0"+
    "\7\5\1\0\1\5\3\0\1\5\4\0\7\5\1\117"+
    "\2\5\1\117\1\0\6\5\4\0\10\5\2\0\7\5"+
    "\1\0\1\5\3\0\1\5\4\0\6\5\1\120\2\5"+
    "\1\120\1\5\1\0\6\5\4\0\10\5\2\0\7\5"+
    "\1\0\1\5\3\0\1\5\43\0\1\121\60\0\1\122"+
    "\60\0\1\123\60\0\1\124\60\0\1\125\30\0\1\126"+
    "\110\0\1\127\60\0\1\130\21\0\13\5\1\0\2\5"+
    "\1\131\3\5\4\0\10\5\2\0\7\5\1\0\1\5"+
    "\3\0\1\5\4\0\13\5\1\0\3\5\1\132\2\5"+
    "\4\0\10\5\2\0\7\5\1\0\1\5\3\0\1\5"+
    "\4\0\13\5\1\0\2\5\2\133\2\5\4\0\10\5"+
    "\2\0\7\5\1\0\1\5\3\0\1\5\4\0\4\5"+
    "\1\134\6\5\1\0\6\5\4\0\10\5\2\0\7\5"+
    "\1\0\1\5\3\0\1\5\4\0\13\5\1\0\6\5"+
    "\4\0\1\5\1\135\6\5\2\0\7\5\1\0\1\5"+
    "\3\0\1\5\4\0\2\5\1\134\10\5\1\0\6\5"+
    "\4\0\10\5\2\0\7\5\1\0\1\5\3\0\1\5"+
    "\4\0\13\5\1\0\6\5\4\0\5\5\1\135\2\5"+
    "\2\0\7\5\1\0\1\5\3\0\1\5\4\0\13\5"+
    "\1\0\6\5\2\0\1\136\1\0\10\5\2\0\7\5"+
    "\1\0\1\5\3\0\1\5\4\0\13\5\1\0\2\137"+
    "\4\5\4\0\10\5\2\0\7\5\1\0\1\5\3\0"+
    "\1\5\43\0\1\140\21\0\13\5\1\0\4\5\1\141"+
    "\1\5\4\0\10\5\2\0\7\5\1\0\1\5\3\0"+
    "\1\5\4\0\13\5\1\0\5\5\1\142\4\0\10\5"+
    "\2\0\7\5\1\0\1\5\3\0\1\5\4\0\5\5"+
    "\1\143\2\5\1\143\2\5\1\0\6\5\4\0\10\5"+
    "\2\0\7\5\1\0\1\5\3\0\1\5\4\0\13\5"+
    "\1\0\6\5\2\0\1\144\1\0\10\5\2\0\7\5"+
    "\1\0\1\5\3\0\1\5\4\0\13\5\1\0\6\5"+
    "\4\0\2\5\1\145\5\5\2\0\7\5\1\0\1\5"+
    "\3\0\1\5\4\0\13\5\1\0\6\5\4\0\6\5"+
    "\1\146\1\5\2\0\7\5\1\0\1\5\3\0\1\5"+
    "\4\0\13\5\1\0\4\5\2\147\4\0\10\5\2\0"+
    "\7\5\1\0\1\5\3\0\1\5\4\0\13\5\1\0"+
    "\6\5\4\0\3\5\1\150\4\5\2\0\7\5\1\0"+
    "\1\5\3\0\1\5\4\0\13\5\1\0\6\5\4\0"+
    "\7\5\1\150\2\0\7\5\1\0\1\5\3\0\1\5"+
    "\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3675];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\6\1\1\11\2\1\4\11\1\1\1\11\1\0"+
    "\1\1\4\11\5\1\1\0\12\1\7\0\3\1\1\0"+
    "\11\1\10\0\2\1\1\11\11\1\5\11\1\0\2\11"+
    "\5\1\1\11\1\1\1\11\3\1\1\11\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[104];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
Main m = new Main();
List<String> words = new ArrayList<String>();
List<String> line = new ArrayList<String>();
boolean PR = false;
public void program(boolean x){
         this.PR=x;

   }
   public void identifier(String x, int y) {
      
   if(PR == false){
   if(words.isEmpty()== true){
   words.add(x);
   line.add(x + " " +Integer.toString(y+1));
   }
   else { boolean t = true;
   for(int i = 0; i < words.size(); i++){
   if(x.equals(words.get(i)))
   t = false;
                           }
   if(t== true){ words.add(x);
              line.add(x + " " + Integer.toString(y+1));}                      

   }}
   else this.PR = false;


   }
   



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  tester(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 172) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    //last();

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Symbol next() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      if (zzMarkedPosL > zzStartRead) {
        switch (zzBufferL[zzMarkedPosL-1]) {
        case '\n':
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = zzBufferL[zzMarkedPosL] != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = zzBufferL[zzMarkedPosL] != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return new Symbol(LexicalUnit.ENDLINE," ");
            }
          case 32: break;
          case 2: 
            { identifier(yytext(),yyline);
              return new Symbol(LexicalUnit.VARNAME,yytext());
            }
          case 33: break;
          case 3: 
            { return new Symbol(LexicalUnit.PLUS,yytext());
            }
          case 34: break;
          case 4: 
            { return new Symbol(LexicalUnit.MINUS,yytext());
            }
          case 35: break;
          case 5: 
            { return new Symbol(LexicalUnit.DIVIDE,yytext());
            }
          case 36: break;
          case 6: 
            { return new Symbol(LexicalUnit.TIMES,yytext());
            }
          case 37: break;
          case 7: 
            { return new Symbol(LexicalUnit.COMMA,yytext());
            }
          case 38: break;
          case 8: 
            { 
            }
          case 39: break;
          case 9: 
            { return new Symbol(LexicalUnit.NUMBER,yytext());
            }
          case 40: break;
          case 10: 
            { return new Symbol(LexicalUnit.LEFT_PARENTHESIS,yytext());
            }
          case 41: break;
          case 11: 
            { return new Symbol(LexicalUnit.RIGHT_PARENTHESIS,yytext());
            }
          case 42: break;
          case 12: 
            { return new Symbol(LexicalUnit.EQUAL,yytext());
            }
          case 43: break;
          case 13: 
            { return new Symbol(LexicalUnit.IF,yytext());
            }
          case 44: break;
          case 14: 
            { return new Symbol(LexicalUnit.END,yytext());
            }
          case 45: break;
          case 15: 
            { return new Symbol(LexicalUnit.DO,yytext());
            }
          case 46: break;
          case 16: 
            { return new Symbol(LexicalUnit.ELSE,yytext());
            }
          case 47: break;
          case 17: 
            { return new Symbol(LexicalUnit.THEN,yytext());
            }
          case 48: break;
          case 18: 
            { return new Symbol(LexicalUnit.EQUAL_COMPARE,yytext());
            }
          case 49: break;
          case 19: 
            { return new Symbol(LexicalUnit.DIFFERENT,yytext());
            }
          case 50: break;
          case 20: 
            { return new Symbol(LexicalUnit.GREATER_EQUAL,yytext());
            }
          case 51: break;
          case 21: 
            { return new Symbol(LexicalUnit.GREATER,yytext());
            }
          case 52: break;
          case 22: 
            { return new Symbol(LexicalUnit.OR,yytext());
            }
          case 53: break;
          case 23: 
            { return new Symbol(LexicalUnit.SMALLER_EQUAL,yytext());
            }
          case 54: break;
          case 24: 
            { return new Symbol(LexicalUnit.SMALLER,yytext());
            }
          case 55: break;
          case 25: 
            { return new Symbol(LexicalUnit.ENDIF,yytext());
            }
          case 56: break;
          case 26: 
            { return new Symbol(LexicalUnit.ENDDO,yytext());
            }
          case 57: break;
          case 27: 
            { return new Symbol(LexicalUnit.READ,yytext());
            }
          case 58: break;
          case 28: 
            { return new Symbol(LexicalUnit.AND,yytext());
            }
          case 59: break;
          case 29: 
            { return new Symbol(LexicalUnit.PRINT,yytext());
            }
          case 60: break;
          case 30: 
            { return new Symbol(LexicalUnit.INTEGER,yytext());
            }
          case 61: break;
          case 31: 
            { program(true);
				return new Symbol(LexicalUnit.PROGRAM,yytext());
            }
          case 62: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
