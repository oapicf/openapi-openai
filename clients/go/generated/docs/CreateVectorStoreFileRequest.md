# CreateVectorStoreFileRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileId** | **string** | A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. | 
**ChunkingStrategy** | Pointer to [**ChunkingStrategyRequestParam**](ChunkingStrategyRequestParam.md) |  | [optional] 

## Methods

### NewCreateVectorStoreFileRequest

`func NewCreateVectorStoreFileRequest(fileId string, ) *CreateVectorStoreFileRequest`

NewCreateVectorStoreFileRequest instantiates a new CreateVectorStoreFileRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateVectorStoreFileRequestWithDefaults

`func NewCreateVectorStoreFileRequestWithDefaults() *CreateVectorStoreFileRequest`

NewCreateVectorStoreFileRequestWithDefaults instantiates a new CreateVectorStoreFileRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFileId

`func (o *CreateVectorStoreFileRequest) GetFileId() string`

GetFileId returns the FileId field if non-nil, zero value otherwise.

### GetFileIdOk

`func (o *CreateVectorStoreFileRequest) GetFileIdOk() (*string, bool)`

GetFileIdOk returns a tuple with the FileId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileId

`func (o *CreateVectorStoreFileRequest) SetFileId(v string)`

SetFileId sets FileId field to given value.


### GetChunkingStrategy

`func (o *CreateVectorStoreFileRequest) GetChunkingStrategy() ChunkingStrategyRequestParam`

GetChunkingStrategy returns the ChunkingStrategy field if non-nil, zero value otherwise.

### GetChunkingStrategyOk

`func (o *CreateVectorStoreFileRequest) GetChunkingStrategyOk() (*ChunkingStrategyRequestParam, bool)`

GetChunkingStrategyOk returns a tuple with the ChunkingStrategy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChunkingStrategy

`func (o *CreateVectorStoreFileRequest) SetChunkingStrategy(v ChunkingStrategyRequestParam)`

SetChunkingStrategy sets ChunkingStrategy field to given value.

### HasChunkingStrategy

`func (o *CreateVectorStoreFileRequest) HasChunkingStrategy() bool`

HasChunkingStrategy returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


