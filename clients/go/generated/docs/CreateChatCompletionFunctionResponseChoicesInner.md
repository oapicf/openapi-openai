# CreateChatCompletionFunctionResponseChoicesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FinishReason** | **string** | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, or &#x60;function_call&#x60; if the model called a function.  | 
**Index** | **int32** | The index of the choice in the list of choices. | 
**Message** | [**ChatCompletionResponseMessage**](ChatCompletionResponseMessage.md) |  | 

## Methods

### NewCreateChatCompletionFunctionResponseChoicesInner

`func NewCreateChatCompletionFunctionResponseChoicesInner(finishReason string, index int32, message ChatCompletionResponseMessage, ) *CreateChatCompletionFunctionResponseChoicesInner`

NewCreateChatCompletionFunctionResponseChoicesInner instantiates a new CreateChatCompletionFunctionResponseChoicesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateChatCompletionFunctionResponseChoicesInnerWithDefaults

`func NewCreateChatCompletionFunctionResponseChoicesInnerWithDefaults() *CreateChatCompletionFunctionResponseChoicesInner`

NewCreateChatCompletionFunctionResponseChoicesInnerWithDefaults instantiates a new CreateChatCompletionFunctionResponseChoicesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFinishReason

`func (o *CreateChatCompletionFunctionResponseChoicesInner) GetFinishReason() string`

GetFinishReason returns the FinishReason field if non-nil, zero value otherwise.

### GetFinishReasonOk

`func (o *CreateChatCompletionFunctionResponseChoicesInner) GetFinishReasonOk() (*string, bool)`

GetFinishReasonOk returns a tuple with the FinishReason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFinishReason

`func (o *CreateChatCompletionFunctionResponseChoicesInner) SetFinishReason(v string)`

SetFinishReason sets FinishReason field to given value.


### GetIndex

`func (o *CreateChatCompletionFunctionResponseChoicesInner) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *CreateChatCompletionFunctionResponseChoicesInner) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *CreateChatCompletionFunctionResponseChoicesInner) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetMessage

`func (o *CreateChatCompletionFunctionResponseChoicesInner) GetMessage() ChatCompletionResponseMessage`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *CreateChatCompletionFunctionResponseChoicesInner) GetMessageOk() (*ChatCompletionResponseMessage, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *CreateChatCompletionFunctionResponseChoicesInner) SetMessage(v ChatCompletionResponseMessage)`

SetMessage sets Message field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


