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

// CreateTranscription200Response - struct for CreateTranscription200Response
type CreateTranscription200Response struct {
	CreateTranscriptionResponseJson *CreateTranscriptionResponseJson
	CreateTranscriptionResponseVerboseJson *CreateTranscriptionResponseVerboseJson
}

// CreateTranscriptionResponseJsonAsCreateTranscription200Response is a convenience function that returns CreateTranscriptionResponseJson wrapped in CreateTranscription200Response
func CreateTranscriptionResponseJsonAsCreateTranscription200Response(v *CreateTranscriptionResponseJson) CreateTranscription200Response {
	return CreateTranscription200Response{
		CreateTranscriptionResponseJson: v,
	}
}

// CreateTranscriptionResponseVerboseJsonAsCreateTranscription200Response is a convenience function that returns CreateTranscriptionResponseVerboseJson wrapped in CreateTranscription200Response
func CreateTranscriptionResponseVerboseJsonAsCreateTranscription200Response(v *CreateTranscriptionResponseVerboseJson) CreateTranscription200Response {
	return CreateTranscription200Response{
		CreateTranscriptionResponseVerboseJson: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *CreateTranscription200Response) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into CreateTranscriptionResponseJson
	err = newStrictDecoder(data).Decode(&dst.CreateTranscriptionResponseJson)
	if err == nil {
		jsonCreateTranscriptionResponseJson, _ := json.Marshal(dst.CreateTranscriptionResponseJson)
		if string(jsonCreateTranscriptionResponseJson) == "{}" { // empty struct
			dst.CreateTranscriptionResponseJson = nil
		} else {
			if err = validator.Validate(dst.CreateTranscriptionResponseJson); err != nil {
				dst.CreateTranscriptionResponseJson = nil
			} else {
				match++
			}
		}
	} else {
		dst.CreateTranscriptionResponseJson = nil
	}

	// try to unmarshal data into CreateTranscriptionResponseVerboseJson
	err = newStrictDecoder(data).Decode(&dst.CreateTranscriptionResponseVerboseJson)
	if err == nil {
		jsonCreateTranscriptionResponseVerboseJson, _ := json.Marshal(dst.CreateTranscriptionResponseVerboseJson)
		if string(jsonCreateTranscriptionResponseVerboseJson) == "{}" { // empty struct
			dst.CreateTranscriptionResponseVerboseJson = nil
		} else {
			if err = validator.Validate(dst.CreateTranscriptionResponseVerboseJson); err != nil {
				dst.CreateTranscriptionResponseVerboseJson = nil
			} else {
				match++
			}
		}
	} else {
		dst.CreateTranscriptionResponseVerboseJson = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.CreateTranscriptionResponseJson = nil
		dst.CreateTranscriptionResponseVerboseJson = nil

		return fmt.Errorf("data matches more than one schema in oneOf(CreateTranscription200Response)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(CreateTranscription200Response)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src CreateTranscription200Response) MarshalJSON() ([]byte, error) {
	if src.CreateTranscriptionResponseJson != nil {
		return json.Marshal(&src.CreateTranscriptionResponseJson)
	}

	if src.CreateTranscriptionResponseVerboseJson != nil {
		return json.Marshal(&src.CreateTranscriptionResponseVerboseJson)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *CreateTranscription200Response) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.CreateTranscriptionResponseJson != nil {
		return obj.CreateTranscriptionResponseJson
	}

	if obj.CreateTranscriptionResponseVerboseJson != nil {
		return obj.CreateTranscriptionResponseVerboseJson
	}

	// all schemas are nil
	return nil
}

type NullableCreateTranscription200Response struct {
	value *CreateTranscription200Response
	isSet bool
}

func (v NullableCreateTranscription200Response) Get() *CreateTranscription200Response {
	return v.value
}

func (v *NullableCreateTranscription200Response) Set(val *CreateTranscription200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateTranscription200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateTranscription200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateTranscription200Response(val *CreateTranscription200Response) *NullableCreateTranscription200Response {
	return &NullableCreateTranscription200Response{value: val, isSet: true}
}

func (v NullableCreateTranscription200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateTranscription200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


