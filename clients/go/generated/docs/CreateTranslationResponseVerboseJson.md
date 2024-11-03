# CreateTranslationResponseVerboseJson

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Language** | **string** | The language of the output translation (always &#x60;english&#x60;). | 
**Duration** | **string** | The duration of the input audio. | 
**Text** | **string** | The translated text. | 
**Segments** | Pointer to [**[]TranscriptionSegment**](TranscriptionSegment.md) | Segments of the translated text and their corresponding details. | [optional] 

## Methods

### NewCreateTranslationResponseVerboseJson

`func NewCreateTranslationResponseVerboseJson(language string, duration string, text string, ) *CreateTranslationResponseVerboseJson`

NewCreateTranslationResponseVerboseJson instantiates a new CreateTranslationResponseVerboseJson object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateTranslationResponseVerboseJsonWithDefaults

`func NewCreateTranslationResponseVerboseJsonWithDefaults() *CreateTranslationResponseVerboseJson`

NewCreateTranslationResponseVerboseJsonWithDefaults instantiates a new CreateTranslationResponseVerboseJson object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLanguage

`func (o *CreateTranslationResponseVerboseJson) GetLanguage() string`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CreateTranslationResponseVerboseJson) GetLanguageOk() (*string, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CreateTranslationResponseVerboseJson) SetLanguage(v string)`

SetLanguage sets Language field to given value.


### GetDuration

`func (o *CreateTranslationResponseVerboseJson) GetDuration() string`

GetDuration returns the Duration field if non-nil, zero value otherwise.

### GetDurationOk

`func (o *CreateTranslationResponseVerboseJson) GetDurationOk() (*string, bool)`

GetDurationOk returns a tuple with the Duration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuration

`func (o *CreateTranslationResponseVerboseJson) SetDuration(v string)`

SetDuration sets Duration field to given value.


### GetText

`func (o *CreateTranslationResponseVerboseJson) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *CreateTranslationResponseVerboseJson) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *CreateTranslationResponseVerboseJson) SetText(v string)`

SetText sets Text field to given value.


### GetSegments

`func (o *CreateTranslationResponseVerboseJson) GetSegments() []TranscriptionSegment`

GetSegments returns the Segments field if non-nil, zero value otherwise.

### GetSegmentsOk

`func (o *CreateTranslationResponseVerboseJson) GetSegmentsOk() (*[]TranscriptionSegment, bool)`

GetSegmentsOk returns a tuple with the Segments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSegments

`func (o *CreateTranslationResponseVerboseJson) SetSegments(v []TranscriptionSegment)`

SetSegments sets Segments field to given value.

### HasSegments

`func (o *CreateTranslationResponseVerboseJson) HasSegments() bool`

HasSegments returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


