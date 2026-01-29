# CreateTranslation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Text** | **string** | The translated text. | 
**Language** | **string** | The language of the output translation (always &#x60;english&#x60;). | 
**Duration** | **string** | The duration of the input audio. | 
**Segments** | Pointer to [**[]TranscriptionSegment**](TranscriptionSegment.md) | Segments of the translated text and their corresponding details. | [optional] 

## Methods

### NewCreateTranslation200Response

`func NewCreateTranslation200Response(text string, language string, duration string, ) *CreateTranslation200Response`

NewCreateTranslation200Response instantiates a new CreateTranslation200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateTranslation200ResponseWithDefaults

`func NewCreateTranslation200ResponseWithDefaults() *CreateTranslation200Response`

NewCreateTranslation200ResponseWithDefaults instantiates a new CreateTranslation200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetText

`func (o *CreateTranslation200Response) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *CreateTranslation200Response) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *CreateTranslation200Response) SetText(v string)`

SetText sets Text field to given value.


### GetLanguage

`func (o *CreateTranslation200Response) GetLanguage() string`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CreateTranslation200Response) GetLanguageOk() (*string, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CreateTranslation200Response) SetLanguage(v string)`

SetLanguage sets Language field to given value.


### GetDuration

`func (o *CreateTranslation200Response) GetDuration() string`

GetDuration returns the Duration field if non-nil, zero value otherwise.

### GetDurationOk

`func (o *CreateTranslation200Response) GetDurationOk() (*string, bool)`

GetDurationOk returns a tuple with the Duration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuration

`func (o *CreateTranslation200Response) SetDuration(v string)`

SetDuration sets Duration field to given value.


### GetSegments

`func (o *CreateTranslation200Response) GetSegments() []TranscriptionSegment`

GetSegments returns the Segments field if non-nil, zero value otherwise.

### GetSegmentsOk

`func (o *CreateTranslation200Response) GetSegmentsOk() (*[]TranscriptionSegment, bool)`

GetSegmentsOk returns a tuple with the Segments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSegments

`func (o *CreateTranslation200Response) SetSegments(v []TranscriptionSegment)`

SetSegments sets Segments field to given value.

### HasSegments

`func (o *CreateTranslation200Response) HasSegments() bool`

HasSegments returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


