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

// CreateFineTuningJobRequestHyperparametersLearningRateMultiplier - Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
type CreateFineTuningJobRequestHyperparametersLearningRateMultiplier struct {
	Float32 *float32
	String *string
}

// float32AsCreateFineTuningJobRequestHyperparametersLearningRateMultiplier is a convenience function that returns float32 wrapped in CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
func Float32AsCreateFineTuningJobRequestHyperparametersLearningRateMultiplier(v *float32) CreateFineTuningJobRequestHyperparametersLearningRateMultiplier {
	return CreateFineTuningJobRequestHyperparametersLearningRateMultiplier{
		Float32: v,
	}
}

// stringAsCreateFineTuningJobRequestHyperparametersLearningRateMultiplier is a convenience function that returns string wrapped in CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
func StringAsCreateFineTuningJobRequestHyperparametersLearningRateMultiplier(v *string) CreateFineTuningJobRequestHyperparametersLearningRateMultiplier {
	return CreateFineTuningJobRequestHyperparametersLearningRateMultiplier{
		String: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *CreateFineTuningJobRequestHyperparametersLearningRateMultiplier) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into Float32
	err = newStrictDecoder(data).Decode(&dst.Float32)
	if err == nil {
		jsonFloat32, _ := json.Marshal(dst.Float32)
		if string(jsonFloat32) == "{}" { // empty struct
			dst.Float32 = nil
		} else {
			if err = validator.Validate(dst.Float32); err != nil {
				dst.Float32 = nil
			} else {
				match++
			}
		}
	} else {
		dst.Float32 = nil
	}

	// try to unmarshal data into String
	err = newStrictDecoder(data).Decode(&dst.String)
	if err == nil {
		jsonString, _ := json.Marshal(dst.String)
		if string(jsonString) == "{}" { // empty struct
			dst.String = nil
		} else {
			if err = validator.Validate(dst.String); err != nil {
				dst.String = nil
			} else {
				match++
			}
		}
	} else {
		dst.String = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.Float32 = nil
		dst.String = nil

		return fmt.Errorf("data matches more than one schema in oneOf(CreateFineTuningJobRequestHyperparametersLearningRateMultiplier)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(CreateFineTuningJobRequestHyperparametersLearningRateMultiplier)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src CreateFineTuningJobRequestHyperparametersLearningRateMultiplier) MarshalJSON() ([]byte, error) {
	if src.Float32 != nil {
		return json.Marshal(&src.Float32)
	}

	if src.String != nil {
		return json.Marshal(&src.String)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *CreateFineTuningJobRequestHyperparametersLearningRateMultiplier) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.Float32 != nil {
		return obj.Float32
	}

	if obj.String != nil {
		return obj.String
	}

	// all schemas are nil
	return nil
}

type NullableCreateFineTuningJobRequestHyperparametersLearningRateMultiplier struct {
	value *CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
	isSet bool
}

func (v NullableCreateFineTuningJobRequestHyperparametersLearningRateMultiplier) Get() *CreateFineTuningJobRequestHyperparametersLearningRateMultiplier {
	return v.value
}

func (v *NullableCreateFineTuningJobRequestHyperparametersLearningRateMultiplier) Set(val *CreateFineTuningJobRequestHyperparametersLearningRateMultiplier) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateFineTuningJobRequestHyperparametersLearningRateMultiplier) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateFineTuningJobRequestHyperparametersLearningRateMultiplier) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateFineTuningJobRequestHyperparametersLearningRateMultiplier(val *CreateFineTuningJobRequestHyperparametersLearningRateMultiplier) *NullableCreateFineTuningJobRequestHyperparametersLearningRateMultiplier {
	return &NullableCreateFineTuningJobRequestHyperparametersLearningRateMultiplier{value: val, isSet: true}
}

func (v NullableCreateFineTuningJobRequestHyperparametersLearningRateMultiplier) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateFineTuningJobRequestHyperparametersLearningRateMultiplier) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


