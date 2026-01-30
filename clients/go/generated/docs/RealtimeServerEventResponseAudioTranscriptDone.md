# RealtimeServerEventResponseAudioTranscriptDone

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;response.audio_transcript.done&#x60;. | 
**ResponseId** | **string** | The ID of the response. | 
**ItemId** | **string** | The ID of the item. | 
**OutputIndex** | **int32** | The index of the output item in the response. | 
**ContentIndex** | **int32** | The index of the content part in the item&#39;s content array. | 
**Transcript** | **string** | The final transcript of the audio. | 

## Methods

### NewRealtimeServerEventResponseAudioTranscriptDone

`func NewRealtimeServerEventResponseAudioTranscriptDone(eventId string, type_ string, responseId string, itemId string, outputIndex int32, contentIndex int32, transcript string, ) *RealtimeServerEventResponseAudioTranscriptDone`

NewRealtimeServerEventResponseAudioTranscriptDone instantiates a new RealtimeServerEventResponseAudioTranscriptDone object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventResponseAudioTranscriptDoneWithDefaults

`func NewRealtimeServerEventResponseAudioTranscriptDoneWithDefaults() *RealtimeServerEventResponseAudioTranscriptDone`

NewRealtimeServerEventResponseAudioTranscriptDoneWithDefaults instantiates a new RealtimeServerEventResponseAudioTranscriptDone object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventResponseAudioTranscriptDone) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventResponseAudioTranscriptDone) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventResponseAudioTranscriptDone) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventResponseAudioTranscriptDone) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventResponseAudioTranscriptDone) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventResponseAudioTranscriptDone) SetType(v string)`

SetType sets Type field to given value.


### GetResponseId

`func (o *RealtimeServerEventResponseAudioTranscriptDone) GetResponseId() string`

GetResponseId returns the ResponseId field if non-nil, zero value otherwise.

### GetResponseIdOk

`func (o *RealtimeServerEventResponseAudioTranscriptDone) GetResponseIdOk() (*string, bool)`

GetResponseIdOk returns a tuple with the ResponseId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseId

`func (o *RealtimeServerEventResponseAudioTranscriptDone) SetResponseId(v string)`

SetResponseId sets ResponseId field to given value.


### GetItemId

`func (o *RealtimeServerEventResponseAudioTranscriptDone) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *RealtimeServerEventResponseAudioTranscriptDone) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *RealtimeServerEventResponseAudioTranscriptDone) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetOutputIndex

`func (o *RealtimeServerEventResponseAudioTranscriptDone) GetOutputIndex() int32`

GetOutputIndex returns the OutputIndex field if non-nil, zero value otherwise.

### GetOutputIndexOk

`func (o *RealtimeServerEventResponseAudioTranscriptDone) GetOutputIndexOk() (*int32, bool)`

GetOutputIndexOk returns a tuple with the OutputIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputIndex

`func (o *RealtimeServerEventResponseAudioTranscriptDone) SetOutputIndex(v int32)`

SetOutputIndex sets OutputIndex field to given value.


### GetContentIndex

`func (o *RealtimeServerEventResponseAudioTranscriptDone) GetContentIndex() int32`

GetContentIndex returns the ContentIndex field if non-nil, zero value otherwise.

### GetContentIndexOk

`func (o *RealtimeServerEventResponseAudioTranscriptDone) GetContentIndexOk() (*int32, bool)`

GetContentIndexOk returns a tuple with the ContentIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentIndex

`func (o *RealtimeServerEventResponseAudioTranscriptDone) SetContentIndex(v int32)`

SetContentIndex sets ContentIndex field to given value.


### GetTranscript

`func (o *RealtimeServerEventResponseAudioTranscriptDone) GetTranscript() string`

GetTranscript returns the Transcript field if non-nil, zero value otherwise.

### GetTranscriptOk

`func (o *RealtimeServerEventResponseAudioTranscriptDone) GetTranscriptOk() (*string, bool)`

GetTranscriptOk returns a tuple with the Transcript field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTranscript

`func (o *RealtimeServerEventResponseAudioTranscriptDone) SetTranscript(v string)`

SetTranscript sets Transcript field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


