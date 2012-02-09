package dc;


import edu.umn.cs.melt.copper.runtime.engines.semantics.VirtualLocation;
     

public class Parser_dc_parse extends edu.umn.cs.melt.copper.runtime.engines.stripped.StrippedEngine<java.lang.Object,edu.umn.cs.melt.copper.runtime.logging.CopperParserException>
{
    protected String formatError(String error)
    {
    	   String location = "";
        location += "line " + virtualLocation.getLine() + ", column " + virtualLocation.getColumn();
        if(currentState.pos.getFileName().length() > 40) location += "\n         ";
        location += " in file " + virtualLocation.getFileName();
        location += "\n         (parser state: " + currentState.statenum + "; real character index: " + currentState.pos.getPos() + ")";
        return "Error at " + location + ":\n  " + error;
    }
    protected void reportError(String message)
    throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
        throw new edu.umn.cs.melt.copper.runtime.logging.CopperParserException(message);
    }
    public void setupEngine()
    {
    }
    public int transition(int state,char ch)
    {
         return delta[state][cmap[ch]];
    }
    public class Semantics extends edu.umn.cs.melt.copper.runtime.engines.stripped.semantics.StrippedSemanticActionContainer<edu.umn.cs.melt.copper.runtime.logging.CopperParserException>
    {
        public common.DecoratedNode context;

        public Semantics()
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            runInit();
        }

        public void error(edu.umn.cs.melt.copper.runtime.auxiliary.InputPosition pos,java.lang.String message)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            reportError("Error at " + pos.toString() + ":\n  " + message);
        }

        public void runDefaultTermAction()
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            
        }
        public void runDefaultProdAction()
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            
        }
        public void runInit()
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
                        context = common.TopNode.singleton;
        }
        public Object runSemanticAction(edu.umn.cs.melt.copper.runtime.auxiliary.InputPosition _pos,Object[] _children,int _prod)
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            this._pos = _pos;
            this._children = _children;
            this._prod = _prod;
            this._specialAttributes = new edu.umn.cs.melt.copper.runtime.engines.semantics.SpecialParserAttributes(virtualLocation);
            Object RESULT = null;
            switch(_prod)
            {
            case 35:
                RESULT = runSemanticAction_35();
                break;
            case 36:
                RESULT = runSemanticAction_36();
                break;
            case 37:
                RESULT = runSemanticAction_37();
                break;
            case 39:
                RESULT = runSemanticAction_39();
                break;
            case 40:
                RESULT = runSemanticAction_40();
                break;
            case 41:
                RESULT = runSemanticAction_41();
                break;
            case 42:
                RESULT = runSemanticAction_42();
                break;
            case 43:
                RESULT = runSemanticAction_43();
                break;
            case 44:
                RESULT = runSemanticAction_44();
                break;
            case 45:
                RESULT = runSemanticAction_45();
                break;
            case 46:
                RESULT = runSemanticAction_46();
                break;
            case 47:
                RESULT = runSemanticAction_47();
                break;
            case 48:
                RESULT = runSemanticAction_48();
                break;
            case 49:
                RESULT = runSemanticAction_49();
                break;
            case 50:
                RESULT = runSemanticAction_50();
                break;
            case 51:
                RESULT = runSemanticAction_51();
                break;
            case 52:
                RESULT = runSemanticAction_52();
                break;
            case 53:
                RESULT = runSemanticAction_53();
                break;
            case 54:
                RESULT = runSemanticAction_54();
                break;
            case 55:
                RESULT = runSemanticAction_55();
                break;
            case 56:
                RESULT = runSemanticAction_56();
                break;
            case 57:
                RESULT = runSemanticAction_57();
                break;
            case 58:
                RESULT = runSemanticAction_58();
                break;
            case 59:
                RESULT = runSemanticAction_59();
                break;
            default:
        runDefaultProdAction();
                 break;
            }
            return RESULT;
        }
        public Object runSemanticAction(edu.umn.cs.melt.copper.runtime.auxiliary.InputPosition _pos,edu.umn.cs.melt.copper.runtime.engines.stripped.scanner.StrippedMatchData _terminal)
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            this._pos = _pos;
            this._terminal = _terminal;
            this._specialAttributes = new edu.umn.cs.melt.copper.runtime.engines.semantics.SpecialParserAttributes(virtualLocation);
            @SuppressWarnings("unused") String lexeme = _terminal.lexeme;
            Object RESULT = null;
            switch(_terminal.firstTerm)
            {
            case 0:
                RESULT = runSemanticAction_0(lexeme);
                break;
            case 2:
                RESULT = runSemanticAction_2(lexeme);
                break;
            case 3:
                RESULT = runSemanticAction_3(lexeme);
                break;
            case 4:
                RESULT = runSemanticAction_4(lexeme);
                break;
            case 5:
                RESULT = runSemanticAction_5(lexeme);
                break;
            case 6:
                RESULT = runSemanticAction_6(lexeme);
                break;
            case 7:
                RESULT = runSemanticAction_7(lexeme);
                break;
            case 8:
                RESULT = runSemanticAction_8(lexeme);
                break;
            case 9:
                RESULT = runSemanticAction_9(lexeme);
                break;
            case 10:
                RESULT = runSemanticAction_10(lexeme);
                break;
            case 11:
                RESULT = runSemanticAction_11(lexeme);
                break;
            case 12:
                RESULT = runSemanticAction_12(lexeme);
                break;
            case 13:
                RESULT = runSemanticAction_13(lexeme);
                break;
            case 14:
                RESULT = runSemanticAction_14(lexeme);
                break;
            case 15:
                RESULT = runSemanticAction_15(lexeme);
                break;
            case 16:
                RESULT = runSemanticAction_16(lexeme);
                break;
            case 17:
                RESULT = runSemanticAction_17(lexeme);
                break;
            case 18:
                RESULT = runSemanticAction_18(lexeme);
                break;
            case 19:
                RESULT = runSemanticAction_19(lexeme);
                break;
            case 20:
                RESULT = runSemanticAction_20(lexeme);
                break;
            default:
        runDefaultTermAction();
                 break;
            }
            return RESULT;
        }
        public java.lang.Object runSemanticAction_35()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PFactorLogiNot_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_36()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PintegerConstant_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_37()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.Pnested_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_39()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PorOp_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_40()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PLogiOrLogiAnd_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_41()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.Proot_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_42()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PequalTo_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_43()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PnotEqualTo_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_44()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PCmpeCmlg_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_45()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PandOp_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_46()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PLogiAndCmpe_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_47()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PexprTerm_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_48()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.Psub_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_49()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.Padd_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_50()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PlessThanOrEqualTo_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_51()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PgreaterThan_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_52()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PlessThan_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_53()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PCmplgExpr_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_54()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PgreaterThanOrEqualTo_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_55()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PphraseFactor_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_56()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.Ppow_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_57()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.PtermPhrase_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_58()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.Pdiv_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_59()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new dc.Pmul_c(_children);
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_0(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_2(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_3(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_4(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_5(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_6(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_7(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_8(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_9(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_10(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_11(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_12(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_13(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_14(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_15(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_16(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_17(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_18(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_19(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public java.lang.Object runSemanticAction_20(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            java.lang.Object RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation.getFileName(),virtualLocation.getLine(),virtualLocation.getColumn());
    
            return RESULT;
        }
        public int runDisambiguationAction(edu.umn.cs.melt.copper.runtime.auxiliary.InputPosition _pos,edu.umn.cs.melt.copper.runtime.engines.stripped.scanner.StrippedMatchData match)
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            @SuppressWarnings("unused") String lexeme = match.lexeme;
            return -1;
        }
    }
    public Semantics semantics;
    public Object runSemanticAction(edu.umn.cs.melt.copper.runtime.auxiliary.InputPosition _pos,Object[] _children,int _prod)
    throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
        return semantics.runSemanticAction(_pos,_children,_prod);
    }
    public Object runSemanticAction(edu.umn.cs.melt.copper.runtime.auxiliary.InputPosition _pos,edu.umn.cs.melt.copper.runtime.engines.stripped.scanner.StrippedMatchData _terminal)
    throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
        return semantics.runSemanticAction(_pos,_terminal);
    }
    public int runDisambiguationAction(edu.umn.cs.melt.copper.runtime.auxiliary.InputPosition _pos,edu.umn.cs.melt.copper.runtime.engines.stripped.scanner.StrippedMatchData matches)
    throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
        return semantics.runDisambiguationAction(_pos,matches);
    }
    public edu.umn.cs.melt.copper.runtime.engines.semantics.SpecialParserAttributes getSpecialAttributes()
    {
        return semantics.getSpecialAttributes();
    }
    public void startEngine(edu.umn.cs.melt.copper.runtime.auxiliary.InputPosition initialPos)
    throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
         super.startEngine(initialPos);
         semantics = new Semantics();
    }

public static final byte[] symbolNamesHash = edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\165\122\301\156\324\060" +
"\020\165\101\250\264\200\100\052\024\012\124\010\251\347\376\000" +
"\134\252\260\055\110\021\033\261\053\070\040\021\231\144\224\015" +
"\162\154\143\117\332\042\176\011\176\206\237\100\034\370\007\074" +
"\161\334\215\223\345\066\157\336\233\361\233\361\374\370\313\156" +
"\264\206\355\175\114\277\360\163\176\054\270\254\216\027\150\152" +
"\131\275\370\371\353\375\357\077\207\337\317\256\061\166\251\031" +
"\143\057\221\335\232\065\032\277\171\036\331\326\221\313\224\105" +
"\376\106\142\132\143\216\310\166\034\312\104\153\103\374\212\333" +
"\125\210\027\310\015\305\273\024\213\236\270\351\300\153\336\325" +
"\122\247\064\343\006\144\100\357\256\320\035\342\300\332\345\212" +
"\167\170\177\200\347\146\366\265\345\142\251\210\270\347\210\063" +
"\003\034\301\004\355\155\227\032\050\016\142\105\124\115\326\116" +
"\144\071\327\004\356\072\360\126\341\210\166\031\117\323\110\163" +
"\343\143\172\065\255\045\044\252\151\100\142\236\371\352\017\253" +
"\032\141\241\171\001\044\272\016\332\042\333\246\271\224\102\037" +
"\315\056\265\361\263\236\362\002\225\311\013\357\067\125\125\355" +
"\136\042\270\365\251\137\215\113\315\073\301\116\337\042\304\111" +
"\243\141\130\350\046\010\024\365\247\170\327\313\104\105\200\272" +
"\145\053\303\055\004\331\022\114\103\361\141\146\124\331\026\130" +
"\053\231\137\171\032\170\171\026\363\265\104\250\300\044\112\132" +
"\344\262\123\354\307\012\011\026\241\163\263\235\160\155\133\001" +
"\310\356\307\022\105\073\234\276\355\307\035\214\063\052\063\375" +
"\002\036\306\151\350\177\313\061\217\107\126\326\137\351\310\107" +
"\061\111\053\114\032\277\236\007\061\305\273\173\160\371\047\123" +
"\203\316\132\130\376\250\041\270\305\207\255\356\305\224\155\077" +
"\157\310\362\262\233\362\171\234\025\223\033\237\032\251\006\347" +
"\076\065\022\072\020\165\060\031\132\124\341\102\216\376\333\064" +
"\172\373\151\054\323\335\031\255\157\167\064\224\126\027\033\176" +
"\302\365\155\326\367\067\052\051\353\363\015\331\246\025\171\361" +
"\017\367\233\076\143\253\004\000\000"
});

public static final byte[] symbolNumbersHash = edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\201\051\332\323\167\127\202\132\331\253\115\113\231\030\030" +
"\052\012\030\030\030\154\030\150\004\024\310\300\016\014\014\214" +
"\120\314\014\304\114\120\032\131\214\031\211\215\056\316\214\103" +
"\015\062\315\014\000\032\216\134\370\013\001\000\000"
});

public static final byte[] productionLHSsHash = edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\201\051\332\323\167\127\202\132\331\253\115\113\231\030\030" +
"\052\012\030\030\030\044\025\030\030\044\024\040\064\010\113\001" +
"\261\064\024\313\000\261\054\022\226\203\142\171\044\254\200\005" +
"\053\102\261\022\014\003\000\021\077\105\264\177\000\000\000"
});

public static final byte[] parseTableHash = edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\315\227\271\116\303\100" +
"\020\206\207\160\337\367\175\055\147\056\356\204\233\202\226\002" +
"\361\000\151\170\004\100\002\121\321\123\361\024\164\124\224\074" +
"\017\025\022\065\055\063\141\027\306\316\172\066\262\127\304\253" +
"\374\372\355\331\361\357\057\226\055\173\137\076\241\365\366\006" +
"\232\053\225\263\361\257\367\213\311\247\307\223\014\300\375\025" +
"\000\344\261\236\251\234\235\277\135\256\336\175\274\076\233\362" +
"\022\350\241\000\232\300\062\260\236\261\325\353\035\170\174\013" +
"\252\131\157\167\243\172\120\235\250\056\124\073\252\003\325\212" +
"\152\273\275\206\207\352\331\252\124\247\000\313\306\303\212\252" +
"\333\172\222\320\323\010\122\351\377\361\037\327\152\120\173\175" +
"\327\352\327\303\212\252\333\172\222\320\323\250\241\332\067\316" +
"\205\374\223\266\172\130\074\303\053\325\241\161\056\323\035\256" +
"\333\372\170\277\067\252\115\343\044\005\060\214\032\142\124\233" +
"\222\170\206\127\252\135\162\044\351\103\365\206\273\151\136\022" +
"\317\360\112\265\046\165\323\074\322\216\241\106\121\043\172\177" +
"\234\334\034\353\312\210\105\265\341\240\012\314\043\121\277\251" +
"\343\366\100\075\031\261\250\162\016\052\353\074\022\115\270\172" +
"\022\121\345\223\046\052\200\251\244\031\101\252\313\244\161\236" +
"\106\143\336\070\102\017\275\161\026\122\111\065\233\016\052\365" +
"\363\166\236\121\326\267\163\203\251\246\243\251\034\311\316\076" +
"\345\375\031\324\251\215\274\257\346\123\111\225\113\017\225\252" +
"\376\176\237\301\364\334\355\313\251\244\312\246\222\152\065\075" +
"\124\270\077\247\135\130\343\374\067\225\245\147\221\274\341\327" +
"\212\326\203\053\312\265\036\054\112\311\064\257\202\137\310\264" +
"\117\137\310\105\163\254\053\243\236\121\103\125\160\120\025\102" +
"\124\005\115\125\060\307\272\062\142\121\155\033\047\251\332\225" +
"\327\266\044\236\341\225\152\135\352\016\317\253\277\325\304\272" +
"\372\133\115\210\031\261\250\216\214\163\061\252\043\111\074\303" +
"\053\125\211\134\105\257\122\113\222\170\206\127\252\055\343\044" +
"\125\173\137\155\111\342\031\136\251\016\214\163\061\252\003\111" +
"\074\303\053\325\212\361\260\242\352\266\036\357\124\073\344\052" +
"\372\276\332\221\304\063\274\122\145\245\356\250\171\025\134\321" +
"\213\031\261\250\366\364\131\242\256\325\236\044\236\341\225\252" +
"\354\240\052\113\342\031\136\251\216\215\163\061\252\143\111\074" +
"\043\311\370\006\257\261\203\374\057\030\000\000"
});

public static final byte[] shiftableSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\203\146\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\000\003\106\226\212\342\102\206\072\006\246" +
"\122\020\311\012\227\140\375\367\013\273\004\351\072\360\110\124" +
"\221\054\041\205\113\202\011\207\304\042\034\022\054\115\270\044" +
"\030\160\110\060\340\224\300\025\044\124\224\140\141\142\030\070" +
"\313\007\124\002\167\324\342\226\300\225\174\160\045\006\162\022" +
"\034\351\151\027\147\066\300\141\007\316\044\212\307\125\170\234" +
"\013\000\333\344\232\251\141\004\000\000"
});

public static final byte[] layoutSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\203\146\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\000\001\011\006\306\212\342\102\206\072\006" +
"\246\122\020\311\072\052\061\052\061\052\061\074\045\000\134\141" +
"\322\176\141\004\000\000"
});

