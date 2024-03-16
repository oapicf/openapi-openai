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
)

// checks if the CreateCompletionResponseChoicesInnerLogprobs type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CreateCompletionResponseChoicesInnerLogprobs{}

// CreateCompletionResponseChoicesInnerLogprobs struct for CreateCompletionResponseChoicesInnerLogprobs
type CreateCompletionResponseChoicesInnerLogprobs struct {
	Tokens []string `json:"tokens,omitempty"`
	TokenLogprobs []float32 `json:"token_logprobs,omitempty"`
	TopLogprobs []map[string]interface{} `json:"top_logprobs,omitempty"`
	TextOffset []int32 `json:"text_offset,omitempty"`
}

// NewCreateCompletionResponseChoicesInnerLogprobs instantiates a new CreateCompletionResponseChoicesInnerLogprobs object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateCompletionResponseChoicesInnerLogprobs() *CreateCompletionResponseChoicesInnerLogprobs {
	this := CreateCompletionResponseChoicesInnerLogprobs{}
	return &this
}

// NewCreateCompletionResponseChoicesInnerLogprobsWithDefaults instantiates a new CreateCompletionResponseChoicesInnerLogprobs object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateCompletionResponseChoicesInnerLogprobsWithDefaults() *CreateCompletionResponseChoicesInnerLogprobs {
	this := CreateCompletionResponseChoicesInnerLogprobs{}
	return &this
}

// GetTokens returns the Tokens field value if set, zero value otherwise.
func (o *CreateCompletionResponseChoicesInnerLogprobs) GetTokens() []string {
	if o == nil || IsNil(o.Tokens) {
		var ret []string
		return ret
	}
	return o.Tokens
}

// GetTokensOk returns a tuple with the Tokens field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateCompletionResponseChoicesInnerLogprobs) GetTokensOk() ([]string, bool) {
	if o == nil || IsNil(o.Tokens) {
		return nil, false
	}
	return o.Tokens, true
}

// HasTokens returns a boolean if a field has been set.
func (o *CreateCompletionResponseChoicesInnerLogprobs) HasTokens() bool {
	if o != nil && !IsNil(o.Tokens) {
		return true
	}

	return false
}

// SetTokens gets a reference to the given []string and assigns it to the Tokens field.
func (o *CreateCompletionResponseChoicesInnerLogprobs) SetTokens(v []string) {
	o.Tokens = v
}

// GetTokenLogprobs returns the TokenLogprobs field value if set, zero value otherwise.
func (o *CreateCompletionResponseChoicesInnerLogprobs) GetTokenLogprobs() []float32 {
	if o == nil || IsNil(o.TokenLogprobs) {
		var ret []float32
		return ret
	}
	return o.TokenLogprobs
}

// GetTokenLogprobsOk returns a tuple with the TokenLogprobs field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateCompletionResponseChoicesInnerLogprobs) GetTokenLogprobsOk() ([]float32, bool) {
	if o == nil || IsNil(o.TokenLogprobs) {
		return nil, false
	}
	return o.TokenLogprobs, true
}

// HasTokenLogprobs returns a boolean if a field has been set.
func (o *CreateCompletionResponseChoicesInnerLogprobs) HasTokenLogprobs() bool {
	if o != nil && !IsNil(o.TokenLogprobs) {
		return true
	}

	return false
}

// SetTokenLogprobs gets a reference to the given []float32 and assigns it to the TokenLogprobs field.
func (o *CreateCompletionResponseChoicesInnerLogprobs) SetTokenLogprobs(v []float32) {
	o.TokenLogprobs = v
}

// GetTopLogprobs returns the TopLogprobs field value if set, zero value otherwise.
func (o *CreateCompletionResponseChoicesInnerLogprobs) GetTopLogprobs() []map[string]interface{} {
	if o == nil || IsNil(o.TopLogprobs) {
		var ret []map[string]interface{}
		return ret
	}
	return o.TopLogprobs
}

// GetTopLogprobsOk returns a tuple with the TopLogprobs field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateCompletionResponseChoicesInnerLogprobs) GetTopLogprobsOk() ([]map[string]interface{}, bool) {
	if o == nil || IsNil(o.TopLogprobs) {
		return nil, false
	}
	return o.TopLogprobs, true
}

// HasTopLogprobs returns a boolean if a field has been set.
func (o *CreateCompletionResponseChoicesInnerLogprobs) HasTopLogprobs() bool {
	if o != nil && !IsNil(o.TopLogprobs) {
		return true
	}

	return false
}

// SetTopLogprobs gets a reference to the given []map[string]interface{} and assigns it to the TopLogprobs field.
func (o *CreateCompletionResponseChoicesInnerLogprobs) SetTopLogprobs(v []map[string]interface{}) {
	o.TopLogprobs = v
}

// GetTextOffset returns the TextOffset field value if set, zero value otherwise.
func (o *CreateCompletionResponseChoicesInnerLogprobs) GetTextOffset() []int32 {
	if o == nil || IsNil(o.TextOffset) {
		var ret []int32
		return ret
	}
	return o.TextOffset
}

// GetTextOffsetOk returns a tuple with the TextOffset field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateCompletionResponseChoicesInnerLogprobs) GetTextOffsetOk() ([]int32, bool) {
	if o == nil || IsNil(o.TextOffset) {
		return nil, false
	}
	return o.TextOffset, true
}

// HasTextOffset returns a boolean if a field has been set.
func (o *CreateCompletionResponseChoicesInnerLogprobs) HasTextOffset() bool {
	if o != nil && !IsNil(o.TextOffset) {
		return true
	}

	return false
}

// SetTextOffset gets a reference to the given []int32 and assigns it to the TextOffset field.
func (o *CreateCompletionResponseChoicesInnerLogprobs) SetTextOffset(v []int32) {
	o.TextOffset = v
}

func (o CreateCompletionResponseChoicesInnerLogprobs) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CreateCompletionResponseChoicesInnerLogprobs) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Tokens) {
		toSerialize["tokens"] = o.Tokens
	}
	if !IsNil(o.TokenLogprobs) {
		toSerialize["token_logprobs"] = o.TokenLogprobs
	}
	if !IsNil(o.TopLogprobs) {
		toSerialize["top_logprobs"] = o.TopLogprobs
	}
	if !IsNil(o.TextOffset) {
		toSerialize["text_offset"] = o.TextOffset
	}
	return toSerialize, nil
}

type NullableCreateCompletionResponseChoicesInnerLogprobs struct {
	value *CreateCompletionResponseChoicesInnerLogprobs
	isSet bool
}

func (v NullableCreateCompletionResponseChoicesInnerLogprobs) Get() *CreateCompletionResponseChoicesInnerLogprobs {
	return v.value
}

func (v *NullableCreateCompletionResponseChoicesInnerLogprobs) Set(val *CreateCompletionResponseChoicesInnerLogprobs) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateCompletionResponseChoicesInnerLogprobs) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateCompletionResponseChoicesInnerLogprobs) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateCompletionResponseChoicesInnerLogprobs(val *CreateCompletionResponseChoicesInnerLogprobs) *NullableCreateCompletionResponseChoicesInnerLogprobs {
	return &NullableCreateCompletionResponseChoicesInnerLogprobs{value: val, isSet: true}
}

func (v NullableCreateCompletionResponseChoicesInnerLogprobs) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateCompletionResponseChoicesInnerLogprobs) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


