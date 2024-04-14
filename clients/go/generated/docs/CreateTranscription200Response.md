# CreateTranscription200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Text** | **string** | The transcribed text. | 
**Language** | **string** | The language of the input audio. | 
**Duration** | **string** | The duration of the input audio. | 
**Words** | Pointer to [**[]TranscriptionWord**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] 
**Segments** | Pointer to [**[]TranscriptionSegment**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] 

## Methods

### NewCreateTranscription200Response

`func NewCreateTranscription200Response(text string, language string, duration string, ) *CreateTranscription200Response`

NewCreateTranscription200Response instantiates a new CreateTranscription200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateTranscription200ResponseWithDefaults

`func NewCreateTranscription200ResponseWithDefaults() *CreateTranscription200Response`

NewCreateTranscription200ResponseWithDefaults instantiates a new CreateTranscription200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetText

`func (o *CreateTranscription200Response) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *CreateTranscription200Response) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *CreateTranscription200Response) SetText(v string)`

SetText sets Text field to given value.


### GetLanguage

`func (o *CreateTranscription200Response) GetLanguage() string`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CreateTranscription200Response) GetLanguageOk() (*string, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CreateTranscription200Response) SetLanguage(v string)`

SetLanguage sets Language field to given value.


### GetDuration

`func (o *CreateTranscription200Response) GetDuration() string`

GetDuration returns the Duration field if non-nil, zero value otherwise.

### GetDurationOk

`func (o *CreateTranscription200Response) GetDurationOk() (*string, bool)`

GetDurationOk returns a tuple with the Duration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuration

`func (o *CreateTranscription200Response) SetDuration(v string)`

SetDuration sets Duration field to given value.


### GetWords

`func (o *CreateTranscription200Response) GetWords() []TranscriptionWord`

GetWords returns the Words field if non-nil, zero value otherwise.

### GetWordsOk

`func (o *CreateTranscription200Response) GetWordsOk() (*[]TranscriptionWord, bool)`

GetWordsOk returns a tuple with the Words field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWords

`func (o *CreateTranscription200Response) SetWords(v []TranscriptionWord)`

SetWords sets Words field to given value.

### HasWords

`func (o *CreateTranscription200Response) HasWords() bool`

HasWords returns a boolean if a field has been set.

### GetSegments

`func (o *CreateTranscription200Response) GetSegments() []TranscriptionSegment`

GetSegments returns the Segments field if non-nil, zero value otherwise.

### GetSegmentsOk

`func (o *CreateTranscription200Response) GetSegmentsOk() (*[]TranscriptionSegment, bool)`

GetSegmentsOk returns a tuple with the Segments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSegments

`func (o *CreateTranscription200Response) SetSegments(v []TranscriptionSegment)`

SetSegments sets Segments field to given value.

### HasSegments

`func (o *CreateTranscription200Response) HasSegments() bool`

HasSegments returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


