@isTest
private class OASResponseFormatJsonSchemaJsonSchemTest {
    @isTest
    private static void equalsSameInstance() {
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema1 = OASResponseFormatJsonSchemaJsonSchem.getExample();
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema2 = responseFormatJsonSchemaJsonSchema1;
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema3 = new OASResponseFormatJsonSchemaJsonSchem();
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema4 = responseFormatJsonSchemaJsonSchema3;

        System.assert(responseFormatJsonSchemaJsonSchema1.equals(responseFormatJsonSchemaJsonSchema2));
        System.assert(responseFormatJsonSchemaJsonSchema2.equals(responseFormatJsonSchemaJsonSchema1));
        System.assert(responseFormatJsonSchemaJsonSchema1.equals(responseFormatJsonSchemaJsonSchema1));
        System.assert(responseFormatJsonSchemaJsonSchema3.equals(responseFormatJsonSchemaJsonSchema4));
        System.assert(responseFormatJsonSchemaJsonSchema4.equals(responseFormatJsonSchemaJsonSchema3));
        System.assert(responseFormatJsonSchemaJsonSchema3.equals(responseFormatJsonSchemaJsonSchema3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema1 = OASResponseFormatJsonSchemaJsonSchem.getExample();
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema2 = OASResponseFormatJsonSchemaJsonSchem.getExample();
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema3 = new OASResponseFormatJsonSchemaJsonSchem();
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema4 = new OASResponseFormatJsonSchemaJsonSchem();

        System.assert(responseFormatJsonSchemaJsonSchema1.equals(responseFormatJsonSchemaJsonSchema2));
        System.assert(responseFormatJsonSchemaJsonSchema2.equals(responseFormatJsonSchemaJsonSchema1));
        System.assert(responseFormatJsonSchemaJsonSchema3.equals(responseFormatJsonSchemaJsonSchema4));
        System.assert(responseFormatJsonSchemaJsonSchema4.equals(responseFormatJsonSchemaJsonSchema3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema1 = OASResponseFormatJsonSchemaJsonSchem.getExample();
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema2 = new OASResponseFormatJsonSchemaJsonSchem();

        System.assertEquals(false, responseFormatJsonSchemaJsonSchema1.equals('foo'));
        System.assertEquals(false, responseFormatJsonSchemaJsonSchema2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema1 = OASResponseFormatJsonSchemaJsonSchem.getExample();
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema2 = new OASResponseFormatJsonSchemaJsonSchem();
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema3;

        System.assertEquals(false, responseFormatJsonSchemaJsonSchema1.equals(responseFormatJsonSchemaJsonSchema3));
        System.assertEquals(false, responseFormatJsonSchemaJsonSchema2.equals(responseFormatJsonSchemaJsonSchema3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema1 = OASResponseFormatJsonSchemaJsonSchem.getExample();
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema2 = new OASResponseFormatJsonSchemaJsonSchem();

        System.assertEquals(responseFormatJsonSchemaJsonSchema1.hashCode(), responseFormatJsonSchemaJsonSchema1.hashCode());
        System.assertEquals(responseFormatJsonSchemaJsonSchema2.hashCode(), responseFormatJsonSchemaJsonSchema2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema1 = OASResponseFormatJsonSchemaJsonSchem.getExample();
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema2 = OASResponseFormatJsonSchemaJsonSchem.getExample();
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema3 = new OASResponseFormatJsonSchemaJsonSchem();
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema4 = new OASResponseFormatJsonSchemaJsonSchem();

        System.assert(responseFormatJsonSchemaJsonSchema1.equals(responseFormatJsonSchemaJsonSchema2));
        System.assert(responseFormatJsonSchemaJsonSchema3.equals(responseFormatJsonSchemaJsonSchema4));
        System.assertEquals(responseFormatJsonSchemaJsonSchema1.hashCode(), responseFormatJsonSchemaJsonSchema2.hashCode());
        System.assertEquals(responseFormatJsonSchemaJsonSchema3.hashCode(), responseFormatJsonSchemaJsonSchema4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASResponseFormatJsonSchemaJsonSchem responseFormatJsonSchemaJsonSchema = new OASResponseFormatJsonSchemaJsonSchem();
        System.assertEquals(new Map<String, oas_any_type_not_mapped>(), responseFormatJsonSchemaJsonSchema.schema);
        System.assertEquals(false, responseFormatJsonSchemaJsonSchema.strict);
        System.assertEquals(null, responseFormatJsonSchemaJsonSchema.description);
        System.assertEquals(null, responseFormatJsonSchemaJsonSchema.name);
    }
}
