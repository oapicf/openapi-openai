@isTest
private class OASRunObjectRequiredActionTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunObjectRequiredAction runObjectRequiredAction1 = OASRunObjectRequiredAction.getExample();
        OASRunObjectRequiredAction runObjectRequiredAction2 = runObjectRequiredAction1;
        OASRunObjectRequiredAction runObjectRequiredAction3 = new OASRunObjectRequiredAction();
        OASRunObjectRequiredAction runObjectRequiredAction4 = runObjectRequiredAction3;

        System.assert(runObjectRequiredAction1.equals(runObjectRequiredAction2));
        System.assert(runObjectRequiredAction2.equals(runObjectRequiredAction1));
        System.assert(runObjectRequiredAction1.equals(runObjectRequiredAction1));
        System.assert(runObjectRequiredAction3.equals(runObjectRequiredAction4));
        System.assert(runObjectRequiredAction4.equals(runObjectRequiredAction3));
        System.assert(runObjectRequiredAction3.equals(runObjectRequiredAction3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunObjectRequiredAction runObjectRequiredAction1 = OASRunObjectRequiredAction.getExample();
        OASRunObjectRequiredAction runObjectRequiredAction2 = OASRunObjectRequiredAction.getExample();
        OASRunObjectRequiredAction runObjectRequiredAction3 = new OASRunObjectRequiredAction();
        OASRunObjectRequiredAction runObjectRequiredAction4 = new OASRunObjectRequiredAction();

        System.assert(runObjectRequiredAction1.equals(runObjectRequiredAction2));
        System.assert(runObjectRequiredAction2.equals(runObjectRequiredAction1));
        System.assert(runObjectRequiredAction3.equals(runObjectRequiredAction4));
        System.assert(runObjectRequiredAction4.equals(runObjectRequiredAction3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunObjectRequiredAction runObjectRequiredAction1 = OASRunObjectRequiredAction.getExample();
        OASRunObjectRequiredAction runObjectRequiredAction2 = new OASRunObjectRequiredAction();

        System.assertEquals(false, runObjectRequiredAction1.equals('foo'));
        System.assertEquals(false, runObjectRequiredAction2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunObjectRequiredAction runObjectRequiredAction1 = OASRunObjectRequiredAction.getExample();
        OASRunObjectRequiredAction runObjectRequiredAction2 = new OASRunObjectRequiredAction();
        OASRunObjectRequiredAction runObjectRequiredAction3;

        System.assertEquals(false, runObjectRequiredAction1.equals(runObjectRequiredAction3));
        System.assertEquals(false, runObjectRequiredAction2.equals(runObjectRequiredAction3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunObjectRequiredAction runObjectRequiredAction1 = OASRunObjectRequiredAction.getExample();
        OASRunObjectRequiredAction runObjectRequiredAction2 = new OASRunObjectRequiredAction();

        System.assertEquals(runObjectRequiredAction1.hashCode(), runObjectRequiredAction1.hashCode());
        System.assertEquals(runObjectRequiredAction2.hashCode(), runObjectRequiredAction2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunObjectRequiredAction runObjectRequiredAction1 = OASRunObjectRequiredAction.getExample();
        OASRunObjectRequiredAction runObjectRequiredAction2 = OASRunObjectRequiredAction.getExample();
        OASRunObjectRequiredAction runObjectRequiredAction3 = new OASRunObjectRequiredAction();
        OASRunObjectRequiredAction runObjectRequiredAction4 = new OASRunObjectRequiredAction();

        System.assert(runObjectRequiredAction1.equals(runObjectRequiredAction2));
        System.assert(runObjectRequiredAction3.equals(runObjectRequiredAction4));
        System.assertEquals(runObjectRequiredAction1.hashCode(), runObjectRequiredAction2.hashCode());
        System.assertEquals(runObjectRequiredAction3.hashCode(), runObjectRequiredAction4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunObjectRequiredAction runObjectRequiredAction = new OASRunObjectRequiredAction();
        Map<String, String> x-property-mappings = runObjectRequiredAction.getx-property-mappings();
        System.assertEquals('submitToolOutputs', x-property-mappings.get('submit_tool_outputs'));
    }
}
