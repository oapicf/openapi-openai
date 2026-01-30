# RealtimeServerEventResponseContentPartDone

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;response.content_part.done&#x60;. | 
**ResponseId** | **string** | The ID of the response. | 
**ItemId** | **string** | The ID of the item. | 
**OutputIndex** | **int32** | The index of the output item in the response. | 
**ContentIndex** | **int32** | The index of the content part in the item&#39;s content array. | 
**Part** | [**RealtimeServerEventResponseContentPartDonePart**](RealtimeServerEventResponseContentPartDonePart.md) |  | 

## Methods

### NewRealtimeServerEventResponseContentPartDone

`func NewRealtimeServerEventResponseContentPartDone(eventId string, type_ string, responseId string, itemId string, outputIndex int32, contentIndex int32, part RealtimeServerEventResponseContentPartDonePart, ) *RealtimeServerEventResponseContentPartDone`

NewRealtimeServerEventResponseContentPartDone instantiates a new RealtimeServerEventResponseContentPartDone object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventResponseContentPartDoneWithDefaults

`func NewRealtimeServerEventResponseContentPartDoneWithDefaults() *RealtimeServerEventResponseContentPartDone`

NewRealtimeServerEventResponseContentPartDoneWithDefaults instantiates a new RealtimeServerEventResponseContentPartDone object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventResponseContentPartDone) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventResponseContentPartDone) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventResponseContentPartDone) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventResponseContentPartDone) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventResponseContentPartDone) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventResponseContentPartDone) SetType(v string)`

SetType sets Type field to given value.


### GetResponseId

`func (o *RealtimeServerEventResponseContentPartDone) GetResponseId() string`

GetResponseId returns the ResponseId field if non-nil, zero value otherwise.

### GetResponseIdOk

`func (o *RealtimeServerEventResponseContentPartDone) GetResponseIdOk() (*string, bool)`

GetResponseIdOk returns a tuple with the ResponseId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseId

`func (o *RealtimeServerEventResponseContentPartDone) SetResponseId(v string)`

SetResponseId sets ResponseId field to given value.


### GetItemId

`func (o *RealtimeServerEventResponseContentPartDone) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *RealtimeServerEventResponseContentPartDone) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *RealtimeServerEventResponseContentPartDone) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetOutputIndex

`func (o *RealtimeServerEventResponseContentPartDone) GetOutputIndex() int32`

GetOutputIndex returns the OutputIndex field if non-nil, zero value otherwise.

### GetOutputIndexOk

`func (o *RealtimeServerEventResponseContentPartDone) GetOutputIndexOk() (*int32, bool)`

GetOutputIndexOk returns a tuple with the OutputIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputIndex

`func (o *RealtimeServerEventResponseContentPartDone) SetOutputIndex(v int32)`

SetOutputIndex sets OutputIndex field to given value.


### GetContentIndex

`func (o *RealtimeServerEventResponseContentPartDone) GetContentIndex() int32`

GetContentIndex returns the ContentIndex field if non-nil, zero value otherwise.

### GetContentIndexOk

`func (o *RealtimeServerEventResponseContentPartDone) GetContentIndexOk() (*int32, bool)`

GetContentIndexOk returns a tuple with the ContentIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentIndex

`func (o *RealtimeServerEventResponseContentPartDone) SetContentIndex(v int32)`

SetContentIndex sets ContentIndex field to given value.


### GetPart

`func (o *RealtimeServerEventResponseContentPartDone) GetPart() RealtimeServerEventResponseContentPartDonePart`

GetPart returns the Part field if non-nil, zero value otherwise.

### GetPartOk

`func (o *RealtimeServerEventResponseContentPartDone) GetPartOk() (*RealtimeServerEventResponseContentPartDonePart, bool)`

GetPartOk returns a tuple with the Part field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPart

`func (o *RealtimeServerEventResponseContentPartDone) SetPart(v RealtimeServerEventResponseContentPartDonePart)`

SetPart sets Part field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


