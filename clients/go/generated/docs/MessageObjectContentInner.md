# MessageObjectContentInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Always &#x60;image_file&#x60;. | 
**ImageFile** | [**MessageContentImageFileObjectImageFile**](MessageContentImageFileObjectImageFile.md) |  | 
**ImageUrl** | [**MessageContentImageUrlObjectImageUrl**](MessageContentImageUrlObjectImageUrl.md) |  | 
**Text** | [**MessageContentTextObjectText**](MessageContentTextObjectText.md) |  | 
**Refusal** | **string** |  | 

## Methods

### NewMessageObjectContentInner

`func NewMessageObjectContentInner(type_ string, imageFile MessageContentImageFileObjectImageFile, imageUrl MessageContentImageUrlObjectImageUrl, text MessageContentTextObjectText, refusal string, ) *MessageObjectContentInner`

NewMessageObjectContentInner instantiates a new MessageObjectContentInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageObjectContentInnerWithDefaults

`func NewMessageObjectContentInnerWithDefaults() *MessageObjectContentInner`

NewMessageObjectContentInnerWithDefaults instantiates a new MessageObjectContentInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *MessageObjectContentInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageObjectContentInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageObjectContentInner) SetType(v string)`

SetType sets Type field to given value.


### GetImageFile

`func (o *MessageObjectContentInner) GetImageFile() MessageContentImageFileObjectImageFile`

GetImageFile returns the ImageFile field if non-nil, zero value otherwise.

### GetImageFileOk

`func (o *MessageObjectContentInner) GetImageFileOk() (*MessageContentImageFileObjectImageFile, bool)`

GetImageFileOk returns a tuple with the ImageFile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageFile

`func (o *MessageObjectContentInner) SetImageFile(v MessageContentImageFileObjectImageFile)`

SetImageFile sets ImageFile field to given value.


### GetImageUrl

`func (o *MessageObjectContentInner) GetImageUrl() MessageContentImageUrlObjectImageUrl`

GetImageUrl returns the ImageUrl field if non-nil, zero value otherwise.

### GetImageUrlOk

`func (o *MessageObjectContentInner) GetImageUrlOk() (*MessageContentImageUrlObjectImageUrl, bool)`

GetImageUrlOk returns a tuple with the ImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageUrl

`func (o *MessageObjectContentInner) SetImageUrl(v MessageContentImageUrlObjectImageUrl)`

SetImageUrl sets ImageUrl field to given value.


### GetText

`func (o *MessageObjectContentInner) GetText() MessageContentTextObjectText`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *MessageObjectContentInner) GetTextOk() (*MessageContentTextObjectText, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *MessageObjectContentInner) SetText(v MessageContentTextObjectText)`

SetText sets Text field to given value.


### GetRefusal

`func (o *MessageObjectContentInner) GetRefusal() string`

GetRefusal returns the Refusal field if non-nil, zero value otherwise.

### GetRefusalOk

`func (o *MessageObjectContentInner) GetRefusalOk() (*string, bool)`

GetRefusalOk returns a tuple with the Refusal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefusal

`func (o *MessageObjectContentInner) SetRefusal(v string)`

SetRefusal sets Refusal field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


