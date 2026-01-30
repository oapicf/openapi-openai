# RealtimeServerEventResponseContentPartAddedPart

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to **string** | The content type (\&quot;text\&quot;, \&quot;audio\&quot;). | [optional] 
**Text** | Pointer to **string** | The text content (if type is \&quot;text\&quot;). | [optional] 
**Audio** | Pointer to **string** | Base64-encoded audio data (if type is \&quot;audio\&quot;). | [optional] 
**Transcript** | Pointer to **string** | The transcript of the audio (if type is \&quot;audio\&quot;). | [optional] 

## Methods

### NewRealtimeServerEventResponseContentPartAddedPart

`func NewRealtimeServerEventResponseContentPartAddedPart() *RealtimeServerEventResponseContentPartAddedPart`

NewRealtimeServerEventResponseContentPartAddedPart instantiates a new RealtimeServerEventResponseContentPartAddedPart object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventResponseContentPartAddedPartWithDefaults

`func NewRealtimeServerEventResponseContentPartAddedPartWithDefaults() *RealtimeServerEventResponseContentPartAddedPart`

NewRealtimeServerEventResponseContentPartAddedPartWithDefaults instantiates a new RealtimeServerEventResponseContentPartAddedPart object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *RealtimeServerEventResponseContentPartAddedPart) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventResponseContentPartAddedPart) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventResponseContentPartAddedPart) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *RealtimeServerEventResponseContentPartAddedPart) HasType() bool`

HasType returns a boolean if a field has been set.

### GetText

`func (o *RealtimeServerEventResponseContentPartAddedPart) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *RealtimeServerEventResponseContentPartAddedPart) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *RealtimeServerEventResponseContentPartAddedPart) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *RealtimeServerEventResponseContentPartAddedPart) HasText() bool`

HasText returns a boolean if a field has been set.

### GetAudio

`func (o *RealtimeServerEventResponseContentPartAddedPart) GetAudio() string`

GetAudio returns the Audio field if non-nil, zero value otherwise.

### GetAudioOk

`func (o *RealtimeServerEventResponseContentPartAddedPart) GetAudioOk() (*string, bool)`

GetAudioOk returns a tuple with the Audio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudio

`func (o *RealtimeServerEventResponseContentPartAddedPart) SetAudio(v string)`

SetAudio sets Audio field to given value.

### HasAudio

`func (o *RealtimeServerEventResponseContentPartAddedPart) HasAudio() bool`

HasAudio returns a boolean if a field has been set.

### GetTranscript

`func (o *RealtimeServerEventResponseContentPartAddedPart) GetTranscript() string`

GetTranscript returns the Transcript field if non-nil, zero value otherwise.

### GetTranscriptOk

`func (o *RealtimeServerEventResponseContentPartAddedPart) GetTranscriptOk() (*string, bool)`

GetTranscriptOk returns a tuple with the Transcript field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTranscript

`func (o *RealtimeServerEventResponseContentPartAddedPart) SetTranscript(v string)`

SetTranscript sets Transcript field to given value.

### HasTranscript

`func (o *RealtimeServerEventResponseContentPartAddedPart) HasTranscript() bool`

HasTranscript returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


