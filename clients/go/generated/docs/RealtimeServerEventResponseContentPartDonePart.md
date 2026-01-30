# RealtimeServerEventResponseContentPartDonePart

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to **string** | The content type (\&quot;text\&quot;, \&quot;audio\&quot;). | [optional] 
**Text** | Pointer to **string** | The text content (if type is \&quot;text\&quot;). | [optional] 
**Audio** | Pointer to **string** | Base64-encoded audio data (if type is \&quot;audio\&quot;). | [optional] 
**Transcript** | Pointer to **string** | The transcript of the audio (if type is \&quot;audio\&quot;). | [optional] 

## Methods

### NewRealtimeServerEventResponseContentPartDonePart

`func NewRealtimeServerEventResponseContentPartDonePart() *RealtimeServerEventResponseContentPartDonePart`

NewRealtimeServerEventResponseContentPartDonePart instantiates a new RealtimeServerEventResponseContentPartDonePart object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventResponseContentPartDonePartWithDefaults

`func NewRealtimeServerEventResponseContentPartDonePartWithDefaults() *RealtimeServerEventResponseContentPartDonePart`

NewRealtimeServerEventResponseContentPartDonePartWithDefaults instantiates a new RealtimeServerEventResponseContentPartDonePart object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *RealtimeServerEventResponseContentPartDonePart) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventResponseContentPartDonePart) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventResponseContentPartDonePart) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *RealtimeServerEventResponseContentPartDonePart) HasType() bool`

HasType returns a boolean if a field has been set.

### GetText

`func (o *RealtimeServerEventResponseContentPartDonePart) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *RealtimeServerEventResponseContentPartDonePart) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *RealtimeServerEventResponseContentPartDonePart) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *RealtimeServerEventResponseContentPartDonePart) HasText() bool`

HasText returns a boolean if a field has been set.

### GetAudio

`func (o *RealtimeServerEventResponseContentPartDonePart) GetAudio() string`

GetAudio returns the Audio field if non-nil, zero value otherwise.

### GetAudioOk

`func (o *RealtimeServerEventResponseContentPartDonePart) GetAudioOk() (*string, bool)`

GetAudioOk returns a tuple with the Audio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudio

`func (o *RealtimeServerEventResponseContentPartDonePart) SetAudio(v string)`

SetAudio sets Audio field to given value.

### HasAudio

`func (o *RealtimeServerEventResponseContentPartDonePart) HasAudio() bool`

HasAudio returns a boolean if a field has been set.

### GetTranscript

`func (o *RealtimeServerEventResponseContentPartDonePart) GetTranscript() string`

GetTranscript returns the Transcript field if non-nil, zero value otherwise.

### GetTranscriptOk

`func (o *RealtimeServerEventResponseContentPartDonePart) GetTranscriptOk() (*string, bool)`

GetTranscriptOk returns a tuple with the Transcript field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTranscript

`func (o *RealtimeServerEventResponseContentPartDonePart) SetTranscript(v string)`

SetTranscript sets Transcript field to given value.

### HasTranscript

`func (o *RealtimeServerEventResponseContentPartDonePart) HasTranscript() bool`

HasTranscript returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


