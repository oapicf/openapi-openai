# RealtimeServerEventResponseOutputItemDone

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;response.output_item.done&#x60;. | 
**ResponseId** | **string** | The ID of the Response to which the item belongs. | 
**OutputIndex** | **int32** | The index of the output item in the Response. | 
**Item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | 

## Methods

### NewRealtimeServerEventResponseOutputItemDone

`func NewRealtimeServerEventResponseOutputItemDone(eventId string, type_ string, responseId string, outputIndex int32, item RealtimeConversationItem, ) *RealtimeServerEventResponseOutputItemDone`

NewRealtimeServerEventResponseOutputItemDone instantiates a new RealtimeServerEventResponseOutputItemDone object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventResponseOutputItemDoneWithDefaults

`func NewRealtimeServerEventResponseOutputItemDoneWithDefaults() *RealtimeServerEventResponseOutputItemDone`

NewRealtimeServerEventResponseOutputItemDoneWithDefaults instantiates a new RealtimeServerEventResponseOutputItemDone object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventResponseOutputItemDone) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventResponseOutputItemDone) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventResponseOutputItemDone) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventResponseOutputItemDone) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventResponseOutputItemDone) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventResponseOutputItemDone) SetType(v string)`

SetType sets Type field to given value.


### GetResponseId

`func (o *RealtimeServerEventResponseOutputItemDone) GetResponseId() string`

GetResponseId returns the ResponseId field if non-nil, zero value otherwise.

### GetResponseIdOk

`func (o *RealtimeServerEventResponseOutputItemDone) GetResponseIdOk() (*string, bool)`

GetResponseIdOk returns a tuple with the ResponseId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseId

`func (o *RealtimeServerEventResponseOutputItemDone) SetResponseId(v string)`

SetResponseId sets ResponseId field to given value.


### GetOutputIndex

`func (o *RealtimeServerEventResponseOutputItemDone) GetOutputIndex() int32`

GetOutputIndex returns the OutputIndex field if non-nil, zero value otherwise.

### GetOutputIndexOk

`func (o *RealtimeServerEventResponseOutputItemDone) GetOutputIndexOk() (*int32, bool)`

GetOutputIndexOk returns a tuple with the OutputIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputIndex

`func (o *RealtimeServerEventResponseOutputItemDone) SetOutputIndex(v int32)`

SetOutputIndex sets OutputIndex field to given value.


### GetItem

`func (o *RealtimeServerEventResponseOutputItemDone) GetItem() RealtimeConversationItem`

GetItem returns the Item field if non-nil, zero value otherwise.

### GetItemOk

`func (o *RealtimeServerEventResponseOutputItemDone) GetItemOk() (*RealtimeConversationItem, bool)`

GetItemOk returns a tuple with the Item field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItem

`func (o *RealtimeServerEventResponseOutputItemDone) SetItem(v RealtimeConversationItem)`

SetItem sets Item field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


