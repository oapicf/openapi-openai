/*
OpenAI API

APIs for sampling from and fine-tuning language models

API version: 2.0.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"fmt"
)

// CreateModerationRequestInput - The input text to classify
type CreateModerationRequestInput struct {
	ArrayOfString *[]string
	String *string
}

// []stringAsCreateModerationRequestInput is a convenience function that returns []string wrapped in CreateModerationRequestInput
func ArrayOfStringAsCreateModerationRequestInput(v *[]string) CreateModerationRequestInput {
	return CreateModerationRequestInput{
		ArrayOfString: v,
	}
}

// stringAsCreateModerationRequestInput is a convenience function that returns string wrapped in CreateModerationRequestInput
func StringAsCreateModerationRequestInput(v *string) CreateModerationRequestInput {
	return CreateModerationRequestInput{
		String: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *CreateModerationRequestInput) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into ArrayOfString
	err = newStrictDecoder(data).Decode(&dst.ArrayOfString)
	if err == nil {
		jsonArrayOfString, _ := json.Marshal(dst.ArrayOfString)
		if string(jsonArrayOfString) == "{}" { // empty struct
			dst.ArrayOfString = nil
		} else {
			match++
		}
	} else {
		dst.ArrayOfString = nil
	}

	// try to unmarshal data into String
	err = newStrictDecoder(data).Decode(&dst.String)
	if err == nil {
		jsonString, _ := json.Marshal(dst.String)
		if string(jsonString) == "{}" { // empty struct
			dst.String = nil
		} else {
			match++
		}
	} else {
		dst.String = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.ArrayOfString = nil
		dst.String = nil

		return fmt.Errorf("data matches more than one schema in oneOf(CreateModerationRequestInput)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(CreateModerationRequestInput)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src CreateModerationRequestInput) MarshalJSON() ([]byte, error) {
	if src.ArrayOfString != nil {
		return json.Marshal(&src.ArrayOfString)
	}

	if src.String != nil {
		return json.Marshal(&src.String)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *CreateModerationRequestInput) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.ArrayOfString != nil {
		return obj.ArrayOfString
	}

	if obj.String != nil {
		return obj.String
	}

	// all schemas are nil
	return nil
}

type NullableCreateModerationRequestInput struct {
	value *CreateModerationRequestInput
	isSet bool
}

func (v NullableCreateModerationRequestInput) Get() *CreateModerationRequestInput {
	return v.value
}

func (v *NullableCreateModerationRequestInput) Set(val *CreateModerationRequestInput) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateModerationRequestInput) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateModerationRequestInput) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateModerationRequestInput(val *CreateModerationRequestInput) *NullableCreateModerationRequestInput {
	return &NullableCreateModerationRequestInput{value: val, isSet: true}
}

func (v NullableCreateModerationRequestInput) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateModerationRequestInput) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


