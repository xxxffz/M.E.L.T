package simple.composed.simple_all;



public class Parser_simple_composed_simple_all_parse extends edu.umn.cs.melt.copper.runtime.engines.single.SingleDFAEngine<simple.concretesyntax.NRoot,edu.umn.cs.melt.copper.runtime.logging.CopperParserException>
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
            case 89:
                RESULT = runSemanticAction_89();
                break;
            case 90:
                RESULT = runSemanticAction_90();
                break;
            case 91:
                RESULT = runSemanticAction_91();
                break;
            case 92:
                RESULT = runSemanticAction_92();
                break;
            case 93:
                RESULT = runSemanticAction_93();
                break;
            case 94:
                RESULT = runSemanticAction_94();
                break;
            case 95:
                RESULT = runSemanticAction_95();
                break;
            case 96:
                RESULT = runSemanticAction_96();
                break;
            case 97:
                RESULT = runSemanticAction_97();
                break;
            case 98:
                RESULT = runSemanticAction_98();
                break;
            case 99:
                RESULT = runSemanticAction_99();
                break;
            case 101:
                RESULT = runSemanticAction_101();
                break;
            case 102:
                RESULT = runSemanticAction_102();
                break;
            case 103:
                RESULT = runSemanticAction_103();
                break;
            case 104:
                RESULT = runSemanticAction_104();
                break;
            case 105:
                RESULT = runSemanticAction_105();
                break;
            case 106:
                RESULT = runSemanticAction_106();
                break;
            case 107:
                RESULT = runSemanticAction_107();
                break;
            case 108:
                RESULT = runSemanticAction_108();
                break;
            case 109:
                RESULT = runSemanticAction_109();
                break;
            case 110:
                RESULT = runSemanticAction_110();
                break;
            case 111:
                RESULT = runSemanticAction_111();
                break;
            case 112:
                RESULT = runSemanticAction_112();
                break;
            case 113:
                RESULT = runSemanticAction_113();
                break;
            case 114:
                RESULT = runSemanticAction_114();
                break;
            case 115:
                RESULT = runSemanticAction_115();
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
            case 26:
                RESULT = runSemanticAction_26(lexeme);
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
            case 38:
                RESULT = runSemanticAction_38(lexeme);
                break;
            case 39:
                RESULT = runSemanticAction_39(lexeme);
                break;
            case 40:
                RESULT = runSemanticAction_40(lexeme);
                break;
            case 41:
                RESULT = runSemanticAction_41(lexeme);
                break;
            case 42:
                RESULT = runSemanticAction_42(lexeme);
                break;
            case 43:
                RESULT = runSemanticAction_43(lexeme);
                break;
            case 44:
                RESULT = runSemanticAction_44(lexeme);
                break;
            case 45:
                RESULT = runSemanticAction_45(lexeme);
                break;
            case 46:
                RESULT = runSemanticAction_46(lexeme);
                break;
            case 47:
                RESULT = runSemanticAction_47(lexeme);
                break;
            case 48:
                RESULT = runSemanticAction_48(lexeme);
                break;
            default:
        runDefaultTermAction();
                 break;
            }
            return RESULT;
        }
        public simple.concretesyntax.NRoot runSemanticAction_68()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NRoot RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxRoot_sv_30_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NTypeExpr runSemanticAction_69()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NTypeExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_18_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NTypeExpr runSemanticAction_70()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NTypeExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_21_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NTypeExpr runSemanticAction_71()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NTypeExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_23_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_72()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_50_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_73()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_52_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_74()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_46_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_75()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_48_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_76()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_77_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_77()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_79_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_78()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_73_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_79()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_75_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_80()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_93_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_81()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_96_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_82()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_85_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_83()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_91_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_84()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_99_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_85()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.extensions.matrix.PP_simple_extensions_matrixExpr_sv_4_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_86()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.extensions.implication.PP_simple_extensions_implicationImplication_sv_11_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_87()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.extensions.expr_let.PP_simple_extensions_expr_letLet_sv_13_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_88()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.extensions.expr_if.PP_simple_extensions_expr_ifExpr_sv_12_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_89()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_29_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_90()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_21_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_91()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_33_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_92()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_31_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_93()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_44_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NExpr runSemanticAction_94()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NExpr RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxExpr_sv_42_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtUnMatched runSemanticAction_95()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtUnMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxFor_sv_8_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtUnMatched runSemanticAction_96()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtUnMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_63_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtUnMatched runSemanticAction_97()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtUnMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_65_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtUnMatched runSemanticAction_98()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtUnMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_67_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtUnMatched runSemanticAction_99()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtUnMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_69_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmts runSemanticAction_101()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmts RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_19_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmts runSemanticAction_102()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmts RESULT = null;
            
RESULT = new simple.concretesyntax.PstmtNone(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmt runSemanticAction_103()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmt RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_35_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmt runSemanticAction_104()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmt RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_33_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmt runSemanticAction_105()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmt RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_37_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtMatched runSemanticAction_106()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_54_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtMatched runSemanticAction_107()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_52_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtMatched runSemanticAction_108()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtMatched RESULT = null;
            
RESULT = new simple.extensions.do_while.PP_simple_extensions_do_whileDoWhile_sv_18_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtMatched runSemanticAction_109()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtMatched RESULT = null;
            
RESULT = new simple.extensions.repeat_until.PP_simple_extensions_repeat_untilRepeatUntil_sv_11_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtMatched runSemanticAction_110()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxFor_sv_4_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtMatched runSemanticAction_111()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_46_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtMatched runSemanticAction_112()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_48_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NStmtMatched runSemanticAction_113()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NStmtMatched RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxStmt_sv_50_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NDecl runSemanticAction_114()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NDecl RESULT = null;
            
RESULT = new simple.concretesyntax.PP_simple_concretesyntaxDecl_sv_9_1(_children);

            return RESULT;
        }
        public simple.concretesyntax.NDecl runSemanticAction_115()
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            simple.concretesyntax.NDecl RESULT = null;
            
