# ChatCompletionRequestUserMessageContentPart

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of the content part. | 
**Text** | **string** | The text content. | 
**ImageUrl** | [**ChatCompletionRequestMessageContentPartImageImageUrl**](ChatCompletionRequestMessageContentPartImageImageUrl.md) |  | 
**InputAudio** | [**ChatCompletionRequestMessageContentPartAudioInputAudio**](ChatCompletionRequestMessageContentPartAudioInputAudio.md) |  | 

## Methods

### NewChatCompletionRequestUserMessageContentPart

`func NewChatCompletionRequestUserMessageContentPart(type_ string, text string, imageUrl ChatCompletionRequestMessageContentPartImageImageUrl, inputAudio ChatCompletionRequestMessageContentPartAudioInputAudio, ) *ChatCompletionRequestUserMessageContentPart`

NewChatCompletionRequestUserMessageContentPart instantiates a new ChatCompletionRequestUserMessageContentPart object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionRequestUserMessageContentPartWithDefaults

`func NewChatCompletionRequestUserMessageContentPartWithDefaults() *ChatCompletionRequestUserMessageContentPart`

NewChatCompletionRequestUserMessageContentPartWithDefaults instantiates a new ChatCompletionRequestUserMessageContentPart object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *ChatCompletionRequestUserMessageContentPart) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ChatCompletionRequestUserMessageContentPart) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ChatCompletionRequestUserMessageContentPart) SetType(v string)`

SetType sets Type field to given value.


### GetText

`func (o *ChatCompletionRequestUserMessageContentPart) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *ChatCompletionRequestUserMessageContentPart) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *ChatCompletionRequestUserMessageContentPart) SetText(v string)`

SetText sets Text field to given value.


### GetImageUrl

`func (o *ChatCompletionRequestUserMessageContentPart) GetImageUrl() ChatCompletionRequestMessageContentPartImageImageUrl`

GetImageUrl returns the ImageUrl field if non-nil, zero value otherwise.

### GetImageUrlOk

`func (o *ChatCompletionRequestUserMessageContentPart) GetImageUrlOk() (*ChatCompletionRequestMessageContentPartImageImageUrl, bool)`

GetImageUrlOk returns a tuple with the ImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageUrl

`func (o *ChatCompletionRequestUserMessageContentPart) SetImageUrl(v ChatCompletionRequestMessageContentPartImageImageUrl)`

SetImageUrl sets ImageUrl field to given value.


### GetInputAudio

`func (o *ChatCompletionRequestUserMessageContentPart) GetInputAudio() ChatCompletionRequestMessageContentPartAudioInputAudio`

GetInputAudio returns the InputAudio field if non-nil, zero value otherwise.

### GetInputAudioOk

`func (o *ChatCompletionRequestUserMessageContentPart) GetInputAudioOk() (*ChatCompletionRequestMessageContentPartAudioInputAudio, bool)`

GetInputAudioOk returns a tuple with the InputAudio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputAudio

`func (o *ChatCompletionRequestUserMessageContentPart) SetInputAudio(v ChatCompletionRequestMessageContentPartAudioInputAudio)`

SetInputAudio sets InputAudio field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


