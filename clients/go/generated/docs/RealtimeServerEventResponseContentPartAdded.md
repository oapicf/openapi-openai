# RealtimeServerEventResponseContentPartAdded

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;response.content_part.added&#x60;. | 
**ResponseId** | **string** | The ID of the response. | 
**ItemId** | **string** | The ID of the item to which the content part was added. | 
**OutputIndex** | **int32** | The index of the output item in the response. | 
**ContentIndex** | **int32** | The index of the content part in the item&#39;s content array. | 
**Part** | [**RealtimeServerEventResponseContentPartAddedPart**](RealtimeServerEventResponseContentPartAddedPart.md) |  | 

## Methods

### NewRealtimeServerEventResponseContentPartAdded

`func NewRealtimeServerEventResponseContentPartAdded(eventId string, type_ string, responseId string, itemId string, outputIndex int32, contentIndex int32, part RealtimeServerEventResponseContentPartAddedPart, ) *RealtimeServerEventResponseContentPartAdded`

NewRealtimeServerEventResponseContentPartAdded instantiates a new RealtimeServerEventResponseContentPartAdded object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventResponseContentPartAddedWithDefaults

`func NewRealtimeServerEventResponseContentPartAddedWithDefaults() *RealtimeServerEventResponseContentPartAdded`

NewRealtimeServerEventResponseContentPartAddedWithDefaults instantiates a new RealtimeServerEventResponseContentPartAdded object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventResponseContentPartAdded) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventResponseContentPartAdded) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventResponseContentPartAdded) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventResponseContentPartAdded) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventResponseContentPartAdded) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventResponseContentPartAdded) SetType(v string)`

SetType sets Type field to given value.


### GetResponseId

`func (o *RealtimeServerEventResponseContentPartAdded) GetResponseId() string`

GetResponseId returns the ResponseId field if non-nil, zero value otherwise.

### GetResponseIdOk

`func (o *RealtimeServerEventResponseContentPartAdded) GetResponseIdOk() (*string, bool)`

GetResponseIdOk returns a tuple with the ResponseId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseId

`func (o *RealtimeServerEventResponseContentPartAdded) SetResponseId(v string)`

SetResponseId sets ResponseId field to given value.


### GetItemId

`func (o *RealtimeServerEventResponseContentPartAdded) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *RealtimeServerEventResponseContentPartAdded) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *RealtimeServerEventResponseContentPartAdded) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetOutputIndex

`func (o *RealtimeServerEventResponseContentPartAdded) GetOutputIndex() int32`

GetOutputIndex returns the OutputIndex field if non-nil, zero value otherwise.

### GetOutputIndexOk

`func (o *RealtimeServerEventResponseContentPartAdded) GetOutputIndexOk() (*int32, bool)`

GetOutputIndexOk returns a tuple with the OutputIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputIndex

`func (o *RealtimeServerEventResponseContentPartAdded) SetOutputIndex(v int32)`

SetOutputIndex sets OutputIndex field to given value.


### GetContentIndex

`func (o *RealtimeServerEventResponseContentPartAdded) GetContentIndex() int32`

GetContentIndex returns the ContentIndex field if non-nil, zero value otherwise.

### GetContentIndexOk

`func (o *RealtimeServerEventResponseContentPartAdded) GetContentIndexOk() (*int32, bool)`

GetContentIndexOk returns a tuple with the ContentIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentIndex

`func (o *RealtimeServerEventResponseContentPartAdded) SetContentIndex(v int32)`

SetContentIndex sets ContentIndex field to given value.


### GetPart

`func (o *RealtimeServerEventResponseContentPartAdded) GetPart() RealtimeServerEventResponseContentPartAddedPart`

GetPart returns the Part field if non-nil, zero value otherwise.

### GetPartOk

`func (o *RealtimeServerEventResponseContentPartAdded) GetPartOk() (*RealtimeServerEventResponseContentPartAddedPart, bool)`

GetPartOk returns a tuple with the Part field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPart

`func (o *RealtimeServerEventResponseContentPartAdded) SetPart(v RealtimeServerEventResponseContentPartAddedPart)`

SetPart sets Part field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


