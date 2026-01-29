# CreateChatCompletionResponseChoicesInnerLogprobs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | [**[]ChatCompletionTokenLogprob**](ChatCompletionTokenLogprob.md) | A list of message content tokens with log probability information. | 

## Methods

### NewCreateChatCompletionResponseChoicesInnerLogprobs

`func NewCreateChatCompletionResponseChoicesInnerLogprobs(content []ChatCompletionTokenLogprob, ) *CreateChatCompletionResponseChoicesInnerLogprobs`

NewCreateChatCompletionResponseChoicesInnerLogprobs instantiates a new CreateChatCompletionResponseChoicesInnerLogprobs object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateChatCompletionResponseChoicesInnerLogprobsWithDefaults

`func NewCreateChatCompletionResponseChoicesInnerLogprobsWithDefaults() *CreateChatCompletionResponseChoicesInnerLogprobs`

NewCreateChatCompletionResponseChoicesInnerLogprobsWithDefaults instantiates a new CreateChatCompletionResponseChoicesInnerLogprobs object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContent

`func (o *CreateChatCompletionResponseChoicesInnerLogprobs) GetContent() []ChatCompletionTokenLogprob`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *CreateChatCompletionResponseChoicesInnerLogprobs) GetContentOk() (*[]ChatCompletionTokenLogprob, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *CreateChatCompletionResponseChoicesInnerLogprobs) SetContent(v []ChatCompletionTokenLogprob)`

SetContent sets Content field to given value.


### SetContentNil

`func (o *CreateChatCompletionResponseChoicesInnerLogprobs) SetContentNil(b bool)`

 SetContentNil sets the value for Content to be an explicit nil

### UnsetContent
`func (o *CreateChatCompletionResponseChoicesInnerLogprobs) UnsetContent()`

UnsetContent ensures that no value is present for Content, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


