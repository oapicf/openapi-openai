# RealtimeServerEventConversationItemDeleted

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;conversation.item.deleted&#x60;. | 
**ItemId** | **string** | The ID of the item that was deleted. | 

## Methods

### NewRealtimeServerEventConversationItemDeleted

`func NewRealtimeServerEventConversationItemDeleted(eventId string, type_ string, itemId string, ) *RealtimeServerEventConversationItemDeleted`

NewRealtimeServerEventConversationItemDeleted instantiates a new RealtimeServerEventConversationItemDeleted object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventConversationItemDeletedWithDefaults

`func NewRealtimeServerEventConversationItemDeletedWithDefaults() *RealtimeServerEventConversationItemDeleted`

NewRealtimeServerEventConversationItemDeletedWithDefaults instantiates a new RealtimeServerEventConversationItemDeleted object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventConversationItemDeleted) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventConversationItemDeleted) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventConversationItemDeleted) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventConversationItemDeleted) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventConversationItemDeleted) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventConversationItemDeleted) SetType(v string)`

SetType sets Type field to given value.


### GetItemId

`func (o *RealtimeServerEventConversationItemDeleted) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *RealtimeServerEventConversationItemDeleted) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *RealtimeServerEventConversationItemDeleted) SetItemId(v string)`

SetItemId sets ItemId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


