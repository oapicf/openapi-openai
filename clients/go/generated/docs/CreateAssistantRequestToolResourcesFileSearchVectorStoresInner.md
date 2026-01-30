# CreateAssistantRequestToolResourcesFileSearchVectorStoresInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileIds** | Pointer to **[]string** | A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.  | [optional] 
**ChunkingStrategy** | Pointer to [**CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy**](CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.md) |  | [optional] 
**Metadata** | Pointer to **map[string]interface{}** | Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 

## Methods

### NewCreateAssistantRequestToolResourcesFileSearchVectorStoresInner

`func NewCreateAssistantRequestToolResourcesFileSearchVectorStoresInner() *CreateAssistantRequestToolResourcesFileSearchVectorStoresInner`

NewCreateAssistantRequestToolResourcesFileSearchVectorStoresInner instantiates a new CreateAssistantRequestToolResourcesFileSearchVectorStoresInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateAssistantRequestToolResourcesFileSearchVectorStoresInnerWithDefaults

`func NewCreateAssistantRequestToolResourcesFileSearchVectorStoresInnerWithDefaults() *CreateAssistantRequestToolResourcesFileSearchVectorStoresInner`

NewCreateAssistantRequestToolResourcesFileSearchVectorStoresInnerWithDefaults instantiates a new CreateAssistantRequestToolResourcesFileSearchVectorStoresInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFileIds

`func (o *CreateAssistantRequestToolResourcesFileSearchVectorStoresInner) GetFileIds() []string`

GetFileIds returns the FileIds field if non-nil, zero value otherwise.

### GetFileIdsOk

`func (o *CreateAssistantRequestToolResourcesFileSearchVectorStoresInner) GetFileIdsOk() (*[]string, bool)`

GetFileIdsOk returns a tuple with the FileIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileIds

`func (o *CreateAssistantRequestToolResourcesFileSearchVectorStoresInner) SetFileIds(v []string)`

SetFileIds sets FileIds field to given value.

### HasFileIds

`func (o *CreateAssistantRequestToolResourcesFileSearchVectorStoresInner) HasFileIds() bool`

HasFileIds returns a boolean if a field has been set.

### GetChunkingStrategy

`func (o *CreateAssistantRequestToolResourcesFileSearchVectorStoresInner) GetChunkingStrategy() CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy`

GetChunkingStrategy returns the ChunkingStrategy field if non-nil, zero value otherwise.

### GetChunkingStrategyOk

`func (o *CreateAssistantRequestToolResourcesFileSearchVectorStoresInner) GetChunkingStrategyOk() (*CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy, bool)`

GetChunkingStrategyOk returns a tuple with the ChunkingStrategy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChunkingStrategy

`func (o *CreateAssistantRequestToolResourcesFileSearchVectorStoresInner) SetChunkingStrategy(v CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy)`

SetChunkingStrategy sets ChunkingStrategy field to given value.

### HasChunkingStrategy

`func (o *CreateAssistantRequestToolResourcesFileSearchVectorStoresInner) HasChunkingStrategy() bool`

HasChunkingStrategy returns a boolean if a field has been set.

### GetMetadata

`func (o *CreateAssistantRequestToolResourcesFileSearchVectorStoresInner) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *CreateAssistantRequestToolResourcesFileSearchVectorStoresInner) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *CreateAssistantRequestToolResourcesFileSearchVectorStoresInner) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *CreateAssistantRequestToolResourcesFileSearchVectorStoresInner) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


