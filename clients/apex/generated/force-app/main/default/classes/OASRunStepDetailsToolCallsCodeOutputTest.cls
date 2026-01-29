@isTest
private class OASRunStepDetailsToolCallsCodeOutputTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage1 = OASRunStepDetailsToolCallsCodeOutput.getExample();
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage2 = runStepDetailsToolCallsCodeOutputImageObjectImage1;
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage3 = new OASRunStepDetailsToolCallsCodeOutput();
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage4 = runStepDetailsToolCallsCodeOutputImageObjectImage3;

        System.assert(runStepDetailsToolCallsCodeOutputImageObjectImage1.equals(runStepDetailsToolCallsCodeOutputImageObjectImage2));
        System.assert(runStepDetailsToolCallsCodeOutputImageObjectImage2.equals(runStepDetailsToolCallsCodeOutputImageObjectImage1));
        System.assert(runStepDetailsToolCallsCodeOutputImageObjectImage1.equals(runStepDetailsToolCallsCodeOutputImageObjectImage1));
        System.assert(runStepDetailsToolCallsCodeOutputImageObjectImage3.equals(runStepDetailsToolCallsCodeOutputImageObjectImage4));
        System.assert(runStepDetailsToolCallsCodeOutputImageObjectImage4.equals(runStepDetailsToolCallsCodeOutputImageObjectImage3));
        System.assert(runStepDetailsToolCallsCodeOutputImageObjectImage3.equals(runStepDetailsToolCallsCodeOutputImageObjectImage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage1 = OASRunStepDetailsToolCallsCodeOutput.getExample();
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage2 = OASRunStepDetailsToolCallsCodeOutput.getExample();
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage3 = new OASRunStepDetailsToolCallsCodeOutput();
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage4 = new OASRunStepDetailsToolCallsCodeOutput();

        System.assert(runStepDetailsToolCallsCodeOutputImageObjectImage1.equals(runStepDetailsToolCallsCodeOutputImageObjectImage2));
        System.assert(runStepDetailsToolCallsCodeOutputImageObjectImage2.equals(runStepDetailsToolCallsCodeOutputImageObjectImage1));
        System.assert(runStepDetailsToolCallsCodeOutputImageObjectImage3.equals(runStepDetailsToolCallsCodeOutputImageObjectImage4));
        System.assert(runStepDetailsToolCallsCodeOutputImageObjectImage4.equals(runStepDetailsToolCallsCodeOutputImageObjectImage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage1 = OASRunStepDetailsToolCallsCodeOutput.getExample();
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage2 = new OASRunStepDetailsToolCallsCodeOutput();

        System.assertEquals(false, runStepDetailsToolCallsCodeOutputImageObjectImage1.equals('foo'));
        System.assertEquals(false, runStepDetailsToolCallsCodeOutputImageObjectImage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage1 = OASRunStepDetailsToolCallsCodeOutput.getExample();
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage2 = new OASRunStepDetailsToolCallsCodeOutput();
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage3;

        System.assertEquals(false, runStepDetailsToolCallsCodeOutputImageObjectImage1.equals(runStepDetailsToolCallsCodeOutputImageObjectImage3));
        System.assertEquals(false, runStepDetailsToolCallsCodeOutputImageObjectImage2.equals(runStepDetailsToolCallsCodeOutputImageObjectImage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage1 = OASRunStepDetailsToolCallsCodeOutput.getExample();
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage2 = new OASRunStepDetailsToolCallsCodeOutput();

        System.assertEquals(runStepDetailsToolCallsCodeOutputImageObjectImage1.hashCode(), runStepDetailsToolCallsCodeOutputImageObjectImage1.hashCode());
        System.assertEquals(runStepDetailsToolCallsCodeOutputImageObjectImage2.hashCode(), runStepDetailsToolCallsCodeOutputImageObjectImage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage1 = OASRunStepDetailsToolCallsCodeOutput.getExample();
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage2 = OASRunStepDetailsToolCallsCodeOutput.getExample();
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage3 = new OASRunStepDetailsToolCallsCodeOutput();
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage4 = new OASRunStepDetailsToolCallsCodeOutput();

        System.assert(runStepDetailsToolCallsCodeOutputImageObjectImage1.equals(runStepDetailsToolCallsCodeOutputImageObjectImage2));
        System.assert(runStepDetailsToolCallsCodeOutputImageObjectImage3.equals(runStepDetailsToolCallsCodeOutputImageObjectImage4));
        System.assertEquals(runStepDetailsToolCallsCodeOutputImageObjectImage1.hashCode(), runStepDetailsToolCallsCodeOutputImageObjectImage2.hashCode());
        System.assertEquals(runStepDetailsToolCallsCodeOutputImageObjectImage3.hashCode(), runStepDetailsToolCallsCodeOutputImageObjectImage4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunStepDetailsToolCallsCodeOutput runStepDetailsToolCallsCodeOutputImageObjectImage = new OASRunStepDetailsToolCallsCodeOutput();
        Map<String, String> x-property-mappings = runStepDetailsToolCallsCodeOutputImageObjectImage.getx-property-mappings();
        System.assertEquals('fileId', x-property-mappings.get('file_id'));
    }
}
