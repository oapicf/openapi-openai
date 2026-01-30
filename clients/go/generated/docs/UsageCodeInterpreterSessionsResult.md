# UsageCodeInterpreterSessionsResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**Sessions** | **int32** | The number of code interpreter sessions. | 
**ProjectId** | Pointer to **NullableString** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 

## Methods

### NewUsageCodeInterpreterSessionsResult

`func NewUsageCodeInterpreterSessionsResult(object string, sessions int32, ) *UsageCodeInterpreterSessionsResult`

NewUsageCodeInterpreterSessionsResult instantiates a new UsageCodeInterpreterSessionsResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsageCodeInterpreterSessionsResultWithDefaults

`func NewUsageCodeInterpreterSessionsResultWithDefaults() *UsageCodeInterpreterSessionsResult`

NewUsageCodeInterpreterSessionsResultWithDefaults instantiates a new UsageCodeInterpreterSessionsResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *UsageCodeInterpreterSessionsResult) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *UsageCodeInterpreterSessionsResult) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *UsageCodeInterpreterSessionsResult) SetObject(v string)`

SetObject sets Object field to given value.


### GetSessions

`func (o *UsageCodeInterpreterSessionsResult) GetSessions() int32`

GetSessions returns the Sessions field if non-nil, zero value otherwise.

### GetSessionsOk

`func (o *UsageCodeInterpreterSessionsResult) GetSessionsOk() (*int32, bool)`

GetSessionsOk returns a tuple with the Sessions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSessions

`func (o *UsageCodeInterpreterSessionsResult) SetSessions(v int32)`

SetSessions sets Sessions field to given value.


### GetProjectId

`func (o *UsageCodeInterpreterSessionsResult) GetProjectId() string`

GetProjectId returns the ProjectId field if non-nil, zero value otherwise.

### GetProjectIdOk

`func (o *UsageCodeInterpreterSessionsResult) GetProjectIdOk() (*string, bool)`

GetProjectIdOk returns a tuple with the ProjectId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProjectId

`func (o *UsageCodeInterpreterSessionsResult) SetProjectId(v string)`

SetProjectId sets ProjectId field to given value.

### HasProjectId

`func (o *UsageCodeInterpreterSessionsResult) HasProjectId() bool`

HasProjectId returns a boolean if a field has been set.

### SetProjectIdNil

`func (o *UsageCodeInterpreterSessionsResult) SetProjectIdNil(b bool)`

 SetProjectIdNil sets the value for ProjectId to be an explicit nil

### UnsetProjectId
`func (o *UsageCodeInterpreterSessionsResult) UnsetProjectId()`

UnsetProjectId ensures that no value is present for ProjectId, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


