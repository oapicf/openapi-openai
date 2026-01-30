# RealtimeServerEventInputAudioBufferSpeechStopped

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;input_audio_buffer.speech_stopped&#x60;. | 
**AudioEndMs** | **int32** | Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  &#x60;min_silence_duration_ms&#x60; configured in the Session.  | 
**ItemId** | **string** | The ID of the user message item that will be created. | 

## Methods

### NewRealtimeServerEventInputAudioBufferSpeechStopped

`func NewRealtimeServerEventInputAudioBufferSpeechStopped(eventId string, type_ string, audioEndMs int32, itemId string, ) *RealtimeServerEventInputAudioBufferSpeechStopped`

NewRealtimeServerEventInputAudioBufferSpeechStopped instantiates a new RealtimeServerEventInputAudioBufferSpeechStopped object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventInputAudioBufferSpeechStoppedWithDefaults

`func NewRealtimeServerEventInputAudioBufferSpeechStoppedWithDefaults() *RealtimeServerEventInputAudioBufferSpeechStopped`

NewRealtimeServerEventInputAudioBufferSpeechStoppedWithDefaults instantiates a new RealtimeServerEventInputAudioBufferSpeechStopped object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventInputAudioBufferSpeechStopped) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventInputAudioBufferSpeechStopped) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventInputAudioBufferSpeechStopped) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventInputAudioBufferSpeechStopped) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventInputAudioBufferSpeechStopped) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventInputAudioBufferSpeechStopped) SetType(v string)`

SetType sets Type field to given value.


### GetAudioEndMs

`func (o *RealtimeServerEventInputAudioBufferSpeechStopped) GetAudioEndMs() int32`

GetAudioEndMs returns the AudioEndMs field if non-nil, zero value otherwise.

### GetAudioEndMsOk

`func (o *RealtimeServerEventInputAudioBufferSpeechStopped) GetAudioEndMsOk() (*int32, bool)`

GetAudioEndMsOk returns a tuple with the AudioEndMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudioEndMs

`func (o *RealtimeServerEventInputAudioBufferSpeechStopped) SetAudioEndMs(v int32)`

SetAudioEndMs sets AudioEndMs field to given value.


### GetItemId

`func (o *RealtimeServerEventInputAudioBufferSpeechStopped) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *RealtimeServerEventInputAudioBufferSpeechStopped) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *RealtimeServerEventInputAudioBufferSpeechStopped) SetItemId(v string)`

SetItemId sets ItemId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


