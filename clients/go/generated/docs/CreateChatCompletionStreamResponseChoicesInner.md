# CreateChatCompletionStreamResponseChoicesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | Pointer to **int32** |  | [optional] 
**Delta** | Pointer to [**ChatCompletionStreamResponseDelta**](ChatCompletionStreamResponseDelta.md) |  | [optional] 
**FinishReason** | Pointer to **string** |  | [optional] 

## Methods

### NewCreateChatCompletionStreamResponseChoicesInner

`func NewCreateChatCompletionStreamResponseChoicesInner() *CreateChatCompletionStreamResponseChoicesInner`

NewCreateChatCompletionStreamResponseChoicesInner instantiates a new CreateChatCompletionStreamResponseChoicesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateChatCompletionStreamResponseChoicesInnerWithDefaults

`func NewCreateChatCompletionStreamResponseChoicesInnerWithDefaults() *CreateChatCompletionStreamResponseChoicesInner`

NewCreateChatCompletionStreamResponseChoicesInnerWithDefaults instantiates a new CreateChatCompletionStreamResponseChoicesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

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

### HasIndex

`func (o *CreateChatCompletionStreamResponseChoicesInner) HasIndex() bool`

HasIndex returns a boolean if a field has been set.

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

### HasDelta

`func (o *CreateChatCompletionStreamResponseChoicesInner) HasDelta() bool`

HasDelta returns a boolean if a field has been set.

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

### HasFinishReason

`func (o *CreateChatCompletionStreamResponseChoicesInner) HasFinishReason() bool`

HasFinishReason returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


