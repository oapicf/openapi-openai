@isTest
private class OASResponseFormatJsonSchemaTest {
    @isTest
    private static void equalsSameInstance() {
        OASResponseFormatJsonSchema responseFormatJsonSchema1 = OASResponseFormatJsonSchema.getExample();
        OASResponseFormatJsonSchema responseFormatJsonSchema2 = responseFormatJsonSchema1;
        OASResponseFormatJsonSchema responseFormatJsonSchema3 = new OASResponseFormatJsonSchema();
        OASResponseFormatJsonSchema responseFormatJsonSchema4 = responseFormatJsonSchema3;

        System.assert(responseFormatJsonSchema1.equals(responseFormatJsonSchema2));
        System.assert(responseFormatJsonSchema2.equals(responseFormatJsonSchema1));
        System.assert(responseFormatJsonSchema1.equals(responseFormatJsonSchema1));
        System.assert(responseFormatJsonSchema3.equals(responseFormatJsonSchema4));
        System.assert(responseFormatJsonSchema4.equals(responseFormatJsonSchema3));
        System.assert(responseFormatJsonSchema3.equals(responseFormatJsonSchema3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASResponseFormatJsonSchema responseFormatJsonSchema1 = OASResponseFormatJsonSchema.getExample();
        OASResponseFormatJsonSchema responseFormatJsonSchema2 = OASResponseFormatJsonSchema.getExample();
        OASResponseFormatJsonSchema responseFormatJsonSchema3 = new OASResponseFormatJsonSchema();
        OASResponseFormatJsonSchema responseFormatJsonSchema4 = new OASResponseFormatJsonSchema();

        System.assert(responseFormatJsonSchema1.equals(responseFormatJsonSchema2));
        System.assert(responseFormatJsonSchema2.equals(responseFormatJsonSchema1));
        System.assert(responseFormatJsonSchema3.equals(responseFormatJsonSchema4));
        System.assert(responseFormatJsonSchema4.equals(responseFormatJsonSchema3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASResponseFormatJsonSchema responseFormatJsonSchema1 = OASResponseFormatJsonSchema.getExample();
        OASResponseFormatJsonSchema responseFormatJsonSchema2 = new OASResponseFormatJsonSchema();

        System.assertEquals(false, responseFormatJsonSchema1.equals('foo'));
        System.assertEquals(false, responseFormatJsonSchema2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASResponseFormatJsonSchema responseFormatJsonSchema1 = OASResponseFormatJsonSchema.getExample();
        OASResponseFormatJsonSchema responseFormatJsonSchema2 = new OASResponseFormatJsonSchema();
        OASResponseFormatJsonSchema responseFormatJsonSchema3;

        System.assertEquals(false, responseFormatJsonSchema1.equals(responseFormatJsonSchema3));
        System.assertEquals(false, responseFormatJsonSchema2.equals(responseFormatJsonSchema3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASResponseFormatJsonSchema responseFormatJsonSchema1 = OASResponseFormatJsonSchema.getExample();
        OASResponseFormatJsonSchema responseFormatJsonSchema2 = new OASResponseFormatJsonSchema();

        System.assertEquals(responseFormatJsonSchema1.hashCode(), responseFormatJsonSchema1.hashCode());
        System.assertEquals(responseFormatJsonSchema2.hashCode(), responseFormatJsonSchema2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASResponseFormatJsonSchema responseFormatJsonSchema1 = OASResponseFormatJsonSchema.getExample();
        OASResponseFormatJsonSchema responseFormatJsonSchema2 = OASResponseFormatJsonSchema.getExample();
        OASResponseFormatJsonSchema responseFormatJsonSchema3 = new OASResponseFormatJsonSchema();
        OASResponseFormatJsonSchema responseFormatJsonSchema4 = new OASResponseFormatJsonSchema();

        System.assert(responseFormatJsonSchema1.equals(responseFormatJsonSchema2));
        System.assert(responseFormatJsonSchema3.equals(responseFormatJsonSchema4));
        System.assertEquals(responseFormatJsonSchema1.hashCode(), responseFormatJsonSchema2.hashCode());
        System.assertEquals(responseFormatJsonSchema3.hashCode(), responseFormatJsonSchema4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASResponseFormatJsonSchema responseFormatJsonSchema = new OASResponseFormatJsonSchema();
        Map<String, String> x-property-mappings = responseFormatJsonSchema.getx-property-mappings();
        System.assertEquals('jsonSchema', x-property-mappings.get('json_schema'));
    }
}
