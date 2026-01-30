# RealtimeServerEventInputAudioBufferSpeechStarted

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;input_audio_buffer.speech_started&#x60;. | 
**AudioStartMs** | **int32** | Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  &#x60;prefix_padding_ms&#x60; configured in the Session.  | 
**ItemId** | **string** | The ID of the user message item that will be created when speech stops.  | 

## Methods

### NewRealtimeServerEventInputAudioBufferSpeechStarted

`func NewRealtimeServerEventInputAudioBufferSpeechStarted(eventId string, type_ string, audioStartMs int32, itemId string, ) *RealtimeServerEventInputAudioBufferSpeechStarted`

NewRealtimeServerEventInputAudioBufferSpeechStarted instantiates a new RealtimeServerEventInputAudioBufferSpeechStarted object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventInputAudioBufferSpeechStartedWithDefaults

`func NewRealtimeServerEventInputAudioBufferSpeechStartedWithDefaults() *RealtimeServerEventInputAudioBufferSpeechStarted`

NewRealtimeServerEventInputAudioBufferSpeechStartedWithDefaults instantiates a new RealtimeServerEventInputAudioBufferSpeechStarted object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventInputAudioBufferSpeechStarted) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventInputAudioBufferSpeechStarted) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventInputAudioBufferSpeechStarted) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventInputAudioBufferSpeechStarted) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventInputAudioBufferSpeechStarted) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventInputAudioBufferSpeechStarted) SetType(v string)`

SetType sets Type field to given value.


### GetAudioStartMs

`func (o *RealtimeServerEventInputAudioBufferSpeechStarted) GetAudioStartMs() int32`

GetAudioStartMs returns the AudioStartMs field if non-nil, zero value otherwise.

### GetAudioStartMsOk

`func (o *RealtimeServerEventInputAudioBufferSpeechStarted) GetAudioStartMsOk() (*int32, bool)`

GetAudioStartMsOk returns a tuple with the AudioStartMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudioStartMs

`func (o *RealtimeServerEventInputAudioBufferSpeechStarted) SetAudioStartMs(v int32)`

SetAudioStartMs sets AudioStartMs field to given value.


### GetItemId

`func (o *RealtimeServerEventInputAudioBufferSpeechStarted) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *RealtimeServerEventInputAudioBufferSpeechStarted) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *RealtimeServerEventInputAudioBufferSpeechStarted) SetItemId(v string)`

SetItemId sets ItemId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


