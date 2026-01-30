@isTest
private class OASProjectUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectUpdateRequest projectUpdateRequest1 = OASProjectUpdateRequest.getExample();
        OASProjectUpdateRequest projectUpdateRequest2 = projectUpdateRequest1;
        OASProjectUpdateRequest projectUpdateRequest3 = new OASProjectUpdateRequest();
        OASProjectUpdateRequest projectUpdateRequest4 = projectUpdateRequest3;

        System.assert(projectUpdateRequest1.equals(projectUpdateRequest2));
        System.assert(projectUpdateRequest2.equals(projectUpdateRequest1));
        System.assert(projectUpdateRequest1.equals(projectUpdateRequest1));
        System.assert(projectUpdateRequest3.equals(projectUpdateRequest4));
        System.assert(projectUpdateRequest4.equals(projectUpdateRequest3));
        System.assert(projectUpdateRequest3.equals(projectUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectUpdateRequest projectUpdateRequest1 = OASProjectUpdateRequest.getExample();
        OASProjectUpdateRequest projectUpdateRequest2 = OASProjectUpdateRequest.getExample();
        OASProjectUpdateRequest projectUpdateRequest3 = new OASProjectUpdateRequest();
        OASProjectUpdateRequest projectUpdateRequest4 = new OASProjectUpdateRequest();

        System.assert(projectUpdateRequest1.equals(projectUpdateRequest2));
        System.assert(projectUpdateRequest2.equals(projectUpdateRequest1));
        System.assert(projectUpdateRequest3.equals(projectUpdateRequest4));
        System.assert(projectUpdateRequest4.equals(projectUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectUpdateRequest projectUpdateRequest1 = OASProjectUpdateRequest.getExample();
        OASProjectUpdateRequest projectUpdateRequest2 = new OASProjectUpdateRequest();

        System.assertEquals(false, projectUpdateRequest1.equals('foo'));
        System.assertEquals(false, projectUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectUpdateRequest projectUpdateRequest1 = OASProjectUpdateRequest.getExample();
        OASProjectUpdateRequest projectUpdateRequest2 = new OASProjectUpdateRequest();
        OASProjectUpdateRequest projectUpdateRequest3;

        System.assertEquals(false, projectUpdateRequest1.equals(projectUpdateRequest3));
        System.assertEquals(false, projectUpdateRequest2.equals(projectUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectUpdateRequest projectUpdateRequest1 = OASProjectUpdateRequest.getExample();
        OASProjectUpdateRequest projectUpdateRequest2 = new OASProjectUpdateRequest();

        System.assertEquals(projectUpdateRequest1.hashCode(), projectUpdateRequest1.hashCode());
        System.assertEquals(projectUpdateRequest2.hashCode(), projectUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectUpdateRequest projectUpdateRequest1 = OASProjectUpdateRequest.getExample();
        OASProjectUpdateRequest projectUpdateRequest2 = OASProjectUpdateRequest.getExample();
        OASProjectUpdateRequest projectUpdateRequest3 = new OASProjectUpdateRequest();
        OASProjectUpdateRequest projectUpdateRequest4 = new OASProjectUpdateRequest();

        System.assert(projectUpdateRequest1.equals(projectUpdateRequest2));
        System.assert(projectUpdateRequest3.equals(projectUpdateRequest4));
        System.assertEquals(projectUpdateRequest1.hashCode(), projectUpdateRequest2.hashCode());
        System.assertEquals(projectUpdateRequest3.hashCode(), projectUpdateRequest4.hashCode());
    }
}