RESULT = new simple.extensions.matrix.PP_simple_extensions_matrixDecl_sv_4_1(_children);

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
        public common.TerminalRecord runSemanticAction_26(String lexeme)
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
        public common.TerminalRecord runSemanticAction_38(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_39(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_40(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_41(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_42(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_43(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_44(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_45(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_46(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_47(String lexeme)
        throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
        {
            common.TerminalRecord RESULT = null;
            
RESULT = new common.TerminalRecord(lexeme,virtualLocation,Integer.valueOf((int)getStartRealLocation().getPos()),Integer.valueOf((int)getEndRealLocation().getPos()));

            return RESULT;
        }
        public common.TerminalRecord runSemanticAction_48(String lexeme)
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
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\245\130\315\156\023\061" +
"\020\166\221\020\067\056\005\304\137\013\210\162\255\110\323\066" +
"\215\100\225\332\046\255\042\155\113\224\264\364\200\204\145\266" +
"\116\262\260\153\157\167\047\045\021\257\004\057\303\113\040\016" +
"\274\003\266\223\335\244\265\167\253\330\227\064\361\067\337\067" +
"\343\361\170\166\266\077\377\241\273\303\004\055\177\362\276\222" +
"\053\262\036\022\326\137\357\102\022\260\376\273\137\277\077\376" +
"\371\273\362\343\350\016\102\243\030\041\004\200\236\247\101\024" +
"\207\024\003\115\242\200\221\060\305\136\300\350\001\217\042\312" +
"\004\374\114\203\317\007\001\320\156\114\174\012\150\145\212\322" +
"\021\120\226\006\234\245\370\202\343\357\203\100\254\065\070\240" +
"\125\035\247\243\070\301\101\017\067\303\224\226\032\234\016\104" +
"\000\205\006\041\005\334\144\027\306\020\162\203\326\055\002\036" +
"\025\073\174\243\033\310\205\300\047\040\176\340\226\374\116\123" +
"\100\057\164\273\210\210\264\216\260\267\237\020\377\133\231\305" +
"\261\372\143\364\225\320\230\022\300\103\006\101\210\073\352\107" +
"\231\122\147\352\353\201\166\056\173\062\033\153\267\070\070\223" +
"\237\200\236\152\354\175\316\103\112\030\236\163\256\201\236\070" +
"\370\204\010\372\103\315\242\101\322\001\240\107\332\272\254\043" +
"\002\150\131\003\232\227\046\231\111\121\254\150\353\207\041\047" +
"\120\342\276\171\051\365\364\234\034\362\004\320\143\263\234\334" +
"\252\256\164\004\122\111\217\367\310\230\030\121\140\264\117\223" +
"\074\062\075\257\123\013\351\114\027\155\135\030\127\173\246\125" +
"\317\030\256\247\302\325\335\172\264\007\007\303\044\034\027\201" +
"\155\222\310\353\245\247\354\204\033\103\375\220\230\334\037\223" +
"\300\054\042\243\322\133\107\047\350\017\262\260\012\320\151\134" +
"\272\253\166\070\114\115\025\326\026\215\015\146\327\174\006\114" +
"\132\136\111\321\164\201\044\046\305\156\250\212\131\317\133\227" +
"\106\201\317\103\316\114\254\163\331\364\114\231\073\025\175\160" +
"\151\015\320\375\367\064\212\141\374\062\125\161\355\316\034\370" +
"\234\371\011\005\232\216\031\020\161\303\071\237\333\317\015\360" +
"\164\034\323\246\150\137\205\354\011\370\332\014\166\041\202\063" +
"\046\232\221\077\240\242\364\226\076\317\216\301\140\051\322\375" +
"\144\212\222\057\042\152\342\103\346\204\135\315\002\270\201\065" +
"\250\037\026\202\122\266\060\364\353\340\015\346\044\053\257\212" +
"\231\371\256\012\004\116\110\104\013\301\322\224\116\166\264\152" +
"\146\352\007\142\060\000\124\067\113\267\261\161\135\156\026\247" +
"\127\270\372\026\127\026\345\312\150\045\267\262\143\317\335\250" +
"\070\160\253\213\163\145\002\045\167\313\142\277\071\167\303\236" +
"\273\271\355\300\265\310\163\306\255\325\034\270\165\007\256\303" +
"\031\325\266\354\271\165\007\277\165\207\063\332\161\211\331\342" +
"\056\344\134\165\106\273\205\303\134\116\327\240\274\272\244\100" +
"\273\174\102\065\251\314\341\255\071\123\331\027\324\176\366\113" +
"\246\142\223\136\006\212\211\131\211\250\203\334\053\036\336\013" +
"\065\202\136\266\265\212\303\205\335\160\050\176\233\346\226\161" +
"\253\016\005\134\165\360\273\271\351\300\125\171\256\055\304\025" +
"\163\263\272\067\213\173\225\217\142\111\335\266\310\124\316\265" +
"\270\256\071\327\242\245\346\134\125\125\367\016\110\234\016\303" +
"\205\037\332\231\112\105\251\024\314\157\251\060\072\341\314\132" +
"\274\352\220\032\233\342\315\271\016\151\335\262\050\336\234\253" +
"\212\367\120\157\046\371\277\031\114\235\046\003\033\134\115\345" +
"\263\161\250\243\333\136\173\075\066\211\315\033\114\336\317\325" +
"\113\364\254\227\132\135\055\207\234\330\114\053\071\327\341\112" +
"\117\246\263\035\253\251\320\372\101\230\011\210\174\375\007\135" +
"\315\103\343\330\022\000\000"
});

public static final byte[] symbolDisplayNamesHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\245\130\335\156\323\060" +
"\024\366\220\020\167\334\014\020\177\033\040\306\355\104\327\155" +
"\135\003\232\264\255\335\124\051\033\125\273\261\013\044\042\223" +
"\271\255\041\261\263\304\035\255\170\045\170\031\136\002\161\301" +
"\073\140\073\315\317\146\247\123\355\233\256\365\167\276\357\034" +
"\037\037\237\234\354\347\077\160\167\034\203\345\117\356\127\170" +
"\005\327\003\110\206\353\175\026\143\062\174\367\353\367\307\077" +
"\177\127\176\034\335\001\140\022\001\000\030\003\317\023\034\106" +
"\001\162\030\212\103\114\140\220\070\056\046\350\200\206\041\042" +
"\034\176\246\300\347\043\314\120\077\202\076\142\140\145\206\242" +
"\011\103\044\301\224\044\316\005\365\276\217\060\137\153\121\006" +
"\126\125\034\115\242\330\303\003\247\035\044\150\256\301\351\210" +
"\007\120\151\020\040\346\264\311\205\066\204\334\240\163\213\200" +
"\213\370\016\337\250\006\142\001\373\220\361\037\116\107\174\107" +
"\011\003\057\124\273\020\362\264\116\034\167\077\206\376\267\171" +
"\026\307\362\217\326\127\214\042\004\231\067\046\014\007\116\117" +
"\376\230\247\324\233\371\172\240\234\313\236\310\306\332\055\016" +
"\316\304\047\003\117\025\366\076\245\001\202\304\053\071\127\100" +
"\227\037\174\014\071\375\241\142\321\202\311\210\201\107\312\272" +
"\250\043\310\300\262\002\264\057\165\062\151\121\254\050\353\207" +
"\001\205\154\216\373\366\245\320\123\163\162\110\143\006\036\353" +
"\345\304\126\125\245\043\046\224\324\170\217\264\211\341\005\206" +
"\206\050\316\043\123\363\072\263\020\316\124\321\316\205\166\165" +
"\240\133\165\265\341\272\062\134\325\255\213\006\354\140\034\007" +
"\323\052\260\013\143\161\275\324\224\235\120\155\250\037\142\235" +
"\373\143\210\365\042\042\052\265\165\364\360\160\224\205\125\201" +
"\316\342\122\135\165\203\161\242\253\260\056\157\154\254\270\346" +
"\005\220\266\274\071\105\323\147\060\326\051\366\003\131\314\152" +
"\336\372\050\304\076\015\050\321\261\316\105\323\323\145\356\224" +
"\367\301\245\065\006\356\277\107\141\304\246\057\023\031\327\156" +
"\341\300\247\304\217\021\103\311\224\060\310\157\070\245\245\375" +
"\334\000\117\247\021\152\363\366\125\311\116\301\327\172\260\317" +
"\102\166\106\170\063\362\107\210\227\336\322\347\342\030\064\226" +
"\074\335\117\146\050\374\302\243\206\076\313\234\220\253\042\200" +
"\033\130\013\371\101\045\050\144\053\103\277\016\336\140\246\131" +
"\171\125\315\314\167\125\041\160\002\103\124\011\316\115\151\272" +
"\243\125\075\123\075\020\215\001\003\315\024\364\256\113\173\135" +
"\117\273\056\066\353\045\127\136\375\255\127\133\224\053\242\025" +
"\334\332\216\071\167\243\146\301\255\057\316\025\011\024\334\055" +
"\203\375\346\334\015\163\356\346\266\005\327\040\317\031\267\321" +
"\260\340\066\055\270\026\147\324\330\062\347\066\055\374\066\055" +
"\316\150\307\046\146\203\273\220\163\345\031\355\316\154\212\231" +
"\314\113\207\271\202\256\100\171\165\011\201\256\152\125\232\120" +
"\265\052\045\274\123\062\025\175\101\356\147\137\245\144\123\261" +
"\126\057\003\371\304\054\105\344\101\356\125\330\341\101\265\006" +
"\036\144\133\253\131\134\330\015\213\342\067\151\156\031\267\156" +
"\121\300\165\013\277\233\233\026\134\231\347\306\102\134\076\067" +
"\313\173\263\270\127\361\050\026\324\155\203\114\345\134\203\353" +
"\232\163\015\132\152\316\225\125\165\357\000\106\311\070\130\370" +
"\241\235\251\324\244\312\252\236\233\160\243\023\112\214\305\353" +
"\026\251\061\051\336\234\153\221\326\055\203\342\315\271\262\170" +
"\017\325\146\222\375\233\101\333\151\062\260\105\345\124\136\214" +
"\103\075\325\266\374\172\254\025\053\033\244\357\347\362\045\272" +
"\350\245\106\127\313\042\047\046\323\112\316\265\270\322\351\164" +
"\266\143\064\025\032\077\010\063\001\236\257\377\013\001\063\302" +
"\330\022\000\000"
});

public static final byte[] symbolNumbersHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\201\051\332\323\167\127\202\132\331\253\115\113\231\030\030" +
"\052\012\030\030\030\112\030\206\021\120\240\002\166\140\140\140" +
"\003\142\106\044\314\114\000\063\142\301\154\120\071\126\044\066" +
"\010\063\241\351\345\204\252\001\141\166\050\146\202\142\006\064" +
"\063\221\325\261\102\365\202\314\140\101\162\047\057\000\265\301" +
"\370\041\353\001\000\000"
});

public static final byte[] productionLHSsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\201\051\332\323\167\127\202\132\331\253\115\113\231\030\030" +
"\052\012\030\030\030\014\024\030\030\214\201\330\004\011\233\322" +
"\020\233\141\301\346\100\154\001\305\066\110\330\216\000\166\004" +
"\141\000\016\376\211\140\333\000\000\000"
});

public static final byte[] parseTableHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\355\135\111\223\025\105" +
"\020\116\101\134\120\161\027\161\115\067\334\367\135\021\333\005" +
"\145\130\105\140\140\230\001\007\334\167\100\101\334\160\067\302" +
"\223\277\302\233\047\217\376\036\117\106\170\366\152\077\136\127" +
"\220\235\363\125\127\322\135\157\252\273\306\057\250\250\227\137" +
"\175\231\225\223\164\327\364\366\172\176\377\207\126\034\073\112" +
"\313\147\147\247\126\377\373\327\366\065\277\376\262\156\031\321" +
"\211\303\104\364\163\311\057\233\235\332\372\347\374\332\343\177" +
"\377\361\233\243\137\244\036\202\211\316\152\351\267\254\353\334" +
"\307\216\320\311\123\121\172\123\031\046\132\236\072\207\021\372" +
"\127\231\056\230\217\030\153\070\225\141\242\263\027\163\276\176" +
"\125\206\211\126\244\316\301\141\141\145\230\350\242\046\217\162" +
"\374\262\262\255\122\334\171\001\237\225\145\073\127\161\347\224" +
"\355\322\262\135\050\270\113\220\177\101\364\226\320\134\251\342" +
"\134\136\266\013\300\234\027\127\375\352\252\277\102\215\237\137" +
"\365\127\011\356\152\367\071\355\066\123\020\155\110\061\257\005" +
"\311\053\363\122\212\171\055\110\136\231\227\123\314\153\101\170" +
"\235\051\304\076\136\215\327\326\231\321\070\017\143\235\271\125" +
"\215\367\170\235\101\340\123\377\322\243\227\225\271\071\165\016" +
"\043\364\262\062\267\244\316\141\204\141\034\317\050\277\126\353" +
"\014\030\137\123\365\306\165\206\317\260\062\305\042\254\300\312" +
"\257\355\012\174\215\032\357\361\012\134\146\162\135\212\171\055" +
"\030\306\336\124\304\371\255\175\255\032\117\260\315\224\063\334" +
"\020\063\136\012\044\337\233\256\117\061\257\005\013\053\123\020" +
"\035\221\012\144\113\116\333\310\017\151\034\247\165\050\313\046" +
"\215\157\376\256\350\337\361\014\002\023\335\264\330\163\366\257" +
"\062\114\164\143\352\034\106\200\173\323\333\122\201\154\311\151" +
"\033\001\151\034\247\143\371\374\255\371\304\002\254\314\073\152" +
"\346\005\266\344\264\215\200\064\216\323\261\174\376\326\174\142" +
"\001\126\346\135\065\363\002\133\162\332\106\100\032\307\351\130" +
"\076\177\153\076\261\320\277\165\246\015\230\350\241\330\061\273" +
"\127\206\211\036\216\227\117\177\060\214\155\206\211\036\137\354" +
"\071\207\121\231\046\060\321\243\223\210\173\146\225\051\263\170" +
"\144\022\131\364\021\266\312\060\321\075\241\110\245\346\016\300" +
"\335\356\321\336\125\365\167\226\355\136\065\166\137\331\356\017" +
"\314\165\167\050\237\112\267\326\242\103\310\276\062\217\131\164" +
"\010\311\317\265\157\113\061\257\005\303\137\201\045\212\210\077" +
"\107\366\173\323\203\026\035\102\366\225\171\300\242\103\010\127" +
"\246\040\172\263\051\102\150\074\006\026\143\016\215\211\135\007" +
"\336\026\063\136\012\330\053\303\104\317\001\356\171\145\257\007" +
"\032\171\137\342\211\262\075\011\064\117\227\355\051\305\275\120" +
"\365\033\004\367\254\370\374\114\331\326\225\155\163\050\367\066" +
"\300\225\051\210\136\161\115\162\110\143\341\232\306\103\176\262" +
"\107\261\264\056\026\274\225\331\341\232\344\220\306\302\065\215" +
"\207\374\144\217\142\151\135\054\170\053\363\252\153\222\343\372" +
"\377\131\155\274\211\153\032\017\371\311\036\305\322\272\130\360" +
"\126\146\247\153\222\103\032\013\327\064\036\362\223\075\212\245" +
"\165\261\340\255\314\056\327\044\207\064\026\256\151\074\344\047" +
"\173\024\113\353\142\241\373\323\150\025\067\204\147\041\266\252" +
"\361\010\367\265\171\270\307\300\123\026\035\102\366\225\151\375" +
"\354\150\366\225\151\375\274\361\160\216\201\313\176\007\203\143" +
"\340\120\336\155\061\250\312\154\344\136\126\146\261\300\104\233" +
"\122\347\060\102\366\353\314\166\213\016\041\373\312\154\261\350" +
"\020\340\035\377\243\122\201\154\311\151\033\001\151\034\247\143" +
"\371\374\255\371\304\302\240\126\340\202\223\256\300\005\321\307" +
"\122\201\154\311\151\033\371\041\215\343\264\016\145\331\244\361" +
"\315\337\025\331\257\063\255\237\305\312\276\062\173\055\072\204" +
"\354\053\163\310\242\103\310\276\062\255\357\306\144\137\231\171" +
"\213\016\041\373\312\034\264\350\020\262\257\314\001\213\016\041" +
"\373\312\274\146\321\041\364\357\134\373\114\301\104\273\047\021" +
"\067\373\155\346\175\213\016\041\373\312\314\131\164\010\331\127" +
"\146\306\242\103\310\276\062\263\026\035\102\366\225\331\147\321" +
"\041\170\357\336\316\272\046\071\244\261\160\115\343\041\077\331" +
"\243\130\132\027\013\203\272\162\265\237\223\136\271\342\300\367" +
"\265\053\315\252\220\106\351\127\172\370\211\335\327\026\343\257" +
"\007\342\275\201\170\377\066\123\172\354\121\166\322\155\246\372" +
"\334\263\373\115\074\334\025\270\365\267\010\341\165\340\303\122" +
"\201\154\311\151\033\371\041\215\343\264\016\145\331\244\361\315" +
"\337\025\361\127\140\126\117\205\161\266\173\123\071\373\364\244" +
"\146\357\063\262\137\147\132\177\047\167\070\307\063\325\147\364" +
"\244\164\355\151\271\130\310\176\233\171\317\242\103\030\306\233" +
"\171\224\137\254\367\134\355\254\372\135\202\133\072\117\060\266" +
"\276\253\013\217\147\016\112\005\262\045\247\155\004\244\161\234" +
"\216\345\363\267\346\023\013\223\173\227\010\327\337\246\223\307" +
"\273\104\152\327\116\221\055\071\155\043\077\244\161\234\326\241" +
"\054\233\064\276\371\273\042\373\165\346\043\213\016\041\373\312" +
"\174\150\321\041\170\257\351\155\164\115\162\110\243\062\131\257" +
"\271\266\100\363\061\070\322\163\272\130\363\072\170\053\063\347" +
"\232\317\023\215\361\270\062\163\212\153\165\014\054\306\066\270" +
"\371\030\127\146\316\227\117\027\170\053\263\337\065\311\041\215" +
"\344\170\134\231\032\327\026\150\076\306\225\331\217\364\135\341" +
"\255\314\001\327\044\207\064\222\343\161\145\132\337\145\327\361" +
"\265\315\270\062\007\220\276\053\274\225\231\161\315\347\211\306" +
"\170\134\231\031\305\305\332\233\146\030\127\146\306\227\117\027" +
"\170\053\263\317\065\311\041\215\205\153\032\017\371\311\036\305" +
"\322\272\130\360\126\146\273\153\222\103\032\013\327\064\036\362" +
"\223\275\324\360\351\155\246\246\213\005\157\145\266\271\046\071" +
"\244\261\160\115\343\041\077\331\113\015\237\256\114\115\027\013" +
"\336\312\154\165\115\162\110\143\341\232\306\103\176\262\107\261" +
"\264\056\026\274\225\331\342\232\344\220\306\302\065\215\207\374" +
"\144\217\142\151\135\054\170\053\263\331\065\311\041\215\344\170" +
"\374\273\051\312\173\032\320\174\214\177\067\155\106\372\256\200" +
"\347\332\363\052\243\005\266\344\264\215\200\064\216\323\261\174" +
"\376\326\174\142\001\126\246\166\355\024\331\222\323\066\362\103" +
"\032\307\151\035\312\262\111\343\233\277\053\274\173\323\046\327" +
"\044\207\064\222\343\361\336\024\345\333\176\150\076\306\173\323" +
"\046\244\357\012\270\315\324\316\334\221\055\071\155\043\077\244" +
"\161\234\326\241\054\233\064\276\371\273\302\273\315\114\271\046" +
"\071\244\221\034\217\267\231\326\337\253\327\361\265\315\170\233" +
"\231\102\372\256\030\316\235\270\262\077\312\275\272\257\055\062" +
"\351\345\075\112\141\107\175\036\142\042\317\102\174\240\270\214" +
"\236\205\050\210\246\135\363\171\242\061\036\257\063\323\212\213" +
"\165\025\142\232\361\072\063\355\313\247\013\262\277\102\376\205" +
"\105\207\200\053\123\106\374\034\314\322\353\165\046\066\232\267" +
"\231\162\346\343\342\363\377\225\201\140\125\231\322\076\301\113" +
"\276\062\074\334\165\346\023\213\016\141\111\074\051\375\151\040" +
"\336\061\304\147\361\235\270\317\046\021\167\070\307\300\145\177" +
"\222\123\277\061\343\220\124\040\133\162\332\106\100\032\307\351" +
"\130\076\177\153\076\261\000\053\123\373\006\003\262\045\247\155" +
"\004\244\161\234\216\345\363\267\346\023\013\336\263\203\075\256" +
"\111\016\151\054\134\323\170\310\117\366\050\226\326\305\002\334" +
"\146\152\147\204\310\226\234\266\221\037\322\070\116\353\120\226" +
"\115\032\337\374\135\221\374\357\035\174\235\142\136\013\262\077" +
"\322\373\312\242\103\350\164\166\360\045\057\271\263\203\202\150" +
"\267\153\222\103\032\013\327\064\036\362\223\075\212\245\165\261" +
"\340\255\314\136\327\034\307\152\233\031\215\061\330\146\012\365" +
"\006\045\216\264\315\124\363\241\053\127\173\335\070\372\011\333" +
"\042\376\012\314\104\337\304\212\225\022\113\342\214\362\273\100" +
"\274\157\021\237\374\267\366\367\051\346\265\000\036\351\325\236" +
"\273\106\266\344\264\215\374\220\306\161\132\207\262\154\322\370" +
"\346\357\012\130\231\332\173\176\220\055\071\155\043\040\215\343" +
"\164\054\237\277\065\237\130\230\330\137\234\371\041\146\274\024" +
"\310\376\030\370\107\213\016\141\070\127\256\252\317\350\033\246" +
"\077\205\162\157\003\270\316\324\256\052\043\133\162\332\106\100" +
"\032\307\351\130\076\177\153\076\261\360\037\233\044\365\251\305" +
"\223\000\000"
});

