# RealtimeServerEventInputAudioBufferCommitted

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;input_audio_buffer.committed&#x60;. | 
**PreviousItemId** | **string** | The ID of the preceding item after which the new item will be inserted.  | 
**ItemId** | **string** | The ID of the user message item that will be created. | 

## Methods

### NewRealtimeServerEventInputAudioBufferCommitted

`func NewRealtimeServerEventInputAudioBufferCommitted(eventId string, type_ string, previousItemId string, itemId string, ) *RealtimeServerEventInputAudioBufferCommitted`

NewRealtimeServerEventInputAudioBufferCommitted instantiates a new RealtimeServerEventInputAudioBufferCommitted object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventInputAudioBufferCommittedWithDefaults

`func NewRealtimeServerEventInputAudioBufferCommittedWithDefaults() *RealtimeServerEventInputAudioBufferCommitted`

NewRealtimeServerEventInputAudioBufferCommittedWithDefaults instantiates a new RealtimeServerEventInputAudioBufferCommitted object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventInputAudioBufferCommitted) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventInputAudioBufferCommitted) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventInputAudioBufferCommitted) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventInputAudioBufferCommitted) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventInputAudioBufferCommitted) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventInputAudioBufferCommitted) SetType(v string)`

SetType sets Type field to given value.


### GetPreviousItemId

`func (o *RealtimeServerEventInputAudioBufferCommitted) GetPreviousItemId() string`

GetPreviousItemId returns the PreviousItemId field if non-nil, zero value otherwise.

### GetPreviousItemIdOk

`func (o *RealtimeServerEventInputAudioBufferCommitted) GetPreviousItemIdOk() (*string, bool)`

GetPreviousItemIdOk returns a tuple with the PreviousItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreviousItemId

`func (o *RealtimeServerEventInputAudioBufferCommitted) SetPreviousItemId(v string)`

SetPreviousItemId sets PreviousItemId field to given value.


### GetItemId

`func (o *RealtimeServerEventInputAudioBufferCommitted) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *RealtimeServerEventInputAudioBufferCommitted) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *RealtimeServerEventInputAudioBufferCommitted) SetItemId(v string)`

SetItemId sets ItemId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


