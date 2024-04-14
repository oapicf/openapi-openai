# ChatCompletionRequestMessageContentPartImageImageUrl

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Url** | **string** | Either a URL of the image or the base64 encoded image data. | 
**Detail** | Pointer to **string** | Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding). | [optional] [default to "auto"]

## Methods

### NewChatCompletionRequestMessageContentPartImageImageUrl

`func NewChatCompletionRequestMessageContentPartImageImageUrl(url string, ) *ChatCompletionRequestMessageContentPartImageImageUrl`

NewChatCompletionRequestMessageContentPartImageImageUrl instantiates a new ChatCompletionRequestMessageContentPartImageImageUrl object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChatCompletionRequestMessageContentPartImageImageUrlWithDefaults

`func NewChatCompletionRequestMessageContentPartImageImageUrlWithDefaults() *ChatCompletionRequestMessageContentPartImageImageUrl`

NewChatCompletionRequestMessageContentPartImageImageUrlWithDefaults instantiates a new ChatCompletionRequestMessageContentPartImageImageUrl object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUrl

`func (o *ChatCompletionRequestMessageContentPartImageImageUrl) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *ChatCompletionRequestMessageContentPartImageImageUrl) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *ChatCompletionRequestMessageContentPartImageImageUrl) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetDetail

`func (o *ChatCompletionRequestMessageContentPartImageImageUrl) GetDetail() string`

GetDetail returns the Detail field if non-nil, zero value otherwise.

### GetDetailOk

`func (o *ChatCompletionRequestMessageContentPartImageImageUrl) GetDetailOk() (*string, bool)`

GetDetailOk returns a tuple with the Detail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetail

`func (o *ChatCompletionRequestMessageContentPartImageImageUrl) SetDetail(v string)`

SetDetail sets Detail field to given value.

### HasDetail

`func (o *ChatCompletionRequestMessageContentPartImageImageUrl) HasDetail() bool`

HasDetail returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


