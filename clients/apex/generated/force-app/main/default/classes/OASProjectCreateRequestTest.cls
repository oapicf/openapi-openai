@isTest
private class OASProjectCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectCreateRequest projectCreateRequest1 = OASProjectCreateRequest.getExample();
        OASProjectCreateRequest projectCreateRequest2 = projectCreateRequest1;
        OASProjectCreateRequest projectCreateRequest3 = new OASProjectCreateRequest();
        OASProjectCreateRequest projectCreateRequest4 = projectCreateRequest3;

        System.assert(projectCreateRequest1.equals(projectCreateRequest2));
        System.assert(projectCreateRequest2.equals(projectCreateRequest1));
        System.assert(projectCreateRequest1.equals(projectCreateRequest1));
        System.assert(projectCreateRequest3.equals(projectCreateRequest4));
        System.assert(projectCreateRequest4.equals(projectCreateRequest3));
        System.assert(projectCreateRequest3.equals(projectCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectCreateRequest projectCreateRequest1 = OASProjectCreateRequest.getExample();
        OASProjectCreateRequest projectCreateRequest2 = OASProjectCreateRequest.getExample();
        OASProjectCreateRequest projectCreateRequest3 = new OASProjectCreateRequest();
        OASProjectCreateRequest projectCreateRequest4 = new OASProjectCreateRequest();

        System.assert(projectCreateRequest1.equals(projectCreateRequest2));
        System.assert(projectCreateRequest2.equals(projectCreateRequest1));
        System.assert(projectCreateRequest3.equals(projectCreateRequest4));
        System.assert(projectCreateRequest4.equals(projectCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectCreateRequest projectCreateRequest1 = OASProjectCreateRequest.getExample();
        OASProjectCreateRequest projectCreateRequest2 = new OASProjectCreateRequest();

        System.assertEquals(false, projectCreateRequest1.equals('foo'));
        System.assertEquals(false, projectCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectCreateRequest projectCreateRequest1 = OASProjectCreateRequest.getExample();
        OASProjectCreateRequest projectCreateRequest2 = new OASProjectCreateRequest();
        OASProjectCreateRequest projectCreateRequest3;

        System.assertEquals(false, projectCreateRequest1.equals(projectCreateRequest3));
        System.assertEquals(false, projectCreateRequest2.equals(projectCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectCreateRequest projectCreateRequest1 = OASProjectCreateRequest.getExample();
        OASProjectCreateRequest projectCreateRequest2 = new OASProjectCreateRequest();

        System.assertEquals(projectCreateRequest1.hashCode(), projectCreateRequest1.hashCode());
        System.assertEquals(projectCreateRequest2.hashCode(), projectCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectCreateRequest projectCreateRequest1 = OASProjectCreateRequest.getExample();
        OASProjectCreateRequest projectCreateRequest2 = OASProjectCreateRequest.getExample();
        OASProjectCreateRequest projectCreateRequest3 = new OASProjectCreateRequest();
        OASProjectCreateRequest projectCreateRequest4 = new OASProjectCreateRequest();

        System.assert(projectCreateRequest1.equals(projectCreateRequest2));
        System.assert(projectCreateRequest3.equals(projectCreateRequest4));
        System.assertEquals(projectCreateRequest1.hashCode(), projectCreateRequest2.hashCode());
        System.assertEquals(projectCreateRequest3.hashCode(), projectCreateRequest4.hashCode());
    }
}
