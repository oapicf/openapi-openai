# ChatCompletionRequestToolMessage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Role** | **string** | The role of the messages author, in this case &#x60;tool&#x60;. | 
**Content** | **string** | The contents of the tool message. | 
**ToolCallId** | **string** | Tool call that this message is responding to. | 

## Methods

### NewChatCompletionRequestToolMessage

`func NewChatCompletionRequestToolMessage(role string, content string, toolCallId string, ) *ChatCompletionRequestToolMessage`

NewChatCompletionRequestToolMessage instantiates a new ChatCompletionRequestToolMessage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionRequestToolMessageWithDefaults

`func NewChatCompletionRequestToolMessageWithDefaults() *ChatCompletionRequestToolMessage`

NewChatCompletionRequestToolMessageWithDefaults instantiates a new ChatCompletionRequestToolMessage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRole

`func (o *ChatCompletionRequestToolMessage) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *ChatCompletionRequestToolMessage) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *ChatCompletionRequestToolMessage) SetRole(v string)`

SetRole sets Role field to given value.


### GetContent

`func (o *ChatCompletionRequestToolMessage) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *ChatCompletionRequestToolMessage) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *ChatCompletionRequestToolMessage) SetContent(v string)`

SetContent sets Content field to given value.


### GetToolCallId

`func (o *ChatCompletionRequestToolMessage) GetToolCallId() string`

GetToolCallId returns the ToolCallId field if non-nil, zero value otherwise.

### GetToolCallIdOk

`func (o *ChatCompletionRequestToolMessage) GetToolCallIdOk() (*string, bool)`

GetToolCallIdOk returns a tuple with the ToolCallId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolCallId

`func (o *ChatCompletionRequestToolMessage) SetToolCallId(v string)`

SetToolCallId sets ToolCallId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


