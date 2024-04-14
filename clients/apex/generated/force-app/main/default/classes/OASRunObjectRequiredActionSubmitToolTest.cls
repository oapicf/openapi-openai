@isTest
private class OASRunObjectRequiredActionSubmitToolTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs1 = OASRunObjectRequiredActionSubmitTool.getExample();
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs2 = runObjectRequiredActionSubmitToolOutputs1;
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs3 = new OASRunObjectRequiredActionSubmitTool();
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs4 = runObjectRequiredActionSubmitToolOutputs3;

        System.assert(runObjectRequiredActionSubmitToolOutputs1.equals(runObjectRequiredActionSubmitToolOutputs2));
        System.assert(runObjectRequiredActionSubmitToolOutputs2.equals(runObjectRequiredActionSubmitToolOutputs1));
        System.assert(runObjectRequiredActionSubmitToolOutputs1.equals(runObjectRequiredActionSubmitToolOutputs1));
        System.assert(runObjectRequiredActionSubmitToolOutputs3.equals(runObjectRequiredActionSubmitToolOutputs4));
        System.assert(runObjectRequiredActionSubmitToolOutputs4.equals(runObjectRequiredActionSubmitToolOutputs3));
        System.assert(runObjectRequiredActionSubmitToolOutputs3.equals(runObjectRequiredActionSubmitToolOutputs3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs1 = OASRunObjectRequiredActionSubmitTool.getExample();
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs2 = OASRunObjectRequiredActionSubmitTool.getExample();
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs3 = new OASRunObjectRequiredActionSubmitTool();
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs4 = new OASRunObjectRequiredActionSubmitTool();

        System.assert(runObjectRequiredActionSubmitToolOutputs1.equals(runObjectRequiredActionSubmitToolOutputs2));
        System.assert(runObjectRequiredActionSubmitToolOutputs2.equals(runObjectRequiredActionSubmitToolOutputs1));
        System.assert(runObjectRequiredActionSubmitToolOutputs3.equals(runObjectRequiredActionSubmitToolOutputs4));
        System.assert(runObjectRequiredActionSubmitToolOutputs4.equals(runObjectRequiredActionSubmitToolOutputs3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs1 = OASRunObjectRequiredActionSubmitTool.getExample();
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs2 = new OASRunObjectRequiredActionSubmitTool();

        System.assertEquals(false, runObjectRequiredActionSubmitToolOutputs1.equals('foo'));
        System.assertEquals(false, runObjectRequiredActionSubmitToolOutputs2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs1 = OASRunObjectRequiredActionSubmitTool.getExample();
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs2 = new OASRunObjectRequiredActionSubmitTool();
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs3;

        System.assertEquals(false, runObjectRequiredActionSubmitToolOutputs1.equals(runObjectRequiredActionSubmitToolOutputs3));
        System.assertEquals(false, runObjectRequiredActionSubmitToolOutputs2.equals(runObjectRequiredActionSubmitToolOutputs3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs1 = OASRunObjectRequiredActionSubmitTool.getExample();
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs2 = new OASRunObjectRequiredActionSubmitTool();

        System.assertEquals(runObjectRequiredActionSubmitToolOutputs1.hashCode(), runObjectRequiredActionSubmitToolOutputs1.hashCode());
        System.assertEquals(runObjectRequiredActionSubmitToolOutputs2.hashCode(), runObjectRequiredActionSubmitToolOutputs2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs1 = OASRunObjectRequiredActionSubmitTool.getExample();
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs2 = OASRunObjectRequiredActionSubmitTool.getExample();
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs3 = new OASRunObjectRequiredActionSubmitTool();
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs4 = new OASRunObjectRequiredActionSubmitTool();

        System.assert(runObjectRequiredActionSubmitToolOutputs1.equals(runObjectRequiredActionSubmitToolOutputs2));
        System.assert(runObjectRequiredActionSubmitToolOutputs3.equals(runObjectRequiredActionSubmitToolOutputs4));
        System.assertEquals(runObjectRequiredActionSubmitToolOutputs1.hashCode(), runObjectRequiredActionSubmitToolOutputs2.hashCode());
        System.assertEquals(runObjectRequiredActionSubmitToolOutputs3.hashCode(), runObjectRequiredActionSubmitToolOutputs4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs = new OASRunObjectRequiredActionSubmitTool();
        Map<String, String> x-property-mappings = runObjectRequiredActionSubmitToolOutputs.getx-property-mappings();
        System.assertEquals('toolCalls', x-property-mappings.get('tool_calls'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRunObjectRequiredActionSubmitTool runObjectRequiredActionSubmitToolOutputs = new OASRunObjectRequiredActionSubmitTool();
        System.assertEquals(new List<OASRunToolCallObject>(), runObjectRequiredActionSubmitToolOutputs.toolCalls);
    }
}
