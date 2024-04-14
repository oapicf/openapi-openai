# MessageDeltaContentImageFileObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int32** | The index of the content part in the message. | 
**Type** | **string** | Always &#x60;image_file&#x60;. | 
**ImageFile** | Pointer to [**MessageDeltaContentImageFileObjectImageFile**](MessageDeltaContentImageFileObjectImageFile.md) |  | [optional] 

## Methods

### NewMessageDeltaContentImageFileObject

`func NewMessageDeltaContentImageFileObject(index int32, type_ string, ) *MessageDeltaContentImageFileObject`

NewMessageDeltaContentImageFileObject instantiates a new MessageDeltaContentImageFileObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageDeltaContentImageFileObjectWithDefaults

`func NewMessageDeltaContentImageFileObjectWithDefaults() *MessageDeltaContentImageFileObject`

NewMessageDeltaContentImageFileObjectWithDefaults instantiates a new MessageDeltaContentImageFileObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIndex

`func (o *MessageDeltaContentImageFileObject) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *MessageDeltaContentImageFileObject) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *MessageDeltaContentImageFileObject) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetType

`func (o *MessageDeltaContentImageFileObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageDeltaContentImageFileObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageDeltaContentImageFileObject) SetType(v string)`

SetType sets Type field to given value.


### GetImageFile

`func (o *MessageDeltaContentImageFileObject) GetImageFile() MessageDeltaContentImageFileObjectImageFile`

GetImageFile returns the ImageFile field if non-nil, zero value otherwise.

### GetImageFileOk

`func (o *MessageDeltaContentImageFileObject) GetImageFileOk() (*MessageDeltaContentImageFileObjectImageFile, bool)`

GetImageFileOk returns a tuple with the ImageFile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageFile

`func (o *MessageDeltaContentImageFileObject) SetImageFile(v MessageDeltaContentImageFileObjectImageFile)`

SetImageFile sets ImageFile field to given value.

### HasImageFile

`func (o *MessageDeltaContentImageFileObject) HasImageFile() bool`

HasImageFile returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


