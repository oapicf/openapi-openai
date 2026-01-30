# CreateThreadRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messages** | Pointer to [**[]CreateMessageRequest**](CreateMessageRequest.md) | A list of [messages](/docs/api-reference/messages) to start the thread with. | [optional] 
**ToolResources** | Pointer to [**NullableCreateThreadRequestToolResources**](CreateThreadRequestToolResources.md) |  | [optional] 
**Metadata** | Pointer to **map[string]interface{}** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 

## Methods

### NewCreateThreadRequest

`func NewCreateThreadRequest() *CreateThreadRequest`

NewCreateThreadRequest instantiates a new CreateThreadRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateThreadRequestWithDefaults

`func NewCreateThreadRequestWithDefaults() *CreateThreadRequest`

NewCreateThreadRequestWithDefaults instantiates a new CreateThreadRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessages

`func (o *CreateThreadRequest) GetMessages() []CreateMessageRequest`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *CreateThreadRequest) GetMessagesOk() (*[]CreateMessageRequest, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *CreateThreadRequest) SetMessages(v []CreateMessageRequest)`

SetMessages sets Messages field to given value.

### HasMessages

`func (o *CreateThreadRequest) HasMessages() bool`

HasMessages returns a boolean if a field has been set.

### GetToolResources

`func (o *CreateThreadRequest) GetToolResources() CreateThreadRequestToolResources`

GetToolResources returns the ToolResources field if non-nil, zero value otherwise.

### GetToolResourcesOk

`func (o *CreateThreadRequest) GetToolResourcesOk() (*CreateThreadRequestToolResources, bool)`

GetToolResourcesOk returns a tuple with the ToolResources field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolResources

`func (o *CreateThreadRequest) SetToolResources(v CreateThreadRequestToolResources)`

SetToolResources sets ToolResources field to given value.

### HasToolResources

`func (o *CreateThreadRequest) HasToolResources() bool`

HasToolResources returns a boolean if a field has been set.

### SetToolResourcesNil

`func (o *CreateThreadRequest) SetToolResourcesNil(b bool)`

 SetToolResourcesNil sets the value for ToolResources to be an explicit nil

### UnsetToolResources
`func (o *CreateThreadRequest) UnsetToolResources()`

UnsetToolResources ensures that no value is present for ToolResources, not even an explicit nil
### GetMetadata

`func (o *CreateThreadRequest) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *CreateThreadRequest) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *CreateThreadRequest) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *CreateThreadRequest) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *CreateThreadRequest) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *CreateThreadRequest) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


