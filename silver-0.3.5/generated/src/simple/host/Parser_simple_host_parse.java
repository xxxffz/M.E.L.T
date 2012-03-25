package simple.host;



public class Parser_simple_host_parse extends edu.umn.cs.melt.copper.runtime.engines.single.SingleDFAEngine<simple.concretesyntax.NRoot,edu.umn.cs.melt.copper.runtime.logging.CopperParserException>
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
    protected void reportSyntaxError()
    throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
    java.util.ArrayList<String> expectedTerminalsReal = bitVecToRealStringList(getShiftableSets()[currentState.statenum]);
    java.util.ArrayList<String> expectedTerminalsDisplay = bitVecToDisplayStringList(getShiftableSets()[currentState.statenum]);
    java.util.ArrayList<String> matchedTerminalsReal = bitVecToRealStringList(disjointMatch.terms);
    java.util.ArrayList<String> matchedTerminalsDisplay = bitVecToDisplayStringList(disjointMatch.terms);
    throw new edu.umn.cs.melt.copper.runtime.logging.CopperSyntaxError(virtualLocation,currentState.pos,currentState.statenum,expectedTerminalsReal,expectedTerminalsDisplay,matchedTerminalsReal,matchedTerminalsDisplay);
    }
    public void setupEngine()
    {
    }
    public int transition(int state,char ch)
    {
         return delta[state][cmap[ch]];
    }
    public class Semantics extends edu.umn.cs.melt.copper.runtime.engines.single.semantics.SingleDFASemanticActionContainer<edu.umn.cs.melt.copper.runtime.logging.CopperParserException>
    {
        public common.DecoratedNode context;

        public Semantics()
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            runInit();
        }

        public void error(edu.umn.cs.melt.copper.runtime.io.InputPosition pos,java.lang.String message)
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
        public Object runSemanticAction(edu.umn.cs.melt.copper.runtime.io.InputPosition _pos,Object[] _children,int _prod)
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            this._pos = _pos;
            this._children = _children;
            this._prod = _prod;
            this._specialAttributes = new edu.umn.cs.melt.copper.runtime.engines.semantics.SpecialParserAttributes(virtualLocation);
            Object RESULT = null;
            switch(_prod)
            {
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
            case 60:
                RESULT = runSemanticAction_60();
                break;
            case 61:
                RESULT = runSemanticAction_61();
                break;
            case 62:
                RESULT = runSemanticAction_62();
                break;
            case 63:
                RESULT = runSemanticAction_63();
                break;
            case 64:
                RESULT = runSemanticAction_64();
                break;
            case 65:
                RESULT = runSemanticAction_65();
                break;
            case 67:
                RESULT = runSemanticAction_67();
                break;
            case 68:
                RESULT = runSemanticAction_68();
                break;
            case 69:
                RESULT = runSemanticAction_69();
                break;
            case 70:
                RESULT = runSemanticAction_70();
                break;
            case 71:
                RESULT = runSemanticAction_71();
                break;
            case 72:
                RESULT = runSemanticAction_72();
                break;
            case 73:
                RESULT = runSemanticAction_73();
                break;
            case 74:
                RESULT = runSemanticAction_74();
                break;
            case 75:
                RESULT = runSemanticAction_75();
                break;
            case 76:
                RESULT = runSemanticAction_76();
                break;
            case 77:
                RESULT = runSemanticAction_77();
                break;
            case 78:
                RESULT = runSemanticAction_78();
                break;
            case 79:
                RESULT = runSemanticAction_79();
                break;
            case 80:
                RESULT = runSemanticAction_80();
                break;
            case 81:
                RESULT = runSemanticAction_81();
                break;
            case 82:
                RESULT = runSemanticAction_82();
                break;
            case 83:
                RESULT = runSemanticAction_83();
                break;
            case 84:
                RESULT = runSemanticAction_84();
                break;
            case 85:
                RESULT = runSemanticAction_85();
                break;
            case 86:
                RESULT = runSemanticAction_86();
                break;
            case 87:
                RESULT = runSemanticAction_87();
                break;
            case 88:
                RESULT = runSemanticAction_88();
                break;
            default:
        runDefaultProdAction();
                 break;
            }
            return RESULT;
        }
        public Object runSemanticAction(edu.umn.cs.melt.copper.runtime.io.InputPosition _pos,edu.umn.cs.melt.copper.runtime.engines.single.scanner.SingleDFAMatchData _terminal)
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
            case 1:
                RESULT = runSemanticAction_1(lexeme);
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
            case 21:
                RESULT = runSemanticAction_21(lexeme);
                break;
            case 22:
                RESULT = runSemanticAction_22(lexeme);
                break;
            case 23:
                RESULT = runSemanticAction_23(lexeme);
                break;
            case 24:
                RESULT = runSemanticAction_24(lexeme);
                break;
            case 25:
                RESULT = runSemanticAction_25(lexeme);
                break;
            case 27:
                RESULT = runSemanticAction_27(lexeme);
                break;
            case 28:
                RESULT = runSemanticAction_28(lexeme);
                break;
            case 29:
                RESULT = runSemanticAction_29(lexeme);
                break;
            case 30:
                RESULT = runSemanticAction_30(lexeme);
                break;
            case 31:
                RESULT = runSemanticAction_31(lexeme);
                break;
            case 32:
                RESULT = runSemanticAction_32(lexeme);
                break;
            case 33:
                RESULT = runSemanticAction_33(lexeme);
                break;
            case 34:
                RESULT = runSemanticAction_34(lexeme);
                break;
            case 35:
                RESULT = runSemanticAction_35(lexeme);
                break;
            case 36:
                RESULT = runSemanticAction_36(lexeme);
                break;
            case 37:
                RESULT = runSemanticAction_37(lexeme);
                break;
            default:
        runDefaultTermAction();
                 break;
            }
            return RESULT;
        }
        public simple.concretesyntax.NRoot runSemanticAction_48()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NRoot RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxRoot_sv_30_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtMatched runSemanticAction_49()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxFor_sv_4_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtMatched runSemanticAction_50()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_46_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtMatched runSemanticAction_51()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_48_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtMatched runSemanticAction_52()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_50_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtMatched runSemanticAction_53()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_52_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtMatched runSemanticAction_54()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_54_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmts runSemanticAction_55()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmts RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_19_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmts runSemanticAction_56()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmts RESULT = null;
            
