@isTest
private class OASResponseFormatJsonObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASResponseFormatJsonObject responseFormatJsonObject1 = OASResponseFormatJsonObject.getExample();
        OASResponseFormatJsonObject responseFormatJsonObject2 = responseFormatJsonObject1;
        OASResponseFormatJsonObject responseFormatJsonObject3 = new OASResponseFormatJsonObject();
        OASResponseFormatJsonObject responseFormatJsonObject4 = responseFormatJsonObject3;

        System.assert(responseFormatJsonObject1.equals(responseFormatJsonObject2));
        System.assert(responseFormatJsonObject2.equals(responseFormatJsonObject1));
        System.assert(responseFormatJsonObject1.equals(responseFormatJsonObject1));
        System.assert(responseFormatJsonObject3.equals(responseFormatJsonObject4));
        System.assert(responseFormatJsonObject4.equals(responseFormatJsonObject3));
        System.assert(responseFormatJsonObject3.equals(responseFormatJsonObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASResponseFormatJsonObject responseFormatJsonObject1 = OASResponseFormatJsonObject.getExample();
        OASResponseFormatJsonObject responseFormatJsonObject2 = OASResponseFormatJsonObject.getExample();
        OASResponseFormatJsonObject responseFormatJsonObject3 = new OASResponseFormatJsonObject();
        OASResponseFormatJsonObject responseFormatJsonObject4 = new OASResponseFormatJsonObject();

        System.assert(responseFormatJsonObject1.equals(responseFormatJsonObject2));
        System.assert(responseFormatJsonObject2.equals(responseFormatJsonObject1));
        System.assert(responseFormatJsonObject3.equals(responseFormatJsonObject4));
        System.assert(responseFormatJsonObject4.equals(responseFormatJsonObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASResponseFormatJsonObject responseFormatJsonObject1 = OASResponseFormatJsonObject.getExample();
        OASResponseFormatJsonObject responseFormatJsonObject2 = new OASResponseFormatJsonObject();

        System.assertEquals(false, responseFormatJsonObject1.equals('foo'));
        System.assertEquals(false, responseFormatJsonObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASResponseFormatJsonObject responseFormatJsonObject1 = OASResponseFormatJsonObject.getExample();
        OASResponseFormatJsonObject responseFormatJsonObject2 = new OASResponseFormatJsonObject();
        OASResponseFormatJsonObject responseFormatJsonObject3;

        System.assertEquals(false, responseFormatJsonObject1.equals(responseFormatJsonObject3));
        System.assertEquals(false, responseFormatJsonObject2.equals(responseFormatJsonObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASResponseFormatJsonObject responseFormatJsonObject1 = OASResponseFormatJsonObject.getExample();
        OASResponseFormatJsonObject responseFormatJsonObject2 = new OASResponseFormatJsonObject();

        System.assertEquals(responseFormatJsonObject1.hashCode(), responseFormatJsonObject1.hashCode());
        System.assertEquals(responseFormatJsonObject2.hashCode(), responseFormatJsonObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASResponseFormatJsonObject responseFormatJsonObject1 = OASResponseFormatJsonObject.getExample();
        OASResponseFormatJsonObject responseFormatJsonObject2 = OASResponseFormatJsonObject.getExample();
        OASResponseFormatJsonObject responseFormatJsonObject3 = new OASResponseFormatJsonObject();
        OASResponseFormatJsonObject responseFormatJsonObject4 = new OASResponseFormatJsonObject();

        System.assert(responseFormatJsonObject1.equals(responseFormatJsonObject2));
        System.assert(responseFormatJsonObject3.equals(responseFormatJsonObject4));
        System.assertEquals(responseFormatJsonObject1.hashCode(), responseFormatJsonObject2.hashCode());
        System.assertEquals(responseFormatJsonObject3.hashCode(), responseFormatJsonObject4.hashCode());
    }
}
