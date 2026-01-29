# TranscriptionWord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Word** | **string** | The text content of the word. | 
**Start** | **float32** | Start time of the word in seconds. | 
**End** | **float32** | End time of the word in seconds. | 

## Methods

### NewTranscriptionWord

`func NewTranscriptionWord(word string, start float32, end float32, ) *TranscriptionWord`

NewTranscriptionWord instantiates a new TranscriptionWord object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTranscriptionWordWithDefaults

`func NewTranscriptionWordWithDefaults() *TranscriptionWord`

NewTranscriptionWordWithDefaults instantiates a new TranscriptionWord object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetWord

`func (o *TranscriptionWord) GetWord() string`

GetWord returns the Word field if non-nil, zero value otherwise.

### GetWordOk

`func (o *TranscriptionWord) GetWordOk() (*string, bool)`

GetWordOk returns a tuple with the Word field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWord

`func (o *TranscriptionWord) SetWord(v string)`

SetWord sets Word field to given value.


### GetStart

`func (o *TranscriptionWord) GetStart() float32`

GetStart returns the Start field if non-nil, zero value otherwise.

### GetStartOk

`func (o *TranscriptionWord) GetStartOk() (*float32, bool)`

GetStartOk returns a tuple with the Start field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStart

`func (o *TranscriptionWord) SetStart(v float32)`

SetStart sets Start field to given value.


### GetEnd

`func (o *TranscriptionWord) GetEnd() float32`

GetEnd returns the End field if non-nil, zero value otherwise.

### GetEndOk

`func (o *TranscriptionWord) GetEndOk() (*float32, bool)`

GetEndOk returns a tuple with the End field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnd

`func (o *TranscriptionWord) SetEnd(v float32)`

SetEnd sets End field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


