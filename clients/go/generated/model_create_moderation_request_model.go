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

// CreateModerationRequestModel Two content moderations models are available: `text-moderation-stable` and `text-moderation-latest`.  The default is `text-moderation-latest` which will be automatically upgraded over time. This ensures you are always using our most accurate model. If you use `text-moderation-stable`, we will provide advanced notice before updating the model. Accuracy of `text-moderation-stable` may be slightly lower than for `text-moderation-latest`. 
type CreateModerationRequestModel struct {
	string *string
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *CreateModerationRequestModel) UnmarshalJSON(data []byte) error {
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

	return fmt.Errorf("data failed to match schemas in anyOf(CreateModerationRequestModel)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *CreateModerationRequestModel) MarshalJSON() ([]byte, error) {
	if src.string != nil {
		return json.Marshal(&src.string)
	}

	return nil, nil // no data in anyOf schemas
}

type NullableCreateModerationRequestModel struct {
	value *CreateModerationRequestModel
	isSet bool
}

func (v NullableCreateModerationRequestModel) Get() *CreateModerationRequestModel {
	return v.value
}

func (v *NullableCreateModerationRequestModel) Set(val *CreateModerationRequestModel) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateModerationRequestModel) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateModerationRequestModel) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateModerationRequestModel(val *CreateModerationRequestModel) *NullableCreateModerationRequestModel {
	return &NullableCreateModerationRequestModel{value: val, isSet: true}
}

func (v NullableCreateModerationRequestModel) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateModerationRequestModel) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


