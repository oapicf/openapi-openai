# ChatCompletionRequestFunctionMessage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Role** | **string** | The role of the messages author, in this case &#x60;function&#x60;. | 
**Content** | **NullableString** | The contents of the function message. | 
**Name** | **string** | The name of the function to call. | 

## Methods

### NewChatCompletionRequestFunctionMessage

`func NewChatCompletionRequestFunctionMessage(role string, content NullableString, name string, ) *ChatCompletionRequestFunctionMessage`

NewChatCompletionRequestFunctionMessage instantiates a new ChatCompletionRequestFunctionMessage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionRequestFunctionMessageWithDefaults

`func NewChatCompletionRequestFunctionMessageWithDefaults() *ChatCompletionRequestFunctionMessage`

NewChatCompletionRequestFunctionMessageWithDefaults instantiates a new ChatCompletionRequestFunctionMessage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRole

`func (o *ChatCompletionRequestFunctionMessage) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *ChatCompletionRequestFunctionMessage) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *ChatCompletionRequestFunctionMessage) SetRole(v string)`

SetRole sets Role field to given value.


### GetContent

`func (o *ChatCompletionRequestFunctionMessage) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *ChatCompletionRequestFunctionMessage) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *ChatCompletionRequestFunctionMessage) SetContent(v string)`

SetContent sets Content field to given value.


### SetContentNil

`func (o *ChatCompletionRequestFunctionMessage) SetContentNil(b bool)`

 SetContentNil sets the value for Content to be an explicit nil

### UnsetContent
`func (o *ChatCompletionRequestFunctionMessage) UnsetContent()`

UnsetContent ensures that no value is present for Content, not even an explicit nil
### GetName

`func (o *ChatCompletionRequestFunctionMessage) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ChatCompletionRequestFunctionMessage) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ChatCompletionRequestFunctionMessage) SetName(v string)`

SetName sets Name field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


