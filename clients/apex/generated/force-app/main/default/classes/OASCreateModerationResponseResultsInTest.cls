@isTest
private class OASCreateModerationResponseResultsInTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner1 = OASCreateModerationResponseResultsIn.getExample();
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner2 = createModerationResponseResultsInner1;
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner3 = new OASCreateModerationResponseResultsIn();
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner4 = createModerationResponseResultsInner3;

        System.assert(createModerationResponseResultsInner1.equals(createModerationResponseResultsInner2));
        System.assert(createModerationResponseResultsInner2.equals(createModerationResponseResultsInner1));
        System.assert(createModerationResponseResultsInner1.equals(createModerationResponseResultsInner1));
        System.assert(createModerationResponseResultsInner3.equals(createModerationResponseResultsInner4));
        System.assert(createModerationResponseResultsInner4.equals(createModerationResponseResultsInner3));
        System.assert(createModerationResponseResultsInner3.equals(createModerationResponseResultsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner1 = OASCreateModerationResponseResultsIn.getExample();
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner2 = OASCreateModerationResponseResultsIn.getExample();
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner3 = new OASCreateModerationResponseResultsIn();
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner4 = new OASCreateModerationResponseResultsIn();

        System.assert(createModerationResponseResultsInner1.equals(createModerationResponseResultsInner2));
        System.assert(createModerationResponseResultsInner2.equals(createModerationResponseResultsInner1));
        System.assert(createModerationResponseResultsInner3.equals(createModerationResponseResultsInner4));
        System.assert(createModerationResponseResultsInner4.equals(createModerationResponseResultsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner1 = OASCreateModerationResponseResultsIn.getExample();
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner2 = new OASCreateModerationResponseResultsIn();

        System.assertEquals(false, createModerationResponseResultsInner1.equals('foo'));
        System.assertEquals(false, createModerationResponseResultsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner1 = OASCreateModerationResponseResultsIn.getExample();
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner2 = new OASCreateModerationResponseResultsIn();
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner3;

        System.assertEquals(false, createModerationResponseResultsInner1.equals(createModerationResponseResultsInner3));
        System.assertEquals(false, createModerationResponseResultsInner2.equals(createModerationResponseResultsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner1 = OASCreateModerationResponseResultsIn.getExample();
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner2 = new OASCreateModerationResponseResultsIn();

        System.assertEquals(createModerationResponseResultsInner1.hashCode(), createModerationResponseResultsInner1.hashCode());
        System.assertEquals(createModerationResponseResultsInner2.hashCode(), createModerationResponseResultsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner1 = OASCreateModerationResponseResultsIn.getExample();
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner2 = OASCreateModerationResponseResultsIn.getExample();
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner3 = new OASCreateModerationResponseResultsIn();
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner4 = new OASCreateModerationResponseResultsIn();

        System.assert(createModerationResponseResultsInner1.equals(createModerationResponseResultsInner2));
        System.assert(createModerationResponseResultsInner3.equals(createModerationResponseResultsInner4));
        System.assertEquals(createModerationResponseResultsInner1.hashCode(), createModerationResponseResultsInner2.hashCode());
        System.assertEquals(createModerationResponseResultsInner3.hashCode(), createModerationResponseResultsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateModerationResponseResultsIn createModerationResponseResultsInner = new OASCreateModerationResponseResultsIn();
        Map<String, String> x-property-mappings = createModerationResponseResultsInner.getx-property-mappings();
        System.assertEquals('categoryScores', x-property-mappings.get('category_scores'));
        System.assertEquals('categoryAppliedInputTypes', x-property-mappings.get('category_applied_input_types'));
    }
}
