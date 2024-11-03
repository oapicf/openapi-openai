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

// RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner - struct for RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
type RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner struct {
	RunStepDetailsToolCallsCodeOutputImageObject *RunStepDetailsToolCallsCodeOutputImageObject
	RunStepDetailsToolCallsCodeOutputLogsObject *RunStepDetailsToolCallsCodeOutputLogsObject
}

// RunStepDetailsToolCallsCodeOutputImageObjectAsRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner is a convenience function that returns RunStepDetailsToolCallsCodeOutputImageObject wrapped in RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
func RunStepDetailsToolCallsCodeOutputImageObjectAsRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(v *RunStepDetailsToolCallsCodeOutputImageObject) RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
	return RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner{
		RunStepDetailsToolCallsCodeOutputImageObject: v,
	}
}

// RunStepDetailsToolCallsCodeOutputLogsObjectAsRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner is a convenience function that returns RunStepDetailsToolCallsCodeOutputLogsObject wrapped in RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
func RunStepDetailsToolCallsCodeOutputLogsObjectAsRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(v *RunStepDetailsToolCallsCodeOutputLogsObject) RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
	return RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner{
		RunStepDetailsToolCallsCodeOutputLogsObject: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into RunStepDetailsToolCallsCodeOutputImageObject
	err = newStrictDecoder(data).Decode(&dst.RunStepDetailsToolCallsCodeOutputImageObject)
	if err == nil {
		jsonRunStepDetailsToolCallsCodeOutputImageObject, _ := json.Marshal(dst.RunStepDetailsToolCallsCodeOutputImageObject)
		if string(jsonRunStepDetailsToolCallsCodeOutputImageObject) == "{}" { // empty struct
			dst.RunStepDetailsToolCallsCodeOutputImageObject = nil
		} else {
			if err = validator.Validate(dst.RunStepDetailsToolCallsCodeOutputImageObject); err != nil {
				dst.RunStepDetailsToolCallsCodeOutputImageObject = nil
			} else {
				match++
			}
		}
	} else {
		dst.RunStepDetailsToolCallsCodeOutputImageObject = nil
	}

	// try to unmarshal data into RunStepDetailsToolCallsCodeOutputLogsObject
	err = newStrictDecoder(data).Decode(&dst.RunStepDetailsToolCallsCodeOutputLogsObject)
	if err == nil {
		jsonRunStepDetailsToolCallsCodeOutputLogsObject, _ := json.Marshal(dst.RunStepDetailsToolCallsCodeOutputLogsObject)
		if string(jsonRunStepDetailsToolCallsCodeOutputLogsObject) == "{}" { // empty struct
			dst.RunStepDetailsToolCallsCodeOutputLogsObject = nil
		} else {
			if err = validator.Validate(dst.RunStepDetailsToolCallsCodeOutputLogsObject); err != nil {
				dst.RunStepDetailsToolCallsCodeOutputLogsObject = nil
			} else {
				match++
			}
		}
	} else {
		dst.RunStepDetailsToolCallsCodeOutputLogsObject = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.RunStepDetailsToolCallsCodeOutputImageObject = nil
		dst.RunStepDetailsToolCallsCodeOutputLogsObject = nil

		return fmt.Errorf("data matches more than one schema in oneOf(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) MarshalJSON() ([]byte, error) {
	if src.RunStepDetailsToolCallsCodeOutputImageObject != nil {
		return json.Marshal(&src.RunStepDetailsToolCallsCodeOutputImageObject)
	}

	if src.RunStepDetailsToolCallsCodeOutputLogsObject != nil {
		return json.Marshal(&src.RunStepDetailsToolCallsCodeOutputLogsObject)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.RunStepDetailsToolCallsCodeOutputImageObject != nil {
		return obj.RunStepDetailsToolCallsCodeOutputImageObject
	}

	if obj.RunStepDetailsToolCallsCodeOutputLogsObject != nil {
		return obj.RunStepDetailsToolCallsCodeOutputLogsObject
	}

	// all schemas are nil
	return nil
}

type NullableRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner struct {
	value *RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
	isSet bool
}

func (v NullableRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) Get() *RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
	return v.value
}

func (v *NullableRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) Set(val *RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(val *RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) *NullableRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
	return &NullableRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner{value: val, isSet: true}
}

func (v NullableRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


