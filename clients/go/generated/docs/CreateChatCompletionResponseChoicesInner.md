# CreateChatCompletionResponseChoicesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | Pointer to **int32** |  | [optional] 
**Message** | Pointer to [**ChatCompletionResponseMessage**](ChatCompletionResponseMessage.md) |  | [optional] 
**FinishReason** | Pointer to **string** |  | [optional] 

## Methods

### NewCreateChatCompletionResponseChoicesInner

`func NewCreateChatCompletionResponseChoicesInner() *CreateChatCompletionResponseChoicesInner`

NewCreateChatCompletionResponseChoicesInner instantiates a new CreateChatCompletionResponseChoicesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateChatCompletionResponseChoicesInnerWithDefaults

`func NewCreateChatCompletionResponseChoicesInnerWithDefaults() *CreateChatCompletionResponseChoicesInner`

NewCreateChatCompletionResponseChoicesInnerWithDefaults instantiates a new CreateChatCompletionResponseChoicesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

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

### HasIndex

`func (o *CreateChatCompletionResponseChoicesInner) HasIndex() bool`

HasIndex returns a boolean if a field has been set.

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

### HasMessage

`func (o *CreateChatCompletionResponseChoicesInner) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

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

### HasFinishReason

`func (o *CreateChatCompletionResponseChoicesInner) HasFinishReason() bool`

HasFinishReason returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