public static final byte[] prefixSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\203\146\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\200\202\212\342\102\206\072\006\246\122\020" +
"\311\072\052\061\052\061\052\061\074\045\000\306\102\154\302\141" +
"\004\000\000"
});

public static final byte[] layoutMapsHash = edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\044\072\332\047\053\261\054\121\257\264\044\063\107\317" +
"\051\263\044\070\265\304\132\362\322\273\215\346\317\356\030\061" +
"\061\060\124\024\060\060\060\150\002\025\012\143\121\227\053\251" +
"\301\162\276\317\245\000\246\116\254\270\210\101\000\135\125\336" +
"\337\216\072\113\223\325\212\314\014\214\321\014\054\111\231\045" +
"\305\045\014\114\321\136\025\005\100\103\101\264\002\313\126\241" +
"\215\245\223\141\146\060\062\200\001\043\113\105\001\006\050\056" +
"\144\250\143\140\051\005\221\354\050\112\161\112\024\200\305\230" +
"\300\156\303\246\206\365\337\057\142\355\001\051\305\155\006\001" +
"\173\206\233\177\350\147\117\025\361\366\124\341\262\247\152\020" +
"\331\043\105\274\075\122\270\354\221\042\302\036\046\342\355\141" +
"\302\145\017\023\141\173\026\021\157\317\042\134\366\054\042\154" +
"\017\113\023\321\366\200\224\342\066\203\220\075\014\304\333\303" +
"\200\313\036\006\302\366\060\020\157\017\003\056\173\030\210\261" +
"\207\116\345\316\250\075\344\331\303\302\304\100\164\172\003\052" +
"\305\155\306\040\361\317\250\075\243\366\214\332\103\111\373\215" +
"\116\365\066\335\354\241\123\273\212\116\355\220\341\327\116\034" +
"\156\355\153\172\365\113\350\023\077\364\152\367\322\057\275\015" +
"\261\164\015\000\343\135\326\012\047\021\000\000"
});

