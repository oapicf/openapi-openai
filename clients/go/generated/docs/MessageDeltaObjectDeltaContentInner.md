# MessageDeltaObjectDeltaContentInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int32** | The index of the content part in the message. | 
**Type** | **string** | Always &#x60;image_file&#x60;. | 
**ImageFile** | Pointer to [**MessageDeltaContentImageFileObjectImageFile**](MessageDeltaContentImageFileObjectImageFile.md) |  | [optional] 
**Text** | Pointer to [**MessageDeltaContentTextObjectText**](MessageDeltaContentTextObjectText.md) |  | [optional] 
**Refusal** | Pointer to **string** |  | [optional] 
**ImageUrl** | Pointer to [**MessageDeltaContentImageUrlObjectImageUrl**](MessageDeltaContentImageUrlObjectImageUrl.md) |  | [optional] 

## Methods

### NewMessageDeltaObjectDeltaContentInner

`func NewMessageDeltaObjectDeltaContentInner(index int32, type_ string, ) *MessageDeltaObjectDeltaContentInner`

NewMessageDeltaObjectDeltaContentInner instantiates a new MessageDeltaObjectDeltaContentInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageDeltaObjectDeltaContentInnerWithDefaults

`func NewMessageDeltaObjectDeltaContentInnerWithDefaults() *MessageDeltaObjectDeltaContentInner`

NewMessageDeltaObjectDeltaContentInnerWithDefaults instantiates a new MessageDeltaObjectDeltaContentInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIndex

`func (o *MessageDeltaObjectDeltaContentInner) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *MessageDeltaObjectDeltaContentInner) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *MessageDeltaObjectDeltaContentInner) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetType

`func (o *MessageDeltaObjectDeltaContentInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageDeltaObjectDeltaContentInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageDeltaObjectDeltaContentInner) SetType(v string)`

SetType sets Type field to given value.


### GetImageFile

`func (o *MessageDeltaObjectDeltaContentInner) GetImageFile() MessageDeltaContentImageFileObjectImageFile`

GetImageFile returns the ImageFile field if non-nil, zero value otherwise.

### GetImageFileOk

`func (o *MessageDeltaObjectDeltaContentInner) GetImageFileOk() (*MessageDeltaContentImageFileObjectImageFile, bool)`

GetImageFileOk returns a tuple with the ImageFile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageFile

`func (o *MessageDeltaObjectDeltaContentInner) SetImageFile(v MessageDeltaContentImageFileObjectImageFile)`

SetImageFile sets ImageFile field to given value.

### HasImageFile

`func (o *MessageDeltaObjectDeltaContentInner) HasImageFile() bool`

HasImageFile returns a boolean if a field has been set.

### GetText

`func (o *MessageDeltaObjectDeltaContentInner) GetText() MessageDeltaContentTextObjectText`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *MessageDeltaObjectDeltaContentInner) GetTextOk() (*MessageDeltaContentTextObjectText, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *MessageDeltaObjectDeltaContentInner) SetText(v MessageDeltaContentTextObjectText)`

SetText sets Text field to given value.

### HasText

`func (o *MessageDeltaObjectDeltaContentInner) HasText() bool`

HasText returns a boolean if a field has been set.

### GetRefusal

`func (o *MessageDeltaObjectDeltaContentInner) GetRefusal() string`

GetRefusal returns the Refusal field if non-nil, zero value otherwise.

### GetRefusalOk

`func (o *MessageDeltaObjectDeltaContentInner) GetRefusalOk() (*string, bool)`

GetRefusalOk returns a tuple with the Refusal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefusal

`func (o *MessageDeltaObjectDeltaContentInner) SetRefusal(v string)`

SetRefusal sets Refusal field to given value.

### HasRefusal

`func (o *MessageDeltaObjectDeltaContentInner) HasRefusal() bool`

HasRefusal returns a boolean if a field has been set.

### GetImageUrl

`func (o *MessageDeltaObjectDeltaContentInner) GetImageUrl() MessageDeltaContentImageUrlObjectImageUrl`

GetImageUrl returns the ImageUrl field if non-nil, zero value otherwise.

### GetImageUrlOk

`func (o *MessageDeltaObjectDeltaContentInner) GetImageUrlOk() (*MessageDeltaContentImageUrlObjectImageUrl, bool)`

GetImageUrlOk returns a tuple with the ImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageUrl

`func (o *MessageDeltaObjectDeltaContentInner) SetImageUrl(v MessageDeltaContentImageUrlObjectImageUrl)`

SetImageUrl sets ImageUrl field to given value.

### HasImageUrl

`func (o *MessageDeltaObjectDeltaContentInner) HasImageUrl() bool`

HasImageUrl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


