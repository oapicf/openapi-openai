# ChatCompletionRequestMessageContentPartAudio

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of the content part. Always &#x60;input_audio&#x60;. | 
**InputAudio** | [**ChatCompletionRequestMessageContentPartAudioInputAudio**](ChatCompletionRequestMessageContentPartAudioInputAudio.md) |  | 

## Methods

### NewChatCompletionRequestMessageContentPartAudio

`func NewChatCompletionRequestMessageContentPartAudio(type_ string, inputAudio ChatCompletionRequestMessageContentPartAudioInputAudio, ) *ChatCompletionRequestMessageContentPartAudio`

NewChatCompletionRequestMessageContentPartAudio instantiates a new ChatCompletionRequestMessageContentPartAudio object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionRequestMessageContentPartAudioWithDefaults

`func NewChatCompletionRequestMessageContentPartAudioWithDefaults() *ChatCompletionRequestMessageContentPartAudio`

NewChatCompletionRequestMessageContentPartAudioWithDefaults instantiates a new ChatCompletionRequestMessageContentPartAudio object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *ChatCompletionRequestMessageContentPartAudio) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ChatCompletionRequestMessageContentPartAudio) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ChatCompletionRequestMessageContentPartAudio) SetType(v string)`

SetType sets Type field to given value.


### GetInputAudio

`func (o *ChatCompletionRequestMessageContentPartAudio) GetInputAudio() ChatCompletionRequestMessageContentPartAudioInputAudio`

GetInputAudio returns the InputAudio field if non-nil, zero value otherwise.

### GetInputAudioOk

`func (o *ChatCompletionRequestMessageContentPartAudio) GetInputAudioOk() (*ChatCompletionRequestMessageContentPartAudioInputAudio, bool)`

GetInputAudioOk returns a tuple with the InputAudio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputAudio

`func (o *ChatCompletionRequestMessageContentPartAudio) SetInputAudio(v ChatCompletionRequestMessageContentPartAudioInputAudio)`

SetInputAudio sets InputAudio field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