public static final byte[] shiftableSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\305\126\075\113\303\120" +
"\024\275\111\123\055\350\120\354\344\326\342\342\124\150\353\042" +
"\135\142\225\010\342\122\034\263\130\101\060\242\322\066\211\144" +
"\052\101\041\070\210\010\376\014\135\034\374\007\035\013\376\022" +
"\177\202\340\173\265\056\162\317\203\033\002\015\244\031\116\357" +
"\347\073\367\274\373\366\105\345\170\114\065\377\370\162\160\073" +
"\150\306\121\160\325\354\005\321\311\171\324\275\336\334\166\076" +
"\237\016\206\066\121\062\044\242\054\034\123\365\377\277\156\276" +
"\037\046\273\073\257\215\022\131\076\071\147\101\024\106\144\373" +
"\107\311\120\071\325\337\272\363\261\361\036\277\374\371\260\324" +
"\133\127\157\051\011\107\064\041\073\326\277\345\005\340\360\200" +
"\262\005\026\026\002\346\066\034\060\275\033\245\217\253\234\205" +
"\116\213\165\045\006\164\214\331\241\240\300\034\300\324\006\165" +
"\150\140\046\052\320\320\022\252\210\053\177\346\053\117\305\005" +
"\242\046\312\201\024\262\104\075\056\013\240\164\135\223\053\233" +
"\003\052\353\027\015\272\227\000\250\273\170\014\162\304\120\005" +
"\272\373\222\063\037\367\263\136\203\001\254\260\237\171\255\256" +
"\024\350\210\055\070\340\167\014\270\063\227\267\004\002\035\120" +
"\071\006\040\251\345\301\041\251\141\160\070\203\005\266\144\251" +
"\000\234\301\145\146\205\051\212\017\312\076\115\053\234\356\266" +
"\265\105\115\310\022\376\314\225\053\217\247\250\176\070\001\200" +
"\061\220\000\030\262\102\167\224\234\355\260\300\342\330\156\205" +
"\125\132\341\325\147\057\363\252\054\000\055\344\256\162\251\150" +
"\121\000\110\127\176\036\106\127\102\013\064\070\126\033\061\021" +
"\261\035\266\035\263\144\036\143\015\001\133\000\150\011\347\003" +
"\010\000\124\070\223\350\313\226\042\303\225\012\167\070\264\365" +
"\031\233\310\265\044\307\105\077\277\124\105\052\052\137\122\361" +
"\336\216\226\042\271\130\056\142\374\000\233\107\011\164\166\015" +
"\000\000"
});

