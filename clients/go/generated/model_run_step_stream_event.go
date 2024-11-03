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

// RunStepStreamEvent - struct for RunStepStreamEvent
type RunStepStreamEvent struct {
	RunStepStreamEventOneOf *RunStepStreamEventOneOf
	RunStepStreamEventOneOf1 *RunStepStreamEventOneOf1
	RunStepStreamEventOneOf2 *RunStepStreamEventOneOf2
	RunStepStreamEventOneOf3 *RunStepStreamEventOneOf3
	RunStepStreamEventOneOf4 *RunStepStreamEventOneOf4
	RunStepStreamEventOneOf5 *RunStepStreamEventOneOf5
	RunStepStreamEventOneOf6 *RunStepStreamEventOneOf6
}

// RunStepStreamEventOneOfAsRunStepStreamEvent is a convenience function that returns RunStepStreamEventOneOf wrapped in RunStepStreamEvent
func RunStepStreamEventOneOfAsRunStepStreamEvent(v *RunStepStreamEventOneOf) RunStepStreamEvent {
	return RunStepStreamEvent{
		RunStepStreamEventOneOf: v,
	}
}

// RunStepStreamEventOneOf1AsRunStepStreamEvent is a convenience function that returns RunStepStreamEventOneOf1 wrapped in RunStepStreamEvent
func RunStepStreamEventOneOf1AsRunStepStreamEvent(v *RunStepStreamEventOneOf1) RunStepStreamEvent {
	return RunStepStreamEvent{
		RunStepStreamEventOneOf1: v,
	}
}

// RunStepStreamEventOneOf2AsRunStepStreamEvent is a convenience function that returns RunStepStreamEventOneOf2 wrapped in RunStepStreamEvent
func RunStepStreamEventOneOf2AsRunStepStreamEvent(v *RunStepStreamEventOneOf2) RunStepStreamEvent {
	return RunStepStreamEvent{
		RunStepStreamEventOneOf2: v,
	}
}

// RunStepStreamEventOneOf3AsRunStepStreamEvent is a convenience function that returns RunStepStreamEventOneOf3 wrapped in RunStepStreamEvent
func RunStepStreamEventOneOf3AsRunStepStreamEvent(v *RunStepStreamEventOneOf3) RunStepStreamEvent {
	return RunStepStreamEvent{
		RunStepStreamEventOneOf3: v,
	}
}

// RunStepStreamEventOneOf4AsRunStepStreamEvent is a convenience function that returns RunStepStreamEventOneOf4 wrapped in RunStepStreamEvent
func RunStepStreamEventOneOf4AsRunStepStreamEvent(v *RunStepStreamEventOneOf4) RunStepStreamEvent {
	return RunStepStreamEvent{
		RunStepStreamEventOneOf4: v,
	}
}

// RunStepStreamEventOneOf5AsRunStepStreamEvent is a convenience function that returns RunStepStreamEventOneOf5 wrapped in RunStepStreamEvent
func RunStepStreamEventOneOf5AsRunStepStreamEvent(v *RunStepStreamEventOneOf5) RunStepStreamEvent {
	return RunStepStreamEvent{
		RunStepStreamEventOneOf5: v,
	}
}

