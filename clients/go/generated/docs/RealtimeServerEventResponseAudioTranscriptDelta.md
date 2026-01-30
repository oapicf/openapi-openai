# RealtimeServerEventResponseAudioTranscriptDelta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;response.audio_transcript.delta&#x60;. | 
**ResponseId** | **string** | The ID of the response. | 
**ItemId** | **string** | The ID of the item. | 
**OutputIndex** | **int32** | The index of the output item in the response. | 
**ContentIndex** | **int32** | The index of the content part in the item&#39;s content array. | 
**Delta** | **string** | The transcript delta. | 

## Methods

### NewRealtimeServerEventResponseAudioTranscriptDelta

`func NewRealtimeServerEventResponseAudioTranscriptDelta(eventId string, type_ string, responseId string, itemId string, outputIndex int32, contentIndex int32, delta string, ) *RealtimeServerEventResponseAudioTranscriptDelta`

NewRealtimeServerEventResponseAudioTranscriptDelta instantiates a new RealtimeServerEventResponseAudioTranscriptDelta object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventResponseAudioTranscriptDeltaWithDefaults

`func NewRealtimeServerEventResponseAudioTranscriptDeltaWithDefaults() *RealtimeServerEventResponseAudioTranscriptDelta`

NewRealtimeServerEventResponseAudioTranscriptDeltaWithDefaults instantiates a new RealtimeServerEventResponseAudioTranscriptDelta object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) SetType(v string)`

SetType sets Type field to given value.


### GetResponseId

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) GetResponseId() string`

GetResponseId returns the ResponseId field if non-nil, zero value otherwise.

### GetResponseIdOk

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) GetResponseIdOk() (*string, bool)`

GetResponseIdOk returns a tuple with the ResponseId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseId

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) SetResponseId(v string)`

SetResponseId sets ResponseId field to given value.


### GetItemId

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetOutputIndex

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) GetOutputIndex() int32`

GetOutputIndex returns the OutputIndex field if non-nil, zero value otherwise.

### GetOutputIndexOk

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) GetOutputIndexOk() (*int32, bool)`

GetOutputIndexOk returns a tuple with the OutputIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputIndex

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) SetOutputIndex(v int32)`

SetOutputIndex sets OutputIndex field to given value.


### GetContentIndex

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) GetContentIndex() int32`

GetContentIndex returns the ContentIndex field if non-nil, zero value otherwise.

### GetContentIndexOk

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) GetContentIndexOk() (*int32, bool)`

GetContentIndexOk returns a tuple with the ContentIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentIndex

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) SetContentIndex(v int32)`

SetContentIndex sets ContentIndex field to given value.


### GetDelta

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) GetDelta() string`

GetDelta returns the Delta field if non-nil, zero value otherwise.

### GetDeltaOk

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) GetDeltaOk() (*string, bool)`

GetDeltaOk returns a tuple with the Delta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDelta

`func (o *RealtimeServerEventResponseAudioTranscriptDelta) SetDelta(v string)`

SetDelta sets Delta field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


