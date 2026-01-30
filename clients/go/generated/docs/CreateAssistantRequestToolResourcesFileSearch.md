# CreateAssistantRequestToolResourcesFileSearch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VectorStoreIds** | Pointer to **[]string** | The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  | [optional] 
**VectorStores** | Pointer to [**[]CreateAssistantRequestToolResourcesFileSearchVectorStoresInner**](CreateAssistantRequestToolResourcesFileSearchVectorStoresInner.md) | A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant.  | [optional] 

## Methods

### NewCreateAssistantRequestToolResourcesFileSearch

`func NewCreateAssistantRequestToolResourcesFileSearch() *CreateAssistantRequestToolResourcesFileSearch`

NewCreateAssistantRequestToolResourcesFileSearch instantiates a new CreateAssistantRequestToolResourcesFileSearch object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateAssistantRequestToolResourcesFileSearchWithDefaults

`func NewCreateAssistantRequestToolResourcesFileSearchWithDefaults() *CreateAssistantRequestToolResourcesFileSearch`

NewCreateAssistantRequestToolResourcesFileSearchWithDefaults instantiates a new CreateAssistantRequestToolResourcesFileSearch object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetVectorStoreIds

`func (o *CreateAssistantRequestToolResourcesFileSearch) GetVectorStoreIds() []string`

GetVectorStoreIds returns the VectorStoreIds field if non-nil, zero value otherwise.

### GetVectorStoreIdsOk

`func (o *CreateAssistantRequestToolResourcesFileSearch) GetVectorStoreIdsOk() (*[]string, bool)`

GetVectorStoreIdsOk returns a tuple with the VectorStoreIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVectorStoreIds

`func (o *CreateAssistantRequestToolResourcesFileSearch) SetVectorStoreIds(v []string)`

SetVectorStoreIds sets VectorStoreIds field to given value.

### HasVectorStoreIds

`func (o *CreateAssistantRequestToolResourcesFileSearch) HasVectorStoreIds() bool`

HasVectorStoreIds returns a boolean if a field has been set.

### GetVectorStores

`func (o *CreateAssistantRequestToolResourcesFileSearch) GetVectorStores() []CreateAssistantRequestToolResourcesFileSearchVectorStoresInner`

GetVectorStores returns the VectorStores field if non-nil, zero value otherwise.

### GetVectorStoresOk

`func (o *CreateAssistantRequestToolResourcesFileSearch) GetVectorStoresOk() (*[]CreateAssistantRequestToolResourcesFileSearchVectorStoresInner, bool)`

GetVectorStoresOk returns a tuple with the VectorStores field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVectorStores

`func (o *CreateAssistantRequestToolResourcesFileSearch) SetVectorStores(v []CreateAssistantRequestToolResourcesFileSearchVectorStoresInner)`

SetVectorStores sets VectorStores field to given value.

### HasVectorStores

`func (o *CreateAssistantRequestToolResourcesFileSearch) HasVectorStores() bool`

HasVectorStores returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


