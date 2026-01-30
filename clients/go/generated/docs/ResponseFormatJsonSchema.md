# ResponseFormatJsonSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of response format being defined: &#x60;json_schema&#x60; | 
**JsonSchema** | [**ResponseFormatJsonSchemaJsonSchema**](ResponseFormatJsonSchemaJsonSchema.md) |  | 

## Methods

### NewResponseFormatJsonSchema

`func NewResponseFormatJsonSchema(type_ string, jsonSchema ResponseFormatJsonSchemaJsonSchema, ) *ResponseFormatJsonSchema`

NewResponseFormatJsonSchema instantiates a new ResponseFormatJsonSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewResponseFormatJsonSchemaWithDefaults

`func NewResponseFormatJsonSchemaWithDefaults() *ResponseFormatJsonSchema`

NewResponseFormatJsonSchemaWithDefaults instantiates a new ResponseFormatJsonSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *ResponseFormatJsonSchema) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ResponseFormatJsonSchema) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ResponseFormatJsonSchema) SetType(v string)`

SetType sets Type field to given value.


### GetJsonSchema

`func (o *ResponseFormatJsonSchema) GetJsonSchema() ResponseFormatJsonSchemaJsonSchema`

GetJsonSchema returns the JsonSchema field if non-nil, zero value otherwise.

### GetJsonSchemaOk

`func (o *ResponseFormatJsonSchema) GetJsonSchemaOk() (*ResponseFormatJsonSchemaJsonSchema, bool)`

GetJsonSchemaOk returns a tuple with the JsonSchema field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJsonSchema

`func (o *ResponseFormatJsonSchema) SetJsonSchema(v ResponseFormatJsonSchemaJsonSchema)`

SetJsonSchema sets JsonSchema field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


