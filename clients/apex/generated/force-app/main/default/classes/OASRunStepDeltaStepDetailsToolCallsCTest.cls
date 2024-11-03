@isTest
private class OASRunStepDeltaStepDetailsToolCallsCTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1 = OASRunStepDeltaStepDetailsToolCallsC.getExample();
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage2 = runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1;
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage3 = new OASRunStepDeltaStepDetailsToolCallsC();
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage4 = runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage3;

        System.assert(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1.equals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage2));
        System.assert(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage2.equals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1));
        System.assert(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1.equals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1));
        System.assert(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage3.equals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage4));
        System.assert(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage4.equals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage3));
        System.assert(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage3.equals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1 = OASRunStepDeltaStepDetailsToolCallsC.getExample();
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage2 = OASRunStepDeltaStepDetailsToolCallsC.getExample();
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage3 = new OASRunStepDeltaStepDetailsToolCallsC();
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage4 = new OASRunStepDeltaStepDetailsToolCallsC();

        System.assert(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1.equals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage2));
        System.assert(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage2.equals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1));
        System.assert(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage3.equals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage4));
        System.assert(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage4.equals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1 = OASRunStepDeltaStepDetailsToolCallsC.getExample();
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage2 = new OASRunStepDeltaStepDetailsToolCallsC();

        System.assertEquals(false, runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1.equals('foo'));
        System.assertEquals(false, runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1 = OASRunStepDeltaStepDetailsToolCallsC.getExample();
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage2 = new OASRunStepDeltaStepDetailsToolCallsC();
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage3;

        System.assertEquals(false, runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1.equals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage3));
        System.assertEquals(false, runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage2.equals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1 = OASRunStepDeltaStepDetailsToolCallsC.getExample();
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage2 = new OASRunStepDeltaStepDetailsToolCallsC();

        System.assertEquals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1.hashCode(), runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1.hashCode());
        System.assertEquals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage2.hashCode(), runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1 = OASRunStepDeltaStepDetailsToolCallsC.getExample();
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage2 = OASRunStepDeltaStepDetailsToolCallsC.getExample();
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage3 = new OASRunStepDeltaStepDetailsToolCallsC();
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage4 = new OASRunStepDeltaStepDetailsToolCallsC();

        System.assert(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1.equals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage2));
        System.assert(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage3.equals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage4));
        System.assertEquals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage1.hashCode(), runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage2.hashCode());
        System.assertEquals(runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage3.hashCode(), runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunStepDeltaStepDetailsToolCallsC runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage = new OASRunStepDeltaStepDetailsToolCallsC();
        Map<String, String> x-property-mappings = runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.getx-property-mappings();
        System.assertEquals('fileId', x-property-mappings.get('file_id'));
    }
}
