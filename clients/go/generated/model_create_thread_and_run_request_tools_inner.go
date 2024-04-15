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
	"fmt"
)

// CreateThreadAndRunRequestToolsInner - struct for CreateThreadAndRunRequestToolsInner
type CreateThreadAndRunRequestToolsInner struct {
	AssistantToolsCode *AssistantToolsCode
	AssistantToolsFunction *AssistantToolsFunction
	AssistantToolsRetrieval *AssistantToolsRetrieval
}

// AssistantToolsCodeAsCreateThreadAndRunRequestToolsInner is a convenience function that returns AssistantToolsCode wrapped in CreateThreadAndRunRequestToolsInner
func AssistantToolsCodeAsCreateThreadAndRunRequestToolsInner(v *AssistantToolsCode) CreateThreadAndRunRequestToolsInner {
	return CreateThreadAndRunRequestToolsInner{
		AssistantToolsCode: v,
	}
}

// AssistantToolsFunctionAsCreateThreadAndRunRequestToolsInner is a convenience function that returns AssistantToolsFunction wrapped in CreateThreadAndRunRequestToolsInner
func AssistantToolsFunctionAsCreateThreadAndRunRequestToolsInner(v *AssistantToolsFunction) CreateThreadAndRunRequestToolsInner {
	return CreateThreadAndRunRequestToolsInner{
		AssistantToolsFunction: v,
	}
}

// AssistantToolsRetrievalAsCreateThreadAndRunRequestToolsInner is a convenience function that returns AssistantToolsRetrieval wrapped in CreateThreadAndRunRequestToolsInner
func AssistantToolsRetrievalAsCreateThreadAndRunRequestToolsInner(v *AssistantToolsRetrieval) CreateThreadAndRunRequestToolsInner {
	return CreateThreadAndRunRequestToolsInner{
		AssistantToolsRetrieval: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *CreateThreadAndRunRequestToolsInner) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into AssistantToolsCode
	err = newStrictDecoder(data).Decode(&dst.AssistantToolsCode)
	if err == nil {
		jsonAssistantToolsCode, _ := json.Marshal(dst.AssistantToolsCode)
		if string(jsonAssistantToolsCode) == "{}" { // empty struct
			dst.AssistantToolsCode = nil
		} else {
			match++
		}
	} else {
		dst.AssistantToolsCode = nil
	}

	// try to unmarshal data into AssistantToolsFunction
	err = newStrictDecoder(data).Decode(&dst.AssistantToolsFunction)
	if err == nil {
		jsonAssistantToolsFunction, _ := json.Marshal(dst.AssistantToolsFunction)
		if string(jsonAssistantToolsFunction) == "{}" { // empty struct
			dst.AssistantToolsFunction = nil
		} else {
			match++
		}
	} else {
		dst.AssistantToolsFunction = nil
	}

	// try to unmarshal data into AssistantToolsRetrieval
	err = newStrictDecoder(data).Decode(&dst.AssistantToolsRetrieval)
	if err == nil {
		jsonAssistantToolsRetrieval, _ := json.Marshal(dst.AssistantToolsRetrieval)
		if string(jsonAssistantToolsRetrieval) == "{}" { // empty struct
			dst.AssistantToolsRetrieval = nil
		} else {
			match++
		}
	} else {
		dst.AssistantToolsRetrieval = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.AssistantToolsCode = nil
		dst.AssistantToolsFunction = nil
		dst.AssistantToolsRetrieval = nil

		return fmt.Errorf("data matches more than one schema in oneOf(CreateThreadAndRunRequestToolsInner)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(CreateThreadAndRunRequestToolsInner)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src CreateThreadAndRunRequestToolsInner) MarshalJSON() ([]byte, error) {
	if src.AssistantToolsCode != nil {
		return json.Marshal(&src.AssistantToolsCode)
	}

	if src.AssistantToolsFunction != nil {
		return json.Marshal(&src.AssistantToolsFunction)
	}

	if src.AssistantToolsRetrieval != nil {
		return json.Marshal(&src.AssistantToolsRetrieval)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *CreateThreadAndRunRequestToolsInner) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.AssistantToolsCode != nil {
		return obj.AssistantToolsCode
	}

	if obj.AssistantToolsFunction != nil {
		return obj.AssistantToolsFunction
	}

	if obj.AssistantToolsRetrieval != nil {
		return obj.AssistantToolsRetrieval
	}

	// all schemas are nil
	return nil
}

type NullableCreateThreadAndRunRequestToolsInner struct {
	value *CreateThreadAndRunRequestToolsInner
	isSet bool
}

func (v NullableCreateThreadAndRunRequestToolsInner) Get() *CreateThreadAndRunRequestToolsInner {
	return v.value
}

func (v *NullableCreateThreadAndRunRequestToolsInner) Set(val *CreateThreadAndRunRequestToolsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateThreadAndRunRequestToolsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateThreadAndRunRequestToolsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateThreadAndRunRequestToolsInner(val *CreateThreadAndRunRequestToolsInner) *NullableCreateThreadAndRunRequestToolsInner {
	return &NullableCreateThreadAndRunRequestToolsInner{value: val, isSet: true}
}

func (v NullableCreateThreadAndRunRequestToolsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateThreadAndRunRequestToolsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

