# VectorStoreFileObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The identifier, which can be referenced in API endpoints. | 
**Object** | **string** | The object type, which is always &#x60;vector_store.file&#x60;. | 
**UsageBytes** | **int32** | The total vector store usage in bytes. Note that this may be different from the original file size. | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) for when the vector store file was created. | 
**VectorStoreId** | **string** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**Status** | **string** | The status of the vector store file, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60;, or &#x60;failed&#x60;. The status &#x60;completed&#x60; indicates that the vector store file is ready for use. | 
**LastError** | [**NullableVectorStoreFileObjectLastError**](VectorStoreFileObjectLastError.md) |  | 
**ChunkingStrategy** | Pointer to [**VectorStoreFileObjectChunkingStrategy**](VectorStoreFileObjectChunkingStrategy.md) |  | [optional] 

## Methods

### NewVectorStoreFileObject

`func NewVectorStoreFileObject(id string, object string, usageBytes int32, createdAt int32, vectorStoreId string, status string, lastError NullableVectorStoreFileObjectLastError, ) *VectorStoreFileObject`

NewVectorStoreFileObject instantiates a new VectorStoreFileObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVectorStoreFileObjectWithDefaults

`func NewVectorStoreFileObjectWithDefaults() *VectorStoreFileObject`

NewVectorStoreFileObjectWithDefaults instantiates a new VectorStoreFileObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *VectorStoreFileObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *VectorStoreFileObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *VectorStoreFileObject) SetId(v string)`

SetId sets Id field to given value.


### GetObject

`func (o *VectorStoreFileObject) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *VectorStoreFileObject) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *VectorStoreFileObject) SetObject(v string)`

SetObject sets Object field to given value.


### GetUsageBytes

`func (o *VectorStoreFileObject) GetUsageBytes() int32`

GetUsageBytes returns the UsageBytes field if non-nil, zero value otherwise.

### GetUsageBytesOk

`func (o *VectorStoreFileObject) GetUsageBytesOk() (*int32, bool)`

GetUsageBytesOk returns a tuple with the UsageBytes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsageBytes

`func (o *VectorStoreFileObject) SetUsageBytes(v int32)`

SetUsageBytes sets UsageBytes field to given value.


### GetCreatedAt

`func (o *VectorStoreFileObject) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *VectorStoreFileObject) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *VectorStoreFileObject) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetVectorStoreId

`func (o *VectorStoreFileObject) GetVectorStoreId() string`

GetVectorStoreId returns the VectorStoreId field if non-nil, zero value otherwise.

### GetVectorStoreIdOk

`func (o *VectorStoreFileObject) GetVectorStoreIdOk() (*string, bool)`

GetVectorStoreIdOk returns a tuple with the VectorStoreId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVectorStoreId

`func (o *VectorStoreFileObject) SetVectorStoreId(v string)`

SetVectorStoreId sets VectorStoreId field to given value.


### GetStatus

`func (o *VectorStoreFileObject) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *VectorStoreFileObject) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *VectorStoreFileObject) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetLastError

`func (o *VectorStoreFileObject) GetLastError() VectorStoreFileObjectLastError`

GetLastError returns the LastError field if non-nil, zero value otherwise.

### GetLastErrorOk

`func (o *VectorStoreFileObject) GetLastErrorOk() (*VectorStoreFileObjectLastError, bool)`

GetLastErrorOk returns a tuple with the LastError field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastError

`func (o *VectorStoreFileObject) SetLastError(v VectorStoreFileObjectLastError)`

SetLastError sets LastError field to given value.


### SetLastErrorNil

`func (o *VectorStoreFileObject) SetLastErrorNil(b bool)`

 SetLastErrorNil sets the value for LastError to be an explicit nil

### UnsetLastError
`func (o *VectorStoreFileObject) UnsetLastError()`

UnsetLastError ensures that no value is present for LastError, not even an explicit nil
### GetChunkingStrategy

`func (o *VectorStoreFileObject) GetChunkingStrategy() VectorStoreFileObjectChunkingStrategy`

GetChunkingStrategy returns the ChunkingStrategy field if non-nil, zero value otherwise.

### GetChunkingStrategyOk

`func (o *VectorStoreFileObject) GetChunkingStrategyOk() (*VectorStoreFileObjectChunkingStrategy, bool)`

GetChunkingStrategyOk returns a tuple with the ChunkingStrategy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChunkingStrategy

`func (o *VectorStoreFileObject) SetChunkingStrategy(v VectorStoreFileObjectChunkingStrategy)`

SetChunkingStrategy sets ChunkingStrategy field to given value.

### HasChunkingStrategy

`func (o *VectorStoreFileObject) HasChunkingStrategy() bool`

HasChunkingStrategy returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


