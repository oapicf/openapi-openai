# Upload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The Upload unique identifier, which can be referenced in API endpoints. | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) for when the Upload was created. | 
**Filename** | **string** | The name of the file to be uploaded. | 
**Bytes** | **int32** | The intended number of bytes to be uploaded. | 
**Purpose** | **string** | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. | 
**Status** | **string** | The status of the Upload. | 
**ExpiresAt** | **int32** | The Unix timestamp (in seconds) for when the Upload was created. | 
**Object** | Pointer to **string** | The object type, which is always \&quot;upload\&quot;. | [optional] 
**File** | Pointer to [**OpenAIFile**](OpenAIFile.md) |  | [optional] 

## Methods

### NewUpload

`func NewUpload(id string, createdAt int32, filename string, bytes int32, purpose string, status string, expiresAt int32, ) *Upload`

NewUpload instantiates a new Upload object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUploadWithDefaults

`func NewUploadWithDefaults() *Upload`

NewUploadWithDefaults instantiates a new Upload object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Upload) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Upload) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Upload) SetId(v string)`

SetId sets Id field to given value.


### GetCreatedAt

`func (o *Upload) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *Upload) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *Upload) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetFilename

`func (o *Upload) GetFilename() string`

GetFilename returns the Filename field if non-nil, zero value otherwise.

### GetFilenameOk

`func (o *Upload) GetFilenameOk() (*string, bool)`

GetFilenameOk returns a tuple with the Filename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilename

`func (o *Upload) SetFilename(v string)`

SetFilename sets Filename field to given value.


### GetBytes

`func (o *Upload) GetBytes() int32`

GetBytes returns the Bytes field if non-nil, zero value otherwise.

### GetBytesOk

`func (o *Upload) GetBytesOk() (*int32, bool)`

GetBytesOk returns a tuple with the Bytes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBytes

`func (o *Upload) SetBytes(v int32)`

SetBytes sets Bytes field to given value.


### GetPurpose

`func (o *Upload) GetPurpose() string`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *Upload) GetPurposeOk() (*string, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *Upload) SetPurpose(v string)`

SetPurpose sets Purpose field to given value.


### GetStatus

`func (o *Upload) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Upload) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Upload) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetExpiresAt

`func (o *Upload) GetExpiresAt() int32`

GetExpiresAt returns the ExpiresAt field if non-nil, zero value otherwise.

### GetExpiresAtOk

`func (o *Upload) GetExpiresAtOk() (*int32, bool)`

GetExpiresAtOk returns a tuple with the ExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAt

`func (o *Upload) SetExpiresAt(v int32)`

SetExpiresAt sets ExpiresAt field to given value.


### GetObject

`func (o *Upload) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *Upload) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *Upload) SetObject(v string)`

SetObject sets Object field to given value.

### HasObject

`func (o *Upload) HasObject() bool`

HasObject returns a boolean if a field has been set.

### GetFile

`func (o *Upload) GetFile() OpenAIFile`

GetFile returns the File field if non-nil, zero value otherwise.

### GetFileOk

`func (o *Upload) GetFileOk() (*OpenAIFile, bool)`

GetFileOk returns a tuple with the File field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFile

`func (o *Upload) SetFile(v OpenAIFile)`

SetFile sets File field to given value.

### HasFile

`func (o *Upload) HasFile() bool`

HasFile returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


