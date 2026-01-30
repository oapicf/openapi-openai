# VectorStoreObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The identifier, which can be referenced in API endpoints. | 
**Object** | **string** | The object type, which is always &#x60;vector_store&#x60;. | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) for when the vector store was created. | 
**Name** | **string** | The name of the vector store. | 
**UsageBytes** | **int32** | The total number of bytes used by the files in the vector store. | 
**FileCounts** | [**VectorStoreObjectFileCounts**](VectorStoreObjectFileCounts.md) |  | 
**Status** | **string** | The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use. | 
**ExpiresAfter** | Pointer to [**VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] 
**ExpiresAt** | Pointer to **NullableInt32** | The Unix timestamp (in seconds) for when the vector store will expire. | [optional] 
**LastActiveAt** | **NullableInt32** | The Unix timestamp (in seconds) for when the vector store was last active. | 
**Metadata** | **map[string]interface{}** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 

## Methods

### NewVectorStoreObject

`func NewVectorStoreObject(id string, object string, createdAt int32, name string, usageBytes int32, fileCounts VectorStoreObjectFileCounts, status string, lastActiveAt NullableInt32, metadata map[string]interface{}, ) *VectorStoreObject`

NewVectorStoreObject instantiates a new VectorStoreObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVectorStoreObjectWithDefaults

`func NewVectorStoreObjectWithDefaults() *VectorStoreObject`

NewVectorStoreObjectWithDefaults instantiates a new VectorStoreObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *VectorStoreObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *VectorStoreObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *VectorStoreObject) SetId(v string)`

SetId sets Id field to given value.


### GetObject

`func (o *VectorStoreObject) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *VectorStoreObject) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *VectorStoreObject) SetObject(v string)`

SetObject sets Object field to given value.


### GetCreatedAt

`func (o *VectorStoreObject) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *VectorStoreObject) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *VectorStoreObject) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetName

`func (o *VectorStoreObject) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *VectorStoreObject) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *VectorStoreObject) SetName(v string)`

SetName sets Name field to given value.


### GetUsageBytes

`func (o *VectorStoreObject) GetUsageBytes() int32`

GetUsageBytes returns the UsageBytes field if non-nil, zero value otherwise.

### GetUsageBytesOk

`func (o *VectorStoreObject) GetUsageBytesOk() (*int32, bool)`

GetUsageBytesOk returns a tuple with the UsageBytes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsageBytes

`func (o *VectorStoreObject) SetUsageBytes(v int32)`

SetUsageBytes sets UsageBytes field to given value.


### GetFileCounts

`func (o *VectorStoreObject) GetFileCounts() VectorStoreObjectFileCounts`

GetFileCounts returns the FileCounts field if non-nil, zero value otherwise.

### GetFileCountsOk

`func (o *VectorStoreObject) GetFileCountsOk() (*VectorStoreObjectFileCounts, bool)`

GetFileCountsOk returns a tuple with the FileCounts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileCounts

`func (o *VectorStoreObject) SetFileCounts(v VectorStoreObjectFileCounts)`

SetFileCounts sets FileCounts field to given value.


### GetStatus

`func (o *VectorStoreObject) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *VectorStoreObject) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *VectorStoreObject) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetExpiresAfter

`func (o *VectorStoreObject) GetExpiresAfter() VectorStoreExpirationAfter`

GetExpiresAfter returns the ExpiresAfter field if non-nil, zero value otherwise.

### GetExpiresAfterOk

`func (o *VectorStoreObject) GetExpiresAfterOk() (*VectorStoreExpirationAfter, bool)`

GetExpiresAfterOk returns a tuple with the ExpiresAfter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAfter

`func (o *VectorStoreObject) SetExpiresAfter(v VectorStoreExpirationAfter)`

SetExpiresAfter sets ExpiresAfter field to given value.

### HasExpiresAfter

`func (o *VectorStoreObject) HasExpiresAfter() bool`

HasExpiresAfter returns a boolean if a field has been set.

### GetExpiresAt

`func (o *VectorStoreObject) GetExpiresAt() int32`

GetExpiresAt returns the ExpiresAt field if non-nil, zero value otherwise.

### GetExpiresAtOk

`func (o *VectorStoreObject) GetExpiresAtOk() (*int32, bool)`

GetExpiresAtOk returns a tuple with the ExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAt

`func (o *VectorStoreObject) SetExpiresAt(v int32)`

SetExpiresAt sets ExpiresAt field to given value.

### HasExpiresAt

`func (o *VectorStoreObject) HasExpiresAt() bool`

HasExpiresAt returns a boolean if a field has been set.

### SetExpiresAtNil

`func (o *VectorStoreObject) SetExpiresAtNil(b bool)`

 SetExpiresAtNil sets the value for ExpiresAt to be an explicit nil

### UnsetExpiresAt
`func (o *VectorStoreObject) UnsetExpiresAt()`

UnsetExpiresAt ensures that no value is present for ExpiresAt, not even an explicit nil
### GetLastActiveAt

`func (o *VectorStoreObject) GetLastActiveAt() int32`

GetLastActiveAt returns the LastActiveAt field if non-nil, zero value otherwise.

### GetLastActiveAtOk

`func (o *VectorStoreObject) GetLastActiveAtOk() (*int32, bool)`

GetLastActiveAtOk returns a tuple with the LastActiveAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastActiveAt

`func (o *VectorStoreObject) SetLastActiveAt(v int32)`

SetLastActiveAt sets LastActiveAt field to given value.


### SetLastActiveAtNil

`func (o *VectorStoreObject) SetLastActiveAtNil(b bool)`

 SetLastActiveAtNil sets the value for LastActiveAt to be an explicit nil

### UnsetLastActiveAt
`func (o *VectorStoreObject) UnsetLastActiveAt()`

UnsetLastActiveAt ensures that no value is present for LastActiveAt, not even an explicit nil
### GetMetadata

`func (o *VectorStoreObject) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *VectorStoreObject) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *VectorStoreObject) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.


### SetMetadataNil

`func (o *VectorStoreObject) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *VectorStoreObject) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


