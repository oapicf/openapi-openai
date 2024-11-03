# ChatCompletionRequestUserMessage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | [**ChatCompletionRequestUserMessageContent**](ChatCompletionRequestUserMessageContent.md) |  | 
**Role** | **string** | The role of the messages author, in this case &#x60;user&#x60;. | 
**Name** | Pointer to **string** | An optional name for the participant. Provides the model information to differentiate between participants of the same role. | [optional] 

## Methods

### NewChatCompletionRequestUserMessage

`func NewChatCompletionRequestUserMessage(content ChatCompletionRequestUserMessageContent, role string, ) *ChatCompletionRequestUserMessage`

NewChatCompletionRequestUserMessage instantiates a new ChatCompletionRequestUserMessage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionRequestUserMessageWithDefaults

`func NewChatCompletionRequestUserMessageWithDefaults() *ChatCompletionRequestUserMessage`

NewChatCompletionRequestUserMessageWithDefaults instantiates a new ChatCompletionRequestUserMessage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContent

`func (o *ChatCompletionRequestUserMessage) GetContent() ChatCompletionRequestUserMessageContent`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *ChatCompletionRequestUserMessage) GetContentOk() (*ChatCompletionRequestUserMessageContent, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *ChatCompletionRequestUserMessage) SetContent(v ChatCompletionRequestUserMessageContent)`

SetContent sets Content field to given value.


### GetRole

`func (o *ChatCompletionRequestUserMessage) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *ChatCompletionRequestUserMessage) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *ChatCompletionRequestUserMessage) SetRole(v string)`

SetRole sets Role field to given value.


### GetName

`func (o *ChatCompletionRequestUserMessage) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ChatCompletionRequestUserMessage) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ChatCompletionRequestUserMessage) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ChatCompletionRequestUserMessage) HasName() bool`

HasName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


