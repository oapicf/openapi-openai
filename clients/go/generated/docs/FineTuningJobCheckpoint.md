# FineTuningJobCheckpoint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The checkpoint identifier, which can be referenced in the API endpoints. | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) for when the checkpoint was created. | 
**FineTunedModelCheckpoint** | **string** | The name of the fine-tuned checkpoint model that is created. | 
**StepNumber** | **int32** | The step number that the checkpoint was created at. | 
**Metrics** | [**FineTuningJobCheckpointMetrics**](FineTuningJobCheckpointMetrics.md) |  | 
**FineTuningJobId** | **string** | The name of the fine-tuning job that this checkpoint was created from. | 
**Object** | **string** | The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;. | 

## Methods

### NewFineTuningJobCheckpoint

`func NewFineTuningJobCheckpoint(id string, createdAt int32, fineTunedModelCheckpoint string, stepNumber int32, metrics FineTuningJobCheckpointMetrics, fineTuningJobId string, object string, ) *FineTuningJobCheckpoint`

NewFineTuningJobCheckpoint instantiates a new FineTuningJobCheckpoint object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFineTuningJobCheckpointWithDefaults

`func NewFineTuningJobCheckpointWithDefaults() *FineTuningJobCheckpoint`

NewFineTuningJobCheckpointWithDefaults instantiates a new FineTuningJobCheckpoint object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *FineTuningJobCheckpoint) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *FineTuningJobCheckpoint) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *FineTuningJobCheckpoint) SetId(v string)`

SetId sets Id field to given value.


### GetCreatedAt

`func (o *FineTuningJobCheckpoint) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *FineTuningJobCheckpoint) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *FineTuningJobCheckpoint) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetFineTunedModelCheckpoint

`func (o *FineTuningJobCheckpoint) GetFineTunedModelCheckpoint() string`

GetFineTunedModelCheckpoint returns the FineTunedModelCheckpoint field if non-nil, zero value otherwise.

### GetFineTunedModelCheckpointOk

`func (o *FineTuningJobCheckpoint) GetFineTunedModelCheckpointOk() (*string, bool)`

GetFineTunedModelCheckpointOk returns a tuple with the FineTunedModelCheckpoint field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFineTunedModelCheckpoint

`func (o *FineTuningJobCheckpoint) SetFineTunedModelCheckpoint(v string)`

SetFineTunedModelCheckpoint sets FineTunedModelCheckpoint field to given value.


### GetStepNumber

`func (o *FineTuningJobCheckpoint) GetStepNumber() int32`

GetStepNumber returns the StepNumber field if non-nil, zero value otherwise.

### GetStepNumberOk

`func (o *FineTuningJobCheckpoint) GetStepNumberOk() (*int32, bool)`

GetStepNumberOk returns a tuple with the StepNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStepNumber

`func (o *FineTuningJobCheckpoint) SetStepNumber(v int32)`

SetStepNumber sets StepNumber field to given value.


### GetMetrics

`func (o *FineTuningJobCheckpoint) GetMetrics() FineTuningJobCheckpointMetrics`

GetMetrics returns the Metrics field if non-nil, zero value otherwise.

### GetMetricsOk

`func (o *FineTuningJobCheckpoint) GetMetricsOk() (*FineTuningJobCheckpointMetrics, bool)`

GetMetricsOk returns a tuple with the Metrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetrics

`func (o *FineTuningJobCheckpoint) SetMetrics(v FineTuningJobCheckpointMetrics)`

SetMetrics sets Metrics field to given value.


### GetFineTuningJobId

`func (o *FineTuningJobCheckpoint) GetFineTuningJobId() string`

GetFineTuningJobId returns the FineTuningJobId field if non-nil, zero value otherwise.

### GetFineTuningJobIdOk

`func (o *FineTuningJobCheckpoint) GetFineTuningJobIdOk() (*string, bool)`

GetFineTuningJobIdOk returns a tuple with the FineTuningJobId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFineTuningJobId

`func (o *FineTuningJobCheckpoint) SetFineTuningJobId(v string)`

SetFineTuningJobId sets FineTuningJobId field to given value.


### GetObject

`func (o *FineTuningJobCheckpoint) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *FineTuningJobCheckpoint) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *FineTuningJobCheckpoint) SetObject(v string)`

SetObject sets Object field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