public static final byte[] prefixMapsHash = edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\044\072\332\047\053\261\054\121\257\264\044\063\107\317" +
"\051\263\044\070\265\304\132\362\322\273\215\346\317\356\030\061" +
"\061\060\124\024\060\060\060\150\002\025\012\143\121\227\053\251" +
"\301\162\276\317\245\000\246\116\254\000\053\050\055\144\250\143" +
"\140\032\225\037\225\037\225\037\225\037\171\362\000\352\060\157" +
"\277\153\005\000\000"
});

public static final byte[] shiftableUnionHash = edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\270" +
"\210\101\040\053\261\054\121\257\264\044\063\107\317\051\263\044" +
"\070\265\044\357\157\107\235\245\311\152\105\146\006\306\150\006" +
"\226\244\314\222\342\022\006\246\150\257\212\202\322\042\060\255" +
"\300\262\125\150\143\351\144\046\006\206\212\002\006\006\006\106" +
"\006\020\140\375\377\257\002\000\133\360\111\205\121\000\000\000" +
""
});

public static final byte[] acceptSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\203\164\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\200\202\212\342\102\206\072\006\246\122\020" +
"\311\212\044\301\210\113\002\207\016\016\334\106\071\140\227\140" +
"\301\251\203\005\207\204\000\056\035\114\044\273\212\021\247\345" +
"\015\270\044\004\160\111\070\340\364\071\251\376\140\120\300\045" +
"\301\201\323\016\026\222\045\032\160\110\060\342\262\203\211\124" +
"\017\002\335\213\113\102\000\227\204\102\005\000\270\113\251\072" +
"\003\003\000\000"
});