public static final byte[] layoutSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\103\133\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\200\000\346\212\342\102\206\072\006\246\122" +
"\020\311\072\052\061\052\061\052\061\052\061\052\061\052\061\052" +
"\061\052\061\052\061\052\061\052\061\052\061\154\045\000\303\007" +
"\243\315\166\015\000\000"
});

public static final byte[] prefixSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\103\133\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\200\202\212\342\102\206\072\006\246\122\020" +
"\311\072\052\061\052\061\052\061\052\061\052\061\052\061\052\061" +
"\052\061\052\061\052\061\052\061\052\061\154\045\000\162\026\374" +
"\125\166\015\000\000"
});

public static final byte[] layoutMapsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\355\233\061\153\333\100" +
"\024\307\237\256\052\325\320\301\064\135\262\311\133\247\200\255" +
"\100\022\272\210\020\062\224\054\246\243\227\246\120\210\113\022" +
"\034\133\056\236\202\350\140\072\224\022\310\307\110\026\017\371" +
"\006\036\015\201\316\235\273\265\337\240\320\273\223\064\244\271" +
"\007\015\074\377\211\016\011\144\203\377\342\176\176\167\357\075" +
"\335\273\223\256\177\321\323\311\210\136\366\373\007\037\017\077" +
"\035\156\114\262\301\361\306\356\040\173\373\041\173\275\376\375" +
"\367\174\353\347\217\256\042\232\016\211\150\246\057\134\163\134" +
"\167\262\376\052\274\375\266\067\254\256\113\306\043\152\375\173" +
"\325\351\237\057\347\073\233\127\355\047\024\364\051\174\077\310" +
"\306\031\251\376\233\351\120\067\152\276\343\360\346\305\174\162" +
"\131\265\021\350\063\326\047\115\307\147\164\116\341\304\174\076" +
"\273\043\014\037\172\330\066\224\375\203\367\333\014\071\130\050" +
"\016\063\277\072\141\225\040\152\131\300\300\052\101\024\126\230" +
"\340\352\106\045\017\133\174\076\313\277\206\016\130\051\310\132" +
"\146\275\316\145\131\041\064\260\377\202\231\241\131\356\061\143" +
"\246\005\131\313\200\101\355\061\154\241\270\070\123\362\161\146" +
"\332\134\162\260\145\235\203\032\234\256\050\142\054\263\202\060" +
"\014\333\215\027\134\006\271\020\317\040\071\027\147\171\335\203" +
"\032\231\210\375\205\131\067\160\215\131\051\210\302\314\221\062" +
"\101\155\004\131\030\322\365\123\256\033\323\025\165\243\342\272" +
"\121\011\303\242\347\107\155\312\035\260\122\250\057\014\231\365" +
"\261\045\223\307\143\246\143\067\115\231\240\326\202\054\014\071" +
"\007\031\365\146\273\155\027\254\024\044\141\301\270\067\333\357" +
"\154\337\207\125\102\275\141\011\007\113\352\156\031\012\126\124" +
"\106\316\071\110\041\210\302\374\115\127\120\130\302\145\220\104" +
"\076\203\140\141\320\302\302\137\007\201\026\026\120\007\201\326" +
"\324\376\072\110\003\153\140\217\007\226\062\045\323\112\152\152" +
"\177\273\261\201\111\300\260\323\157\354\315\123\275\313\043\367" +
"\216\205\025\104\141\135\143\100\313\001\053\005\121\030\172\166" +
"\205\233\203\350\336\332\167\072\110\051\210\302\354\341\134\164" +
"\051\004\121\030\164\314\220\213\056\140\157\104\356\171\372\133" +
"\305\100\203\272\251\142\044\140\376\256\312\065\260\006\326\300" +
"\074\203\371\173\077\203\167\243\247\226\041\213\301\240\313\300" +
"\052\101\324\062\144\025\203\035\063\350\354\312\016\115\304\325" +
"\324\321\012\140\061\007\213\345\141\035\306\101\214\040\012\003" +
"\327\147\300\105\227\324\026\352\240\225\124\364\306\217\237\017" +
"\346\371\173\363\324\107\354\366\306\122\020\205\301\023\061\052" +
"\135\171\074\043\046\273\257\357\136\157\014\345\137\016\000\046" +
"\142\250\353\243\327\256\200\357\305\040\037\314\363\167\101\132" +
"\174\314\376\002\223\104\100\245\215\071\000\000"
});

