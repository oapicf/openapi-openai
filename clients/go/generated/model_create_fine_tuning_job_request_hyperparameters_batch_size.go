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

// CreateFineTuningJobRequestHyperparametersBatchSize - Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
type CreateFineTuningJobRequestHyperparametersBatchSize struct {
	Int32 *int32
	String *string
}

// int32AsCreateFineTuningJobRequestHyperparametersBatchSize is a convenience function that returns int32 wrapped in CreateFineTuningJobRequestHyperparametersBatchSize
func Int32AsCreateFineTuningJobRequestHyperparametersBatchSize(v *int32) CreateFineTuningJobRequestHyperparametersBatchSize {
	return CreateFineTuningJobRequestHyperparametersBatchSize{
		Int32: v,
	}
}

// stringAsCreateFineTuningJobRequestHyperparametersBatchSize is a convenience function that returns string wrapped in CreateFineTuningJobRequestHyperparametersBatchSize
func StringAsCreateFineTuningJobRequestHyperparametersBatchSize(v *string) CreateFineTuningJobRequestHyperparametersBatchSize {
	return CreateFineTuningJobRequestHyperparametersBatchSize{
		String: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *CreateFineTuningJobRequestHyperparametersBatchSize) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into Int32
	err = newStrictDecoder(data).Decode(&dst.Int32)
	if err == nil {
		jsonInt32, _ := json.Marshal(dst.Int32)
		if string(jsonInt32) == "{}" { // empty struct
			dst.Int32 = nil
		} else {
			if err = validator.Validate(dst.Int32); err != nil {
				dst.Int32 = nil
			} else {
				match++
			}
		}
	} else {
		dst.Int32 = nil
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
		dst.Int32 = nil
		dst.String = nil

		return fmt.Errorf("data matches more than one schema in oneOf(CreateFineTuningJobRequestHyperparametersBatchSize)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(CreateFineTuningJobRequestHyperparametersBatchSize)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src CreateFineTuningJobRequestHyperparametersBatchSize) MarshalJSON() ([]byte, error) {
	if src.Int32 != nil {
		return json.Marshal(&src.Int32)
	}

	if src.String != nil {
		return json.Marshal(&src.String)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *CreateFineTuningJobRequestHyperparametersBatchSize) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.Int32 != nil {
		return obj.Int32
	}

	if obj.String != nil {
		return obj.String
	}

	// all schemas are nil
	return nil
}

type NullableCreateFineTuningJobRequestHyperparametersBatchSize struct {
	value *CreateFineTuningJobRequestHyperparametersBatchSize
	isSet bool
}

func (v NullableCreateFineTuningJobRequestHyperparametersBatchSize) Get() *CreateFineTuningJobRequestHyperparametersBatchSize {
	return v.value
}

func (v *NullableCreateFineTuningJobRequestHyperparametersBatchSize) Set(val *CreateFineTuningJobRequestHyperparametersBatchSize) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateFineTuningJobRequestHyperparametersBatchSize) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateFineTuningJobRequestHyperparametersBatchSize) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateFineTuningJobRequestHyperparametersBatchSize(val *CreateFineTuningJobRequestHyperparametersBatchSize) *NullableCreateFineTuningJobRequestHyperparametersBatchSize {
	return &NullableCreateFineTuningJobRequestHyperparametersBatchSize{value: val, isSet: true}
}

func (v NullableCreateFineTuningJobRequestHyperparametersBatchSize) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateFineTuningJobRequestHyperparametersBatchSize) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


