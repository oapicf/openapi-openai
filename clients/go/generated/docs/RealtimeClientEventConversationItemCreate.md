# RealtimeClientEventConversationItemCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | Pointer to **string** | Optional client-generated ID used to identify this event. | [optional] 
**Type** | **string** | The event type, must be &#x60;conversation.item.create&#x60;. | 
**PreviousItemId** | Pointer to **string** | The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  | [optional] 
**Item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | 

## Methods

### NewRealtimeClientEventConversationItemCreate

`func NewRealtimeClientEventConversationItemCreate(type_ string, item RealtimeConversationItem, ) *RealtimeClientEventConversationItemCreate`

NewRealtimeClientEventConversationItemCreate instantiates a new RealtimeClientEventConversationItemCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeClientEventConversationItemCreateWithDefaults

`func NewRealtimeClientEventConversationItemCreateWithDefaults() *RealtimeClientEventConversationItemCreate`

NewRealtimeClientEventConversationItemCreateWithDefaults instantiates a new RealtimeClientEventConversationItemCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeClientEventConversationItemCreate) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeClientEventConversationItemCreate) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeClientEventConversationItemCreate) SetEventId(v string)`

SetEventId sets EventId field to given value.

### HasEventId

`func (o *RealtimeClientEventConversationItemCreate) HasEventId() bool`

HasEventId returns a boolean if a field has been set.

### GetType

`func (o *RealtimeClientEventConversationItemCreate) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeClientEventConversationItemCreate) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeClientEventConversationItemCreate) SetType(v string)`

SetType sets Type field to given value.


### GetPreviousItemId

`func (o *RealtimeClientEventConversationItemCreate) GetPreviousItemId() string`

GetPreviousItemId returns the PreviousItemId field if non-nil, zero value otherwise.

### GetPreviousItemIdOk

`func (o *RealtimeClientEventConversationItemCreate) GetPreviousItemIdOk() (*string, bool)`

GetPreviousItemIdOk returns a tuple with the PreviousItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreviousItemId

`func (o *RealtimeClientEventConversationItemCreate) SetPreviousItemId(v string)`

SetPreviousItemId sets PreviousItemId field to given value.

### HasPreviousItemId

`func (o *RealtimeClientEventConversationItemCreate) HasPreviousItemId() bool`

HasPreviousItemId returns a boolean if a field has been set.

### GetItem

`func (o *RealtimeClientEventConversationItemCreate) GetItem() RealtimeConversationItem`

GetItem returns the Item field if non-nil, zero value otherwise.

### GetItemOk

`func (o *RealtimeClientEventConversationItemCreate) GetItemOk() (*RealtimeConversationItem, bool)`

GetItemOk returns a tuple with the Item field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItem

`func (o *RealtimeClientEventConversationItemCreate) SetItem(v RealtimeConversationItem)`

SetItem sets Item field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