public static final byte[] prefixMapsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\355\313\041\022\202\100" +
"\000\106\341\177\166\360\004\132\270\001\151\203\006\002\315\041" +
"\332\210\044\202\001\107\147\026\146\327\041\021\211\236\304\342" +
"\111\234\061\233\155\172\006\051\064\213\205\364\136\176\337\365" +
"\255\105\150\265\052\313\335\241\072\127\066\370\372\150\267\265" +
"\057\366\076\213\037\237\133\372\172\256\215\324\071\111\303\070" +
"\056\177\174\247\070\211\356\227\334\115\337\306\375\137\150\324" +
"\313\200\301\140\060\030\014\006\203\301\140\060\030\014\006\203" +
"\301\140\060\030\014\006\203\301\140\060\030\014\236\025\177\001" +
"\115\346\206\071\071\040\000\000"
});

public static final byte[] terminalUsesHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\201\051\332\323\167\127\202\132\331\253\115\113\231\030\030" +
"\052\012\030\030\030\214\031\206\021\000\000\111\060\033\176\347" +
"\000\000\000"
});

public static final byte[] shiftableUnionHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\270" +
"\210\101\040\053\261\054\121\257\264\044\063\107\317\051\263\044" +
"\070\265\044\357\157\107\235\245\311\152\105\146\006\306\150\006" +
"\226\244\314\222\342\022\006\246\150\257\212\202\322\042\060\255" +
"\300\262\125\150\143\351\144\046\006\206\212\002\006\006\006\106" +
"\006\346\377\140\120\001\000\112\026\220\107\121\000\000\000"
});

