/*
OpenAI API

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

API version: 2.0.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// checks if the FineTuningJobCheckpointMetrics type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &FineTuningJobCheckpointMetrics{}

// FineTuningJobCheckpointMetrics Metrics at the step number during the fine-tuning job.
type FineTuningJobCheckpointMetrics struct {
	Step *float32 `json:"step,omitempty"`
	TrainLoss *float32 `json:"train_loss,omitempty"`
	TrainMeanTokenAccuracy *float32 `json:"train_mean_token_accuracy,omitempty"`
	ValidLoss *float32 `json:"valid_loss,omitempty"`
	ValidMeanTokenAccuracy *float32 `json:"valid_mean_token_accuracy,omitempty"`
	FullValidLoss *float32 `json:"full_valid_loss,omitempty"`
	FullValidMeanTokenAccuracy *float32 `json:"full_valid_mean_token_accuracy,omitempty"`
}

// NewFineTuningJobCheckpointMetrics instantiates a new FineTuningJobCheckpointMetrics object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFineTuningJobCheckpointMetrics() *FineTuningJobCheckpointMetrics {
	this := FineTuningJobCheckpointMetrics{}
	return &this
}

// NewFineTuningJobCheckpointMetricsWithDefaults instantiates a new FineTuningJobCheckpointMetrics object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFineTuningJobCheckpointMetricsWithDefaults() *FineTuningJobCheckpointMetrics {
	this := FineTuningJobCheckpointMetrics{}
	return &this
}

// GetStep returns the Step field value if set, zero value otherwise.
func (o *FineTuningJobCheckpointMetrics) GetStep() float32 {
	if o == nil || IsNil(o.Step) {
		var ret float32
		return ret
	}
	return *o.Step
}

// GetStepOk returns a tuple with the Step field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FineTuningJobCheckpointMetrics) GetStepOk() (*float32, bool) {
	if o == nil || IsNil(o.Step) {
		return nil, false
	}
	return o.Step, true
}

// HasStep returns a boolean if a field has been set.
func (o *FineTuningJobCheckpointMetrics) HasStep() bool {
	if o != nil && !IsNil(o.Step) {
		return true
	}

	return false
}

// SetStep gets a reference to the given float32 and assigns it to the Step field.
func (o *FineTuningJobCheckpointMetrics) SetStep(v float32) {
	o.Step = &v
}

// GetTrainLoss returns the TrainLoss field value if set, zero value otherwise.
func (o *FineTuningJobCheckpointMetrics) GetTrainLoss() float32 {
	if o == nil || IsNil(o.TrainLoss) {
		var ret float32
		return ret
	}
	return *o.TrainLoss
}

// GetTrainLossOk returns a tuple with the TrainLoss field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FineTuningJobCheckpointMetrics) GetTrainLossOk() (*float32, bool) {
	if o == nil || IsNil(o.TrainLoss) {
		return nil, false
	}
	return o.TrainLoss, true
}

// HasTrainLoss returns a boolean if a field has been set.
func (o *FineTuningJobCheckpointMetrics) HasTrainLoss() bool {
	if o != nil && !IsNil(o.TrainLoss) {
		return true
	}

	return false
}

// SetTrainLoss gets a reference to the given float32 and assigns it to the TrainLoss field.
func (o *FineTuningJobCheckpointMetrics) SetTrainLoss(v float32) {
	o.TrainLoss = &v
}

// GetTrainMeanTokenAccuracy returns the TrainMeanTokenAccuracy field value if set, zero value otherwise.
func (o *FineTuningJobCheckpointMetrics) GetTrainMeanTokenAccuracy() float32 {
	if o == nil || IsNil(o.TrainMeanTokenAccuracy) {
		var ret float32
		return ret
	}
	return *o.TrainMeanTokenAccuracy
}

// GetTrainMeanTokenAccuracyOk returns a tuple with the TrainMeanTokenAccuracy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FineTuningJobCheckpointMetrics) GetTrainMeanTokenAccuracyOk() (*float32, bool) {
	if o == nil || IsNil(o.TrainMeanTokenAccuracy) {
		return nil, false
	}
	return o.TrainMeanTokenAccuracy, true
}

// HasTrainMeanTokenAccuracy returns a boolean if a field has been set.
func (o *FineTuningJobCheckpointMetrics) HasTrainMeanTokenAccuracy() bool {
	if o != nil && !IsNil(o.TrainMeanTokenAccuracy) {
		return true
	}

	return false
}

// SetTrainMeanTokenAccuracy gets a reference to the given float32 and assigns it to the TrainMeanTokenAccuracy field.
func (o *FineTuningJobCheckpointMetrics) SetTrainMeanTokenAccuracy(v float32) {
	o.TrainMeanTokenAccuracy = &v
}

// GetValidLoss returns the ValidLoss field value if set, zero value otherwise.
func (o *FineTuningJobCheckpointMetrics) GetValidLoss() float32 {
	if o == nil || IsNil(o.ValidLoss) {
		var ret float32
		return ret
	}
	return *o.ValidLoss
}

// GetValidLossOk returns a tuple with the ValidLoss field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FineTuningJobCheckpointMetrics) GetValidLossOk() (*float32, bool) {
	if o == nil || IsNil(o.ValidLoss) {
		return nil, false
	}
	return o.ValidLoss, true
}

// HasValidLoss returns a boolean if a field has been set.
func (o *FineTuningJobCheckpointMetrics) HasValidLoss() bool {
	if o != nil && !IsNil(o.ValidLoss) {
		return true
	}

	return false
}

// SetValidLoss gets a reference to the given float32 and assigns it to the ValidLoss field.
func (o *FineTuningJobCheckpointMetrics) SetValidLoss(v float32) {
	o.ValidLoss = &v
}

// GetValidMeanTokenAccuracy returns the ValidMeanTokenAccuracy field value if set, zero value otherwise.
func (o *FineTuningJobCheckpointMetrics) GetValidMeanTokenAccuracy() float32 {
	if o == nil || IsNil(o.ValidMeanTokenAccuracy) {
		var ret float32
		return ret
	}
	return *o.ValidMeanTokenAccuracy
}

// GetValidMeanTokenAccuracyOk returns a tuple with the ValidMeanTokenAccuracy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FineTuningJobCheckpointMetrics) GetValidMeanTokenAccuracyOk() (*float32, bool) {
	if o == nil || IsNil(o.ValidMeanTokenAccuracy) {
		return nil, false
	}
	return o.ValidMeanTokenAccuracy, true
}

// HasValidMeanTokenAccuracy returns a boolean if a field has been set.
func (o *FineTuningJobCheckpointMetrics) HasValidMeanTokenAccuracy() bool {
	if o != nil && !IsNil(o.ValidMeanTokenAccuracy) {
		return true
	}

	return false
}

// SetValidMeanTokenAccuracy gets a reference to the given float32 and assigns it to the ValidMeanTokenAccuracy field.
func (o *FineTuningJobCheckpointMetrics) SetValidMeanTokenAccuracy(v float32) {
	o.ValidMeanTokenAccuracy = &v
}

// GetFullValidLoss returns the FullValidLoss field value if set, zero value otherwise.
func (o *FineTuningJobCheckpointMetrics) GetFullValidLoss() float32 {
	if o == nil || IsNil(o.FullValidLoss) {
		var ret float32
		return ret
	}
	return *o.FullValidLoss
}

// GetFullValidLossOk returns a tuple with the FullValidLoss field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FineTuningJobCheckpointMetrics) GetFullValidLossOk() (*float32, bool) {
	if o == nil || IsNil(o.FullValidLoss) {
		return nil, false
	}
	return o.FullValidLoss, true
}

// HasFullValidLoss returns a boolean if a field has been set.
func (o *FineTuningJobCheckpointMetrics) HasFullValidLoss() bool {
	if o != nil && !IsNil(o.FullValidLoss) {
		return true
	}

	return false
}

// SetFullValidLoss gets a reference to the given float32 and assigns it to the FullValidLoss field.
func (o *FineTuningJobCheckpointMetrics) SetFullValidLoss(v float32) {
	o.FullValidLoss = &v
}

// GetFullValidMeanTokenAccuracy returns the FullValidMeanTokenAccuracy field value if set, zero value otherwise.
func (o *FineTuningJobCheckpointMetrics) GetFullValidMeanTokenAccuracy() float32 {
	if o == nil || IsNil(o.FullValidMeanTokenAccuracy) {
		var ret float32
		return ret
	}
	return *o.FullValidMeanTokenAccuracy
}

// GetFullValidMeanTokenAccuracyOk returns a tuple with the FullValidMeanTokenAccuracy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FineTuningJobCheckpointMetrics) GetFullValidMeanTokenAccuracyOk() (*float32, bool) {
	if o == nil || IsNil(o.FullValidMeanTokenAccuracy) {
		return nil, false
	}
	return o.FullValidMeanTokenAccuracy, true
}

// HasFullValidMeanTokenAccuracy returns a boolean if a field has been set.
func (o *FineTuningJobCheckpointMetrics) HasFullValidMeanTokenAccuracy() bool {
	if o != nil && !IsNil(o.FullValidMeanTokenAccuracy) {
		return true
	}

	return false
}

// SetFullValidMeanTokenAccuracy gets a reference to the given float32 and assigns it to the FullValidMeanTokenAccuracy field.
func (o *FineTuningJobCheckpointMetrics) SetFullValidMeanTokenAccuracy(v float32) {
	o.FullValidMeanTokenAccuracy = &v
}

func (o FineTuningJobCheckpointMetrics) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o FineTuningJobCheckpointMetrics) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Step) {
		toSerialize["step"] = o.Step
	}
	if !IsNil(o.TrainLoss) {
		toSerialize["train_loss"] = o.TrainLoss
	}
	if !IsNil(o.TrainMeanTokenAccuracy) {
		toSerialize["train_mean_token_accuracy"] = o.TrainMeanTokenAccuracy
	}
	if !IsNil(o.ValidLoss) {
		toSerialize["valid_loss"] = o.ValidLoss
	}
	if !IsNil(o.ValidMeanTokenAccuracy) {
		toSerialize["valid_mean_token_accuracy"] = o.ValidMeanTokenAccuracy
	}
	if !IsNil(o.FullValidLoss) {
		toSerialize["full_valid_loss"] = o.FullValidLoss
	}
	if !IsNil(o.FullValidMeanTokenAccuracy) {
		toSerialize["full_valid_mean_token_accuracy"] = o.FullValidMeanTokenAccuracy
	}
	return toSerialize, nil
}

type NullableFineTuningJobCheckpointMetrics struct {
	value *FineTuningJobCheckpointMetrics
	isSet bool
}

func (v NullableFineTuningJobCheckpointMetrics) Get() *FineTuningJobCheckpointMetrics {
	return v.value
}

func (v *NullableFineTuningJobCheckpointMetrics) Set(val *FineTuningJobCheckpointMetrics) {
	v.value = val
	v.isSet = true
}

func (v NullableFineTuningJobCheckpointMetrics) IsSet() bool {
	return v.isSet
}

func (v *NullableFineTuningJobCheckpointMetrics) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFineTuningJobCheckpointMetrics(val *FineTuningJobCheckpointMetrics) *NullableFineTuningJobCheckpointMetrics {
	return &NullableFineTuningJobCheckpointMetrics{value: val, isSet: true}
}

func (v NullableFineTuningJobCheckpointMetrics) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFineTuningJobCheckpointMetrics) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


