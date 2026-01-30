# ModifyThreadRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ToolResources** | Pointer to [**NullableModifyThreadRequestToolResources**](ModifyThreadRequestToolResources.md) |  | [optional] 
**Metadata** | Pointer to **map[string]interface{}** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 

## Methods

### NewModifyThreadRequest

`func NewModifyThreadRequest() *ModifyThreadRequest`

NewModifyThreadRequest instantiates a new ModifyThreadRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModifyThreadRequestWithDefaults

`func NewModifyThreadRequestWithDefaults() *ModifyThreadRequest`

NewModifyThreadRequestWithDefaults instantiates a new ModifyThreadRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetToolResources

`func (o *ModifyThreadRequest) GetToolResources() ModifyThreadRequestToolResources`

GetToolResources returns the ToolResources field if non-nil, zero value otherwise.

### GetToolResourcesOk

`func (o *ModifyThreadRequest) GetToolResourcesOk() (*ModifyThreadRequestToolResources, bool)`

GetToolResourcesOk returns a tuple with the ToolResources field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolResources

`func (o *ModifyThreadRequest) SetToolResources(v ModifyThreadRequestToolResources)`

SetToolResources sets ToolResources field to given value.

### HasToolResources

`func (o *ModifyThreadRequest) HasToolResources() bool`

HasToolResources returns a boolean if a field has been set.

### SetToolResourcesNil

`func (o *ModifyThreadRequest) SetToolResourcesNil(b bool)`

 SetToolResourcesNil sets the value for ToolResources to be an explicit nil

### UnsetToolResources
`func (o *ModifyThreadRequest) UnsetToolResources()`

UnsetToolResources ensures that no value is present for ToolResources, not even an explicit nil
### GetMetadata

`func (o *ModifyThreadRequest) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *ModifyThreadRequest) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *ModifyThreadRequest) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *ModifyThreadRequest) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *ModifyThreadRequest) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *ModifyThreadRequest) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


