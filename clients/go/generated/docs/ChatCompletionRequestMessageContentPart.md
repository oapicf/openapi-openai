# ChatCompletionRequestMessageContentPart

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of the content part. | 
**Text** | **string** | The text content. | 
**ImageUrl** | [**ChatCompletionRequestMessageContentPartImageImageUrl**](ChatCompletionRequestMessageContentPartImageImageUrl.md) |  | 

## Methods

### NewChatCompletionRequestMessageContentPart

`func NewChatCompletionRequestMessageContentPart(type_ string, text string, imageUrl ChatCompletionRequestMessageContentPartImageImageUrl, ) *ChatCompletionRequestMessageContentPart`

NewChatCompletionRequestMessageContentPart instantiates a new ChatCompletionRequestMessageContentPart object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionRequestMessageContentPartWithDefaults

`func NewChatCompletionRequestMessageContentPartWithDefaults() *ChatCompletionRequestMessageContentPart`

NewChatCompletionRequestMessageContentPartWithDefaults instantiates a new ChatCompletionRequestMessageContentPart object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *ChatCompletionRequestMessageContentPart) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ChatCompletionRequestMessageContentPart) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ChatCompletionRequestMessageContentPart) SetType(v string)`

SetType sets Type field to given value.


### GetText

`func (o *ChatCompletionRequestMessageContentPart) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *ChatCompletionRequestMessageContentPart) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *ChatCompletionRequestMessageContentPart) SetText(v string)`

SetText sets Text field to given value.


### GetImageUrl

`func (o *ChatCompletionRequestMessageContentPart) GetImageUrl() ChatCompletionRequestMessageContentPartImageImageUrl`

GetImageUrl returns the ImageUrl field if non-nil, zero value otherwise.

### GetImageUrlOk

`func (o *ChatCompletionRequestMessageContentPart) GetImageUrlOk() (*ChatCompletionRequestMessageContentPartImageImageUrl, bool)`

GetImageUrlOk returns a tuple with the ImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageUrl

`func (o *ChatCompletionRequestMessageContentPart) SetImageUrl(v ChatCompletionRequestMessageContentPartImageImageUrl)`

SetImageUrl sets ImageUrl field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


