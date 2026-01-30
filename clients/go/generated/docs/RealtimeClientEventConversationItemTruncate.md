# RealtimeClientEventConversationItemTruncate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | Pointer to **string** | Optional client-generated ID used to identify this event. | [optional] 
**Type** | **string** | The event type, must be &#x60;conversation.item.truncate&#x60;. | 
**ItemId** | **string** | The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  | 
**ContentIndex** | **int32** | The index of the content part to truncate. Set this to 0. | 
**AudioEndMs** | **int32** | Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  | 

## Methods

### NewRealtimeClientEventConversationItemTruncate

`func NewRealtimeClientEventConversationItemTruncate(type_ string, itemId string, contentIndex int32, audioEndMs int32, ) *RealtimeClientEventConversationItemTruncate`

NewRealtimeClientEventConversationItemTruncate instantiates a new RealtimeClientEventConversationItemTruncate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeClientEventConversationItemTruncateWithDefaults

`func NewRealtimeClientEventConversationItemTruncateWithDefaults() *RealtimeClientEventConversationItemTruncate`

NewRealtimeClientEventConversationItemTruncateWithDefaults instantiates a new RealtimeClientEventConversationItemTruncate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeClientEventConversationItemTruncate) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeClientEventConversationItemTruncate) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeClientEventConversationItemTruncate) SetEventId(v string)`

SetEventId sets EventId field to given value.

### HasEventId

`func (o *RealtimeClientEventConversationItemTruncate) HasEventId() bool`

HasEventId returns a boolean if a field has been set.

### GetType

`func (o *RealtimeClientEventConversationItemTruncate) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeClientEventConversationItemTruncate) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeClientEventConversationItemTruncate) SetType(v string)`

SetType sets Type field to given value.


### GetItemId

`func (o *RealtimeClientEventConversationItemTruncate) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *RealtimeClientEventConversationItemTruncate) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *RealtimeClientEventConversationItemTruncate) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetContentIndex

`func (o *RealtimeClientEventConversationItemTruncate) GetContentIndex() int32`

GetContentIndex returns the ContentIndex field if non-nil, zero value otherwise.

### GetContentIndexOk

`func (o *RealtimeClientEventConversationItemTruncate) GetContentIndexOk() (*int32, bool)`

GetContentIndexOk returns a tuple with the ContentIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentIndex

`func (o *RealtimeClientEventConversationItemTruncate) SetContentIndex(v int32)`

SetContentIndex sets ContentIndex field to given value.


### GetAudioEndMs

`func (o *RealtimeClientEventConversationItemTruncate) GetAudioEndMs() int32`

GetAudioEndMs returns the AudioEndMs field if non-nil, zero value otherwise.

### GetAudioEndMsOk

`func (o *RealtimeClientEventConversationItemTruncate) GetAudioEndMsOk() (*int32, bool)`

GetAudioEndMsOk returns a tuple with the AudioEndMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudioEndMs

`func (o *RealtimeClientEventConversationItemTruncate) SetAudioEndMs(v int32)`

SetAudioEndMs sets AudioEndMs field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


