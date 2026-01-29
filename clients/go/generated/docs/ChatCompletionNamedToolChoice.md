# ChatCompletionNamedToolChoice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of the tool. Currently, only &#x60;function&#x60; is supported. | 
**Function** | [**ChatCompletionNamedToolChoiceFunction**](ChatCompletionNamedToolChoiceFunction.md) |  | 

## Methods

### NewChatCompletionNamedToolChoice

`func NewChatCompletionNamedToolChoice(type_ string, function ChatCompletionNamedToolChoiceFunction, ) *ChatCompletionNamedToolChoice`

NewChatCompletionNamedToolChoice instantiates a new ChatCompletionNamedToolChoice object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionNamedToolChoiceWithDefaults

`func NewChatCompletionNamedToolChoiceWithDefaults() *ChatCompletionNamedToolChoice`

NewChatCompletionNamedToolChoiceWithDefaults instantiates a new ChatCompletionNamedToolChoice object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *ChatCompletionNamedToolChoice) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ChatCompletionNamedToolChoice) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ChatCompletionNamedToolChoice) SetType(v string)`

SetType sets Type field to given value.


### GetFunction

`func (o *ChatCompletionNamedToolChoice) GetFunction() ChatCompletionNamedToolChoiceFunction`

GetFunction returns the Function field if non-nil, zero value otherwise.

### GetFunctionOk

`func (o *ChatCompletionNamedToolChoice) GetFunctionOk() (*ChatCompletionNamedToolChoiceFunction, bool)`

GetFunctionOk returns a tuple with the Function field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunction

`func (o *ChatCompletionNamedToolChoice) SetFunction(v ChatCompletionNamedToolChoiceFunction)`

SetFunction sets Function field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


