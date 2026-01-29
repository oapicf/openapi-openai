# FineTuningJobCheckpointMetrics

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Step** | Pointer to **float32** |  | [optional] 
**TrainLoss** | Pointer to **float32** |  | [optional] 
**TrainMeanTokenAccuracy** | Pointer to **float32** |  | [optional] 
**ValidLoss** | Pointer to **float32** |  | [optional] 
**ValidMeanTokenAccuracy** | Pointer to **float32** |  | [optional] 
**FullValidLoss** | Pointer to **float32** |  | [optional] 
**FullValidMeanTokenAccuracy** | Pointer to **float32** |  | [optional] 

## Methods

### NewFineTuningJobCheckpointMetrics

`func NewFineTuningJobCheckpointMetrics() *FineTuningJobCheckpointMetrics`

NewFineTuningJobCheckpointMetrics instantiates a new FineTuningJobCheckpointMetrics object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFineTuningJobCheckpointMetricsWithDefaults

`func NewFineTuningJobCheckpointMetricsWithDefaults() *FineTuningJobCheckpointMetrics`

NewFineTuningJobCheckpointMetricsWithDefaults instantiates a new FineTuningJobCheckpointMetrics object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStep

`func (o *FineTuningJobCheckpointMetrics) GetStep() float32`

GetStep returns the Step field if non-nil, zero value otherwise.

### GetStepOk

`func (o *FineTuningJobCheckpointMetrics) GetStepOk() (*float32, bool)`

GetStepOk returns a tuple with the Step field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStep

`func (o *FineTuningJobCheckpointMetrics) SetStep(v float32)`

SetStep sets Step field to given value.

### HasStep

`func (o *FineTuningJobCheckpointMetrics) HasStep() bool`

HasStep returns a boolean if a field has been set.

### GetTrainLoss

`func (o *FineTuningJobCheckpointMetrics) GetTrainLoss() float32`

GetTrainLoss returns the TrainLoss field if non-nil, zero value otherwise.

### GetTrainLossOk

`func (o *FineTuningJobCheckpointMetrics) GetTrainLossOk() (*float32, bool)`

GetTrainLossOk returns a tuple with the TrainLoss field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrainLoss

`func (o *FineTuningJobCheckpointMetrics) SetTrainLoss(v float32)`

SetTrainLoss sets TrainLoss field to given value.

### HasTrainLoss

`func (o *FineTuningJobCheckpointMetrics) HasTrainLoss() bool`

HasTrainLoss returns a boolean if a field has been set.

### GetTrainMeanTokenAccuracy

`func (o *FineTuningJobCheckpointMetrics) GetTrainMeanTokenAccuracy() float32`

GetTrainMeanTokenAccuracy returns the TrainMeanTokenAccuracy field if non-nil, zero value otherwise.

### GetTrainMeanTokenAccuracyOk

`func (o *FineTuningJobCheckpointMetrics) GetTrainMeanTokenAccuracyOk() (*float32, bool)`

GetTrainMeanTokenAccuracyOk returns a tuple with the TrainMeanTokenAccuracy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrainMeanTokenAccuracy

`func (o *FineTuningJobCheckpointMetrics) SetTrainMeanTokenAccuracy(v float32)`

SetTrainMeanTokenAccuracy sets TrainMeanTokenAccuracy field to given value.

### HasTrainMeanTokenAccuracy

`func (o *FineTuningJobCheckpointMetrics) HasTrainMeanTokenAccuracy() bool`

HasTrainMeanTokenAccuracy returns a boolean if a field has been set.

### GetValidLoss

`func (o *FineTuningJobCheckpointMetrics) GetValidLoss() float32`

GetValidLoss returns the ValidLoss field if non-nil, zero value otherwise.

### GetValidLossOk

`func (o *FineTuningJobCheckpointMetrics) GetValidLossOk() (*float32, bool)`

GetValidLossOk returns a tuple with the ValidLoss field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidLoss

`func (o *FineTuningJobCheckpointMetrics) SetValidLoss(v float32)`

SetValidLoss sets ValidLoss field to given value.

### HasValidLoss

`func (o *FineTuningJobCheckpointMetrics) HasValidLoss() bool`

HasValidLoss returns a boolean if a field has been set.

### GetValidMeanTokenAccuracy

`func (o *FineTuningJobCheckpointMetrics) GetValidMeanTokenAccuracy() float32`

GetValidMeanTokenAccuracy returns the ValidMeanTokenAccuracy field if non-nil, zero value otherwise.

### GetValidMeanTokenAccuracyOk

`func (o *FineTuningJobCheckpointMetrics) GetValidMeanTokenAccuracyOk() (*float32, bool)`

GetValidMeanTokenAccuracyOk returns a tuple with the ValidMeanTokenAccuracy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidMeanTokenAccuracy

`func (o *FineTuningJobCheckpointMetrics) SetValidMeanTokenAccuracy(v float32)`

SetValidMeanTokenAccuracy sets ValidMeanTokenAccuracy field to given value.

### HasValidMeanTokenAccuracy

`func (o *FineTuningJobCheckpointMetrics) HasValidMeanTokenAccuracy() bool`

HasValidMeanTokenAccuracy returns a boolean if a field has been set.

### GetFullValidLoss

`func (o *FineTuningJobCheckpointMetrics) GetFullValidLoss() float32`

GetFullValidLoss returns the FullValidLoss field if non-nil, zero value otherwise.

### GetFullValidLossOk

`func (o *FineTuningJobCheckpointMetrics) GetFullValidLossOk() (*float32, bool)`

GetFullValidLossOk returns a tuple with the FullValidLoss field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullValidLoss

`func (o *FineTuningJobCheckpointMetrics) SetFullValidLoss(v float32)`

SetFullValidLoss sets FullValidLoss field to given value.

### HasFullValidLoss

`func (o *FineTuningJobCheckpointMetrics) HasFullValidLoss() bool`

HasFullValidLoss returns a boolean if a field has been set.

### GetFullValidMeanTokenAccuracy

`func (o *FineTuningJobCheckpointMetrics) GetFullValidMeanTokenAccuracy() float32`

GetFullValidMeanTokenAccuracy returns the FullValidMeanTokenAccuracy field if non-nil, zero value otherwise.

### GetFullValidMeanTokenAccuracyOk

`func (o *FineTuningJobCheckpointMetrics) GetFullValidMeanTokenAccuracyOk() (*float32, bool)`

GetFullValidMeanTokenAccuracyOk returns a tuple with the FullValidMeanTokenAccuracy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullValidMeanTokenAccuracy

`func (o *FineTuningJobCheckpointMetrics) SetFullValidMeanTokenAccuracy(v float32)`

SetFullValidMeanTokenAccuracy sets FullValidMeanTokenAccuracy field to given value.

### HasFullValidMeanTokenAccuracy

`func (o *FineTuningJobCheckpointMetrics) HasFullValidMeanTokenAccuracy() bool`

HasFullValidMeanTokenAccuracy returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


