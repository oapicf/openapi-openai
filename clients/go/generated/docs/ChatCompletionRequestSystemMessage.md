# ChatCompletionRequestSystemMessage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | **string** | The contents of the system message. | 
**Role** | **string** | The role of the messages author, in this case &#x60;system&#x60;. | 
**Name** | Pointer to **string** | An optional name for the participant. Provides the model information to differentiate between participants of the same role. | [optional] 

## Methods

### NewChatCompletionRequestSystemMessage

`func NewChatCompletionRequestSystemMessage(content string, role string, ) *ChatCompletionRequestSystemMessage`

NewChatCompletionRequestSystemMessage instantiates a new ChatCompletionRequestSystemMessage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionRequestSystemMessageWithDefaults

`func NewChatCompletionRequestSystemMessageWithDefaults() *ChatCompletionRequestSystemMessage`

NewChatCompletionRequestSystemMessageWithDefaults instantiates a new ChatCompletionRequestSystemMessage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContent

`func (o *ChatCompletionRequestSystemMessage) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *ChatCompletionRequestSystemMessage) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *ChatCompletionRequestSystemMessage) SetContent(v string)`

SetContent sets Content field to given value.


### GetRole

`func (o *ChatCompletionRequestSystemMessage) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *ChatCompletionRequestSystemMessage) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *ChatCompletionRequestSystemMessage) SetRole(v string)`

SetRole sets Role field to given value.


### GetName

`func (o *ChatCompletionRequestSystemMessage) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ChatCompletionRequestSystemMessage) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ChatCompletionRequestSystemMessage) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ChatCompletionRequestSystemMessage) HasName() bool`

HasName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


