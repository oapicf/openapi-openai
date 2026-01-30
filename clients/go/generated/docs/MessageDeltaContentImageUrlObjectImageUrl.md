# MessageDeltaContentImageUrlObjectImageUrl

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Url** | Pointer to **string** | The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. | [optional] 
**Detail** | Pointer to **string** | Specifies the detail level of the image. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;. | [optional] [default to "auto"]

## Methods

### NewMessageDeltaContentImageUrlObjectImageUrl

`func NewMessageDeltaContentImageUrlObjectImageUrl() *MessageDeltaContentImageUrlObjectImageUrl`

NewMessageDeltaContentImageUrlObjectImageUrl instantiates a new MessageDeltaContentImageUrlObjectImageUrl object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageDeltaContentImageUrlObjectImageUrlWithDefaults

`func NewMessageDeltaContentImageUrlObjectImageUrlWithDefaults() *MessageDeltaContentImageUrlObjectImageUrl`

NewMessageDeltaContentImageUrlObjectImageUrlWithDefaults instantiates a new MessageDeltaContentImageUrlObjectImageUrl object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUrl

`func (o *MessageDeltaContentImageUrlObjectImageUrl) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *MessageDeltaContentImageUrlObjectImageUrl) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *MessageDeltaContentImageUrlObjectImageUrl) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *MessageDeltaContentImageUrlObjectImageUrl) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetDetail

`func (o *MessageDeltaContentImageUrlObjectImageUrl) GetDetail() string`

GetDetail returns the Detail field if non-nil, zero value otherwise.

### GetDetailOk

`func (o *MessageDeltaContentImageUrlObjectImageUrl) GetDetailOk() (*string, bool)`

GetDetailOk returns a tuple with the Detail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetail

`func (o *MessageDeltaContentImageUrlObjectImageUrl) SetDetail(v string)`

SetDetail sets Detail field to given value.

### HasDetail

`func (o *MessageDeltaContentImageUrlObjectImageUrl) HasDetail() bool`

HasDetail returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


