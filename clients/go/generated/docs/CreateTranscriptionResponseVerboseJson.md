# CreateTranscriptionResponseVerboseJson

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Language** | **string** | The language of the input audio. | 
**Duration** | **string** | The duration of the input audio. | 
**Text** | **string** | The transcribed text. | 
**Words** | Pointer to [**[]TranscriptionWord**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] 
**Segments** | Pointer to [**[]TranscriptionSegment**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] 

## Methods

### NewCreateTranscriptionResponseVerboseJson

`func NewCreateTranscriptionResponseVerboseJson(language string, duration string, text string, ) *CreateTranscriptionResponseVerboseJson`

NewCreateTranscriptionResponseVerboseJson instantiates a new CreateTranscriptionResponseVerboseJson object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateTranscriptionResponseVerboseJsonWithDefaults

`func NewCreateTranscriptionResponseVerboseJsonWithDefaults() *CreateTranscriptionResponseVerboseJson`

NewCreateTranscriptionResponseVerboseJsonWithDefaults instantiates a new CreateTranscriptionResponseVerboseJson object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLanguage

`func (o *CreateTranscriptionResponseVerboseJson) GetLanguage() string`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CreateTranscriptionResponseVerboseJson) GetLanguageOk() (*string, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CreateTranscriptionResponseVerboseJson) SetLanguage(v string)`

SetLanguage sets Language field to given value.


### GetDuration

`func (o *CreateTranscriptionResponseVerboseJson) GetDuration() string`

GetDuration returns the Duration field if non-nil, zero value otherwise.

### GetDurationOk

`func (o *CreateTranscriptionResponseVerboseJson) GetDurationOk() (*string, bool)`

GetDurationOk returns a tuple with the Duration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuration

`func (o *CreateTranscriptionResponseVerboseJson) SetDuration(v string)`

SetDuration sets Duration field to given value.


### GetText

`func (o *CreateTranscriptionResponseVerboseJson) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *CreateTranscriptionResponseVerboseJson) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *CreateTranscriptionResponseVerboseJson) SetText(v string)`

SetText sets Text field to given value.


### GetWords

`func (o *CreateTranscriptionResponseVerboseJson) GetWords() []TranscriptionWord`

GetWords returns the Words field if non-nil, zero value otherwise.

### GetWordsOk

`func (o *CreateTranscriptionResponseVerboseJson) GetWordsOk() (*[]TranscriptionWord, bool)`

GetWordsOk returns a tuple with the Words field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWords

`func (o *CreateTranscriptionResponseVerboseJson) SetWords(v []TranscriptionWord)`

SetWords sets Words field to given value.

### HasWords

`func (o *CreateTranscriptionResponseVerboseJson) HasWords() bool`

HasWords returns a boolean if a field has been set.

### GetSegments

`func (o *CreateTranscriptionResponseVerboseJson) GetSegments() []TranscriptionSegment`

GetSegments returns the Segments field if non-nil, zero value otherwise.

### GetSegmentsOk

`func (o *CreateTranscriptionResponseVerboseJson) GetSegmentsOk() (*[]TranscriptionSegment, bool)`

GetSegmentsOk returns a tuple with the Segments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSegments

`func (o *CreateTranscriptionResponseVerboseJson) SetSegments(v []TranscriptionSegment)`

SetSegments sets Segments field to given value.

### HasSegments

`func (o *CreateTranscriptionResponseVerboseJson) HasSegments() bool`

HasSegments returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


