# TranscriptionSegment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | Unique identifier of the segment. | 
**Seek** | **int32** | Seek offset of the segment. | 
**Start** | **float32** | Start time of the segment in seconds. | 
**End** | **float32** | End time of the segment in seconds. | 
**Text** | **string** | Text content of the segment. | 
**Tokens** | **[]int32** | Array of token IDs for the text content. | 
**Temperature** | **float32** | Temperature parameter used for generating the segment. | 
**AvgLogprob** | **float32** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. | 
**CompressionRatio** | **float32** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. | 
**NoSpeechProb** | **float32** | Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. | 

## Methods

### NewTranscriptionSegment

`func NewTranscriptionSegment(id int32, seek int32, start float32, end float32, text string, tokens []int32, temperature float32, avgLogprob float32, compressionRatio float32, noSpeechProb float32, ) *TranscriptionSegment`

NewTranscriptionSegment instantiates a new TranscriptionSegment object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTranscriptionSegmentWithDefaults

`func NewTranscriptionSegmentWithDefaults() *TranscriptionSegment`

NewTranscriptionSegmentWithDefaults instantiates a new TranscriptionSegment object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *TranscriptionSegment) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *TranscriptionSegment) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *TranscriptionSegment) SetId(v int32)`

SetId sets Id field to given value.


### GetSeek

`func (o *TranscriptionSegment) GetSeek() int32`

GetSeek returns the Seek field if non-nil, zero value otherwise.

### GetSeekOk

`func (o *TranscriptionSegment) GetSeekOk() (*int32, bool)`

GetSeekOk returns a tuple with the Seek field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSeek

`func (o *TranscriptionSegment) SetSeek(v int32)`

SetSeek sets Seek field to given value.


### GetStart

`func (o *TranscriptionSegment) GetStart() float32`

GetStart returns the Start field if non-nil, zero value otherwise.

### GetStartOk

`func (o *TranscriptionSegment) GetStartOk() (*float32, bool)`

GetStartOk returns a tuple with the Start field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStart

`func (o *TranscriptionSegment) SetStart(v float32)`

SetStart sets Start field to given value.


### GetEnd

`func (o *TranscriptionSegment) GetEnd() float32`

GetEnd returns the End field if non-nil, zero value otherwise.

### GetEndOk

`func (o *TranscriptionSegment) GetEndOk() (*float32, bool)`

GetEndOk returns a tuple with the End field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnd

`func (o *TranscriptionSegment) SetEnd(v float32)`

SetEnd sets End field to given value.


### GetText

`func (o *TranscriptionSegment) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *TranscriptionSegment) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *TranscriptionSegment) SetText(v string)`

SetText sets Text field to given value.


### GetTokens

`func (o *TranscriptionSegment) GetTokens() []int32`

GetTokens returns the Tokens field if non-nil, zero value otherwise.

### GetTokensOk

`func (o *TranscriptionSegment) GetTokensOk() (*[]int32, bool)`

GetTokensOk returns a tuple with the Tokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTokens

`func (o *TranscriptionSegment) SetTokens(v []int32)`

SetTokens sets Tokens field to given value.


### GetTemperature

`func (o *TranscriptionSegment) GetTemperature() float32`

GetTemperature returns the Temperature field if non-nil, zero value otherwise.

### GetTemperatureOk

`func (o *TranscriptionSegment) GetTemperatureOk() (*float32, bool)`

GetTemperatureOk returns a tuple with the Temperature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemperature

`func (o *TranscriptionSegment) SetTemperature(v float32)`

SetTemperature sets Temperature field to given value.


### GetAvgLogprob

`func (o *TranscriptionSegment) GetAvgLogprob() float32`

GetAvgLogprob returns the AvgLogprob field if non-nil, zero value otherwise.

### GetAvgLogprobOk

`func (o *TranscriptionSegment) GetAvgLogprobOk() (*float32, bool)`

GetAvgLogprobOk returns a tuple with the AvgLogprob field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvgLogprob

`func (o *TranscriptionSegment) SetAvgLogprob(v float32)`

SetAvgLogprob sets AvgLogprob field to given value.


### GetCompressionRatio

`func (o *TranscriptionSegment) GetCompressionRatio() float32`

GetCompressionRatio returns the CompressionRatio field if non-nil, zero value otherwise.

### GetCompressionRatioOk

`func (o *TranscriptionSegment) GetCompressionRatioOk() (*float32, bool)`

GetCompressionRatioOk returns a tuple with the CompressionRatio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompressionRatio

`func (o *TranscriptionSegment) SetCompressionRatio(v float32)`

SetCompressionRatio sets CompressionRatio field to given value.


### GetNoSpeechProb

`func (o *TranscriptionSegment) GetNoSpeechProb() float32`

GetNoSpeechProb returns the NoSpeechProb field if non-nil, zero value otherwise.

### GetNoSpeechProbOk

`func (o *TranscriptionSegment) GetNoSpeechProbOk() (*float32, bool)`

GetNoSpeechProbOk returns a tuple with the NoSpeechProb field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNoSpeechProb

`func (o *TranscriptionSegment) SetNoSpeechProb(v float32)`

SetNoSpeechProb sets NoSpeechProb field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