public static final byte[] rejectSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\203\164\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\200\202\212\342\102\206\072\006\246\122\020" +
"\311\072\052\061\052\061\160\022\000\322\322\001\215\003\003\000" +
"\000"
});

public static final byte[] possibleSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\203\164\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\200\202\212\342\102\206\072\006\246\122\020" +
"\311\012\227\220\377\377\027\273\004\203\002\016\035\034\270\214" +
"\342\140\160\300\056\301\202\113\007\003\017\016\011\001\134\072" +
"\230\161\133\216\103\202\021\247\345\015\270\044\002\160\111\070" +
"\340\220\300\351\101\234\376\300\031\272\100\217\340\220\140\140" +
"\041\131\242\001\207\004\043\056\073\230\110\016\053\006\016\134" +
"\022\002\270\044\024\052\000\224\160\376\051\003\003\000\000"
});

public static final byte[] cMapHash = edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\355\321\065\216\026\000" +
"\020\200\321\037\167\167\367\305\335\335\145\201\305\175\221\105" +
"\016\100\110\040\134\210\216\212\222\043\221\160\006\370\012\372" +
"\335\236\367\222\257\230\142\222\111\346\373\357\301\264\317\237" +
"\006\223\107\207\107\176\216\015\175\371\365\343\333\344\301\340" +
"\353\307\301\340\317\237\301\370\076\324\212\132\371\157\136\123" +
"\153\047\260\067\121\063\153\106\255\253\365\265\241\066\326\364" +
"\332\124\323\152\152\115\251\356\036\154\256\111\265\245\126\327" +
"\334\232\127\363\153\101\055\254\105\265\270\226\324\322\132\126" +
"\133\153\133\055\257\071\065\273\206\152\173\355\250\235\265\253" +
"\166\327\236\332\133\373\152\177\035\250\203\165\250\016\327\221" +
"\072\132\307\352\170\235\250\223\165\252\116\327\231\072\133\347" +
"\352\174\135\250\213\165\251\056\327\225\132\125\127\353\132\135" +
"\257\033\065\134\067\353\126\335\256\221\272\123\167\353\136\335" +
"\257\007\365\260\036\325\343\172\122\117\353\131\075\257\027\065" +
"\132\057\353\125\275\256\067\065\126\157\153\126\275\253\367\343" +
"\176\006\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\200\377" +
"\322\137\016\136\254\212\027\000\004\000"
});

