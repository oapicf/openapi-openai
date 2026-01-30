# VectorStoreFileBatchObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The identifier, which can be referenced in API endpoints. | 
**Object** | **string** | The object type, which is always &#x60;vector_store.file_batch&#x60;. | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) for when the vector store files batch was created. | 
**VectorStoreId** | **string** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**Status** | **string** | The status of the vector store files batch, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; or &#x60;failed&#x60;. | 
**FileCounts** | [**VectorStoreFileBatchObjectFileCounts**](VectorStoreFileBatchObjectFileCounts.md) |  | 

## Methods

### NewVectorStoreFileBatchObject

`func NewVectorStoreFileBatchObject(id string, object string, createdAt int32, vectorStoreId string, status string, fileCounts VectorStoreFileBatchObjectFileCounts, ) *VectorStoreFileBatchObject`

NewVectorStoreFileBatchObject instantiates a new VectorStoreFileBatchObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVectorStoreFileBatchObjectWithDefaults

`func NewVectorStoreFileBatchObjectWithDefaults() *VectorStoreFileBatchObject`

NewVectorStoreFileBatchObjectWithDefaults instantiates a new VectorStoreFileBatchObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *VectorStoreFileBatchObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *VectorStoreFileBatchObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *VectorStoreFileBatchObject) SetId(v string)`

SetId sets Id field to given value.


### GetObject

`func (o *VectorStoreFileBatchObject) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *VectorStoreFileBatchObject) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *VectorStoreFileBatchObject) SetObject(v string)`

SetObject sets Object field to given value.


### GetCreatedAt

`func (o *VectorStoreFileBatchObject) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *VectorStoreFileBatchObject) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *VectorStoreFileBatchObject) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetVectorStoreId

`func (o *VectorStoreFileBatchObject) GetVectorStoreId() string`

GetVectorStoreId returns the VectorStoreId field if non-nil, zero value otherwise.

### GetVectorStoreIdOk

`func (o *VectorStoreFileBatchObject) GetVectorStoreIdOk() (*string, bool)`

GetVectorStoreIdOk returns a tuple with the VectorStoreId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVectorStoreId

`func (o *VectorStoreFileBatchObject) SetVectorStoreId(v string)`

SetVectorStoreId sets VectorStoreId field to given value.


### GetStatus

`func (o *VectorStoreFileBatchObject) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *VectorStoreFileBatchObject) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *VectorStoreFileBatchObject) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetFileCounts

`func (o *VectorStoreFileBatchObject) GetFileCounts() VectorStoreFileBatchObjectFileCounts`

GetFileCounts returns the FileCounts field if non-nil, zero value otherwise.

### GetFileCountsOk

`func (o *VectorStoreFileBatchObject) GetFileCountsOk() (*VectorStoreFileBatchObjectFileCounts, bool)`

GetFileCountsOk returns a tuple with the FileCounts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileCounts

`func (o *VectorStoreFileBatchObject) SetFileCounts(v VectorStoreFileBatchObjectFileCounts)`

SetFileCounts sets FileCounts field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