RESULT = new simple.concretesyntax.PstmtNone(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmt runSemanticAction_57()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmt RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_35_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmt runSemanticAction_58()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmt RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_33_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmt runSemanticAction_59()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmt RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_37_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NDecl runSemanticAction_60()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NDecl RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_9_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtUnMatched runSemanticAction_61()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtUnMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxFor_sv_8_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtUnMatched runSemanticAction_62()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtUnMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_63_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtUnMatched runSemanticAction_63()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtUnMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_65_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtUnMatched runSemanticAction_64()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtUnMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_67_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtUnMatched runSemanticAction_65()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtUnMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_69_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NTypeExpr runSemanticAction_67()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NTypeExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_18_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NTypeExpr runSemanticAction_68()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NTypeExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_21_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NTypeExpr runSemanticAction_69()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NTypeExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_23_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_70()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_85_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_71()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_91_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_72()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_77_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_73()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_79_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_74()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_99_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_75()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_93_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_76()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_96_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_77()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_29_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_78()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_21_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_79()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_33_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_80()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_31_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_81()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_44_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_82()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_42_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_83()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_48_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_84()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_46_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_85()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_52_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_86()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_50_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_87()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_75_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_88()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_73_1(_children);

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_0(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_1(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_2(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_3(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_4(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_5(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_6(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_7(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_8(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_9(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_10(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_11(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_12(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_13(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_14(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_15(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_16(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_17(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_18(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_19(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_20(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_21(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_22(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_23(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_24(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_25(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_27(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_28(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_29(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_30(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_31(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_32(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_33(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_34(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_35(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_36(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_37(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public int runDisambiguationAction(edu.umn.cs.melt.copper.runtime.io.InputPosition _pos,edu.umn.cs.melt.copper.runtime.engines.single.scanner.SingleDFAMatchData match)
        throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            @SuppressWarnings("unused") String lexeme = match.lexeme;
            return -1;
        }
    }
    public Semantics semantics;
    public Object runSemanticAction(edu.umn.cs.melt.copper.runtime.io.InputPosition _pos,Object[] _children,int _prod)
    throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
        return semantics.runSemanticAction(_pos,_children,_prod);
    }
    public Object runSemanticAction(edu.umn.cs.melt.copper.runtime.io.InputPosition _pos,edu.umn.cs.melt.copper.runtime.engines.single.scanner.SingleDFAMatchData _terminal)
    throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
        return semantics.runSemanticAction(_pos,_terminal);
    }
    public int runDisambiguationAction(edu.umn.cs.melt.copper.runtime.io.InputPosition _pos,edu.umn.cs.melt.copper.runtime.engines.single.scanner.SingleDFAMatchData matches)
    throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
        return semantics.runDisambiguationAction(_pos,matches);
    }
    public edu.umn.cs.melt.copper.runtime.engines.semantics.SpecialParserAttributes getSpecialAttributes()
    {
        return semantics.getSpecialAttributes();
    }
    public void startEngine(edu.umn.cs.melt.copper.runtime.io.InputPosition initialPos)
    throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
         super.startEngine(initialPos);
         semantics = new Semantics();
    }

public static final byte[] symbolNamesHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\245\225\337\157\323\060" +
"\020\307\075\044\304\033\057\033\010\001\343\207\340\171\132\333" +
"\255\131\004\102\032\335\126\115\312\106\265\014\020\102\042\262" +
"\122\257\015\162\354\054\276\116\255\370\227\340\237\341\237\100" +
"\074\360\077\140\207\045\225\360\145\122\355\327\073\177\174\167" +
"\337\273\263\277\377\041\267\147\045\131\377\034\175\245\127\164" +
"\213\123\061\331\212\241\314\304\344\325\217\237\037\176\375\336" +
"\374\066\274\105\310\274\040\204\174\002\362\130\145\171\301\131" +
"\002\254\314\063\101\271\112\242\114\260\201\314\163\046\000\310" +
"\043\313\375\161\232\001\213\013\232\062\040\033\226\167\137\214" +
"\201\074\265\314\157\245\344\214\212\110\243\045\345\100\036\266" +
"\235\110\164\314\373\226\323\244\103\201\334\263\034\007\124\115" +
"\061\373\041\127\072\275\165\333\176\211\236\276\064\366\115\313" +
"\176\304\045\205\046\147\273\330\043\131\002\171\200\143\246\020" +
"\073\322\020\114\044\073\257\041\140\326\343\013\324\072\306\364" +
"\073\026\300\046\254\064\141\155\371\257\235\067\310\037\261\013" +
"\030\321\122\367\274\305\071\230\225\174\201\225\024\265\224\024" +
"\001\046\331\051\336\201\023\232\011\354\222\167\132\340\265\227" +
"\350\105\022\235\316\263\154\062\255\163\155\361\136\227\151\047" +
"\061\342\063\205\115\337\110\357\016\332\315\030\250\316\357\011" +
"\142\067\333\166\203\332\061\313\263\124\162\051\260\160\061\257" +
"\206\332\026\343\134\142\307\365\076\162\075\353\167\137\263\274" +
"\200\305\063\125\305\176\263\214\232\112\221\226\014\230\132\010" +
"\240\363\344\114\032\341\236\343\316\030\162\070\241\220\116\331" +
"\170\051\037\162\106\265\136\157\274\255\316\003\226\152\071\136" +
"\264\223\357\105\023\175\355\313\122\331\377\116\236\057\012\166" +
"\070\057\312\326\070\377\234\041\356\034\045\250\335\350\222\250" +
"\253\244\267\235\164\200\004\053\261\372\035\060\350\216\041\127" +
"\213\152\212\256\320\276\007\273\347\316\356\156\173\260\135\017" +
"\326\103\253\116\150\330\226\331\120\372\320\251\024\314\365\362" +
"\336\256\173\142\275\236\007\033\030\166\157\045\326\254\223\141" +
"\103\347\211\365\230\234\276\107\261\175\017\221\373\201\007\133" +
"\051\165\147\100\013\065\343\053\217\110\055\167\307\101\265\232" +
"\355\166\074\130\007\305\315\113\130\065\332\101\361\232\015\035" +
"\162\256\331\300\241\133\015\033\172\344\354\303\172\350\034\072" +
"\274\343\065\333\365\310\331\145\256\152\326\345\331\152\130\217" +
"\270\073\016\177\100\303\072\374\075\015\353\260\277\015\353\321" +
"\137\227\377\262\141\035\376\351\146\217\074\166\077\320\263\361" +
"\027\063\052\007\011\120\016\000\000"
});

public static final byte[] symbolDisplayNamesHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\245\225\121\157\323\060" +
"\020\307\075\044\304\033\057\033\010\001\333\100\360\074\255\355" +
"\326\056\005\041\101\267\125\223\262\121\055\003\204\220\210\254" +
"\324\153\063\071\166\026\137\247\126\174\045\370\062\174\011\304" +
"\003\337\001\273\133\122\201\057\223\152\277\336\371\347\273\373" +
"\337\235\375\375\017\271\073\051\310\352\227\360\202\136\321\055" +
"\116\305\150\053\202\042\025\243\127\077\176\176\374\365\173\375" +
"\133\377\016\041\323\234\020\362\031\310\123\225\146\071\147\135" +
"\140\105\226\012\312\125\067\114\005\353\311\054\143\002\200\074" +
"\261\334\237\306\051\260\050\247\011\003\262\146\171\337\212\041" +
"\220\115\313\374\116\112\316\250\010\065\132\120\016\344\161\335" +
"\211\130\307\174\150\071\115\072\024\310\003\313\261\117\325\030" +
"\263\037\160\245\323\133\265\355\227\350\351\113\143\137\267\354" +
"\207\134\122\250\162\266\213\075\224\005\220\107\070\146\012\261" +
"\043\365\301\104\262\363\352\003\146\075\072\107\255\103\114\277" +
"\043\001\154\304\012\023\326\226\377\306\171\213\374\041\073\207" +
"\001\055\164\317\153\234\275\111\301\147\130\111\141\115\111\041" +
"\140\222\235\340\035\070\246\251\300\056\171\257\005\136\171\211" +
"\136\044\321\351\074\115\107\343\062\327\032\357\115\231\166\022" +
"\003\076\121\330\364\015\364\356\240\335\214\200\352\374\066\020" +
"\273\331\266\133\324\216\130\226\046\222\113\201\205\213\370\174" +
"\250\155\061\316\044\166\134\357\043\327\263\176\377\065\313\162" +
"\230\075\123\363\330\157\026\121\023\051\222\202\001\123\063\001" +
"\164\332\075\225\106\270\347\270\063\202\014\216\051\044\143\066" +
"\134\310\207\234\121\265\327\033\157\255\163\237\045\132\216\027" +
"\365\344\007\121\105\137\371\272\120\366\277\223\147\263\234\035" +
"\114\363\242\066\316\265\063\270\166\306\377\072\343\101\214\332" +
"\215\056\261\272\212\133\333\161\003\110\147\051\126\277\003\006" +
"\335\061\344\162\121\115\321\163\264\355\301\356\271\263\273\333" +
"\036\154\323\203\365\320\252\021\030\166\003\147\225\076\164\042" +
"\005\163\275\274\265\353\236\130\253\345\301\166\014\273\267\024" +
"\153\326\311\260\201\363\304\172\114\116\333\243\330\266\207\310" +
"\355\216\007\073\127\352\136\217\346\152\302\227\036\221\122\356" +
"\206\203\152\045\333\154\170\260\016\212\233\227\160\336\150\007" +
"\305\113\066\160\310\271\144\073\016\335\252\330\300\043\147\037" +
"\326\103\347\300\341\035\057\331\246\107\316\056\163\125\262\056" +
"\317\126\305\172\304\335\161\370\003\052\326\341\357\251\130\207" +
"\375\255\130\217\376\272\374\227\025\353\360\117\127\173\344\261" +
"\373\035\075\033\177\001\076\247\027\220\120\016\000\000"
});

public static final byte[] symbolNumbersHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\201\051\332\323\167\127\202\132\331\253\115\113\231\030\030" +
"\052\012\030\030\030\042\031\006\061\120\040\002\073\060\060\260" +
"\001\061\047\020\063\003\061\013\020\063\002\061\053\024\063\071" +
"\100\324\060\042\141\146\250\172\230\032\166\050\146\102\123\207" +
"\254\236\031\207\030\023\022\033\047\006\000\235\357\236\072\177" +
"\001\000\000"
});

public static final byte[] productionLHSsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\201\051\332\323\167\127\202\132\331\253\115\113\231\030\030" +
"\052\012\030\030\030\064\025\030\030\324\201\130\003\007\326\204" +
"\142\055\044\254\015\304\072\130\260\056\020\353\041\141\175\152" +
"\141\000\170\342\051\101\277\000\000\000"
});

public static final byte[] parseTableHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\335\132\311\162\324\060" +
"\020\025\141\337\367\045\254\315\276\016\133\130\023\102\034\310" +
"\066\331\010\201\220\100\056\174\002\120\005\305\211\073\047\276" +
"\202\033\047\216\174\017\047\252\070\163\105\006\253\350\264\133" +
"\055\051\226\143\106\257\312\045\165\277\136\364\312\226\147\074" +
"\343\057\077\325\332\267\157\324\352\305\305\366\376\137\337\037" +
"\165\177\372\170\257\113\251\367\257\224\122\213\332\337\265\330" +
"\236\372\366\362\314\273\037\137\077\033\367\125\125\063\100\251" +
"\125\025\162\273\134\061\157\137\253\017\177\242\242\052\321\235" +
"\127\307\254\347\203\172\224\110\170\131\123\335\225\127\202\001" +
"\112\255\211\125\253\076\045\240\324\332\330\065\045\330\225\350" +
"\225\154\260\145\151\156\263\076\326\043\173\253\076\266\353\143" +
"\035\362\155\223\072\147\112\335\101\261\073\321\174\007\232\157" +
"\101\363\135\372\330\253\217\215\372\330\243\217\335\205\177\223" +
"\254\044\024\172\145\017\253\326\250\202\250\112\206\252\257\147" +
"\371\210\252\144\270\372\172\226\217\216\333\047\107\241\366\175" +
"\242\053\356\253\132\243\012\152\373\214\077\020\263\236\017\152" +
"\123\162\050\146\075\037\324\246\344\160\314\172\076\350\270\035" +
"\177\020\052\357\170\235\261\337\025\323\044\354\112\062\245\156" +
"\160\163\143\123\236\363\111\235\155\261\041\065\060\152\333\047" +
"\335\061\353\371\100\074\047\167\155\131\071\207\171\143\123\237" +
"\324\331\026\033\122\003\103\124\322\053\254\242\027\363\306\246" +
"\076\251\263\055\066\244\006\206\250\244\117\130\105\037\346\215" +
"\115\175\122\147\133\154\110\015\214\346\236\031\101\251\043\061" +
"\353\065\373\364\313\001\224\072\277\234\074\136\211\256\166\112" +
"\350\164\322\342\077\126\214\240\217\323\122\127\315\237\261\370" +
"\117\110\171\102\275\263\121\277\013\137\252\132\243\012\222\071" +
"\047\347\032\335\361\027\142\326\113\346\234\134\114\106\311\361" +
"\225\277\272\262\232\172\065\267\117\062\245\156\307\254\127\126" +
"\242\073\214\220\216\043\022\107\175\034\157\142\244\174\074\272" +
"\352\172\053\031\045\335\106\045\216\372\070\336\304\110\371\170" +
"\164\325\365\123\002\345\335\177\027\315\257\023\356\266\076\156" +
"\331\252\153\356\246\076\156\350\243\247\260\257\021\276\037\212" +
"\247\140\075\136\106\376\226\277\206\277\140\317\311\070\216\300" +
"\066\307\121\037\307\233\030\051\037\217\256\272\336\112\046\110" +
"\267\011\211\243\076\216\067\061\122\076\036\135\165\275\225\114" +
"\222\156\223\022\107\175\034\157\142\244\174\074\272\352\372\051" +
"\311\001\235\367\311\070\220\214\222\373\315\336\273\012\337\222" +
"\173\227\036\257\100\224\173\027\254\354\135\270\027\152\273\013" +
"\033\144\112\335\263\145\345\034\346\215\115\175\122\147\133\154" +
"\110\015\014\121\311\165\156\156\154\312\163\076\251\263\055\066" +
"\244\006\106\343\127\127\037\324\176\165\061\253\362\076\323\115" +
"\040\231\273\360\144\062\112\306\305\035\337\303\315\215\115\171" +
"\316\047\165\267\305\206\324\300\110\346\234\074\112\106\311\154" +
"\062\112\006\223\121\362\040\031\045\323\311\050\311\222\121\062" +
"\234\214\222\221\144\224\074\114\106\311\320\177\371\077\143\320" +
"\257\103\006\313\123\242\273\155\046\366\237\067\160\210\117\174" +
"\003\207\304\372\274\201\363\230\344\314\140\073\231\253\153\252" +
"\271\267\242\110\075\237\163\062\126\214\243\340\365\126\124\246" +
"\277\127\342\056\330\346\070\352\343\170\023\043\345\343\321\125" +
"\227\103\343\317\361\155\250\363\267\372\047\244\233\367\373\074" +
"\056\320\332\271\015\104\111\341\153\321\130\027\130\045\263\070" +
"\002\342\052\231\245\066\224\225\344\276\026\215\165\201\125\102" +
"\357\166\061\225\074\246\066\224\225\344\276\026\215\165\201\125" +
"\262\100\272\055\110\034\365\161\274\211\221\362\221\222\205\102" +
"\211\265\256\267\222\171\322\155\136\342\250\217\343\115\214\224" +
"\217\224\314\027\112\254\165\275\225\074\303\021\020\367\352\172" +
"\106\155\050\137\135\271\257\105\143\135\140\225\314\341\010\210" +
"\253\144\216\332\120\126\222\373\132\064\326\005\361\367\256\001" +
"\141\105\003\230\067\066\365\111\235\155\261\041\065\060\374\336" +
"\115\005\245\236\122\056\373\357\337\115\325\331\323\244\343\264" +
"\304\121\037\307\233\030\051\037\217\256\272\336\112\306\110\267" +
"\061\211\243\076\216\067\061\122\076\036\135\165\375\224\240\056" +
"\067\271\271\261\051\317\371\244\316\266\330\220\032\030\354\071" +
"\151\223\216\155\211\243\076\216\067\061\122\076\036\135\165\375" +
"\224\100\303\377\375\026\363\026\304\370\006\271\344\076\005\161" +
"\077\117\350\075\360\051\224\077\117\162\137\213\306\272\340\176" +
"\216\207\210\347\204\042\323\117\255\120\126\222\373\162\045\123" +
"\356\365\377\203\270\343\357\333\262\162\016\363\306\246\076\251" +
"\263\055\066\244\006\206\250\344\026\067\067\066\345\071\237\324" +
"\331\026\033\122\003\243\361\253\153\006\312\127\127\356\313\257" +
"\256\031\056\307\206\144\176\045\232\353\250\137\356\346\111\316" +
"\222\157\375\215\377\266\222\077\037\326\377\006\116\146\313\312" +
"\071\314\033\233\372\244\316\266\330\220\032\030\242\222\101\141" +
"\025\203\230\067\066\365\111\235\155\261\041\065\060\072\152\237" +
"\074\047\071\057\260\055\236\223\153\334\334\330\224\347\174\322" +
"\352\155\261\041\065\060\104\045\375\302\052\372\061\157\154\352" +
"\223\072\333\142\103\152\140\374\006\144\120\135\076\367\107\000" +
"\000"
});

public static final byte[] shiftableSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\103\164\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\200\020\314\025\305\205\014\165\014\114\245" +
"\040\222\025\046\301\300\201\103\202\005\227\016\005\234\106\011" +
"\140\227\120\231\040\074\103\030\273\016\106\134\106\221\052\101" +
"\216\035\270\174\116\262\004\036\313\031\030\161\352\230\114\035" +
"\073\110\227\000\306\023\166\073\200\121\216\135\202\211\203\227" +
"\205\233\244\320\305\255\003\227\345\070\165\340\066\012\147\022" +
"\305\145\207\154\322\203\044\167\222\044\070\111\326\101\272\004" +
"\351\076\347\165\042\325\271\170\123\011\326\224\210\323\050\234" +
"\211\232\164\177\340\264\234\164\243\206\213\004\316\074\250\322" +
"\040\330\101\132\260\253\064\340\210\163\162\122\073\003\003\325" +
"\044\110\317\070\244\332\101\172\152\047\335\125\244\033\045\211" +
"\053\327\342\366\140\302\203\044\147\052\171\020\227\121\170\222" +
"\017\216\004\107\136\041\203\135\002\227\035\070\375\001\061\012" +
"\000\267\251\173\334\103\011\000\000"
});

public static final byte[] layoutSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\103\164\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\200\000\346\212\342\102\206\072\006\246\122" +
"\020\311\072\052\061\052\061\052\061\052\061\052\061\052\061\052" +
"\061\052\061\264\044\000\270\274\260\114\103\011\000\000"
});

public static final byte[] prefixSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\103\164\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\200\202\212\342\102\206\072\006\246\122\020" +
"\311\072\052\061\052\061\052\061\052\061\052\061\052\061\052\061" +
"\052\061\264\044\000\064\112\054\035\103\011\000\000"
});

public static final byte[] layoutMapsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\044\072\332\047\053\261\054\121\257\264\044\063\107\317" +
"\051\263\044\070\265\304\132\362\322\273\215\346\317\356\030\061" +
"\061\060\124\024\060\060\060\104\003\025\012\143\121\227\053\251" +
"\301\162\276\317\245\000\246\116\275\270\210\101\000\135\125\336" +
"\337\216\072\113\223\325\212\314\014\214\321\014\054\111\231\045" +
"\305\045\014\114\321\136\025\005\100\103\101\264\002\313\126\241" +
"\215\245\223\141\146\060\062\100\211\212\342\102\206\072\006\226" +
"\122\020\311\216\042\121\100\014\000\353\143\002\073\012\213\071" +
"\014\034\070\054\000\113\120\301\002\026\134\076\140\241\222\017" +
"\024\160\131\240\100\255\040\022\300\025\104\002\124\261\100\145" +
"\202\360\014\001\154\026\100\044\250\341\003\106\134\076\140\244" +
"\122\020\015\165\013\206\103\034\320\072\047\017\171\013\350\020" +
"\311\100\012\273\017\100\022\324\361\301\004\134\076\230\060\032" +
"\007\303\302\002\120\265\202\075\016\300\022\224\133\000\252\171" +
"\261\132\000\221\240\334\002\046\016\136\026\016\154\026\100\044" +
"\250\020\104\264\056\115\151\357\003\132\107\062\315\175\100\373" +
"\040\242\171\323\221\326\161\040\233\364\040\311\005\233\005\020" +
"\211\041\140\001\047\056\013\070\207\212\017\206\276\005\103\077" +
"\047\363\072\341\010\042\210\004\345\026\320\074\231\322\245\125" +
"\101\323\226\035\315\203\210\201\326\215\337\241\237\017\150\036" +
"\311\103\077\210\106\055\030\265\140\324\002\072\364\321\124\032" +
"\004\073\260\132\000\221\030\002\101\244\322\200\253\116\156\240" +
"\116\235\074\332\272\036\265\140\324\002\072\130\060\364\133\327" +
"\303\043\016\206\166\020\111\342\352\145\112\122\251\227\071\074" +
"\042\171\064\243\015\164\263\205\306\015\257\341\061\030\102\133" +
"\013\150\035\007\064\317\007\324\010\042\000\215\021\156\056\372" +
"\042\000\000"
});

public static final byte[] prefixMapsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\044\072\332\047\053\261\054\121\257\264\044\063\107\317" +
"\051\263\044\070\265\304\132\362\322\273\215\346\317\356\030\061" +
"\061\060\124\024\060\060\060\104\003\025\012\143\121\227\053\251" +
"\301\162\276\317\245\000\246\116\275\200\070\120\132\310\120\307" +
"\300\064\252\141\124\303\250\206\121\015\243\032\106\065\214\152" +
"\030\325\060\252\141\124\303\250\206\121\015\243\032\106\065\214" +
"\152\030\325\060\252\001\023\000\000\177\050\135\151\266\021\000" +
"\000"
});

public static final byte[] terminalUsesHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\201\051\332\323\167\127\202\132\331\253\115\113\231\030\030" +
"\052\012\030\030\030\324\031\006\061\000\000\313\223\032\147\267" +
"\000\000\000"
});

public static final byte[] shiftableUnionHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\270" +
"\210\101\040\053\261\054\121\257\264\044\063\107\317\051\263\044" +
"\070\265\044\357\157\107\235\245\311\152\105\146\006\306\150\006" +
"\226\244\314\222\342\022\006\246\150\257\212\202\322\042\060\255" +
"\300\262\125\150\143\351\144\046\006\206\212\002\006\006\006\106" +
"\040\266\377\377\377\377\375\012\000\217\141\105\337\121\000\000" +
"\000"
});

public static final byte[] acceptSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\103\102\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\200\202\212\342\102\206\072\006\246\122\020" +
"\311\112\130\202\021\207\204\000\311\072\200\200\011\233\004\043" +
"\116\313\035\160\111\050\340\220\140\041\335\037\170\234\353\100" +
"\065\243\070\110\326\041\200\103\202\203\232\036\144\160\240\226" +
"\121\070\044\070\160\307\007\013\056\011\007\222\223\050\220\042" +
"\125\007\156\011\005\352\205\056\326\324\116\226\121\012\270\044" +
"\032\250\226\030\160\112\064\140\227\020\300\035\210\124\264\034" +
"\117\350\062\222\230\256\160\072\127\001\267\016\026\034\022\114" +
"\124\112\160\114\070\165\060\221\036\272\300\334\066\160\361\061" +
"\240\161\016\214\164\352\025\000\124\223\240\103\220\060\342\161" +
"\125\003\311\241\313\101\252\016\134\301\216\103\207\002\236\100" +
"\024\240\226\253\032\250\030\037\100\147\141\227\000\065\252\000" +
"\357\274\007\352\300\011\000\000"
});

public static final byte[] rejectSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\103\102\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\200\202\212\342\102\206\072\006\246\122\020" +
"\311\072\052\061\052\061\052\061\144\045\030\107\254\345\243\022" +
"\243\361\061\052\201\073\316\111\117\014\364\110\076\244\073\167" +
"\100\375\201\327\125\000\014\234\103\074\300\011\000\000"
});

public static final byte[] possibleSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\335\223\261\112\304\100" +
"\024\105\357\114\146\141\312\101\053\273\261\263\332\312\106\054" +
"\134\304\112\354\054\323\144\005\213\210\112\334\114\044\325\222" +
"\322\312\306\317\320\306\302\357\360\113\374\002\221\270\221\265" +
"\221\167\003\023\202\202\051\046\305\311\274\067\057\367\314\323" +
"\033\046\325\002\233\351\311\305\374\166\076\255\102\176\071\075" +
"\314\303\351\171\330\277\332\332\061\257\367\107\205\006\352\002" +
"\100\126\056\340\176\176\165\375\161\267\334\333\175\334\116\240" +
"\122\230\263\074\224\001\072\075\256\213\125\321\356\355\315\313" +
"\306\163\365\360\135\103\141\375\324\345\015\226\320\125\267\116" +
"\326\340\340\275\155\133\011\164\253\023\201\043\245\276\126\031" +
"\000\132\002\212\235\012\063\006\074\001\206\226\202\262\042\360" +
"\075\307\315\130\251\206\001\147\145\140\111\017\105\233\073\002" +
"\154\043\003\307\347\120\150\130\036\063\031\044\274\224\074\140" +
"\103\232\333\356\055\227\062\206\364\310\270\076\206\200\104\334" +
"\241\251\014\232\132\262\022\042\122\152\166\077\230\355\203\114" +
"\364\361\046\106\046\310\115\034\121\270\321\274\302\000\257\300" +
"\200\217\027\116\307\011\027\017\172\024\245\302\305\173\065\242" +
"\045\177\232\071\211\166\304\074\006\044\310\202\372\107\171\260" +
"\033\365\013\223\323\071\370\161\351\305\351\371\045\075\073\076" +
"\001\223\205\047\002\300\011\000\000"
});

public static final byte[] cMapHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\355\321\071\112\004\121" +
"\020\006\340\236\321\161\337\367\175\134\307\375\040\006\236\300" +
"\304\043\210\240\170\041\063\043\103\217\044\170\007\377\206\026" +
"\232\016\206\066\060\221\357\301\107\025\125\105\125\360\336\276" +
"\212\336\323\143\321\275\273\271\375\270\037\074\177\276\277\166" +
"\213\342\345\241\350\024\345\273\152\141\062\106\133\316\376\126" +
"\271\173\043\006\215\372\161\025\227\142\042\172\061\026\347\261" +
"\035\227\261\037\007\055\225\273\246\342\060\116\142\276\166\153" +
"\046\072\125\374\261\130\313\167\033\275\141\366\206\364\312\133" +
"\327\265\273\027\125\134\157\314\155\305\164\214\304\134\054\324" +
"\172\343\261\034\253\161\032\375\252\176\024\073\261\031\153\125" +
"\155\266\261\167\045\316\242\373\107\177\011\000\000\000\000\000" +
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
"\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" +
"\000\000\000\000\000\000\000\300\077\361\015\000\366\005\153\033" +
"\000\004\000"
});