public static final byte[] acceptSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\315\226\261\116\303\060" +
"\020\206\357\214\053\145\264\140\142\063\033\123\247\056\125\027" +
"\013\061\041\066\306\114\105\142\010\242\125\150\034\224\251\170" +
"\144\142\341\061\140\141\340\071\372\044\175\004\044\160\005\013" +
"\262\215\316\072\031\062\044\122\276\370\077\337\375\147\073\057" +
"\133\030\365\053\070\250\317\257\347\167\363\161\157\233\233\361" +
"\111\143\057\256\354\154\161\170\054\067\217\247\255\000\030\132" +
"\000\270\357\126\240\176\176\265\174\177\130\117\047\317\107\173" +
"\200\065\310\313\306\166\026\104\175\066\264\237\242\376\251\345" +
"\333\376\153\377\364\255\201\360\165\015\335\055\254\101\364\376" +
"\076\372\025\150\042\320\031\061\252\030\160\144\051\257\105\313" +
"\043\056\045\063\244\104\010\070\152\165\005\237\037\230\362\103" +
"\204\200\341\013\276\253\041\223\224\244\317\012\100\321\106\010" +
"\152\014\025\255\125\305\130\104\077\057\046\251\104\255\000\051" +
"\353\243\112\365\025\327\006\200\011\051\035\001\046\072\002\151" +
"\045\121\071\015\027\336\000\362\374\220\114\122\202\265\113\114" +
"\020\030\276\030\061\140\302\176\140\242\257\370\202\027\130\121" +
"\205\200\056\222\271\013\003\367\037\215\312\112\120\163\111\341" +
"\037\032\125\000\370\367\364\352\252\060\120\120\121\244\166\277" +
"\014\344\340\046\004\134\134\012\311\326\226\360\303\037\252\021" +
"\040\311\122\056\014\374\011\071\174\000\007\202\377\307\307\014" +
"\000\000"
});

