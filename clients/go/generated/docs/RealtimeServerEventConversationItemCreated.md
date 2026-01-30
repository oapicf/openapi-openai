# RealtimeServerEventConversationItemCreated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;conversation.item.created&#x60;. | 
**PreviousItemId** | **string** | The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  | 
**Item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | 

## Methods

### NewRealtimeServerEventConversationItemCreated

`func NewRealtimeServerEventConversationItemCreated(eventId string, type_ string, previousItemId string, item RealtimeConversationItem, ) *RealtimeServerEventConversationItemCreated`

NewRealtimeServerEventConversationItemCreated instantiates a new RealtimeServerEventConversationItemCreated object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventConversationItemCreatedWithDefaults

`func NewRealtimeServerEventConversationItemCreatedWithDefaults() *RealtimeServerEventConversationItemCreated`

NewRealtimeServerEventConversationItemCreatedWithDefaults instantiates a new RealtimeServerEventConversationItemCreated object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventConversationItemCreated) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventConversationItemCreated) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventConversationItemCreated) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventConversationItemCreated) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventConversationItemCreated) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventConversationItemCreated) SetType(v string)`

SetType sets Type field to given value.


### GetPreviousItemId

`func (o *RealtimeServerEventConversationItemCreated) GetPreviousItemId() string`

GetPreviousItemId returns the PreviousItemId field if non-nil, zero value otherwise.

### GetPreviousItemIdOk

`func (o *RealtimeServerEventConversationItemCreated) GetPreviousItemIdOk() (*string, bool)`

GetPreviousItemIdOk returns a tuple with the PreviousItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreviousItemId

`func (o *RealtimeServerEventConversationItemCreated) SetPreviousItemId(v string)`

SetPreviousItemId sets PreviousItemId field to given value.


### GetItem

`func (o *RealtimeServerEventConversationItemCreated) GetItem() RealtimeConversationItem`

GetItem returns the Item field if non-nil, zero value otherwise.

### GetItemOk

`func (o *RealtimeServerEventConversationItemCreated) GetItemOk() (*RealtimeConversationItem, bool)`

GetItemOk returns a tuple with the Item field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItem

`func (o *RealtimeServerEventConversationItemCreated) SetItem(v RealtimeConversationItem)`

SetItem sets Item field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