public static final byte[] deltaHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\355\230\111\117\024\101" +
"\030\206\053\040\213\050\002\042\262\051\202\013\253\240\240\200" +
"\013\073\156\243\354\310\042\043\310\117\120\022\010\047\357\236" +
"\374\025\334\070\161\344\367\160\042\341\354\325\157\222\036\323" +
"\151\252\272\172\172\172\252\276\167\254\067\171\323\265\174\275" +
"\074\371\152\351\356\343\013\121\266\277\047\112\323\351\124\343" +
"\237\263\305\346\337\277\306\112\204\070\374\056\204\330\245\366" +
"\222\164\152\376\164\267\363\340\374\344\050\333\074\040\100\265" +
"\377\103\374\024\104\361\217\040\123\056\045\137\041\227\221\313" +
"\311\025\136\275\322\153\273\112\256\362\332\256\171\307\353\344" +
"\152\362\015\162\015\271\226\134\347\365\145\175\223\134\117\276" +
"\105\156\360\332\156\223\033\311\115\344\146\162\013\271\325\353" +
"\273\103\276\113\156\363\352\367\310\355\132\202\216\300\121\204" +
"\324\375\026\222\162\060\116\026\043\353\227\335\357\276\352\131" +
"\056\021\300\011\046\007\035\212\162\170\016\036\104\154\263\252" +
"\042\034\105\160\162\004\366\005\263\026\075\124\075\113\042\004" +
"\217\014\020\304\133\115\071\250\123\027\020\073\007\135\202\353" +
"\216\246\272\102\267\344\212\271\020\364\030\043\200\223\261\265" +
"\250\127\021\343\162\300\237\240\117\027\000\263\243\075\126\075" +
"\113\144\202\176\313\004\377\323\074\110\172\024\015\150\142\314" +
"\355\150\246\347\301\023\170\202\247\261\011\154\152\060\316\111" +
"\254\010\062\032\212\030\367\054\133\140\107\020\324\163\135\000" +
"\153\202\341\050\101\254\011\062\032\321\005\134\042\030\365\071" +
"\130\267\345\227\041\175\057\330\347\300\257\127\262\106\050\002" +
"\251\330\356\150\370\157\025\301\373\275\216\114\340\027\346\277" +
"\153\056\071\030\013\271\177\341\106\321\170\202\004\361\347\001" +
"\234\330\216\242\342\133\213\046\362\046\230\264\114\140\046\007" +
"\123\054\010\340\004\063\017\170\316\344\151\110\202\031\105\037" +
"\157\202\331\220\030\136\004\157\024\117\142\166\036\274\365\071" +
"\130\147\151\166\253\051\376\377\242\167\271\236\300\216\040\147" +
"\071\002\373\162\177\274\264\172\037\250\177\214\170\136\312\127" +
"\376\024\022\367\241\010\107\021\234\042\277\125\314\005\352\356" +
"\355\332\074\301\074\074\101\276\071\130\200\047\220\305\054\102" +
"\020\054\151\142\370\023\310\142\226\341\011\126\340\011\126\241" +
"\010\076\153\142\222\047\160\337\311\371\152\055\327\023\212\360" +
"\373\300\021\070\002\107\140\146\107\133\327\134\103\167\177\373" +
"\173\362\006\064\301\246\242\017\207\040\163\374\002\117\200\237" +
"\003\063\004\133\360\004\370\071\050\024\101\272\340\004\266\225" +
"\377\333\165\241\162\360\125\021\203\067\212\034\201\043\110\206" +
"\140\033\236\000\053\007\073\360\004\161\163\360\015\236\000\077" +
"\007\221\011\376\002\257\076\046\216\351\110\000\000"
});

