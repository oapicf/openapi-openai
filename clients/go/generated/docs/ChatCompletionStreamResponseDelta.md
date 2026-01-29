# ChatCompletionStreamResponseDelta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | Pointer to **NullableString** | The contents of the chunk message. | [optional] 
**FunctionCall** | Pointer to [**ChatCompletionStreamResponseDeltaFunctionCall**](ChatCompletionStreamResponseDeltaFunctionCall.md) |  | [optional] 
**ToolCalls** | Pointer to [**[]ChatCompletionMessageToolCallChunk**](ChatCompletionMessageToolCallChunk.md) |  | [optional] 
**Role** | Pointer to **string** | The role of the author of this message. | [optional] 

## Methods

### NewChatCompletionStreamResponseDelta

`func NewChatCompletionStreamResponseDelta() *ChatCompletionStreamResponseDelta`

NewChatCompletionStreamResponseDelta instantiates a new ChatCompletionStreamResponseDelta object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionStreamResponseDeltaWithDefaults

`func NewChatCompletionStreamResponseDeltaWithDefaults() *ChatCompletionStreamResponseDelta`

NewChatCompletionStreamResponseDeltaWithDefaults instantiates a new ChatCompletionStreamResponseDelta object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContent

`func (o *ChatCompletionStreamResponseDelta) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *ChatCompletionStreamResponseDelta) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *ChatCompletionStreamResponseDelta) SetContent(v string)`

SetContent sets Content field to given value.

### HasContent

`func (o *ChatCompletionStreamResponseDelta) HasContent() bool`

HasContent returns a boolean if a field has been set.

### SetContentNil

`func (o *ChatCompletionStreamResponseDelta) SetContentNil(b bool)`

 SetContentNil sets the value for Content to be an explicit nil

### UnsetContent
`func (o *ChatCompletionStreamResponseDelta) UnsetContent()`

UnsetContent ensures that no value is present for Content, not even an explicit nil
### GetFunctionCall

`func (o *ChatCompletionStreamResponseDelta) GetFunctionCall() ChatCompletionStreamResponseDeltaFunctionCall`

GetFunctionCall returns the FunctionCall field if non-nil, zero value otherwise.

### GetFunctionCallOk

`func (o *ChatCompletionStreamResponseDelta) GetFunctionCallOk() (*ChatCompletionStreamResponseDeltaFunctionCall, bool)`

GetFunctionCallOk returns a tuple with the FunctionCall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunctionCall

`func (o *ChatCompletionStreamResponseDelta) SetFunctionCall(v ChatCompletionStreamResponseDeltaFunctionCall)`

SetFunctionCall sets FunctionCall field to given value.

### HasFunctionCall

`func (o *ChatCompletionStreamResponseDelta) HasFunctionCall() bool`

HasFunctionCall returns a boolean if a field has been set.

### GetToolCalls

`func (o *ChatCompletionStreamResponseDelta) GetToolCalls() []ChatCompletionMessageToolCallChunk`

GetToolCalls returns the ToolCalls field if non-nil, zero value otherwise.

### GetToolCallsOk

`func (o *ChatCompletionStreamResponseDelta) GetToolCallsOk() (*[]ChatCompletionMessageToolCallChunk, bool)`

GetToolCallsOk returns a tuple with the ToolCalls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolCalls

`func (o *ChatCompletionStreamResponseDelta) SetToolCalls(v []ChatCompletionMessageToolCallChunk)`

SetToolCalls sets ToolCalls field to given value.

### HasToolCalls

`func (o *ChatCompletionStreamResponseDelta) HasToolCalls() bool`

HasToolCalls returns a boolean if a field has been set.

### GetRole

`func (o *ChatCompletionStreamResponseDelta) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *ChatCompletionStreamResponseDelta) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *ChatCompletionStreamResponseDelta) SetRole(v string)`

SetRole sets Role field to given value.

### HasRole

`func (o *ChatCompletionStreamResponseDelta) HasRole() bool`

HasRole returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


