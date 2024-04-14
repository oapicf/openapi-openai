# CreateCompletionResponseChoicesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FinishReason** | **string** | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters.  | 
**Index** | **int32** |  | 
**Logprobs** | [**NullableCreateCompletionResponseChoicesInnerLogprobs**](CreateCompletionResponseChoicesInnerLogprobs.md) |  | 
**Text** | **string** |  | 

## Methods

### NewCreateCompletionResponseChoicesInner

`func NewCreateCompletionResponseChoicesInner(finishReason string, index int32, logprobs NullableCreateCompletionResponseChoicesInnerLogprobs, text string, ) *CreateCompletionResponseChoicesInner`

NewCreateCompletionResponseChoicesInner instantiates a new CreateCompletionResponseChoicesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateCompletionResponseChoicesInnerWithDefaults

`func NewCreateCompletionResponseChoicesInnerWithDefaults() *CreateCompletionResponseChoicesInner`

NewCreateCompletionResponseChoicesInnerWithDefaults instantiates a new CreateCompletionResponseChoicesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFinishReason

`func (o *CreateCompletionResponseChoicesInner) GetFinishReason() string`

GetFinishReason returns the FinishReason field if non-nil, zero value otherwise.

### GetFinishReasonOk

`func (o *CreateCompletionResponseChoicesInner) GetFinishReasonOk() (*string, bool)`

GetFinishReasonOk returns a tuple with the FinishReason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFinishReason

`func (o *CreateCompletionResponseChoicesInner) SetFinishReason(v string)`

SetFinishReason sets FinishReason field to given value.


### GetIndex

`func (o *CreateCompletionResponseChoicesInner) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *CreateCompletionResponseChoicesInner) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *CreateCompletionResponseChoicesInner) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetLogprobs

`func (o *CreateCompletionResponseChoicesInner) GetLogprobs() CreateCompletionResponseChoicesInnerLogprobs`

GetLogprobs returns the Logprobs field if non-nil, zero value otherwise.

### GetLogprobsOk

`func (o *CreateCompletionResponseChoicesInner) GetLogprobsOk() (*CreateCompletionResponseChoicesInnerLogprobs, bool)`

GetLogprobsOk returns a tuple with the Logprobs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogprobs

`func (o *CreateCompletionResponseChoicesInner) SetLogprobs(v CreateCompletionResponseChoicesInnerLogprobs)`

SetLogprobs sets Logprobs field to given value.


### SetLogprobsNil

`func (o *CreateCompletionResponseChoicesInner) SetLogprobsNil(b bool)`

 SetLogprobsNil sets the value for Logprobs to be an explicit nil

### UnsetLogprobs
`func (o *CreateCompletionResponseChoicesInner) UnsetLogprobs()`

UnsetLogprobs ensures that no value is present for Logprobs, not even an explicit nil
### GetText

`func (o *CreateCompletionResponseChoicesInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *CreateCompletionResponseChoicesInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *CreateCompletionResponseChoicesInner) SetText(v string)`

SetText sets Text field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


