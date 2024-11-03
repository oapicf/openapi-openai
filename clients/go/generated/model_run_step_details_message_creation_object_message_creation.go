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

// checks if the RunStepDetailsMessageCreationObjectMessageCreation type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &RunStepDetailsMessageCreationObjectMessageCreation{}

// RunStepDetailsMessageCreationObjectMessageCreation struct for RunStepDetailsMessageCreationObjectMessageCreation
type RunStepDetailsMessageCreationObjectMessageCreation struct {
	// The ID of the message that was created by this run step.
	MessageId string `json:"message_id"`
}

type _RunStepDetailsMessageCreationObjectMessageCreation RunStepDetailsMessageCreationObjectMessageCreation

// NewRunStepDetailsMessageCreationObjectMessageCreation instantiates a new RunStepDetailsMessageCreationObjectMessageCreation object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRunStepDetailsMessageCreationObjectMessageCreation(messageId string) *RunStepDetailsMessageCreationObjectMessageCreation {
	this := RunStepDetailsMessageCreationObjectMessageCreation{}
	this.MessageId = messageId
	return &this
}

// NewRunStepDetailsMessageCreationObjectMessageCreationWithDefaults instantiates a new RunStepDetailsMessageCreationObjectMessageCreation object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRunStepDetailsMessageCreationObjectMessageCreationWithDefaults() *RunStepDetailsMessageCreationObjectMessageCreation {
	this := RunStepDetailsMessageCreationObjectMessageCreation{}
	return &this
}

// GetMessageId returns the MessageId field value
func (o *RunStepDetailsMessageCreationObjectMessageCreation) GetMessageId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.MessageId
}

// GetMessageIdOk returns a tuple with the MessageId field value
// and a boolean to check if the value has been set.
func (o *RunStepDetailsMessageCreationObjectMessageCreation) GetMessageIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.MessageId, true
}

// SetMessageId sets field value
func (o *RunStepDetailsMessageCreationObjectMessageCreation) SetMessageId(v string) {
	o.MessageId = v
}

func (o RunStepDetailsMessageCreationObjectMessageCreation) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o RunStepDetailsMessageCreationObjectMessageCreation) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["message_id"] = o.MessageId
	return toSerialize, nil
}

func (o *RunStepDetailsMessageCreationObjectMessageCreation) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"message_id",
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

	varRunStepDetailsMessageCreationObjectMessageCreation := _RunStepDetailsMessageCreationObjectMessageCreation{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varRunStepDetailsMessageCreationObjectMessageCreation)

	if err != nil {
		return err
	}

	*o = RunStepDetailsMessageCreationObjectMessageCreation(varRunStepDetailsMessageCreationObjectMessageCreation)

	return err
}

type NullableRunStepDetailsMessageCreationObjectMessageCreation struct {
	value *RunStepDetailsMessageCreationObjectMessageCreation
	isSet bool
}

func (v NullableRunStepDetailsMessageCreationObjectMessageCreation) Get() *RunStepDetailsMessageCreationObjectMessageCreation {
	return v.value
}

func (v *NullableRunStepDetailsMessageCreationObjectMessageCreation) Set(val *RunStepDetailsMessageCreationObjectMessageCreation) {
	v.value = val
	v.isSet = true
}

func (v NullableRunStepDetailsMessageCreationObjectMessageCreation) IsSet() bool {
	return v.isSet
}

func (v *NullableRunStepDetailsMessageCreationObjectMessageCreation) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRunStepDetailsMessageCreationObjectMessageCreation(val *RunStepDetailsMessageCreationObjectMessageCreation) *NullableRunStepDetailsMessageCreationObjectMessageCreation {
	return &NullableRunStepDetailsMessageCreationObjectMessageCreation{value: val, isSet: true}
}

func (v NullableRunStepDetailsMessageCreationObjectMessageCreation) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRunStepDetailsMessageCreationObjectMessageCreation) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


