# CreateVectorStoreFileBatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileIds** | **[]string** | A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. | 
**ChunkingStrategy** | Pointer to [**ChunkingStrategyRequestParam**](ChunkingStrategyRequestParam.md) |  | [optional] 

## Methods

### NewCreateVectorStoreFileBatchRequest

`func NewCreateVectorStoreFileBatchRequest(fileIds []string, ) *CreateVectorStoreFileBatchRequest`

NewCreateVectorStoreFileBatchRequest instantiates a new CreateVectorStoreFileBatchRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateVectorStoreFileBatchRequestWithDefaults

`func NewCreateVectorStoreFileBatchRequestWithDefaults() *CreateVectorStoreFileBatchRequest`

NewCreateVectorStoreFileBatchRequestWithDefaults instantiates a new CreateVectorStoreFileBatchRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFileIds

`func (o *CreateVectorStoreFileBatchRequest) GetFileIds() []string`

GetFileIds returns the FileIds field if non-nil, zero value otherwise.

### GetFileIdsOk

`func (o *CreateVectorStoreFileBatchRequest) GetFileIdsOk() (*[]string, bool)`

GetFileIdsOk returns a tuple with the FileIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileIds

`func (o *CreateVectorStoreFileBatchRequest) SetFileIds(v []string)`

SetFileIds sets FileIds field to given value.


### GetChunkingStrategy

`func (o *CreateVectorStoreFileBatchRequest) GetChunkingStrategy() ChunkingStrategyRequestParam`

GetChunkingStrategy returns the ChunkingStrategy field if non-nil, zero value otherwise.

### GetChunkingStrategyOk

`func (o *CreateVectorStoreFileBatchRequest) GetChunkingStrategyOk() (*ChunkingStrategyRequestParam, bool)`

GetChunkingStrategyOk returns a tuple with the ChunkingStrategy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChunkingStrategy

`func (o *CreateVectorStoreFileBatchRequest) SetChunkingStrategy(v ChunkingStrategyRequestParam)`

SetChunkingStrategy sets ChunkingStrategy field to given value.

### HasChunkingStrategy

`func (o *CreateVectorStoreFileBatchRequest) HasChunkingStrategy() bool`

HasChunkingStrategy returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


