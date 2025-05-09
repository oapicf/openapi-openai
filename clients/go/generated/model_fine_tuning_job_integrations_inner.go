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
	"gopkg.in/validator.v2"
	"fmt"
)

// FineTuningJobIntegrationsInner - struct for FineTuningJobIntegrationsInner
type FineTuningJobIntegrationsInner struct {
	FineTuningIntegration *FineTuningIntegration
}

// FineTuningIntegrationAsFineTuningJobIntegrationsInner is a convenience function that returns FineTuningIntegration wrapped in FineTuningJobIntegrationsInner
func FineTuningIntegrationAsFineTuningJobIntegrationsInner(v *FineTuningIntegration) FineTuningJobIntegrationsInner {
	return FineTuningJobIntegrationsInner{
		FineTuningIntegration: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *FineTuningJobIntegrationsInner) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into FineTuningIntegration
	err = newStrictDecoder(data).Decode(&dst.FineTuningIntegration)
	if err == nil {
		jsonFineTuningIntegration, _ := json.Marshal(dst.FineTuningIntegration)
		if string(jsonFineTuningIntegration) == "{}" { // empty struct
			dst.FineTuningIntegration = nil
		} else {
			if err = validator.Validate(dst.FineTuningIntegration); err != nil {
				dst.FineTuningIntegration = nil
			} else {
				match++
			}
		}
	} else {
		dst.FineTuningIntegration = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.FineTuningIntegration = nil

		return fmt.Errorf("data matches more than one schema in oneOf(FineTuningJobIntegrationsInner)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(FineTuningJobIntegrationsInner)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src FineTuningJobIntegrationsInner) MarshalJSON() ([]byte, error) {
	if src.FineTuningIntegration != nil {
		return json.Marshal(&src.FineTuningIntegration)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *FineTuningJobIntegrationsInner) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.FineTuningIntegration != nil {
		return obj.FineTuningIntegration
	}

	// all schemas are nil
	return nil
}

type NullableFineTuningJobIntegrationsInner struct {
	value *FineTuningJobIntegrationsInner
	isSet bool
}

func (v NullableFineTuningJobIntegrationsInner) Get() *FineTuningJobIntegrationsInner {
	return v.value
}

func (v *NullableFineTuningJobIntegrationsInner) Set(val *FineTuningJobIntegrationsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableFineTuningJobIntegrationsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableFineTuningJobIntegrationsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFineTuningJobIntegrationsInner(val *FineTuningJobIntegrationsInner) *NullableFineTuningJobIntegrationsInner {
	return &NullableFineTuningJobIntegrationsInner{value: val, isSet: true}
}

func (v NullableFineTuningJobIntegrationsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFineTuningJobIntegrationsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


