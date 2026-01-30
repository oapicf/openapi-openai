# ChatCompletionFunctions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **string** | A description of what the function does, used by the model to choose when and how to call the function. | [optional] 
**Name** | **string** | The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. | 
**Parameters** | Pointer to **map[string]interface{}** | The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list. | [optional] 

## Methods

### NewChatCompletionFunctions

`func NewChatCompletionFunctions(name string, ) *ChatCompletionFunctions`

NewChatCompletionFunctions instantiates a new ChatCompletionFunctions object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionFunctionsWithDefaults

`func NewChatCompletionFunctionsWithDefaults() *ChatCompletionFunctions`

NewChatCompletionFunctionsWithDefaults instantiates a new ChatCompletionFunctions object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *ChatCompletionFunctions) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ChatCompletionFunctions) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ChatCompletionFunctions) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ChatCompletionFunctions) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetName

`func (o *ChatCompletionFunctions) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ChatCompletionFunctions) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ChatCompletionFunctions) SetName(v string)`

SetName sets Name field to given value.


### GetParameters

`func (o *ChatCompletionFunctions) GetParameters() map[string]interface{}`

GetParameters returns the Parameters field if non-nil, zero value otherwise.

### GetParametersOk

`func (o *ChatCompletionFunctions) GetParametersOk() (*map[string]interface{}, bool)`

GetParametersOk returns a tuple with the Parameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParameters

`func (o *ChatCompletionFunctions) SetParameters(v map[string]interface{})`

SetParameters sets Parameters field to given value.

### HasParameters

`func (o *ChatCompletionFunctions) HasParameters() bool`

HasParameters returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


