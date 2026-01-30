# CreateVectorStoreRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileIds** | Pointer to **[]string** | A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. | [optional] 
**Name** | Pointer to **string** | The name of the vector store. | [optional] 
**ExpiresAfter** | Pointer to [**VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] 
**ChunkingStrategy** | Pointer to [**CreateVectorStoreRequestChunkingStrategy**](CreateVectorStoreRequestChunkingStrategy.md) |  | [optional] 
**Metadata** | Pointer to **map[string]interface{}** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 

## Methods

### NewCreateVectorStoreRequest

`func NewCreateVectorStoreRequest() *CreateVectorStoreRequest`

NewCreateVectorStoreRequest instantiates a new CreateVectorStoreRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateVectorStoreRequestWithDefaults

`func NewCreateVectorStoreRequestWithDefaults() *CreateVectorStoreRequest`

NewCreateVectorStoreRequestWithDefaults instantiates a new CreateVectorStoreRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFileIds

`func (o *CreateVectorStoreRequest) GetFileIds() []string`

GetFileIds returns the FileIds field if non-nil, zero value otherwise.

### GetFileIdsOk

`func (o *CreateVectorStoreRequest) GetFileIdsOk() (*[]string, bool)`

GetFileIdsOk returns a tuple with the FileIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileIds

`func (o *CreateVectorStoreRequest) SetFileIds(v []string)`

SetFileIds sets FileIds field to given value.

### HasFileIds

`func (o *CreateVectorStoreRequest) HasFileIds() bool`

HasFileIds returns a boolean if a field has been set.

### GetName

`func (o *CreateVectorStoreRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CreateVectorStoreRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CreateVectorStoreRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CreateVectorStoreRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetExpiresAfter

`func (o *CreateVectorStoreRequest) GetExpiresAfter() VectorStoreExpirationAfter`

GetExpiresAfter returns the ExpiresAfter field if non-nil, zero value otherwise.

### GetExpiresAfterOk

`func (o *CreateVectorStoreRequest) GetExpiresAfterOk() (*VectorStoreExpirationAfter, bool)`

GetExpiresAfterOk returns a tuple with the ExpiresAfter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAfter

`func (o *CreateVectorStoreRequest) SetExpiresAfter(v VectorStoreExpirationAfter)`

SetExpiresAfter sets ExpiresAfter field to given value.

### HasExpiresAfter

`func (o *CreateVectorStoreRequest) HasExpiresAfter() bool`

HasExpiresAfter returns a boolean if a field has been set.

### GetChunkingStrategy

`func (o *CreateVectorStoreRequest) GetChunkingStrategy() CreateVectorStoreRequestChunkingStrategy`

GetChunkingStrategy returns the ChunkingStrategy field if non-nil, zero value otherwise.

### GetChunkingStrategyOk

`func (o *CreateVectorStoreRequest) GetChunkingStrategyOk() (*CreateVectorStoreRequestChunkingStrategy, bool)`

GetChunkingStrategyOk returns a tuple with the ChunkingStrategy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChunkingStrategy

`func (o *CreateVectorStoreRequest) SetChunkingStrategy(v CreateVectorStoreRequestChunkingStrategy)`

SetChunkingStrategy sets ChunkingStrategy field to given value.

### HasChunkingStrategy

`func (o *CreateVectorStoreRequest) HasChunkingStrategy() bool`

HasChunkingStrategy returns a boolean if a field has been set.

### GetMetadata

`func (o *CreateVectorStoreRequest) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *CreateVectorStoreRequest) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *CreateVectorStoreRequest) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *CreateVectorStoreRequest) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *CreateVectorStoreRequest) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *CreateVectorStoreRequest) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


