# AssistantToolsFunction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of tool being defined: &#x60;function&#x60; | 
**Function** | [**FunctionObject**](FunctionObject.md) |  | 

## Methods

### NewAssistantToolsFunction

`func NewAssistantToolsFunction(type_ string, function FunctionObject, ) *AssistantToolsFunction`

NewAssistantToolsFunction instantiates a new AssistantToolsFunction object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssistantToolsFunctionWithDefaults

`func NewAssistantToolsFunctionWithDefaults() *AssistantToolsFunction`

NewAssistantToolsFunctionWithDefaults instantiates a new AssistantToolsFunction object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *AssistantToolsFunction) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AssistantToolsFunction) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AssistantToolsFunction) SetType(v string)`

SetType sets Type field to given value.


### GetFunction

`func (o *AssistantToolsFunction) GetFunction() FunctionObject`

GetFunction returns the Function field if non-nil, zero value otherwise.

### GetFunctionOk

`func (o *AssistantToolsFunction) GetFunctionOk() (*FunctionObject, bool)`

GetFunctionOk returns a tuple with the Function field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunction

`func (o *AssistantToolsFunction) SetFunction(v FunctionObject)`

SetFunction sets Function field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


