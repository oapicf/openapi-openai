# MessageObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The identifier, which can be referenced in API endpoints. | 
**Object** | **string** | The object type, which is always &#x60;thread.message&#x60;. | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) for when the message was created. | 
**ThreadId** | **string** | The [thread](/docs/api-reference/threads) ID that this message belongs to. | 
**Status** | **string** | The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. | 
**IncompleteDetails** | [**NullableMessageObjectIncompleteDetails**](MessageObjectIncompleteDetails.md) |  | 
**CompletedAt** | **NullableInt32** | The Unix timestamp (in seconds) for when the message was completed. | 
**IncompleteAt** | **NullableInt32** | The Unix timestamp (in seconds) for when the message was marked as incomplete. | 
**Role** | **string** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | 
**Content** | [**[]MessageObjectContentInner**](MessageObjectContentInner.md) | The content of the message in array of text and/or images. | 
**AssistantId** | **NullableString** | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. | 
**RunId** | **NullableString** | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. | 
**Attachments** | [**[]CreateMessageRequestAttachmentsInner**](CreateMessageRequestAttachmentsInner.md) | A list of files attached to the message, and the tools they were added to. | 
**Metadata** | **map[string]interface{}** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 

## Methods

### NewMessageObject

`func NewMessageObject(id string, object string, createdAt int32, threadId string, status string, incompleteDetails NullableMessageObjectIncompleteDetails, completedAt NullableInt32, incompleteAt NullableInt32, role string, content []MessageObjectContentInner, assistantId NullableString, runId NullableString, attachments []CreateMessageRequestAttachmentsInner, metadata map[string]interface{}, ) *MessageObject`

NewMessageObject instantiates a new MessageObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageObjectWithDefaults

`func NewMessageObjectWithDefaults() *MessageObject`

NewMessageObjectWithDefaults instantiates a new MessageObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MessageObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MessageObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MessageObject) SetId(v string)`

SetId sets Id field to given value.


### GetObject

`func (o *MessageObject) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *MessageObject) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *MessageObject) SetObject(v string)`

SetObject sets Object field to given value.


### GetCreatedAt

`func (o *MessageObject) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *MessageObject) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *MessageObject) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetThreadId

`func (o *MessageObject) GetThreadId() string`

GetThreadId returns the ThreadId field if non-nil, zero value otherwise.

### GetThreadIdOk

`func (o *MessageObject) GetThreadIdOk() (*string, bool)`

GetThreadIdOk returns a tuple with the ThreadId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThreadId

`func (o *MessageObject) SetThreadId(v string)`

SetThreadId sets ThreadId field to given value.


### GetStatus

`func (o *MessageObject) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *MessageObject) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *MessageObject) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetIncompleteDetails

`func (o *MessageObject) GetIncompleteDetails() MessageObjectIncompleteDetails`

GetIncompleteDetails returns the IncompleteDetails field if non-nil, zero value otherwise.

### GetIncompleteDetailsOk

`func (o *MessageObject) GetIncompleteDetailsOk() (*MessageObjectIncompleteDetails, bool)`

GetIncompleteDetailsOk returns a tuple with the IncompleteDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncompleteDetails

`func (o *MessageObject) SetIncompleteDetails(v MessageObjectIncompleteDetails)`

SetIncompleteDetails sets IncompleteDetails field to given value.


### SetIncompleteDetailsNil

`func (o *MessageObject) SetIncompleteDetailsNil(b bool)`

 SetIncompleteDetailsNil sets the value for IncompleteDetails to be an explicit nil

### UnsetIncompleteDetails
`func (o *MessageObject) UnsetIncompleteDetails()`

UnsetIncompleteDetails ensures that no value is present for IncompleteDetails, not even an explicit nil
### GetCompletedAt

`func (o *MessageObject) GetCompletedAt() int32`

GetCompletedAt returns the CompletedAt field if non-nil, zero value otherwise.

### GetCompletedAtOk

`func (o *MessageObject) GetCompletedAtOk() (*int32, bool)`

GetCompletedAtOk returns a tuple with the CompletedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletedAt

`func (o *MessageObject) SetCompletedAt(v int32)`

SetCompletedAt sets CompletedAt field to given value.


### SetCompletedAtNil

`func (o *MessageObject) SetCompletedAtNil(b bool)`

 SetCompletedAtNil sets the value for CompletedAt to be an explicit nil

### UnsetCompletedAt
`func (o *MessageObject) UnsetCompletedAt()`

UnsetCompletedAt ensures that no value is present for CompletedAt, not even an explicit nil
### GetIncompleteAt

`func (o *MessageObject) GetIncompleteAt() int32`

GetIncompleteAt returns the IncompleteAt field if non-nil, zero value otherwise.

### GetIncompleteAtOk

`func (o *MessageObject) GetIncompleteAtOk() (*int32, bool)`

GetIncompleteAtOk returns a tuple with the IncompleteAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncompleteAt

`func (o *MessageObject) SetIncompleteAt(v int32)`

SetIncompleteAt sets IncompleteAt field to given value.


### SetIncompleteAtNil

`func (o *MessageObject) SetIncompleteAtNil(b bool)`

 SetIncompleteAtNil sets the value for IncompleteAt to be an explicit nil

### UnsetIncompleteAt
`func (o *MessageObject) UnsetIncompleteAt()`

UnsetIncompleteAt ensures that no value is present for IncompleteAt, not even an explicit nil
### GetRole

`func (o *MessageObject) GetRole() string`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *MessageObject) GetRoleOk() (*string, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *MessageObject) SetRole(v string)`

