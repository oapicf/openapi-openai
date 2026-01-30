# RealtimeClientEventInputAudioBufferAppend

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | Pointer to **string** | Optional client-generated ID used to identify this event. | [optional] 
**Type** | **string** | The event type, must be &#x60;input_audio_buffer.append&#x60;. | 
**Audio** | **string** | Base64-encoded audio bytes. This must be in the format specified by the  &#x60;input_audio_format&#x60; field in the session configuration.  | 

## Methods

### NewRealtimeClientEventInputAudioBufferAppend

`func NewRealtimeClientEventInputAudioBufferAppend(type_ string, audio string, ) *RealtimeClientEventInputAudioBufferAppend`

NewRealtimeClientEventInputAudioBufferAppend instantiates a new RealtimeClientEventInputAudioBufferAppend object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeClientEventInputAudioBufferAppendWithDefaults

`func NewRealtimeClientEventInputAudioBufferAppendWithDefaults() *RealtimeClientEventInputAudioBufferAppend`

NewRealtimeClientEventInputAudioBufferAppendWithDefaults instantiates a new RealtimeClientEventInputAudioBufferAppend object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeClientEventInputAudioBufferAppend) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeClientEventInputAudioBufferAppend) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeClientEventInputAudioBufferAppend) SetEventId(v string)`

SetEventId sets EventId field to given value.

### HasEventId

`func (o *RealtimeClientEventInputAudioBufferAppend) HasEventId() bool`

HasEventId returns a boolean if a field has been set.

### GetType

`func (o *RealtimeClientEventInputAudioBufferAppend) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeClientEventInputAudioBufferAppend) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeClientEventInputAudioBufferAppend) SetType(v string)`

SetType sets Type field to given value.


### GetAudio

`func (o *RealtimeClientEventInputAudioBufferAppend) GetAudio() string`

GetAudio returns the Audio field if non-nil, zero value otherwise.

### GetAudioOk

`func (o *RealtimeClientEventInputAudioBufferAppend) GetAudioOk() (*string, bool)`

GetAudioOk returns a tuple with the Audio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudio

`func (o *RealtimeClientEventInputAudioBufferAppend) SetAudio(v string)`

SetAudio sets Audio field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


