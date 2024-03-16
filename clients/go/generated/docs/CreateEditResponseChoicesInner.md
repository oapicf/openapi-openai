# CreateEditResponseChoicesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Text** | Pointer to **string** |  | [optional] 
**Index** | Pointer to **int32** |  | [optional] 
**Logprobs** | Pointer to [**NullableCreateCompletionResponseChoicesInnerLogprobs**](CreateCompletionResponseChoicesInnerLogprobs.md) |  | [optional] 
**FinishReason** | Pointer to **string** |  | [optional] 

## Methods

### NewCreateEditResponseChoicesInner

`func NewCreateEditResponseChoicesInner() *CreateEditResponseChoicesInner`

NewCreateEditResponseChoicesInner instantiates a new CreateEditResponseChoicesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateEditResponseChoicesInnerWithDefaults

`func NewCreateEditResponseChoicesInnerWithDefaults() *CreateEditResponseChoicesInner`

NewCreateEditResponseChoicesInnerWithDefaults instantiates a new CreateEditResponseChoicesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetText

`func (o *CreateEditResponseChoicesInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *CreateEditResponseChoicesInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *CreateEditResponseChoicesInner) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *CreateEditResponseChoicesInner) HasText() bool`

HasText returns a boolean if a field has been set.

### GetIndex

`func (o *CreateEditResponseChoicesInner) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *CreateEditResponseChoicesInner) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *CreateEditResponseChoicesInner) SetIndex(v int32)`

SetIndex sets Index field to given value.

### HasIndex

`func (o *CreateEditResponseChoicesInner) HasIndex() bool`

HasIndex returns a boolean if a field has been set.

### GetLogprobs

`func (o *CreateEditResponseChoicesInner) GetLogprobs() CreateCompletionResponseChoicesInnerLogprobs`

GetLogprobs returns the Logprobs field if non-nil, zero value otherwise.

### GetLogprobsOk

`func (o *CreateEditResponseChoicesInner) GetLogprobsOk() (*CreateCompletionResponseChoicesInnerLogprobs, bool)`

GetLogprobsOk returns a tuple with the Logprobs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogprobs

`func (o *CreateEditResponseChoicesInner) SetLogprobs(v CreateCompletionResponseChoicesInnerLogprobs)`

SetLogprobs sets Logprobs field to given value.

### HasLogprobs

`func (o *CreateEditResponseChoicesInner) HasLogprobs() bool`

HasLogprobs returns a boolean if a field has been set.

### SetLogprobsNil

`func (o *CreateEditResponseChoicesInner) SetLogprobsNil(b bool)`

 SetLogprobsNil sets the value for Logprobs to be an explicit nil

### UnsetLogprobs
`func (o *CreateEditResponseChoicesInner) UnsetLogprobs()`

UnsetLogprobs ensures that no value is present for Logprobs, not even an explicit nil
### GetFinishReason

`func (o *CreateEditResponseChoicesInner) GetFinishReason() string`

GetFinishReason returns the FinishReason field if non-nil, zero value otherwise.

### GetFinishReasonOk

`func (o *CreateEditResponseChoicesInner) GetFinishReasonOk() (*string, bool)`

GetFinishReasonOk returns a tuple with the FinishReason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFinishReason

`func (o *CreateEditResponseChoicesInner) SetFinishReason(v string)`

SetFinishReason sets FinishReason field to given value.

### HasFinishReason

`func (o *CreateEditResponseChoicesInner) HasFinishReason() bool`

HasFinishReason returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


