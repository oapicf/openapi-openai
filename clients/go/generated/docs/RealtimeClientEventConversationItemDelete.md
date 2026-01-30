# RealtimeClientEventConversationItemDelete

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | Pointer to **string** | Optional client-generated ID used to identify this event. | [optional] 
**Type** | **string** | The event type, must be &#x60;conversation.item.delete&#x60;. | 
**ItemId** | **string** | The ID of the item to delete. | 

## Methods

### NewRealtimeClientEventConversationItemDelete

`func NewRealtimeClientEventConversationItemDelete(type_ string, itemId string, ) *RealtimeClientEventConversationItemDelete`

NewRealtimeClientEventConversationItemDelete instantiates a new RealtimeClientEventConversationItemDelete object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeClientEventConversationItemDeleteWithDefaults

`func NewRealtimeClientEventConversationItemDeleteWithDefaults() *RealtimeClientEventConversationItemDelete`

NewRealtimeClientEventConversationItemDeleteWithDefaults instantiates a new RealtimeClientEventConversationItemDelete object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeClientEventConversationItemDelete) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeClientEventConversationItemDelete) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeClientEventConversationItemDelete) SetEventId(v string)`

SetEventId sets EventId field to given value.

### HasEventId

`func (o *RealtimeClientEventConversationItemDelete) HasEventId() bool`

HasEventId returns a boolean if a field has been set.

### GetType

`func (o *RealtimeClientEventConversationItemDelete) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeClientEventConversationItemDelete) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeClientEventConversationItemDelete) SetType(v string)`

SetType sets Type field to given value.


### GetItemId

`func (o *RealtimeClientEventConversationItemDelete) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *RealtimeClientEventConversationItemDelete) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *RealtimeClientEventConversationItemDelete) SetItemId(v string)`

SetItemId sets ItemId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


