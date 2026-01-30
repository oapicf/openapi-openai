# RealtimeServerEventConversationItemTruncated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;conversation.item.truncated&#x60;. | 
**ItemId** | **string** | The ID of the assistant message item that was truncated. | 
**ContentIndex** | **int32** | The index of the content part that was truncated. | 
**AudioEndMs** | **int32** | The duration up to which the audio was truncated, in milliseconds.  | 

## Methods

### NewRealtimeServerEventConversationItemTruncated

`func NewRealtimeServerEventConversationItemTruncated(eventId string, type_ string, itemId string, contentIndex int32, audioEndMs int32, ) *RealtimeServerEventConversationItemTruncated`

NewRealtimeServerEventConversationItemTruncated instantiates a new RealtimeServerEventConversationItemTruncated object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventConversationItemTruncatedWithDefaults

`func NewRealtimeServerEventConversationItemTruncatedWithDefaults() *RealtimeServerEventConversationItemTruncated`

NewRealtimeServerEventConversationItemTruncatedWithDefaults instantiates a new RealtimeServerEventConversationItemTruncated object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventConversationItemTruncated) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventConversationItemTruncated) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventConversationItemTruncated) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventConversationItemTruncated) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventConversationItemTruncated) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventConversationItemTruncated) SetType(v string)`

SetType sets Type field to given value.


### GetItemId

`func (o *RealtimeServerEventConversationItemTruncated) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *RealtimeServerEventConversationItemTruncated) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *RealtimeServerEventConversationItemTruncated) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetContentIndex

`func (o *RealtimeServerEventConversationItemTruncated) GetContentIndex() int32`

GetContentIndex returns the ContentIndex field if non-nil, zero value otherwise.

### GetContentIndexOk

`func (o *RealtimeServerEventConversationItemTruncated) GetContentIndexOk() (*int32, bool)`

GetContentIndexOk returns a tuple with the ContentIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentIndex

`func (o *RealtimeServerEventConversationItemTruncated) SetContentIndex(v int32)`

SetContentIndex sets ContentIndex field to given value.


### GetAudioEndMs

`func (o *RealtimeServerEventConversationItemTruncated) GetAudioEndMs() int32`

GetAudioEndMs returns the AudioEndMs field if non-nil, zero value otherwise.

### GetAudioEndMsOk

`func (o *RealtimeServerEventConversationItemTruncated) GetAudioEndMsOk() (*int32, bool)`

GetAudioEndMsOk returns a tuple with the AudioEndMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudioEndMs

`func (o *RealtimeServerEventConversationItemTruncated) SetAudioEndMs(v int32)`

SetAudioEndMs sets AudioEndMs field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