// RunStepStreamEventOneOf6AsRunStepStreamEvent is a convenience function that returns RunStepStreamEventOneOf6 wrapped in RunStepStreamEvent
func RunStepStreamEventOneOf6AsRunStepStreamEvent(v *RunStepStreamEventOneOf6) RunStepStreamEvent {
	return RunStepStreamEvent{
		RunStepStreamEventOneOf6: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *RunStepStreamEvent) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into RunStepStreamEventOneOf
	err = newStrictDecoder(data).Decode(&dst.RunStepStreamEventOneOf)
	if err == nil {
		jsonRunStepStreamEventOneOf, _ := json.Marshal(dst.RunStepStreamEventOneOf)
		if string(jsonRunStepStreamEventOneOf) == "{}" { // empty struct
			dst.RunStepStreamEventOneOf = nil
		} else {
			if err = validator.Validate(dst.RunStepStreamEventOneOf); err != nil {
				dst.RunStepStreamEventOneOf = nil
			} else {
				match++
			}
		}
	} else {
		dst.RunStepStreamEventOneOf = nil
	}

	// try to unmarshal data into RunStepStreamEventOneOf1
	err = newStrictDecoder(data).Decode(&dst.RunStepStreamEventOneOf1)
	if err == nil {
		jsonRunStepStreamEventOneOf1, _ := json.Marshal(dst.RunStepStreamEventOneOf1)
		if string(jsonRunStepStreamEventOneOf1) == "{}" { // empty struct
			dst.RunStepStreamEventOneOf1 = nil
		} else {
			if err = validator.Validate(dst.RunStepStreamEventOneOf1); err != nil {
				dst.RunStepStreamEventOneOf1 = nil
			} else {
				match++
			}
		}
	} else {
		dst.RunStepStreamEventOneOf1 = nil
	}

	// try to unmarshal data into RunStepStreamEventOneOf2
	err = newStrictDecoder(data).Decode(&dst.RunStepStreamEventOneOf2)
	if err == nil {
		jsonRunStepStreamEventOneOf2, _ := json.Marshal(dst.RunStepStreamEventOneOf2)
		if string(jsonRunStepStreamEventOneOf2) == "{}" { // empty struct
			dst.RunStepStreamEventOneOf2 = nil
		} else {
			if err = validator.Validate(dst.RunStepStreamEventOneOf2); err != nil {
				dst.RunStepStreamEventOneOf2 = nil
			} else {
				match++
			}
		}
	} else {
		dst.RunStepStreamEventOneOf2 = nil
	}

	// try to unmarshal data into RunStepStreamEventOneOf3
	err = newStrictDecoder(data).Decode(&dst.RunStepStreamEventOneOf3)
	if err == nil {
		jsonRunStepStreamEventOneOf3, _ := json.Marshal(dst.RunStepStreamEventOneOf3)
		if string(jsonRunStepStreamEventOneOf3) == "{}" { // empty struct
			dst.RunStepStreamEventOneOf3 = nil
		} else {
			if err = validator.Validate(dst.RunStepStreamEventOneOf3); err != nil {
				dst.RunStepStreamEventOneOf3 = nil
			} else {
				match++
			}
		}
	} else {
		dst.RunStepStreamEventOneOf3 = nil
	}

	// try to unmarshal data into RunStepStreamEventOneOf4
	err = newStrictDecoder(data).Decode(&dst.RunStepStreamEventOneOf4)
	if err == nil {
		jsonRunStepStreamEventOneOf4, _ := json.Marshal(dst.RunStepStreamEventOneOf4)
		if string(jsonRunStepStreamEventOneOf4) == "{}" { // empty struct
			dst.RunStepStreamEventOneOf4 = nil
		} else {
			if err = validator.Validate(dst.RunStepStreamEventOneOf4); err != nil {
				dst.RunStepStreamEventOneOf4 = nil
			} else {
				match++
			}
		}
	} else {
		dst.RunStepStreamEventOneOf4 = nil
	}

	// try to unmarshal data into RunStepStreamEventOneOf5
	err = newStrictDecoder(data).Decode(&dst.RunStepStreamEventOneOf5)
	if err == nil {
		jsonRunStepStreamEventOneOf5, _ := json.Marshal(dst.RunStepStreamEventOneOf5)
		if string(jsonRunStepStreamEventOneOf5) == "{}" { // empty struct
			dst.RunStepStreamEventOneOf5 = nil
		} else {
			if err = validator.Validate(dst.RunStepStreamEventOneOf5); err != nil {
				dst.RunStepStreamEventOneOf5 = nil
			} else {
				match++
			}
		}
	} else {
		dst.RunStepStreamEventOneOf5 = nil
	}

	// try to unmarshal data into RunStepStreamEventOneOf6
	err = newStrictDecoder(data).Decode(&dst.RunStepStreamEventOneOf6)
	if err == nil {
		jsonRunStepStreamEventOneOf6, _ := json.Marshal(dst.RunStepStreamEventOneOf6)
		if string(jsonRunStepStreamEventOneOf6) == "{}" { // empty struct
			dst.RunStepStreamEventOneOf6 = nil
		} else {
			if err = validator.Validate(dst.RunStepStreamEventOneOf6); err != nil {
				dst.RunStepStreamEventOneOf6 = nil
			} else {
				match++
			}
		}
	} else {
		dst.RunStepStreamEventOneOf6 = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.RunStepStreamEventOneOf = nil
		dst.RunStepStreamEventOneOf1 = nil
		dst.RunStepStreamEventOneOf2 = nil
		dst.RunStepStreamEventOneOf3 = nil
		dst.RunStepStreamEventOneOf4 = nil
		dst.RunStepStreamEventOneOf5 = nil
		dst.RunStepStreamEventOneOf6 = nil

		return fmt.Errorf("data matches more than one schema in oneOf(RunStepStreamEvent)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(RunStepStreamEvent)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src RunStepStreamEvent) MarshalJSON() ([]byte, error) {
	if src.RunStepStreamEventOneOf != nil {
		return json.Marshal(&src.RunStepStreamEventOneOf)
	}

	if src.RunStepStreamEventOneOf1 != nil {
		return json.Marshal(&src.RunStepStreamEventOneOf1)
	}

	if src.RunStepStreamEventOneOf2 != nil {
		return json.Marshal(&src.RunStepStreamEventOneOf2)
	}

	if src.RunStepStreamEventOneOf3 != nil {
		return json.Marshal(&src.RunStepStreamEventOneOf3)
	}

	if src.RunStepStreamEventOneOf4 != nil {
		return json.Marshal(&src.RunStepStreamEventOneOf4)
	}

	if src.RunStepStreamEventOneOf5 != nil {
		return json.Marshal(&src.RunStepStreamEventOneOf5)
	}

	if src.RunStepStreamEventOneOf6 != nil {
		return json.Marshal(&src.RunStepStreamEventOneOf6)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *RunStepStreamEvent) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.RunStepStreamEventOneOf != nil {
		return obj.RunStepStreamEventOneOf
	}

	if obj.RunStepStreamEventOneOf1 != nil {
		return obj.RunStepStreamEventOneOf1
	}

	if obj.RunStepStreamEventOneOf2 != nil {
		return obj.RunStepStreamEventOneOf2
	}

	if obj.RunStepStreamEventOneOf3 != nil {
		return obj.RunStepStreamEventOneOf3
	}

	if obj.RunStepStreamEventOneOf4 != nil {
		return obj.RunStepStreamEventOneOf4
	}

	if obj.RunStepStreamEventOneOf5 != nil {
		return obj.RunStepStreamEventOneOf5
	}

	if obj.RunStepStreamEventOneOf6 != nil {
		return obj.RunStepStreamEventOneOf6
	}

	// all schemas are nil
	return nil
}

type NullableRunStepStreamEvent struct {
	value *RunStepStreamEvent
	isSet bool
}

func (v NullableRunStepStreamEvent) Get() *RunStepStreamEvent {
	return v.value
}

func (v *NullableRunStepStreamEvent) Set(val *RunStepStreamEvent) {
	v.value = val
	v.isSet = true
}

func (v NullableRunStepStreamEvent) IsSet() bool {
	return v.isSet
}

func (v *NullableRunStepStreamEvent) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRunStepStreamEvent(val *RunStepStreamEvent) *NullableRunStepStreamEvent {
	return &NullableRunStepStreamEvent{value: val, isSet: true}
}

func (v NullableRunStepStreamEvent) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRunStepStreamEvent) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


