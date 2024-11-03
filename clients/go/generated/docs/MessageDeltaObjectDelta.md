# MessageDeltaObjectDelta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Role** | Pointer to **string** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | [optional] 
**Content** | Pointer to [**[]MessageDeltaObjectDeltaContentInner**](MessageDeltaObjectDeltaContentInner.md) | The content of the message in array of text and/or images. | [optional] 
**FileIds** | Pointer to **[]string** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. | [optional] [default to []]

## Methods

### NewMessageDeltaObjectDelta

`func NewMessageDeltaObjectDelta() *MessageDeltaObjectDelta`

NewMessageDeltaObjectDelta instantiates a new MessageDeltaObjectDelta object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageDeltaObjectDeltaWithDefaults

`func NewMessageDeltaObjectDeltaWithDefaults() *MessageDeltaObjectDelta`

NewMessageDeltaObjectDeltaWithDefaults instantiates a new MessageDeltaObjectDelta object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRole

`func (o *MessageDeltaObjectDelta) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *MessageDeltaObjectDelta) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *MessageDeltaObjectDelta) SetRole(v string)`

SetRole sets Role field to given value.

### HasRole

`func (o *MessageDeltaObjectDelta) HasRole() bool`

HasRole returns a boolean if a field has been set.

### GetContent

`func (o *MessageDeltaObjectDelta) GetContent() []MessageDeltaObjectDeltaContentInner`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *MessageDeltaObjectDelta) GetContentOk() (*[]MessageDeltaObjectDeltaContentInner, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *MessageDeltaObjectDelta) SetContent(v []MessageDeltaObjectDeltaContentInner)`

SetContent sets Content field to given value.

### HasContent

`func (o *MessageDeltaObjectDelta) HasContent() bool`

HasContent returns a boolean if a field has been set.

### GetFileIds

`func (o *MessageDeltaObjectDelta) GetFileIds() []string`

GetFileIds returns the FileIds field if non-nil, zero value otherwise.

### GetFileIdsOk

`func (o *MessageDeltaObjectDelta) GetFileIdsOk() (*[]string, bool)`

GetFileIdsOk returns a tuple with the FileIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileIds

`func (o *MessageDeltaObjectDelta) SetFileIds(v []string)`

SetFileIds sets FileIds field to given value.

### HasFileIds

`func (o *MessageDeltaObjectDelta) HasFileIds() bool`

HasFileIds returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


