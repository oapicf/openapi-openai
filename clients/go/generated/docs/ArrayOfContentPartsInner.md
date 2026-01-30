# ArrayOfContentPartsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Always &#x60;image_file&#x60;. | 
**ImageFile** | [**MessageContentImageFileObjectImageFile**](MessageContentImageFileObjectImageFile.md) |  | 
**ImageUrl** | [**MessageContentImageUrlObjectImageUrl**](MessageContentImageUrlObjectImageUrl.md) |  | 
**Text** | **string** | Text content to be sent to the model | 

## Methods

### NewArrayOfContentPartsInner

`func NewArrayOfContentPartsInner(type_ string, imageFile MessageContentImageFileObjectImageFile, imageUrl MessageContentImageUrlObjectImageUrl, text string, ) *ArrayOfContentPartsInner`

NewArrayOfContentPartsInner instantiates a new ArrayOfContentPartsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewArrayOfContentPartsInnerWithDefaults

`func NewArrayOfContentPartsInnerWithDefaults() *ArrayOfContentPartsInner`

NewArrayOfContentPartsInnerWithDefaults instantiates a new ArrayOfContentPartsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *ArrayOfContentPartsInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ArrayOfContentPartsInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ArrayOfContentPartsInner) SetType(v string)`

SetType sets Type field to given value.


### GetImageFile

`func (o *ArrayOfContentPartsInner) GetImageFile() MessageContentImageFileObjectImageFile`

GetImageFile returns the ImageFile field if non-nil, zero value otherwise.

### GetImageFileOk

`func (o *ArrayOfContentPartsInner) GetImageFileOk() (*MessageContentImageFileObjectImageFile, bool)`

GetImageFileOk returns a tuple with the ImageFile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageFile

`func (o *ArrayOfContentPartsInner) SetImageFile(v MessageContentImageFileObjectImageFile)`

SetImageFile sets ImageFile field to given value.


### GetImageUrl

`func (o *ArrayOfContentPartsInner) GetImageUrl() MessageContentImageUrlObjectImageUrl`

GetImageUrl returns the ImageUrl field if non-nil, zero value otherwise.

### GetImageUrlOk

`func (o *ArrayOfContentPartsInner) GetImageUrlOk() (*MessageContentImageUrlObjectImageUrl, bool)`

GetImageUrlOk returns a tuple with the ImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageUrl

`func (o *ArrayOfContentPartsInner) SetImageUrl(v MessageContentImageUrlObjectImageUrl)`

SetImageUrl sets ImageUrl field to given value.


### GetText

`func (o *ArrayOfContentPartsInner) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *ArrayOfContentPartsInner) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *ArrayOfContentPartsInner) SetText(v string)`

SetText sets Text field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