public static final byte[] rejectSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\133\363\226\201\265\264" +
"\210\101\070\332\047\053\261\054\121\257\264\044\063\107\317\051" +
"\263\044\070\265\304\072\127\122\203\345\174\237\113\001\023\003" +
"\103\105\001\003\003\103\175\161\021\203\000\272\252\274\277\035" +
"\165\226\046\253\025\231\031\030\243\031\130\222\062\113\212\113" +
"\030\230\242\275\052\012\200\206\202\150\005\226\255\102\033\113" +
"\047\303\314\140\144\200\202\212\342\102\206\072\006\246\122\020" +
"\311\072\052\061\052\061\052\061\052\061\052\061\310\044\024\206" +
"\226\253\006\324\271\203\063\254\106\256\004\316\370\030\056\021" +
"\105\105\177\014\227\040\241\242\007\161\352\240\242\121\124\264" +
"\234\212\316\245\107\260\123\073\110\000\206\312\375\313\307\014" +
"\000\000"
});

public static final byte[] possibleSetsHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\325\225\275\116\303\060" +
"\024\205\257\215\213\062\132\060\261\045\133\247\212\201\005\261" +
"\104\210\241\102\154\214\131\050\022\103\020\240\320\044\050\123" +
"\361\310\304\302\143\300\302\300\163\360\044\074\002\002\073\201" +
"\005\356\261\344\050\125\125\253\152\245\176\275\276\077\075\347" +
"\346\345\203\106\365\234\266\263\223\313\331\335\154\122\127\371" +
"\325\344\060\257\116\057\252\203\353\235\261\172\177\074\052\044" +
"\121\123\020\321\175\071\047\375\367\127\067\237\017\213\375\275" +
"\347\144\203\104\106\352\074\257\312\212\144\166\334\024\366\122" +
"\367\031\253\267\255\327\372\351\367\016\101\077\247\051\157\151" +
"\101\262\166\357\243\026\210\257\366\374\007\366\304\202\213\160" +
"\200\275\252\375\232\004\003\042\220\334\236\050\346\201\060\050" +
"\302\345\341\301\124\160\100\241\162\111\303\252\154\020\352\334" +
"\240\252\110\162\300\300\034\061\245\034\220\170\126\266\017\203" +
"\200\142\200\300\127\271\074\014\110\075\311\015\013\014\234\056" +
"\155\042\220\040\135\235\331\012\070\240\074\043\211\120\203\232" +
"\005\061\052\127\172\162\050\016\150\070\253\051\017\072\207\150" +
"\076\207\246\061\337\207\004\125\355\172\124\002\000\032\073\005" +
"\272\066\034\164\145\205\055\000\217\166\321\002\110\141\304\140" +
"\233\041\170\001\040\237\207\333\271\217\007\045\002\111\260\112" +
"\142\140\116\347\332\060\163\102\017\042\253\165\173\011\071\012" +
"\226\013\254\146\137\310\203\121\240\325\126\347\250\001\075\210" +
"\155\200\325\336\103\324\301\332\355\043\321\241\004\267\142\371" +
"\054\375\217\132\277\261\007\116\167\335\146\205\107\342\171\320" +
"\303\076\226\237\243\215\370\006\065\272\301\105\307\014\000\000" +
""
});

public static final byte[] cMapHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\355\321\071\112\104\101" +
"\020\006\340\067\243\343\276\357\373\270\216\373\172\013\003\117" +
"\140\342\021\104\120\274\220\231\221\241\107\022\274\203\377\203" +
"\047\074\046\220\061\060\221\257\341\243\272\253\252\253\203\176" +
"\375\054\132\217\017\105\363\366\372\346\375\256\363\364\361\366" +
"\322\054\212\347\373\242\121\224\353\262\007\223\321\356\261\367" +
"\267\312\331\207\321\337\225\037\252\342\126\054\304\176\314\306" +
"\170\234\304\105\364\105\253\107\345\254\245\030\210\341\130\257" +
"\275\265\022\023\125\374\266\121\333\237\165\325\072\135\347\272" +
"\306\017\265\305\270\212\235\352\335\363\052\036\324\172\346\343" +
"\070\226\143\072\326\142\263\126\237\213\335\030\214\321\030\251" +
"\362\333\161\032\107\061\123\345\126\243\131\273\273\027\143\061" +
"\365\107\177\011\000\000\000\000\000\000\000\000\000\000\000\000" +
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
"\300\077\361\005\370\052\123\055\033\000\004\000"
});