public static final byte[] deltaHash = edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\355\327\073\012\302\100" +
"\024\005\320\207\377\377\377\157\357\052\334\100\012\161\001\151" +
"\154\354\125\210\130\331\133\271\012\073\053\113\327\143\045\130" +
"\333\372\004\025\006\233\161\206\211\317\170\017\334\046\060\311" +
"\013\227\031\222\375\205\222\301\202\342\276\357\265\257\247\161" +
"\167\273\031\306\210\126\063\042\352\363\365\230\357\215\216\223" +
"\301\362\174\330\075\057\117\011\304\011\346\264\046\156\350\325" +
"\116\227\323\341\364\070\055\116\223\323\346\144\070\145\116\211" +
"\123\340\334\327\324\064\223\172\254\275\247\301\111\204\360\142" +
"\221\360\326\216\256\212\213\151\100\365\326\116\326\141\134\337" +
"\077\162\061\336\073\066\342\041\076\353\247\175\245\035\320\144" +
"\334\116\325\305\064\240\372\250\235\264\305\203\322\226\353\377" +
"\222\361\336\311\271\230\006\124\370\146\223\034\174\025\110\206" +
"\166\044\063\156\247\350\142\032\120\141\357\110\366\161\073\111" +
"\227\323\200\012\377\073\222\341\144\223\014\355\110\146\325\116" +
"\135\063\140\010\355\110\206\223\115\062\264\043\031\332\221\114" +
"\253\235\174\130\323\200\012\173\107\062\264\043\031\332\221\354" +
"\006\365\013\316\334\323\053\000\000"
});

