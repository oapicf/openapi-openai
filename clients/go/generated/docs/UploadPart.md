# UploadPart

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The upload Part unique identifier, which can be referenced in API endpoints. | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) for when the Part was created. | 
**UploadId** | **string** | The ID of the Upload object that this Part was added to. | 
**Object** | **string** | The object type, which is always &#x60;upload.part&#x60;. | 

## Methods

### NewUploadPart

`func NewUploadPart(id string, createdAt int32, uploadId string, object string, ) *UploadPart`

NewUploadPart instantiates a new UploadPart object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUploadPartWithDefaults

`func NewUploadPartWithDefaults() *UploadPart`

NewUploadPartWithDefaults instantiates a new UploadPart object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *UploadPart) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *UploadPart) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *UploadPart) SetId(v string)`

SetId sets Id field to given value.


### GetCreatedAt

`func (o *UploadPart) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *UploadPart) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *UploadPart) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetUploadId

`func (o *UploadPart) GetUploadId() string`

GetUploadId returns the UploadId field if non-nil, zero value otherwise.

### GetUploadIdOk

`func (o *UploadPart) GetUploadIdOk() (*string, bool)`

GetUploadIdOk returns a tuple with the UploadId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUploadId

`func (o *UploadPart) SetUploadId(v string)`

SetUploadId sets UploadId field to given value.


### GetObject

`func (o *UploadPart) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *UploadPart) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *UploadPart) SetObject(v string)`

SetObject sets Object field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


