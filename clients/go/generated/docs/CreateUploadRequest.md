# CreateUploadRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Filename** | **string** | The name of the file to upload.  | 
**Purpose** | **string** | The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  | 
**Bytes** | **int32** | The number of bytes in the file you are uploading.  | 
**MimeType** | **string** | The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  | 

## Methods

### NewCreateUploadRequest

`func NewCreateUploadRequest(filename string, purpose string, bytes int32, mimeType string, ) *CreateUploadRequest`

NewCreateUploadRequest instantiates a new CreateUploadRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateUploadRequestWithDefaults

`func NewCreateUploadRequestWithDefaults() *CreateUploadRequest`

NewCreateUploadRequestWithDefaults instantiates a new CreateUploadRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFilename

`func (o *CreateUploadRequest) GetFilename() string`

GetFilename returns the Filename field if non-nil, zero value otherwise.

### GetFilenameOk

`func (o *CreateUploadRequest) GetFilenameOk() (*string, bool)`

GetFilenameOk returns a tuple with the Filename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilename

`func (o *CreateUploadRequest) SetFilename(v string)`

SetFilename sets Filename field to given value.


### GetPurpose

`func (o *CreateUploadRequest) GetPurpose() string`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *CreateUploadRequest) GetPurposeOk() (*string, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *CreateUploadRequest) SetPurpose(v string)`

SetPurpose sets Purpose field to given value.


### GetBytes

`func (o *CreateUploadRequest) GetBytes() int32`

GetBytes returns the Bytes field if non-nil, zero value otherwise.

### GetBytesOk

`func (o *CreateUploadRequest) GetBytesOk() (*int32, bool)`

GetBytesOk returns a tuple with the Bytes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBytes

`func (o *CreateUploadRequest) SetBytes(v int32)`

SetBytes sets Bytes field to given value.


### GetMimeType

`func (o *CreateUploadRequest) GetMimeType() string`

GetMimeType returns the MimeType field if non-nil, zero value otherwise.

### GetMimeTypeOk

`func (o *CreateUploadRequest) GetMimeTypeOk() (*string, bool)`

GetMimeTypeOk returns a tuple with the MimeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMimeType

`func (o *CreateUploadRequest) SetMimeType(v string)`

SetMimeType sets MimeType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


