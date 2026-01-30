# RealtimeServerEventConversationItemInputAudioTranscriptionCompleted

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;conversation.item.input_audio_transcription.completed&#x60;.  | 
**ItemId** | **string** | The ID of the user message item containing the audio. | 
**ContentIndex** | **int32** | The index of the content part containing the audio. | 
**Transcript** | **string** | The transcribed text. | 

## Methods

### NewRealtimeServerEventConversationItemInputAudioTranscriptionCompleted

`func NewRealtimeServerEventConversationItemInputAudioTranscriptionCompleted(eventId string, type_ string, itemId string, contentIndex int32, transcript string, ) *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted`

NewRealtimeServerEventConversationItemInputAudioTranscriptionCompleted instantiates a new RealtimeServerEventConversationItemInputAudioTranscriptionCompleted object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventConversationItemInputAudioTranscriptionCompletedWithDefaults

`func NewRealtimeServerEventConversationItemInputAudioTranscriptionCompletedWithDefaults() *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted`

NewRealtimeServerEventConversationItemInputAudioTranscriptionCompletedWithDefaults instantiates a new RealtimeServerEventConversationItemInputAudioTranscriptionCompleted object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted) SetType(v string)`

SetType sets Type field to given value.


### GetItemId

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetContentIndex

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted) GetContentIndex() int32`

GetContentIndex returns the ContentIndex field if non-nil, zero value otherwise.

### GetContentIndexOk

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted) GetContentIndexOk() (*int32, bool)`

GetContentIndexOk returns a tuple with the ContentIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentIndex

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted) SetContentIndex(v int32)`

SetContentIndex sets ContentIndex field to given value.


### GetTranscript

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted) GetTranscript() string`

GetTranscript returns the Transcript field if non-nil, zero value otherwise.

### GetTranscriptOk

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted) GetTranscriptOk() (*string, bool)`

GetTranscriptOk returns a tuple with the Transcript field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTranscript

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionCompleted) SetTranscript(v string)`

SetTranscript sets Transcript field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


