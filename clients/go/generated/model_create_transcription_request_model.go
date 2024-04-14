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

// CreateTranscriptionRequestModel - ID of the model to use. Only `whisper-1` is currently available. 
type CreateTranscriptionRequestModel struct {
	String *string
}

// stringAsCreateTranscriptionRequestModel is a convenience function that returns string wrapped in CreateTranscriptionRequestModel
func StringAsCreateTranscriptionRequestModel(v *string) CreateTranscriptionRequestModel {
	return CreateTranscriptionRequestModel{
		String: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *CreateTranscriptionRequestModel) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
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
		dst.String = nil

		return fmt.Errorf("data matches more than one schema in oneOf(CreateTranscriptionRequestModel)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(CreateTranscriptionRequestModel)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src CreateTranscriptionRequestModel) MarshalJSON() ([]byte, error) {
	if src.String != nil {
		return json.Marshal(&src.String)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *CreateTranscriptionRequestModel) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.String != nil {
		return obj.String
	}

	// all schemas are nil
	return nil
}

type NullableCreateTranscriptionRequestModel struct {
	value *CreateTranscriptionRequestModel
	isSet bool
}

func (v NullableCreateTranscriptionRequestModel) Get() *CreateTranscriptionRequestModel {
	return v.value
}

func (v *NullableCreateTranscriptionRequestModel) Set(val *CreateTranscriptionRequestModel) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateTranscriptionRequestModel) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateTranscriptionRequestModel) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateTranscriptionRequestModel(val *CreateTranscriptionRequestModel) *NullableCreateTranscriptionRequestModel {
	return &NullableCreateTranscriptionRequestModel{value: val, isSet: true}
}

func (v NullableCreateTranscriptionRequestModel) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateTranscriptionRequestModel) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

