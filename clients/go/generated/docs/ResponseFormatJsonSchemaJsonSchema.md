# ResponseFormatJsonSchemaJsonSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **string** | A description of what the response format is for, used by the model to determine how to respond in the format. | [optional] 
**Name** | **string** | The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. | 
**Schema** | Pointer to **map[string]interface{}** | The schema for the response format, described as a JSON Schema object. | [optional] 
**Strict** | Pointer to **NullableBool** | Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the &#x60;schema&#x60; field. Only a subset of JSON Schema is supported when &#x60;strict&#x60; is &#x60;true&#x60;. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs). | [optional] [default to false]

## Methods

### NewResponseFormatJsonSchemaJsonSchema

`func NewResponseFormatJsonSchemaJsonSchema(name string, ) *ResponseFormatJsonSchemaJsonSchema`

NewResponseFormatJsonSchemaJsonSchema instantiates a new ResponseFormatJsonSchemaJsonSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewResponseFormatJsonSchemaJsonSchemaWithDefaults

`func NewResponseFormatJsonSchemaJsonSchemaWithDefaults() *ResponseFormatJsonSchemaJsonSchema`

NewResponseFormatJsonSchemaJsonSchemaWithDefaults instantiates a new ResponseFormatJsonSchemaJsonSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *ResponseFormatJsonSchemaJsonSchema) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ResponseFormatJsonSchemaJsonSchema) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ResponseFormatJsonSchemaJsonSchema) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ResponseFormatJsonSchemaJsonSchema) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetName

`func (o *ResponseFormatJsonSchemaJsonSchema) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ResponseFormatJsonSchemaJsonSchema) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ResponseFormatJsonSchemaJsonSchema) SetName(v string)`

SetName sets Name field to given value.


### GetSchema

`func (o *ResponseFormatJsonSchemaJsonSchema) GetSchema() map[string]interface{}`

GetSchema returns the Schema field if non-nil, zero value otherwise.

### GetSchemaOk

`func (o *ResponseFormatJsonSchemaJsonSchema) GetSchemaOk() (*map[string]interface{}, bool)`

GetSchemaOk returns a tuple with the Schema field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSchema

`func (o *ResponseFormatJsonSchemaJsonSchema) SetSchema(v map[string]interface{})`

SetSchema sets Schema field to given value.

### HasSchema

`func (o *ResponseFormatJsonSchemaJsonSchema) HasSchema() bool`

HasSchema returns a boolean if a field has been set.

### GetStrict

`func (o *ResponseFormatJsonSchemaJsonSchema) GetStrict() bool`

GetStrict returns the Strict field if non-nil, zero value otherwise.

### GetStrictOk

`func (o *ResponseFormatJsonSchemaJsonSchema) GetStrictOk() (*bool, bool)`

GetStrictOk returns a tuple with the Strict field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStrict

`func (o *ResponseFormatJsonSchemaJsonSchema) SetStrict(v bool)`

SetStrict sets Strict field to given value.

### HasStrict

`func (o *ResponseFormatJsonSchemaJsonSchema) HasStrict() bool`

HasStrict returns a boolean if a field has been set.

### SetStrictNil

`func (o *ResponseFormatJsonSchemaJsonSchema) SetStrictNil(b bool)`

 SetStrictNil sets the value for Strict to be an explicit nil

### UnsetStrict
`func (o *ResponseFormatJsonSchemaJsonSchema) UnsetStrict()`

UnsetStrict ensures that no value is present for Strict, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