public static final byte[] deltaHash = edu.umn.cs.melt.copper.runtime.auxiliary.internal.ByteArrayEncoder.literalToByteArray
(new String[]{ "\037\213\010\000\000\000\000\000\000\000\355\232\107\163\325\060" +
"\024\205\065\011\241\227\120\103\350\065\364\336\041\364\120\036" +
"\020\102\157\217\022\172\207\044\360\102\150\141\315\212\137\301" +
"\216\025\113\176\017\053\146\130\263\345\232\261\031\043\144\133" +
"\262\045\353\352\132\147\346\214\374\364\044\313\137\216\154\311" +
"\363\362\345\047\153\151\014\260\346\172\275\326\366\353\173\117" +
"\373\247\217\235\115\214\015\365\061\306\076\100\175\123\275\326" +
"\375\255\267\143\360\307\327\317\121\365\046\106\110\215\176\066" +
"\314\200\354\057\125\160\334\014\036\001\156\001\217\004\217\012" +
"\353\106\203\307\200\307\206\237\307\201\307\203\047\200\047\202" +
"\047\205\365\255\340\311\340\051\340\251\340\151\340\351\340\031" +
"\340\266\260\315\314\260\154\007\317\012\373\317\006\317\001\317" +
"\005\317\003\317\007\057\000\057\004\057\012\333\057\006\057\001" +
"\057\005\167\204\165\313\062\251\226\207\146\261\317\114\120\047" +
"\152\303\177\307\267\213\327\361\355\342\345\212\204\172\321\171" +
"\371\163\341\245\222\051\325\250\042\255\144\016\353\077\252\125" +
"\061\257\346\076\233\064\077\166\021\257\111\314\052\322\072\365" +
"\277\224\065\255\215\016\062\251\170\255\067\163\101\172\245\104" +
"\265\301\364\325\350\222\162\126\033\065\137\200\221\325\037\345" +
"\223\175\163\102\175\361\047\273\214\266\344\350\123\212\012\121" +
"\241\125\356\031\270\125\320\206\357\217\157\157\241\252\155\226" +
"\373\377\243\212\317\300\355\134\235\233\273\133\247\205\162\275" +
"\222\051\167\010\316\127\234\152\247\145\052\077\003\211\250\042" +
"\124\262\367\325\056\101\033\276\077\236\373\252\314\147\140\147" +
"\151\124\131\332\055\331\316\252\214\146\265\207\245\147\245\232" +
"\321\136\301\030\305\146\340\276\034\124\242\031\270\277\000\225" +
"\137\257\334\334\061\035\020\234\057\231\212\204\234\312\352\140" +
"\312\030\076\053\134\131\165\245\214\121\305\254\262\164\310\344" +
"\325\350\122\356\031\170\130\320\206\357\237\065\003\217\044\214" +
"\241\177\025\116\242\072\232\160\345\151\124\265\014\052\277\267" +
"\120\222\164\126\307\270\072\333\173\013\075\063\020\303\223\335" +
"\056\325\161\164\124\047\054\131\353\330\025\375\015\337\111\245" +
"\122\235\216\035\167\227\164\101\201\116\145\174\337\223\361\375" +
"\311\314\254\316\250\137\224\175\371\377\042\161\107\236\312\035" +
"\125\204\312\346\076\360\154\302\230\376\115\344\217\162\147\165" +
"\116\320\206\357\217\147\167\233\127\270\377\213\304\205\367\253" +
"\363\202\061\334\177\153\274\100\222\112\375\276\302\100\165\221" +
"\024\325\045\011\232\174\124\044\224\073\253\313\202\066\174\177" +
"\232\367\325\025\222\124\064\263\162\213\252\116\222\312\124\126" +
"\127\111\122\311\226\327\224\251\110\310\311\254\150\316\300\240" +
"\274\156\225\352\206\041\052\232\131\105\307\275\144\250\156\012" +
"\306\160\237\052\050\157\051\121\371\337\032\335\371\255\321\123" +
"\171\052\117\245\237\212\327\355\204\172\324\222\136\257\356\160" +
"\165\266\327\053\173\253\360\135\222\124\252\131\335\043\111\105" +
"\063\053\067\250\356\223\244\322\235\325\003\222\124\242\363\076" +
"\044\105\365\110\160\076\165\252\307\310\250\334\233\201\117\112" +
"\243\172\132\042\025\315\254\252\113\365\214\044\325\163\222\124" +
"\152\063\220\027\355\267\106\114\131\365\011\306\240\061\003\373" +
"\255\121\015\030\244\242\231\325\013\162\124\057\005\143\270\117" +
"\025\224\015\062\124\203\051\143\270\113\345\346\323\342\025\111" +
"\052\232\131\341\245\032\042\111\105\063\053\223\124\257\111\122" +
"\321\314\312\123\171\052\034\124\157\162\121\275\105\116\105\063" +
"\253\240\174\247\205\352\075\062\052\232\131\171\052\034\124\303" +
"\044\251\150\146\125\230\352\067\017\304\350\144\123\152\000\000" +
""
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
    public Parser_simple_composed_simple_all_parse() {}
    
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
            edu.umn.cs.melt.copper.runtime.engines.single.SingleDFAEngine<simple.concretesyntax.NRoot,edu.umn.cs.melt.copper.runtime.logging.CopperParserException> engine = new simple.composed.simple_all.Parser_simple_composed_simple_all_parse();
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
        TERMINAL_COUNT = 51;
        GRAMMAR_SYMBOL_COUNT = 68;
        SYMBOL_COUNT = 116;
        PARSER_STATE_COUNT = 134;
        SCANNER_STATE_COUNT = 127;
        DISAMBIG_GROUP_COUNT = 0;
        SCANNER_START_STATENUM = 1;
        PARSER_START_STATENUM = 0;
        EOF_SYMNUM = 49;
        EPS_SYMNUM = 50;
        try { initArrays(); }
        catch(java.io.IOException ex) { System.err.println("IO Exception"); }
        catch(java.lang.ClassNotFoundException ex) { System.err.println("Class Not Found Exception"); }
        disambiguationGroups = new java.util.BitSet[0];
    }

}
