# CreateChatCompletionRequestAudio

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Voice** | **string** | The voice the model uses to respond. Supported voices are &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;sage&#x60;, and &#x60;verse&#x60; (also supported but not recommended are &#x60;alloy&#x60;, &#x60;echo&#x60;, and &#x60;shimmer&#x60;; these voices are less expressive).  | 
**Format** | **string** | Specifies the output audio format. Must be one of &#x60;wav&#x60;, &#x60;mp3&#x60;, &#x60;flac&#x60;, &#x60;opus&#x60;, or &#x60;pcm16&#x60;.  | 

## Methods

### NewCreateChatCompletionRequestAudio

`func NewCreateChatCompletionRequestAudio(voice string, format string, ) *CreateChatCompletionRequestAudio`

NewCreateChatCompletionRequestAudio instantiates a new CreateChatCompletionRequestAudio object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateChatCompletionRequestAudioWithDefaults

`func NewCreateChatCompletionRequestAudioWithDefaults() *CreateChatCompletionRequestAudio`

NewCreateChatCompletionRequestAudioWithDefaults instantiates a new CreateChatCompletionRequestAudio object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetVoice

`func (o *CreateChatCompletionRequestAudio) GetVoice() string`

GetVoice returns the Voice field if non-nil, zero value otherwise.

### GetVoiceOk

`func (o *CreateChatCompletionRequestAudio) GetVoiceOk() (*string, bool)`

GetVoiceOk returns a tuple with the Voice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVoice

`func (o *CreateChatCompletionRequestAudio) SetVoice(v string)`

SetVoice sets Voice field to given value.


### GetFormat

`func (o *CreateChatCompletionRequestAudio) GetFormat() string`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *CreateChatCompletionRequestAudio) GetFormatOk() (*string, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *CreateChatCompletionRequestAudio) SetFormat(v string)`

SetFormat sets Format field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


