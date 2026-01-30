# ThreadObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The identifier, which can be referenced in API endpoints. | 
**Object** | **string** | The object type, which is always &#x60;thread&#x60;. | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) for when the thread was created. | 
**ToolResources** | [**NullableModifyThreadRequestToolResources**](ModifyThreadRequestToolResources.md) |  | 
**Metadata** | **map[string]interface{}** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 

## Methods

### NewThreadObject

`func NewThreadObject(id string, object string, createdAt int32, toolResources NullableModifyThreadRequestToolResources, metadata map[string]interface{}, ) *ThreadObject`

NewThreadObject instantiates a new ThreadObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewThreadObjectWithDefaults

`func NewThreadObjectWithDefaults() *ThreadObject`

NewThreadObjectWithDefaults instantiates a new ThreadObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ThreadObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ThreadObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ThreadObject) SetId(v string)`

SetId sets Id field to given value.


### GetObject

`func (o *ThreadObject) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ThreadObject) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ThreadObject) SetObject(v string)`

SetObject sets Object field to given value.


### GetCreatedAt

`func (o *ThreadObject) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *ThreadObject) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *ThreadObject) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetToolResources

`func (o *ThreadObject) GetToolResources() ModifyThreadRequestToolResources`

GetToolResources returns the ToolResources field if non-nil, zero value otherwise.

### GetToolResourcesOk

`func (o *ThreadObject) GetToolResourcesOk() (*ModifyThreadRequestToolResources, bool)`

GetToolResourcesOk returns a tuple with the ToolResources field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolResources

`func (o *ThreadObject) SetToolResources(v ModifyThreadRequestToolResources)`

SetToolResources sets ToolResources field to given value.


### SetToolResourcesNil

`func (o *ThreadObject) SetToolResourcesNil(b bool)`

 SetToolResourcesNil sets the value for ToolResources to be an explicit nil

### UnsetToolResources
`func (o *ThreadObject) UnsetToolResources()`

UnsetToolResources ensures that no value is present for ToolResources, not even an explicit nil
### GetMetadata

`func (o *ThreadObject) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *ThreadObject) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *ThreadObject) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.


### SetMetadataNil

`func (o *ThreadObject) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *ThreadObject) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


