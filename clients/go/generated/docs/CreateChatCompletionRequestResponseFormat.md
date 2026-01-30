# CreateChatCompletionRequestResponseFormat

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of response format being defined: &#x60;text&#x60; | 
**JsonSchema** | [**ResponseFormatJsonSchemaJsonSchema**](ResponseFormatJsonSchemaJsonSchema.md) |  | 

## Methods

### NewCreateChatCompletionRequestResponseFormat

`func NewCreateChatCompletionRequestResponseFormat(type_ string, jsonSchema ResponseFormatJsonSchemaJsonSchema, ) *CreateChatCompletionRequestResponseFormat`

NewCreateChatCompletionRequestResponseFormat instantiates a new CreateChatCompletionRequestResponseFormat object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateChatCompletionRequestResponseFormatWithDefaults

`func NewCreateChatCompletionRequestResponseFormatWithDefaults() *CreateChatCompletionRequestResponseFormat`

NewCreateChatCompletionRequestResponseFormatWithDefaults instantiates a new CreateChatCompletionRequestResponseFormat object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *CreateChatCompletionRequestResponseFormat) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CreateChatCompletionRequestResponseFormat) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CreateChatCompletionRequestResponseFormat) SetType(v string)`

SetType sets Type field to given value.


### GetJsonSchema

`func (o *CreateChatCompletionRequestResponseFormat) GetJsonSchema() ResponseFormatJsonSchemaJsonSchema`

GetJsonSchema returns the JsonSchema field if non-nil, zero value otherwise.

### GetJsonSchemaOk

`func (o *CreateChatCompletionRequestResponseFormat) GetJsonSchemaOk() (*ResponseFormatJsonSchemaJsonSchema, bool)`

GetJsonSchemaOk returns a tuple with the JsonSchema field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJsonSchema

`func (o *CreateChatCompletionRequestResponseFormat) SetJsonSchema(v ResponseFormatJsonSchemaJsonSchema)`

SetJsonSchema sets JsonSchema field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


