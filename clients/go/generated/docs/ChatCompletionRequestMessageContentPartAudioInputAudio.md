# ChatCompletionRequestMessageContentPartAudioInputAudio

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | **string** | Base64 encoded audio data. | 
**Format** | **string** | The format of the encoded audio data. Currently supports \&quot;wav\&quot; and \&quot;mp3\&quot;.  | 

## Methods

### NewChatCompletionRequestMessageContentPartAudioInputAudio

`func NewChatCompletionRequestMessageContentPartAudioInputAudio(data string, format string, ) *ChatCompletionRequestMessageContentPartAudioInputAudio`

NewChatCompletionRequestMessageContentPartAudioInputAudio instantiates a new ChatCompletionRequestMessageContentPartAudioInputAudio object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionRequestMessageContentPartAudioInputAudioWithDefaults

`func NewChatCompletionRequestMessageContentPartAudioInputAudioWithDefaults() *ChatCompletionRequestMessageContentPartAudioInputAudio`

NewChatCompletionRequestMessageContentPartAudioInputAudioWithDefaults instantiates a new ChatCompletionRequestMessageContentPartAudioInputAudio object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ChatCompletionRequestMessageContentPartAudioInputAudio) GetData() string`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ChatCompletionRequestMessageContentPartAudioInputAudio) GetDataOk() (*string, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ChatCompletionRequestMessageContentPartAudioInputAudio) SetData(v string)`

SetData sets Data field to given value.


### GetFormat

`func (o *ChatCompletionRequestMessageContentPartAudioInputAudio) GetFormat() string`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *ChatCompletionRequestMessageContentPartAudioInputAudio) GetFormatOk() (*string, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *ChatCompletionRequestMessageContentPartAudioInputAudio) SetFormat(v string)`

SetFormat sets Format field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


