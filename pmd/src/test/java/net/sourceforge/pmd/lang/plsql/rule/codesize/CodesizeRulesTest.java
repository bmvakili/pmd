/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.plsql.rule.codesize;

import net.sourceforge.pmd.testframework.SimpleAggregatorTst;

import org.junit.Before;


public class CodesizeRulesTest extends SimpleAggregatorTst {

    private static final String RULESET = "plsql-codesize";

    @Before
    public void setUp() {
        addRule(RULESET, "NPathComplexity");
        addRule(RULESET, "ExcessiveTypeLength");
        addRule(RULESET, "CyclomaticComplexity");
        addRule(RULESET, "ExcessiveObjectLength");
        addRule(RULESET, "ExcessivePackageBodyLength");
        addRule(RULESET, "ExcessivePackageSpecificationLength");
        addRule(RULESET, "ExcessiveParameterList");
        addRule(RULESET, "ExcessiveMethodLength");
        addRule(RULESET, "NcssMethodCount");
        addRule(RULESET, "NcssObjectCount");
        addRule(RULESET, "TooManyFields");
    }

    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(CodesizeRulesTest.class);
    }
}
