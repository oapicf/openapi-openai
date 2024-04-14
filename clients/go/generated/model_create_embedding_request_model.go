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

// CreateEmbeddingRequestModel ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
type CreateEmbeddingRequestModel struct {
	string *string
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *CreateEmbeddingRequestModel) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal JSON data into string
	err = json.Unmarshal(data, &dst.string);
	if err == nil {
		jsonstring, _ := json.Marshal(dst.string)
		if string(jsonstring) == "{}" { // empty struct
			dst.string = nil
		} else {
			return nil // data stored in dst.string, return on the first match
		}
	} else {
		dst.string = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(CreateEmbeddingRequestModel)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *CreateEmbeddingRequestModel) MarshalJSON() ([]byte, error) {
	if src.string != nil {
		return json.Marshal(&src.string)
	}

	return nil, nil // no data in anyOf schemas
}

type NullableCreateEmbeddingRequestModel struct {
	value *CreateEmbeddingRequestModel
	isSet bool
}

func (v NullableCreateEmbeddingRequestModel) Get() *CreateEmbeddingRequestModel {
	return v.value
}

func (v *NullableCreateEmbeddingRequestModel) Set(val *CreateEmbeddingRequestModel) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateEmbeddingRequestModel) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateEmbeddingRequestModel) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateEmbeddingRequestModel(val *CreateEmbeddingRequestModel) *NullableCreateEmbeddingRequestModel {
	return &NullableCreateEmbeddingRequestModel{value: val, isSet: true}
}

func (v NullableCreateEmbeddingRequestModel) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateEmbeddingRequestModel) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