public static void initArrays()
throws java.io.IOException,java.lang.ClassNotFoundException
{
    symbolNames = (String[]) edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.readHash(symbolNamesHash);
    symbolNumbers = (int[]) edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.readHash(symbolNumbersHash);
    productionLHSs = (int[]) edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.readHash(productionLHSsHash);
    parseTable = (int[][]) edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.readHash(parseTableHash);
    shiftableSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.readHash(shiftableSetsHash);
    layoutSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.readHash(layoutSetsHash);
    prefixSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.readHash(prefixSetsHash);
    layoutMaps = (java.util.BitSet[][]) edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.readHash(layoutMapsHash);
    prefixMaps = (java.util.BitSet[][]) edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.readHash(prefixMapsHash);
    shiftableUnion = (java.util.BitSet) edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.readHash(shiftableUnionHash);
    acceptSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.readHash(acceptSetsHash);
    rejectSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.readHash(rejectSetsHash);
    possibleSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.readHash(possibleSetsHash);
    cmap = (int[]) edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.readHash(cMapHash);
    delta = (int[][]) edu.umn.cs.melt.copper.runtime.auxiliary.ByteArrayEncoder.readHash(deltaHash);
    }
    public Parser_dc_parse() {}
    
    public static void main(String[] args)
    {
        boolean useFile = false;
        String filename = "<stdin>";
        java.io.Reader reader = null;
        try
        {
	        int i;
    	    for(i = 0;i < args.length;i++)
        	{
        		if(args[i].charAt(0) != '-') break;
	        	else if(args[i].equals("-f"))
    	    	{
        			i++;
            	    if(i >= args.length) throw new edu.umn.cs.melt.copper.runtime.logging.CopperParserException("A filename must be provided with switch '-f'");
                    useFile = true;
                	filename = args[i];
 	               continue;
    	        }
        	}
            if(!useFile) reader = new java.io.InputStreamReader(System.in);
            else
    		{
    	        try
        	    {
                	reader = new java.io.FileReader(filename);
            	}
            	catch(java.io.FileNotFoundException ex)
            	{
              	  throw new edu.umn.cs.melt.copper.runtime.logging.CopperParserException("File not found: '" + filename + "'");
            	}
        	}
            edu.umn.cs.melt.copper.runtime.engines.stripped.StrippedEngine<java.lang.Object,edu.umn.cs.melt.copper.runtime.logging.CopperParserException> engine = new dc.Parser_dc_parse();
            Object parseTree = engine.parse(reader,filename);
            engine.runPostParseCode(parseTree);
        }
        catch(java.lang.Exception ex)
        {
            System.err.println(ex.getMessage());
            System.exit(1);
        }
    }
		private static int TERMINAL_COUNT;
		private static int GRAMMAR_SYMBOL_COUNT;
		private static int SYMBOL_COUNT;
		private static int PARSER_STATE_COUNT;
		private static int SCANNER_STATE_COUNT;
		private static int DISAMBIG_GROUP_COUNT;
		
		private static int SCANNER_START_STATENUM;
		private static int PARSER_START_STATENUM;
		private static int EOF_SYMNUM;
		private static int EPS_SYMNUM;
		
		private static String[] symbolNames;
		private static int[] symbolNumbers;
		private static int[] productionLHSs;
		
		private static int[][] parseTable;
		private static java.util.BitSet[] shiftableSets;
		private static java.util.BitSet[] layoutSets;
		private static java.util.BitSet[] prefixSets;
		private static java.util.BitSet[][] layoutMaps;
		private static java.util.BitSet[][] prefixMaps;
		
		private static java.util.BitSet[] disambiguationGroups;
		
		private static java.util.BitSet shiftableUnion;
		
		private static java.util.BitSet[] acceptSets,rejectSets,possibleSets;
		
		private static int[][] delta;
		private static int[] cmap;
		
		public int getTERMINAL_COUNT() {
			return TERMINAL_COUNT;
		}
		public int getGRAMMAR_SYMBOL_COUNT() {
			return GRAMMAR_SYMBOL_COUNT;
		}
		public int getSYMBOL_COUNT() {
			return SYMBOL_COUNT;
		}
		public int getPARSER_STATE_COUNT() {
			return PARSER_STATE_COUNT;
		}
		public int getSCANNER_STATE_COUNT() {
			return SCANNER_STATE_COUNT;
		}
		public int getDISAMBIG_GROUP_COUNT() {
			return DISAMBIG_GROUP_COUNT;
		}
		public int getSCANNER_START_STATENUM() {
			return SCANNER_START_STATENUM;
		}
		public int getPARSER_START_STATENUM() {
			return PARSER_START_STATENUM;
		}
		public int getEOF_SYMNUM() {
			return EOF_SYMNUM;
		}
		public int getEPS_SYMNUM() {
			return EPS_SYMNUM;
		}
		public String[] getSymbolNames() {
			return symbolNames;
		}
		public int[] getSymbolNumbers() {
			return symbolNumbers;
		}
		public int[] getProductionLHSs() {
			return productionLHSs;
		}
		public int[][] getParseTable() {
			return parseTable;
		}
		public java.util.BitSet[] getShiftableSets() {
			return shiftableSets;
		}
		public java.util.BitSet[] getLayoutSets() {
			return layoutSets;
		}
		public java.util.BitSet[] getPrefixSets() {
			return prefixSets;
		}
		public java.util.BitSet[][] getLayoutMaps() {
			return layoutMaps;
		}
		public java.util.BitSet[][] getPrefixMaps() {
			return prefixMaps;
		}
		public java.util.BitSet[] getDisambiguationGroups() {
			return disambiguationGroups;
		}
		public java.util.BitSet getShiftableUnion() {
			return shiftableUnion;
		}
		public java.util.BitSet[] getAcceptSets() {
			return acceptSets;
		}
		public java.util.BitSet[] getRejectSets() {
			return rejectSets;
		}
		public java.util.BitSet[] getPossibleSets() {
			return possibleSets;
		}
		public int[][] getDelta() {
			return delta;
		}
		public int[] getCmap() {
			return cmap;
		}	
    public java.lang.Object parse(java.io.Reader input,String inputName)
    throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
    this.buffer = new edu.umn.cs.melt.copper.runtime.auxiliary.QScannerBuffer(input);
    setupEngine();
    startEngine(new edu.umn.cs.melt.copper.runtime.auxiliary.InputPosition(edu.umn.cs.melt.copper.runtime.auxiliary.InputPosition.initialPos(),inputName));
    java.lang.Object parseTree = (java.lang.Object) runEngine();
    return parseTree;
    }



    static
    {
        TERMINAL_COUNT = 22;
        GRAMMAR_SYMBOL_COUNT = 35;
        SYMBOL_COUNT = 60;
        PARSER_STATE_COUNT = 41;
        SCANNER_STATE_COUNT = 27;
        DISAMBIG_GROUP_COUNT = 0;
        SCANNER_START_STATENUM = 1;
        PARSER_START_STATENUM = 0;
        EOF_SYMNUM = 1;
        EPS_SYMNUM = 21;
        try { initArrays(); }
        catch(java.io.IOException ex) { System.err.println("IO Exception"); }
        catch(java.lang.ClassNotFoundException ex) { System.err.println("Class Not Found Exception"); }
        disambiguationGroups = new java.util.BitSet[0];
    }

}
