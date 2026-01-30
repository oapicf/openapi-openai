@isTest
private class OASProjectServiceAccountCreateRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest1 = OASProjectServiceAccountCreateReques.getExample();
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest2 = projectServiceAccountCreateRequest1;
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest3 = new OASProjectServiceAccountCreateReques();
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest4 = projectServiceAccountCreateRequest3;

        System.assert(projectServiceAccountCreateRequest1.equals(projectServiceAccountCreateRequest2));
        System.assert(projectServiceAccountCreateRequest2.equals(projectServiceAccountCreateRequest1));
        System.assert(projectServiceAccountCreateRequest1.equals(projectServiceAccountCreateRequest1));
        System.assert(projectServiceAccountCreateRequest3.equals(projectServiceAccountCreateRequest4));
        System.assert(projectServiceAccountCreateRequest4.equals(projectServiceAccountCreateRequest3));
        System.assert(projectServiceAccountCreateRequest3.equals(projectServiceAccountCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest1 = OASProjectServiceAccountCreateReques.getExample();
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest2 = OASProjectServiceAccountCreateReques.getExample();
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest3 = new OASProjectServiceAccountCreateReques();
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest4 = new OASProjectServiceAccountCreateReques();

        System.assert(projectServiceAccountCreateRequest1.equals(projectServiceAccountCreateRequest2));
        System.assert(projectServiceAccountCreateRequest2.equals(projectServiceAccountCreateRequest1));
        System.assert(projectServiceAccountCreateRequest3.equals(projectServiceAccountCreateRequest4));
        System.assert(projectServiceAccountCreateRequest4.equals(projectServiceAccountCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest1 = OASProjectServiceAccountCreateReques.getExample();
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest2 = new OASProjectServiceAccountCreateReques();

        System.assertEquals(false, projectServiceAccountCreateRequest1.equals('foo'));
        System.assertEquals(false, projectServiceAccountCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest1 = OASProjectServiceAccountCreateReques.getExample();
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest2 = new OASProjectServiceAccountCreateReques();
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest3;

        System.assertEquals(false, projectServiceAccountCreateRequest1.equals(projectServiceAccountCreateRequest3));
        System.assertEquals(false, projectServiceAccountCreateRequest2.equals(projectServiceAccountCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest1 = OASProjectServiceAccountCreateReques.getExample();
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest2 = new OASProjectServiceAccountCreateReques();

        System.assertEquals(projectServiceAccountCreateRequest1.hashCode(), projectServiceAccountCreateRequest1.hashCode());
        System.assertEquals(projectServiceAccountCreateRequest2.hashCode(), projectServiceAccountCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest1 = OASProjectServiceAccountCreateReques.getExample();
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest2 = OASProjectServiceAccountCreateReques.getExample();
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest3 = new OASProjectServiceAccountCreateReques();
        OASProjectServiceAccountCreateReques projectServiceAccountCreateRequest4 = new OASProjectServiceAccountCreateReques();

        System.assert(projectServiceAccountCreateRequest1.equals(projectServiceAccountCreateRequest2));
        System.assert(projectServiceAccountCreateRequest3.equals(projectServiceAccountCreateRequest4));
        System.assertEquals(projectServiceAccountCreateRequest1.hashCode(), projectServiceAccountCreateRequest2.hashCode());
        System.assertEquals(projectServiceAccountCreateRequest3.hashCode(), projectServiceAccountCreateRequest4.hashCode());
    }
}
