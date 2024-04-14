# CreateSpeechRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Model** | [**CreateSpeechRequestModel**](CreateSpeechRequestModel.md) |  | 
**Input** | **string** | The text to generate audio for. The maximum length is 4096 characters. | 
**Voice** | **string** | The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options). | 
**ResponseFormat** | Pointer to **string** | The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;. | [optional] [default to "mp3"]
**Speed** | Pointer to **float32** | The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default. | [optional] [default to 1.0]

## Methods

### NewCreateSpeechRequest

`func NewCreateSpeechRequest(model CreateSpeechRequestModel, input string, voice string, ) *CreateSpeechRequest`

NewCreateSpeechRequest instantiates a new CreateSpeechRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateSpeechRequestWithDefaults

`func NewCreateSpeechRequestWithDefaults() *CreateSpeechRequest`

NewCreateSpeechRequestWithDefaults instantiates a new CreateSpeechRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetModel

`func (o *CreateSpeechRequest) GetModel() CreateSpeechRequestModel`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *CreateSpeechRequest) GetModelOk() (*CreateSpeechRequestModel, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *CreateSpeechRequest) SetModel(v CreateSpeechRequestModel)`

SetModel sets Model field to given value.


### GetInput

`func (o *CreateSpeechRequest) GetInput() string`

GetInput returns the Input field if non-nil, zero value otherwise.

### GetInputOk

`func (o *CreateSpeechRequest) GetInputOk() (*string, bool)`

GetInputOk returns a tuple with the Input field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInput

`func (o *CreateSpeechRequest) SetInput(v string)`

SetInput sets Input field to given value.


### GetVoice

`func (o *CreateSpeechRequest) GetVoice() string`

GetVoice returns the Voice field if non-nil, zero value otherwise.

### GetVoiceOk

`func (o *CreateSpeechRequest) GetVoiceOk() (*string, bool)`

GetVoiceOk returns a tuple with the Voice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVoice

`func (o *CreateSpeechRequest) SetVoice(v string)`

SetVoice sets Voice field to given value.


### GetResponseFormat

`func (o *CreateSpeechRequest) GetResponseFormat() string`

GetResponseFormat returns the ResponseFormat field if non-nil, zero value otherwise.

### GetResponseFormatOk

`func (o *CreateSpeechRequest) GetResponseFormatOk() (*string, bool)`

GetResponseFormatOk returns a tuple with the ResponseFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseFormat

`func (o *CreateSpeechRequest) SetResponseFormat(v string)`

SetResponseFormat sets ResponseFormat field to given value.

### HasResponseFormat

`func (o *CreateSpeechRequest) HasResponseFormat() bool`

HasResponseFormat returns a boolean if a field has been set.

### GetSpeed

`func (o *CreateSpeechRequest) GetSpeed() float32`

GetSpeed returns the Speed field if non-nil, zero value otherwise.

### GetSpeedOk

`func (o *CreateSpeechRequest) GetSpeedOk() (*float32, bool)`

GetSpeedOk returns a tuple with the Speed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpeed

`func (o *CreateSpeechRequest) SetSpeed(v float32)`

SetSpeed sets Speed field to given value.

### HasSpeed

`func (o *CreateSpeechRequest) HasSpeed() bool`

HasSpeed returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


