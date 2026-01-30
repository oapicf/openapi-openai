# UsageVectorStoresResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**UsageBytes** | **int32** | The vector stores usage in bytes. | 
**ProjectId** | Pointer to **NullableString** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 

## Methods

### NewUsageVectorStoresResult

`func NewUsageVectorStoresResult(object string, usageBytes int32, ) *UsageVectorStoresResult`

NewUsageVectorStoresResult instantiates a new UsageVectorStoresResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsageVectorStoresResultWithDefaults

`func NewUsageVectorStoresResultWithDefaults() *UsageVectorStoresResult`

NewUsageVectorStoresResultWithDefaults instantiates a new UsageVectorStoresResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *UsageVectorStoresResult) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *UsageVectorStoresResult) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *UsageVectorStoresResult) SetObject(v string)`

SetObject sets Object field to given value.


### GetUsageBytes

`func (o *UsageVectorStoresResult) GetUsageBytes() int32`

GetUsageBytes returns the UsageBytes field if non-nil, zero value otherwise.

### GetUsageBytesOk

`func (o *UsageVectorStoresResult) GetUsageBytesOk() (*int32, bool)`

GetUsageBytesOk returns a tuple with the UsageBytes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsageBytes

`func (o *UsageVectorStoresResult) SetUsageBytes(v int32)`

SetUsageBytes sets UsageBytes field to given value.


### GetProjectId

`func (o *UsageVectorStoresResult) GetProjectId() string`

GetProjectId returns the ProjectId field if non-nil, zero value otherwise.

### GetProjectIdOk

`func (o *UsageVectorStoresResult) GetProjectIdOk() (*string, bool)`

GetProjectIdOk returns a tuple with the ProjectId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProjectId

`func (o *UsageVectorStoresResult) SetProjectId(v string)`

SetProjectId sets ProjectId field to given value.

### HasProjectId

`func (o *UsageVectorStoresResult) HasProjectId() bool`

HasProjectId returns a boolean if a field has been set.

### SetProjectIdNil

`func (o *UsageVectorStoresResult) SetProjectIdNil(b bool)`

 SetProjectIdNil sets the value for ProjectId to be an explicit nil

### UnsetProjectId
`func (o *UsageVectorStoresResult) UnsetProjectId()`

UnsetProjectId ensures that no value is present for ProjectId, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


