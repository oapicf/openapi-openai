# CreateChatCompletionStreamResponseChoicesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Delta** | [**ChatCompletionStreamResponseDelta**](ChatCompletionStreamResponseDelta.md) |  | 
**Logprobs** | Pointer to [**NullableCreateChatCompletionResponseChoicesInnerLogprobs**](CreateChatCompletionResponseChoicesInnerLogprobs.md) |  | [optional] 
**FinishReason** | **NullableString** | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function.  | 
**Index** | **int32** | The index of the choice in the list of choices. | 

## Methods

### NewCreateChatCompletionStreamResponseChoicesInner

`func NewCreateChatCompletionStreamResponseChoicesInner(delta ChatCompletionStreamResponseDelta, finishReason NullableString, index int32, ) *CreateChatCompletionStreamResponseChoicesInner`

NewCreateChatCompletionStreamResponseChoicesInner instantiates a new CreateChatCompletionStreamResponseChoicesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateChatCompletionStreamResponseChoicesInnerWithDefaults

`func NewCreateChatCompletionStreamResponseChoicesInnerWithDefaults() *CreateChatCompletionStreamResponseChoicesInner`

NewCreateChatCompletionStreamResponseChoicesInnerWithDefaults instantiates a new CreateChatCompletionStreamResponseChoicesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDelta

`func (o *CreateChatCompletionStreamResponseChoicesInner) GetDelta() ChatCompletionStreamResponseDelta`

GetDelta returns the Delta field if non-nil, zero value otherwise.

### GetDeltaOk

`func (o *CreateChatCompletionStreamResponseChoicesInner) GetDeltaOk() (*ChatCompletionStreamResponseDelta, bool)`

GetDeltaOk returns a tuple with the Delta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDelta

`func (o *CreateChatCompletionStreamResponseChoicesInner) SetDelta(v ChatCompletionStreamResponseDelta)`

SetDelta sets Delta field to given value.


### GetLogprobs

`func (o *CreateChatCompletionStreamResponseChoicesInner) GetLogprobs() CreateChatCompletionResponseChoicesInnerLogprobs`

GetLogprobs returns the Logprobs field if non-nil, zero value otherwise.

### GetLogprobsOk

`func (o *CreateChatCompletionStreamResponseChoicesInner) GetLogprobsOk() (*CreateChatCompletionResponseChoicesInnerLogprobs, bool)`

GetLogprobsOk returns a tuple with the Logprobs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogprobs

`func (o *CreateChatCompletionStreamResponseChoicesInner) SetLogprobs(v CreateChatCompletionResponseChoicesInnerLogprobs)`

SetLogprobs sets Logprobs field to given value.

### HasLogprobs

`func (o *CreateChatCompletionStreamResponseChoicesInner) HasLogprobs() bool`

HasLogprobs returns a boolean if a field has been set.

### SetLogprobsNil

`func (o *CreateChatCompletionStreamResponseChoicesInner) SetLogprobsNil(b bool)`

 SetLogprobsNil sets the value for Logprobs to be an explicit nil

### UnsetLogprobs
`func (o *CreateChatCompletionStreamResponseChoicesInner) UnsetLogprobs()`

UnsetLogprobs ensures that no value is present for Logprobs, not even an explicit nil
### GetFinishReason

`func (o *CreateChatCompletionStreamResponseChoicesInner) GetFinishReason() string`

GetFinishReason returns the FinishReason field if non-nil, zero value otherwise.

### GetFinishReasonOk

`func (o *CreateChatCompletionStreamResponseChoicesInner) GetFinishReasonOk() (*string, bool)`

GetFinishReasonOk returns a tuple with the FinishReason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFinishReason

`func (o *CreateChatCompletionStreamResponseChoicesInner) SetFinishReason(v string)`

SetFinishReason sets FinishReason field to given value.


### SetFinishReasonNil

`func (o *CreateChatCompletionStreamResponseChoicesInner) SetFinishReasonNil(b bool)`

 SetFinishReasonNil sets the value for FinishReason to be an explicit nil

### UnsetFinishReason
`func (o *CreateChatCompletionStreamResponseChoicesInner) UnsetFinishReason()`

UnsetFinishReason ensures that no value is present for FinishReason, not even an explicit nil
### GetIndex

`func (o *CreateChatCompletionStreamResponseChoicesInner) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *CreateChatCompletionStreamResponseChoicesInner) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *CreateChatCompletionStreamResponseChoicesInner) SetIndex(v int32)`

SetIndex sets Index field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