SetRole sets Role field to given value.


### GetContent

`func (o *MessageObject) GetContent() []MessageObjectContentInner`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *MessageObject) GetContentOk() (*[]MessageObjectContentInner, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *MessageObject) SetContent(v []MessageObjectContentInner)`

SetContent sets Content field to given value.


### GetAssistantId

`func (o *MessageObject) GetAssistantId() string`

GetAssistantId returns the AssistantId field if non-nil, zero value otherwise.

### GetAssistantIdOk

`func (o *MessageObject) GetAssistantIdOk() (*string, bool)`

GetAssistantIdOk returns a tuple with the AssistantId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssistantId

`func (o *MessageObject) SetAssistantId(v string)`

SetAssistantId sets AssistantId field to given value.


### SetAssistantIdNil

`func (o *MessageObject) SetAssistantIdNil(b bool)`

 SetAssistantIdNil sets the value for AssistantId to be an explicit nil

### UnsetAssistantId
`func (o *MessageObject) UnsetAssistantId()`

UnsetAssistantId ensures that no value is present for AssistantId, not even an explicit nil
### GetRunId

`func (o *MessageObject) GetRunId() string`

GetRunId returns the RunId field if non-nil, zero value otherwise.

### GetRunIdOk

`func (o *MessageObject) GetRunIdOk() (*string, bool)`

GetRunIdOk returns a tuple with the RunId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRunId

`func (o *MessageObject) SetRunId(v string)`

SetRunId sets RunId field to given value.


### SetRunIdNil

`func (o *MessageObject) SetRunIdNil(b bool)`

 SetRunIdNil sets the value for RunId to be an explicit nil

### UnsetRunId
`func (o *MessageObject) UnsetRunId()`

UnsetRunId ensures that no value is present for RunId, not even an explicit nil
### GetAttachments

`func (o *MessageObject) GetAttachments() []CreateMessageRequestAttachmentsInner`

GetAttachments returns the Attachments field if non-nil, zero value otherwise.

### GetAttachmentsOk

`func (o *MessageObject) GetAttachmentsOk() (*[]CreateMessageRequestAttachmentsInner, bool)`

GetAttachmentsOk returns a tuple with the Attachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachments

`func (o *MessageObject) SetAttachments(v []CreateMessageRequestAttachmentsInner)`

SetAttachments sets Attachments field to given value.


### SetAttachmentsNil

`func (o *MessageObject) SetAttachmentsNil(b bool)`

 SetAttachmentsNil sets the value for Attachments to be an explicit nil

### UnsetAttachments
`func (o *MessageObject) UnsetAttachments()`

UnsetAttachments ensures that no value is present for Attachments, not even an explicit nil
### GetMetadata

`func (o *MessageObject) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *MessageObject) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *MessageObject) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.


### SetMetadataNil

`func (o *MessageObject) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *MessageObject) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


