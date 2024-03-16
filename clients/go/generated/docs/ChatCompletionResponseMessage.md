# ChatCompletionResponseMessage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Role** | **string** | The role of the author of this message. | 
**Content** | Pointer to **NullableString** | The contents of the message. | [optional] 
**FunctionCall** | Pointer to [**ChatCompletionRequestMessageFunctionCall**](ChatCompletionRequestMessageFunctionCall.md) |  | [optional] 

## Methods

### NewChatCompletionResponseMessage

`func NewChatCompletionResponseMessage(role string, ) *ChatCompletionResponseMessage`

NewChatCompletionResponseMessage instantiates a new ChatCompletionResponseMessage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionResponseMessageWithDefaults

`func NewChatCompletionResponseMessageWithDefaults() *ChatCompletionResponseMessage`

NewChatCompletionResponseMessageWithDefaults instantiates a new ChatCompletionResponseMessage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRole

`func (o *ChatCompletionResponseMessage) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *ChatCompletionResponseMessage) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *ChatCompletionResponseMessage) SetRole(v string)`

SetRole sets Role field to given value.


### GetContent

`func (o *ChatCompletionResponseMessage) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *ChatCompletionResponseMessage) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *ChatCompletionResponseMessage) SetContent(v string)`

SetContent sets Content field to given value.

### HasContent

`func (o *ChatCompletionResponseMessage) HasContent() bool`

HasContent returns a boolean if a field has been set.

### SetContentNil

`func (o *ChatCompletionResponseMessage) SetContentNil(b bool)`

 SetContentNil sets the value for Content to be an explicit nil

### UnsetContent
`func (o *ChatCompletionResponseMessage) UnsetContent()`

UnsetContent ensures that no value is present for Content, not even an explicit nil
### GetFunctionCall

`func (o *ChatCompletionResponseMessage) GetFunctionCall() ChatCompletionRequestMessageFunctionCall`

GetFunctionCall returns the FunctionCall field if non-nil, zero value otherwise.

### GetFunctionCallOk

`func (o *ChatCompletionResponseMessage) GetFunctionCallOk() (*ChatCompletionRequestMessageFunctionCall, bool)`

GetFunctionCallOk returns a tuple with the FunctionCall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunctionCall

`func (o *ChatCompletionResponseMessage) SetFunctionCall(v ChatCompletionRequestMessageFunctionCall)`

SetFunctionCall sets FunctionCall field to given value.

### HasFunctionCall

`func (o *ChatCompletionResponseMessage) HasFunctionCall() bool`

HasFunctionCall returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


