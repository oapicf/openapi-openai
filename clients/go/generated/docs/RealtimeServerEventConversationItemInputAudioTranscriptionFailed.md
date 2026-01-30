# RealtimeServerEventConversationItemInputAudioTranscriptionFailed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;conversation.item.input_audio_transcription.failed&#x60;.  | 
**ItemId** | **string** | The ID of the user message item. | 
**ContentIndex** | **int32** | The index of the content part containing the audio. | 
**Error** | [**RealtimeServerEventConversationItemInputAudioTranscriptionFailedError**](RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.md) |  | 

## Methods

### NewRealtimeServerEventConversationItemInputAudioTranscriptionFailed

`func NewRealtimeServerEventConversationItemInputAudioTranscriptionFailed(eventId string, type_ string, itemId string, contentIndex int32, error_ RealtimeServerEventConversationItemInputAudioTranscriptionFailedError, ) *RealtimeServerEventConversationItemInputAudioTranscriptionFailed`

NewRealtimeServerEventConversationItemInputAudioTranscriptionFailed instantiates a new RealtimeServerEventConversationItemInputAudioTranscriptionFailed object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventConversationItemInputAudioTranscriptionFailedWithDefaults

`func NewRealtimeServerEventConversationItemInputAudioTranscriptionFailedWithDefaults() *RealtimeServerEventConversationItemInputAudioTranscriptionFailed`

NewRealtimeServerEventConversationItemInputAudioTranscriptionFailedWithDefaults instantiates a new RealtimeServerEventConversationItemInputAudioTranscriptionFailed object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionFailed) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionFailed) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionFailed) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionFailed) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionFailed) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionFailed) SetType(v string)`

SetType sets Type field to given value.


### GetItemId

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionFailed) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionFailed) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionFailed) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetContentIndex

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionFailed) GetContentIndex() int32`

GetContentIndex returns the ContentIndex field if non-nil, zero value otherwise.

### GetContentIndexOk

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionFailed) GetContentIndexOk() (*int32, bool)`

GetContentIndexOk returns a tuple with the ContentIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentIndex

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionFailed) SetContentIndex(v int32)`

SetContentIndex sets ContentIndex field to given value.


### GetError

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionFailed) GetError() RealtimeServerEventConversationItemInputAudioTranscriptionFailedError`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionFailed) GetErrorOk() (*RealtimeServerEventConversationItemInputAudioTranscriptionFailedError, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *RealtimeServerEventConversationItemInputAudioTranscriptionFailed) SetError(v RealtimeServerEventConversationItemInputAudioTranscriptionFailedError)`

SetError sets Error field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