public static void initArrays()
throws java.io.IOException,java.lang.ClassNotFoundException
{
    symbolNames = (String[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(symbolNamesHash);
    symbolDisplayNames = (String[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(symbolDisplayNamesHash);
    symbolNumbers = (int[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(symbolNumbersHash);
    productionLHSs = (int[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(productionLHSsHash);
    parseTable = (int[][]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(parseTableHash);
    shiftableSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(shiftableSetsHash);
    layoutSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(layoutSetsHash);
    prefixSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(prefixSetsHash);
    layoutMaps = (java.util.BitSet[][]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(layoutMapsHash);
    prefixMaps = (java.util.BitSet[][]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(prefixMapsHash);
    terminalUses = (int[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(terminalUsesHash);
    shiftableUnion = (java.util.BitSet) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(shiftableUnionHash);
    acceptSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(acceptSetsHash);
    rejectSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(rejectSetsHash);
    possibleSets = (java.util.BitSet[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(possibleSetsHash);
    cmap = (int[]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(cMapHash);
    delta = (int[][]) edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.readHash(deltaHash);
    }
    public Parser_simple_host_parse() {}
    
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
            edu.umn.cs.melt.copper.runtime.engines.single.SingleDFAEngine<simple.concretesyntax.NRoot,edu.umn.cs.melt.copper.runtime.logging.CopperParserException> engine = new simple.host.Parser_simple_host_parse();
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
		private static String[] symbolDisplayNames;
		private static int[] symbolNumbers;
		private static int[] productionLHSs;
		
		private static int[][] parseTable;
		private static java.util.BitSet[] shiftableSets;
		private static java.util.BitSet[] layoutSets;
		private static java.util.BitSet[] prefixSets;
		private static java.util.BitSet[][] layoutMaps;
		private static java.util.BitSet[][] prefixMaps;
		private static int[] terminalUses;
		
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
		public String[] getSymbolDisplayNames() {
			return symbolDisplayNames;
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
		public int[] getTerminalUses() {
			return terminalUses;
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
    public simple.concretesyntax.NRoot parse(java.io.Reader input,String inputName)
    throws java.io.IOException,edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
    this.buffer = edu.umn.cs.melt.copper.runtime.io.ScannerBuffer.instantiate(input);
    setupEngine();
    startEngine(edu.umn.cs.melt.copper.runtime.io.InputPosition.initialPos(inputName));
    simple.concretesyntax.NRoot parseTree = (simple.concretesyntax.NRoot) runEngine();
    return parseTree;
    }



    static
    {
        TERMINAL_COUNT = 39;
        GRAMMAR_SYMBOL_COUNT = 48;
        SYMBOL_COUNT = 89;
        PARSER_STATE_COUNT = 91;
        SCANNER_STATE_COUNT = 96;
        DISAMBIG_GROUP_COUNT = 0;
        SCANNER_START_STATENUM = 1;
        PARSER_START_STATENUM = 0;
        EOF_SYMNUM = 26;
        EPS_SYMNUM = 38;
        try { initArrays(); }
        catch(java.io.IOException ex) { System.err.println("IO Exception"); }
        catch(java.lang.ClassNotFoundException ex) { System.err.println("Class Not Found Exception"); }
        disambiguationGroups = new java.util.BitSet[0];
    }

}
