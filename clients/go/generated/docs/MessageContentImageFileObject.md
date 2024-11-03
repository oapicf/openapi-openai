# MessageContentImageFileObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Always &#x60;image_file&#x60;. | 
**ImageFile** | [**MessageContentImageFileObjectImageFile**](MessageContentImageFileObjectImageFile.md) |  | 

## Methods

### NewMessageContentImageFileObject

`func NewMessageContentImageFileObject(type_ string, imageFile MessageContentImageFileObjectImageFile, ) *MessageContentImageFileObject`

NewMessageContentImageFileObject instantiates a new MessageContentImageFileObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageContentImageFileObjectWithDefaults

`func NewMessageContentImageFileObjectWithDefaults() *MessageContentImageFileObject`

NewMessageContentImageFileObjectWithDefaults instantiates a new MessageContentImageFileObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *MessageContentImageFileObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageContentImageFileObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageContentImageFileObject) SetType(v string)`

SetType sets Type field to given value.


### GetImageFile

`func (o *MessageContentImageFileObject) GetImageFile() MessageContentImageFileObjectImageFile`

GetImageFile returns the ImageFile field if non-nil, zero value otherwise.

### GetImageFileOk

`func (o *MessageContentImageFileObject) GetImageFileOk() (*MessageContentImageFileObjectImageFile, bool)`

GetImageFileOk returns a tuple with the ImageFile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageFile

`func (o *MessageContentImageFileObject) SetImageFile(v MessageContentImageFileObjectImageFile)`

SetImageFile sets ImageFile field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


