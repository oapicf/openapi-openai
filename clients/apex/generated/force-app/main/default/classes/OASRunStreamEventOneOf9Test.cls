@isTest
private class OASRunStreamEventOneOf9Test {
    @isTest
    private static void equalsSameInstance() {
        OASRunStreamEventOneOf9 runStreamEventOneOf91 = OASRunStreamEventOneOf9.getExample();
        OASRunStreamEventOneOf9 runStreamEventOneOf92 = runStreamEventOneOf91;
        OASRunStreamEventOneOf9 runStreamEventOneOf93 = new OASRunStreamEventOneOf9();
        OASRunStreamEventOneOf9 runStreamEventOneOf94 = runStreamEventOneOf93;

        System.assert(runStreamEventOneOf91.equals(runStreamEventOneOf92));
        System.assert(runStreamEventOneOf92.equals(runStreamEventOneOf91));
        System.assert(runStreamEventOneOf91.equals(runStreamEventOneOf91));
        System.assert(runStreamEventOneOf93.equals(runStreamEventOneOf94));
        System.assert(runStreamEventOneOf94.equals(runStreamEventOneOf93));
        System.assert(runStreamEventOneOf93.equals(runStreamEventOneOf93));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStreamEventOneOf9 runStreamEventOneOf91 = OASRunStreamEventOneOf9.getExample();
        OASRunStreamEventOneOf9 runStreamEventOneOf92 = OASRunStreamEventOneOf9.getExample();
        OASRunStreamEventOneOf9 runStreamEventOneOf93 = new OASRunStreamEventOneOf9();
        OASRunStreamEventOneOf9 runStreamEventOneOf94 = new OASRunStreamEventOneOf9();

        System.assert(runStreamEventOneOf91.equals(runStreamEventOneOf92));
        System.assert(runStreamEventOneOf92.equals(runStreamEventOneOf91));
        System.assert(runStreamEventOneOf93.equals(runStreamEventOneOf94));
        System.assert(runStreamEventOneOf94.equals(runStreamEventOneOf93));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStreamEventOneOf9 runStreamEventOneOf91 = OASRunStreamEventOneOf9.getExample();
        OASRunStreamEventOneOf9 runStreamEventOneOf92 = new OASRunStreamEventOneOf9();

        System.assertEquals(false, runStreamEventOneOf91.equals('foo'));
        System.assertEquals(false, runStreamEventOneOf92.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStreamEventOneOf9 runStreamEventOneOf91 = OASRunStreamEventOneOf9.getExample();
        OASRunStreamEventOneOf9 runStreamEventOneOf92 = new OASRunStreamEventOneOf9();
        OASRunStreamEventOneOf9 runStreamEventOneOf93;

        System.assertEquals(false, runStreamEventOneOf91.equals(runStreamEventOneOf93));
        System.assertEquals(false, runStreamEventOneOf92.equals(runStreamEventOneOf93));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStreamEventOneOf9 runStreamEventOneOf91 = OASRunStreamEventOneOf9.getExample();
        OASRunStreamEventOneOf9 runStreamEventOneOf92 = new OASRunStreamEventOneOf9();

        System.assertEquals(runStreamEventOneOf91.hashCode(), runStreamEventOneOf91.hashCode());
        System.assertEquals(runStreamEventOneOf92.hashCode(), runStreamEventOneOf92.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStreamEventOneOf9 runStreamEventOneOf91 = OASRunStreamEventOneOf9.getExample();
        OASRunStreamEventOneOf9 runStreamEventOneOf92 = OASRunStreamEventOneOf9.getExample();
        OASRunStreamEventOneOf9 runStreamEventOneOf93 = new OASRunStreamEventOneOf9();
        OASRunStreamEventOneOf9 runStreamEventOneOf94 = new OASRunStreamEventOneOf9();

        System.assert(runStreamEventOneOf91.equals(runStreamEventOneOf92));
        System.assert(runStreamEventOneOf93.equals(runStreamEventOneOf94));
        System.assertEquals(runStreamEventOneOf91.hashCode(), runStreamEventOneOf92.hashCode());
        System.assertEquals(runStreamEventOneOf93.hashCode(), runStreamEventOneOf94.hashCode());
    }
}
