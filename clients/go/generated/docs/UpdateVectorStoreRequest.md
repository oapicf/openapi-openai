# UpdateVectorStoreRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **NullableString** | The name of the vector store. | [optional] 
**ExpiresAfter** | Pointer to [**VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] 
**Metadata** | Pointer to **map[string]interface{}** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 

## Methods

### NewUpdateVectorStoreRequest

`func NewUpdateVectorStoreRequest() *UpdateVectorStoreRequest`

NewUpdateVectorStoreRequest instantiates a new UpdateVectorStoreRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateVectorStoreRequestWithDefaults

`func NewUpdateVectorStoreRequestWithDefaults() *UpdateVectorStoreRequest`

NewUpdateVectorStoreRequestWithDefaults instantiates a new UpdateVectorStoreRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *UpdateVectorStoreRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *UpdateVectorStoreRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *UpdateVectorStoreRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *UpdateVectorStoreRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *UpdateVectorStoreRequest) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *UpdateVectorStoreRequest) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetExpiresAfter

`func (o *UpdateVectorStoreRequest) GetExpiresAfter() VectorStoreExpirationAfter`

GetExpiresAfter returns the ExpiresAfter field if non-nil, zero value otherwise.

### GetExpiresAfterOk

`func (o *UpdateVectorStoreRequest) GetExpiresAfterOk() (*VectorStoreExpirationAfter, bool)`

GetExpiresAfterOk returns a tuple with the ExpiresAfter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAfter

`func (o *UpdateVectorStoreRequest) SetExpiresAfter(v VectorStoreExpirationAfter)`

SetExpiresAfter sets ExpiresAfter field to given value.

### HasExpiresAfter

`func (o *UpdateVectorStoreRequest) HasExpiresAfter() bool`

HasExpiresAfter returns a boolean if a field has been set.

### GetMetadata

`func (o *UpdateVectorStoreRequest) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *UpdateVectorStoreRequest) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *UpdateVectorStoreRequest) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *UpdateVectorStoreRequest) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *UpdateVectorStoreRequest) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *UpdateVectorStoreRequest) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


