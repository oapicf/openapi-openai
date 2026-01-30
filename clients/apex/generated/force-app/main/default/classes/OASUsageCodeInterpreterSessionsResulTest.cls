@isTest
private class OASUsageCodeInterpreterSessionsResulTest {
    @isTest
    private static void equalsSameInstance() {
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult1 = OASUsageCodeInterpreterSessionsResul.getExample();
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult2 = usageCodeInterpreterSessionsResult1;
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult3 = new OASUsageCodeInterpreterSessionsResul();
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult4 = usageCodeInterpreterSessionsResult3;

        System.assert(usageCodeInterpreterSessionsResult1.equals(usageCodeInterpreterSessionsResult2));
        System.assert(usageCodeInterpreterSessionsResult2.equals(usageCodeInterpreterSessionsResult1));
        System.assert(usageCodeInterpreterSessionsResult1.equals(usageCodeInterpreterSessionsResult1));
        System.assert(usageCodeInterpreterSessionsResult3.equals(usageCodeInterpreterSessionsResult4));
        System.assert(usageCodeInterpreterSessionsResult4.equals(usageCodeInterpreterSessionsResult3));
        System.assert(usageCodeInterpreterSessionsResult3.equals(usageCodeInterpreterSessionsResult3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult1 = OASUsageCodeInterpreterSessionsResul.getExample();
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult2 = OASUsageCodeInterpreterSessionsResul.getExample();
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult3 = new OASUsageCodeInterpreterSessionsResul();
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult4 = new OASUsageCodeInterpreterSessionsResul();

        System.assert(usageCodeInterpreterSessionsResult1.equals(usageCodeInterpreterSessionsResult2));
        System.assert(usageCodeInterpreterSessionsResult2.equals(usageCodeInterpreterSessionsResult1));
        System.assert(usageCodeInterpreterSessionsResult3.equals(usageCodeInterpreterSessionsResult4));
        System.assert(usageCodeInterpreterSessionsResult4.equals(usageCodeInterpreterSessionsResult3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult1 = OASUsageCodeInterpreterSessionsResul.getExample();
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult2 = new OASUsageCodeInterpreterSessionsResul();

        System.assertEquals(false, usageCodeInterpreterSessionsResult1.equals('foo'));
        System.assertEquals(false, usageCodeInterpreterSessionsResult2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult1 = OASUsageCodeInterpreterSessionsResul.getExample();
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult2 = new OASUsageCodeInterpreterSessionsResul();
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult3;

        System.assertEquals(false, usageCodeInterpreterSessionsResult1.equals(usageCodeInterpreterSessionsResult3));
        System.assertEquals(false, usageCodeInterpreterSessionsResult2.equals(usageCodeInterpreterSessionsResult3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult1 = OASUsageCodeInterpreterSessionsResul.getExample();
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult2 = new OASUsageCodeInterpreterSessionsResul();

        System.assertEquals(usageCodeInterpreterSessionsResult1.hashCode(), usageCodeInterpreterSessionsResult1.hashCode());
        System.assertEquals(usageCodeInterpreterSessionsResult2.hashCode(), usageCodeInterpreterSessionsResult2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult1 = OASUsageCodeInterpreterSessionsResul.getExample();
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult2 = OASUsageCodeInterpreterSessionsResul.getExample();
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult3 = new OASUsageCodeInterpreterSessionsResul();
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult4 = new OASUsageCodeInterpreterSessionsResul();

        System.assert(usageCodeInterpreterSessionsResult1.equals(usageCodeInterpreterSessionsResult2));
        System.assert(usageCodeInterpreterSessionsResult3.equals(usageCodeInterpreterSessionsResult4));
        System.assertEquals(usageCodeInterpreterSessionsResult1.hashCode(), usageCodeInterpreterSessionsResult2.hashCode());
        System.assertEquals(usageCodeInterpreterSessionsResult3.hashCode(), usageCodeInterpreterSessionsResult4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUsageCodeInterpreterSessionsResul usageCodeInterpreterSessionsResult = new OASUsageCodeInterpreterSessionsResul();
        Map<String, String> x-property-mappings = usageCodeInterpreterSessionsResult.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('projectId', x-property-mappings.get('project_id'));
    }
}
