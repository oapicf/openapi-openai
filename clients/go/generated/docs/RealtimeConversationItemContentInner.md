# RealtimeConversationItemContentInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to **string** | The content type (&#x60;input_text&#x60;, &#x60;input_audio&#x60;, &#x60;item_reference&#x60;, &#x60;text&#x60;).  | [optional] 
**Text** | Pointer to **string** | The text content, used for &#x60;input_text&#x60; and &#x60;text&#x60; content types.  | [optional] 
**Id** | Pointer to **string** | ID of a previous conversation item to reference (for &#x60;item_reference&#x60; content types in &#x60;response.create&#x60; events). These can reference both client and server created items.  | [optional] 
**Audio** | Pointer to **string** | Base64-encoded audio bytes, used for &#x60;input_audio&#x60; content type.  | [optional] 
**Transcript** | Pointer to **string** | The transcript of the audio, used for &#x60;input_audio&#x60; content type.  | [optional] 

## Methods

### NewRealtimeConversationItemContentInner

`func NewRealtimeConversationItemContentInner() *RealtimeConversationItemContentInner`

NewRealtimeConversationItemContentInner instantiates a new RealtimeConversationItemContentInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeConversationItemContentInnerWithDefaults

`func NewRealtimeConversationItemContentInnerWithDefaults() *RealtimeConversationItemContentInner`

NewRealtimeConversationItemContentInnerWithDefaults instantiates a new RealtimeConversationItemContentInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *RealtimeConversationItemContentInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeConversationItemContentInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeConversationItemContentInner) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *RealtimeConversationItemContentInner) HasType() bool`

HasType returns a boolean if a field has been set.

### GetText

`func (o *RealtimeConversationItemContentInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *RealtimeConversationItemContentInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *RealtimeConversationItemContentInner) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *RealtimeConversationItemContentInner) HasText() bool`

HasText returns a boolean if a field has been set.

### GetId

`func (o *RealtimeConversationItemContentInner) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RealtimeConversationItemContentInner) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RealtimeConversationItemContentInner) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *RealtimeConversationItemContentInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetAudio

`func (o *RealtimeConversationItemContentInner) GetAudio() string`

GetAudio returns the Audio field if non-nil, zero value otherwise.

### GetAudioOk

`func (o *RealtimeConversationItemContentInner) GetAudioOk() (*string, bool)`

GetAudioOk returns a tuple with the Audio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudio

`func (o *RealtimeConversationItemContentInner) SetAudio(v string)`

SetAudio sets Audio field to given value.

### HasAudio

`func (o *RealtimeConversationItemContentInner) HasAudio() bool`

HasAudio returns a boolean if a field has been set.

### GetTranscript

`func (o *RealtimeConversationItemContentInner) GetTranscript() string`

GetTranscript returns the Transcript field if non-nil, zero value otherwise.

### GetTranscriptOk

`func (o *RealtimeConversationItemContentInner) GetTranscriptOk() (*string, bool)`

GetTranscriptOk returns a tuple with the Transcript field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTranscript

`func (o *RealtimeConversationItemContentInner) SetTranscript(v string)`

SetTranscript sets Transcript field to given value.

### HasTranscript

`func (o *RealtimeConversationItemContentInner) HasTranscript() bool`

HasTranscript returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


