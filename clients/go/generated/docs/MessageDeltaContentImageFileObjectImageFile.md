# MessageDeltaContentImageFileObjectImageFile

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileId** | Pointer to **string** | The [File](/docs/api-reference/files) ID of the image in the message content. Set &#x60;purpose&#x3D;\&quot;vision\&quot;&#x60; when uploading the File if you need to later display the file content. | [optional] 
**Detail** | Pointer to **string** | Specifies the detail level of the image if specified by the user. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;. | [optional] [default to "auto"]

## Methods

### NewMessageDeltaContentImageFileObjectImageFile

`func NewMessageDeltaContentImageFileObjectImageFile() *MessageDeltaContentImageFileObjectImageFile`

NewMessageDeltaContentImageFileObjectImageFile instantiates a new MessageDeltaContentImageFileObjectImageFile object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageDeltaContentImageFileObjectImageFileWithDefaults

`func NewMessageDeltaContentImageFileObjectImageFileWithDefaults() *MessageDeltaContentImageFileObjectImageFile`

NewMessageDeltaContentImageFileObjectImageFileWithDefaults instantiates a new MessageDeltaContentImageFileObjectImageFile object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFileId

`func (o *MessageDeltaContentImageFileObjectImageFile) GetFileId() string`

GetFileId returns the FileId field if non-nil, zero value otherwise.

### GetFileIdOk

`func (o *MessageDeltaContentImageFileObjectImageFile) GetFileIdOk() (*string, bool)`

GetFileIdOk returns a tuple with the FileId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileId

`func (o *MessageDeltaContentImageFileObjectImageFile) SetFileId(v string)`

SetFileId sets FileId field to given value.

### HasFileId

`func (o *MessageDeltaContentImageFileObjectImageFile) HasFileId() bool`

HasFileId returns a boolean if a field has been set.

### GetDetail

`func (o *MessageDeltaContentImageFileObjectImageFile) GetDetail() string`

GetDetail returns the Detail field if non-nil, zero value otherwise.

### GetDetailOk

`func (o *MessageDeltaContentImageFileObjectImageFile) GetDetailOk() (*string, bool)`

GetDetailOk returns a tuple with the Detail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetail

`func (o *MessageDeltaContentImageFileObjectImageFile) SetDetail(v string)`

SetDetail sets Detail field to given value.

### HasDetail

`func (o *MessageDeltaContentImageFileObjectImageFile) HasDetail() bool`

HasDetail returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


