# OpenAIFile

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The file identifier, which can be referenced in the API endpoints. | 
**Bytes** | **int32** | The size of the file, in bytes. | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) for when the file was created. | 
**Filename** | **string** | The name of the file. | 
**Object** | **string** | The object type, which is always &#x60;file&#x60;. | 
**Purpose** | **string** | The intended purpose of the file. Supported values are &#x60;assistants&#x60;, &#x60;assistants_output&#x60;, &#x60;batch&#x60;, &#x60;batch_output&#x60;, &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60; and &#x60;vision&#x60;. | 
**Status** | **string** | Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;. | 
**StatusDetails** | Pointer to **string** | Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;. | [optional] 

## Methods

### NewOpenAIFile

`func NewOpenAIFile(id string, bytes int32, createdAt int32, filename string, object string, purpose string, status string, ) *OpenAIFile`

NewOpenAIFile instantiates a new OpenAIFile object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenAIFileWithDefaults

`func NewOpenAIFileWithDefaults() *OpenAIFile`

NewOpenAIFileWithDefaults instantiates a new OpenAIFile object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OpenAIFile) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OpenAIFile) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OpenAIFile) SetId(v string)`

SetId sets Id field to given value.


### GetBytes

`func (o *OpenAIFile) GetBytes() int32`

GetBytes returns the Bytes field if non-nil, zero value otherwise.

### GetBytesOk

`func (o *OpenAIFile) GetBytesOk() (*int32, bool)`

GetBytesOk returns a tuple with the Bytes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBytes

`func (o *OpenAIFile) SetBytes(v int32)`

SetBytes sets Bytes field to given value.


### GetCreatedAt

`func (o *OpenAIFile) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *OpenAIFile) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *OpenAIFile) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetFilename

`func (o *OpenAIFile) GetFilename() string`

GetFilename returns the Filename field if non-nil, zero value otherwise.

### GetFilenameOk

`func (o *OpenAIFile) GetFilenameOk() (*string, bool)`

GetFilenameOk returns a tuple with the Filename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilename

`func (o *OpenAIFile) SetFilename(v string)`

SetFilename sets Filename field to given value.


### GetObject

`func (o *OpenAIFile) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *OpenAIFile) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *OpenAIFile) SetObject(v string)`

SetObject sets Object field to given value.


### GetPurpose

`func (o *OpenAIFile) GetPurpose() string`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *OpenAIFile) GetPurposeOk() (*string, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *OpenAIFile) SetPurpose(v string)`

SetPurpose sets Purpose field to given value.


### GetStatus

`func (o *OpenAIFile) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *OpenAIFile) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *OpenAIFile) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetStatusDetails

`func (o *OpenAIFile) GetStatusDetails() string`

GetStatusDetails returns the StatusDetails field if non-nil, zero value otherwise.

### GetStatusDetailsOk

`func (o *OpenAIFile) GetStatusDetailsOk() (*string, bool)`

GetStatusDetailsOk returns a tuple with the StatusDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusDetails

`func (o *OpenAIFile) SetStatusDetails(v string)`

SetStatusDetails sets StatusDetails field to given value.

### HasStatusDetails

`func (o *OpenAIFile) HasStatusDetails() bool`

HasStatusDetails returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


