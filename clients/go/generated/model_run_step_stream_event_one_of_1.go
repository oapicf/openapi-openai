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
	"bytes"
	"fmt"
)

// checks if the RunStepStreamEventOneOf1 type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &RunStepStreamEventOneOf1{}

// RunStepStreamEventOneOf1 Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an `in_progress` state.
type RunStepStreamEventOneOf1 struct {
	Event string `json:"event"`
	Data RunStepObject `json:"data"`
}

type _RunStepStreamEventOneOf1 RunStepStreamEventOneOf1

// NewRunStepStreamEventOneOf1 instantiates a new RunStepStreamEventOneOf1 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRunStepStreamEventOneOf1(event string, data RunStepObject) *RunStepStreamEventOneOf1 {
	this := RunStepStreamEventOneOf1{}
	this.Event = event
	this.Data = data
	return &this
}

// NewRunStepStreamEventOneOf1WithDefaults instantiates a new RunStepStreamEventOneOf1 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRunStepStreamEventOneOf1WithDefaults() *RunStepStreamEventOneOf1 {
	this := RunStepStreamEventOneOf1{}
	return &this
}

// GetEvent returns the Event field value
func (o *RunStepStreamEventOneOf1) GetEvent() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Event
}

// GetEventOk returns a tuple with the Event field value
// and a boolean to check if the value has been set.
func (o *RunStepStreamEventOneOf1) GetEventOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Event, true
}

// SetEvent sets field value
func (o *RunStepStreamEventOneOf1) SetEvent(v string) {
	o.Event = v
}

// GetData returns the Data field value
func (o *RunStepStreamEventOneOf1) GetData() RunStepObject {
	if o == nil {
		var ret RunStepObject
		return ret
	}

	return o.Data
}

// GetDataOk returns a tuple with the Data field value
// and a boolean to check if the value has been set.
func (o *RunStepStreamEventOneOf1) GetDataOk() (*RunStepObject, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Data, true
}

// SetData sets field value
func (o *RunStepStreamEventOneOf1) SetData(v RunStepObject) {
	o.Data = v
}

func (o RunStepStreamEventOneOf1) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o RunStepStreamEventOneOf1) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["event"] = o.Event
	toSerialize["data"] = o.Data
	return toSerialize, nil
}

func (o *RunStepStreamEventOneOf1) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"event",
		"data",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varRunStepStreamEventOneOf1 := _RunStepStreamEventOneOf1{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varRunStepStreamEventOneOf1)

	if err != nil {
		return err
	}

	*o = RunStepStreamEventOneOf1(varRunStepStreamEventOneOf1)

	return err
}

type NullableRunStepStreamEventOneOf1 struct {
	value *RunStepStreamEventOneOf1
	isSet bool
}

func (v NullableRunStepStreamEventOneOf1) Get() *RunStepStreamEventOneOf1 {
	return v.value
}

func (v *NullableRunStepStreamEventOneOf1) Set(val *RunStepStreamEventOneOf1) {
	v.value = val
	v.isSet = true
}

func (v NullableRunStepStreamEventOneOf1) IsSet() bool {
	return v.isSet
}

func (v *NullableRunStepStreamEventOneOf1) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRunStepStreamEventOneOf1(val *RunStepStreamEventOneOf1) *NullableRunStepStreamEventOneOf1 {
	return &NullableRunStepStreamEventOneOf1{value: val, isSet: true}
}

func (v NullableRunStepStreamEventOneOf1) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRunStepStreamEventOneOf1) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


