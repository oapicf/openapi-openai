# CreateChatCompletionResponseChoicesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FinishReason** | **string** | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function.  | 
**Index** | **int32** | The index of the choice in the list of choices. | 
**Message** | [**ChatCompletionResponseMessage**](ChatCompletionResponseMessage.md) |  | 
**Logprobs** | [**NullableCreateChatCompletionResponseChoicesInnerLogprobs**](CreateChatCompletionResponseChoicesInnerLogprobs.md) |  | 

## Methods

### NewCreateChatCompletionResponseChoicesInner

`func NewCreateChatCompletionResponseChoicesInner(finishReason string, index int32, message ChatCompletionResponseMessage, logprobs NullableCreateChatCompletionResponseChoicesInnerLogprobs, ) *CreateChatCompletionResponseChoicesInner`

NewCreateChatCompletionResponseChoicesInner instantiates a new CreateChatCompletionResponseChoicesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateChatCompletionResponseChoicesInnerWithDefaults

`func NewCreateChatCompletionResponseChoicesInnerWithDefaults() *CreateChatCompletionResponseChoicesInner`

NewCreateChatCompletionResponseChoicesInnerWithDefaults instantiates a new CreateChatCompletionResponseChoicesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFinishReason

`func (o *CreateChatCompletionResponseChoicesInner) GetFinishReason() string`

GetFinishReason returns the FinishReason field if non-nil, zero value otherwise.

### GetFinishReasonOk

`func (o *CreateChatCompletionResponseChoicesInner) GetFinishReasonOk() (*string, bool)`

GetFinishReasonOk returns a tuple with the FinishReason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFinishReason

`func (o *CreateChatCompletionResponseChoicesInner) SetFinishReason(v string)`

SetFinishReason sets FinishReason field to given value.


### GetIndex

`func (o *CreateChatCompletionResponseChoicesInner) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *CreateChatCompletionResponseChoicesInner) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *CreateChatCompletionResponseChoicesInner) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetMessage

`func (o *CreateChatCompletionResponseChoicesInner) GetMessage() ChatCompletionResponseMessage`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *CreateChatCompletionResponseChoicesInner) GetMessageOk() (*ChatCompletionResponseMessage, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *CreateChatCompletionResponseChoicesInner) SetMessage(v ChatCompletionResponseMessage)`

SetMessage sets Message field to given value.


### GetLogprobs

`func (o *CreateChatCompletionResponseChoicesInner) GetLogprobs() CreateChatCompletionResponseChoicesInnerLogprobs`

GetLogprobs returns the Logprobs field if non-nil, zero value otherwise.

### GetLogprobsOk

`func (o *CreateChatCompletionResponseChoicesInner) GetLogprobsOk() (*CreateChatCompletionResponseChoicesInnerLogprobs, bool)`

GetLogprobsOk returns a tuple with the Logprobs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogprobs

`func (o *CreateChatCompletionResponseChoicesInner) SetLogprobs(v CreateChatCompletionResponseChoicesInnerLogprobs)`

SetLogprobs sets Logprobs field to given value.


### SetLogprobsNil

`func (o *CreateChatCompletionResponseChoicesInner) SetLogprobsNil(b bool)`

 SetLogprobsNil sets the value for Logprobs to be an explicit nil

### UnsetLogprobs
`func (o *CreateChatCompletionResponseChoicesInner) UnsetLogprobs()`

UnsetLogprobs ensures that no value is present for Logprobs, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


