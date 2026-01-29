@isTest
private class OASCreateModerationRequestInputTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateModerationRequestInput createModerationRequestInput1 = OASCreateModerationRequestInput.getExample();
        OASCreateModerationRequestInput createModerationRequestInput2 = createModerationRequestInput1;
        OASCreateModerationRequestInput createModerationRequestInput3 = new OASCreateModerationRequestInput();
        OASCreateModerationRequestInput createModerationRequestInput4 = createModerationRequestInput3;

        System.assert(createModerationRequestInput1.equals(createModerationRequestInput2));
        System.assert(createModerationRequestInput2.equals(createModerationRequestInput1));
        System.assert(createModerationRequestInput1.equals(createModerationRequestInput1));
        System.assert(createModerationRequestInput3.equals(createModerationRequestInput4));
        System.assert(createModerationRequestInput4.equals(createModerationRequestInput3));
        System.assert(createModerationRequestInput3.equals(createModerationRequestInput3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateModerationRequestInput createModerationRequestInput1 = OASCreateModerationRequestInput.getExample();
        OASCreateModerationRequestInput createModerationRequestInput2 = OASCreateModerationRequestInput.getExample();
        OASCreateModerationRequestInput createModerationRequestInput3 = new OASCreateModerationRequestInput();
        OASCreateModerationRequestInput createModerationRequestInput4 = new OASCreateModerationRequestInput();

        System.assert(createModerationRequestInput1.equals(createModerationRequestInput2));
        System.assert(createModerationRequestInput2.equals(createModerationRequestInput1));
        System.assert(createModerationRequestInput3.equals(createModerationRequestInput4));
        System.assert(createModerationRequestInput4.equals(createModerationRequestInput3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateModerationRequestInput createModerationRequestInput1 = OASCreateModerationRequestInput.getExample();
        OASCreateModerationRequestInput createModerationRequestInput2 = new OASCreateModerationRequestInput();

        System.assertEquals(false, createModerationRequestInput1.equals('foo'));
        System.assertEquals(false, createModerationRequestInput2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateModerationRequestInput createModerationRequestInput1 = OASCreateModerationRequestInput.getExample();
        OASCreateModerationRequestInput createModerationRequestInput2 = new OASCreateModerationRequestInput();
        OASCreateModerationRequestInput createModerationRequestInput3;

        System.assertEquals(false, createModerationRequestInput1.equals(createModerationRequestInput3));
        System.assertEquals(false, createModerationRequestInput2.equals(createModerationRequestInput3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateModerationRequestInput createModerationRequestInput1 = OASCreateModerationRequestInput.getExample();
        OASCreateModerationRequestInput createModerationRequestInput2 = new OASCreateModerationRequestInput();

        System.assertEquals(createModerationRequestInput1.hashCode(), createModerationRequestInput1.hashCode());
        System.assertEquals(createModerationRequestInput2.hashCode(), createModerationRequestInput2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateModerationRequestInput createModerationRequestInput1 = OASCreateModerationRequestInput.getExample();
        OASCreateModerationRequestInput createModerationRequestInput2 = OASCreateModerationRequestInput.getExample();
        OASCreateModerationRequestInput createModerationRequestInput3 = new OASCreateModerationRequestInput();
        OASCreateModerationRequestInput createModerationRequestInput4 = new OASCreateModerationRequestInput();

        System.assert(createModerationRequestInput1.equals(createModerationRequestInput2));
        System.assert(createModerationRequestInput3.equals(createModerationRequestInput4));
        System.assertEquals(createModerationRequestInput1.hashCode(), createModerationRequestInput2.hashCode());
        System.assertEquals(createModerationRequestInput3.hashCode(), createModerationRequestInput4.hashCode());
    }
}
