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
	"bytes"
	"fmt"
)

// checks if the CreateEmbeddingResponseUsage type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CreateEmbeddingResponseUsage{}

// CreateEmbeddingResponseUsage The usage information for the request.
type CreateEmbeddingResponseUsage struct {
	// The number of tokens used by the prompt.
	PromptTokens int32 `json:"prompt_tokens"`
	// The total number of tokens used by the request.
	TotalTokens int32 `json:"total_tokens"`
}

type _CreateEmbeddingResponseUsage CreateEmbeddingResponseUsage

// NewCreateEmbeddingResponseUsage instantiates a new CreateEmbeddingResponseUsage object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateEmbeddingResponseUsage(promptTokens int32, totalTokens int32) *CreateEmbeddingResponseUsage {
	this := CreateEmbeddingResponseUsage{}
	this.PromptTokens = promptTokens
	this.TotalTokens = totalTokens
	return &this
}

// NewCreateEmbeddingResponseUsageWithDefaults instantiates a new CreateEmbeddingResponseUsage object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateEmbeddingResponseUsageWithDefaults() *CreateEmbeddingResponseUsage {
	this := CreateEmbeddingResponseUsage{}
	return &this
}

// GetPromptTokens returns the PromptTokens field value
func (o *CreateEmbeddingResponseUsage) GetPromptTokens() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.PromptTokens
}

// GetPromptTokensOk returns a tuple with the PromptTokens field value
// and a boolean to check if the value has been set.
func (o *CreateEmbeddingResponseUsage) GetPromptTokensOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.PromptTokens, true
}

// SetPromptTokens sets field value
func (o *CreateEmbeddingResponseUsage) SetPromptTokens(v int32) {
	o.PromptTokens = v
}

// GetTotalTokens returns the TotalTokens field value
func (o *CreateEmbeddingResponseUsage) GetTotalTokens() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.TotalTokens
}

// GetTotalTokensOk returns a tuple with the TotalTokens field value
// and a boolean to check if the value has been set.
func (o *CreateEmbeddingResponseUsage) GetTotalTokensOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TotalTokens, true
}

// SetTotalTokens sets field value
func (o *CreateEmbeddingResponseUsage) SetTotalTokens(v int32) {
	o.TotalTokens = v
}

func (o CreateEmbeddingResponseUsage) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CreateEmbeddingResponseUsage) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["prompt_tokens"] = o.PromptTokens
	toSerialize["total_tokens"] = o.TotalTokens
	return toSerialize, nil
}

func (o *CreateEmbeddingResponseUsage) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"prompt_tokens",
		"total_tokens",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varCreateEmbeddingResponseUsage := _CreateEmbeddingResponseUsage{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCreateEmbeddingResponseUsage)

	if err != nil {
		return err
	}

	*o = CreateEmbeddingResponseUsage(varCreateEmbeddingResponseUsage)

	return err
}

type NullableCreateEmbeddingResponseUsage struct {
	value *CreateEmbeddingResponseUsage
	isSet bool
}

func (v NullableCreateEmbeddingResponseUsage) Get() *CreateEmbeddingResponseUsage {
	return v.value
}

func (v *NullableCreateEmbeddingResponseUsage) Set(val *CreateEmbeddingResponseUsage) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateEmbeddingResponseUsage) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateEmbeddingResponseUsage) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateEmbeddingResponseUsage(val *CreateEmbeddingResponseUsage) *NullableCreateEmbeddingResponseUsage {
	return &NullableCreateEmbeddingResponseUsage{value: val, isSet: true}
}

func (v NullableCreateEmbeddingResponseUsage) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateEmbeddingResponseUsage) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


