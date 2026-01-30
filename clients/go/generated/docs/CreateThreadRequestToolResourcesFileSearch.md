# CreateThreadRequestToolResourcesFileSearch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VectorStoreIds** | Pointer to **[]string** | The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  | [optional] 
**VectorStores** | Pointer to [**[]CreateThreadRequestToolResourcesFileSearchVectorStoresInner**](CreateThreadRequestToolResourcesFileSearchVectorStoresInner.md) | A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread.  | [optional] 

## Methods

### NewCreateThreadRequestToolResourcesFileSearch

`func NewCreateThreadRequestToolResourcesFileSearch() *CreateThreadRequestToolResourcesFileSearch`

NewCreateThreadRequestToolResourcesFileSearch instantiates a new CreateThreadRequestToolResourcesFileSearch object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateThreadRequestToolResourcesFileSearchWithDefaults

`func NewCreateThreadRequestToolResourcesFileSearchWithDefaults() *CreateThreadRequestToolResourcesFileSearch`

NewCreateThreadRequestToolResourcesFileSearchWithDefaults instantiates a new CreateThreadRequestToolResourcesFileSearch object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetVectorStoreIds

`func (o *CreateThreadRequestToolResourcesFileSearch) GetVectorStoreIds() []string`

GetVectorStoreIds returns the VectorStoreIds field if non-nil, zero value otherwise.

### GetVectorStoreIdsOk

`func (o *CreateThreadRequestToolResourcesFileSearch) GetVectorStoreIdsOk() (*[]string, bool)`

GetVectorStoreIdsOk returns a tuple with the VectorStoreIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVectorStoreIds

`func (o *CreateThreadRequestToolResourcesFileSearch) SetVectorStoreIds(v []string)`

SetVectorStoreIds sets VectorStoreIds field to given value.

### HasVectorStoreIds

`func (o *CreateThreadRequestToolResourcesFileSearch) HasVectorStoreIds() bool`

HasVectorStoreIds returns a boolean if a field has been set.

### GetVectorStores

`func (o *CreateThreadRequestToolResourcesFileSearch) GetVectorStores() []CreateThreadRequestToolResourcesFileSearchVectorStoresInner`

GetVectorStores returns the VectorStores field if non-nil, zero value otherwise.

### GetVectorStoresOk

`func (o *CreateThreadRequestToolResourcesFileSearch) GetVectorStoresOk() (*[]CreateThreadRequestToolResourcesFileSearchVectorStoresInner, bool)`

GetVectorStoresOk returns a tuple with the VectorStores field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVectorStores

`func (o *CreateThreadRequestToolResourcesFileSearch) SetVectorStores(v []CreateThreadRequestToolResourcesFileSearchVectorStoresInner)`

SetVectorStores sets VectorStores field to given value.

### HasVectorStores

`func (o *CreateThreadRequestToolResourcesFileSearch) HasVectorStores() bool`

HasVectorStores returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


