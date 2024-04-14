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

// checks if the CreateEditResponseChoicesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CreateEditResponseChoicesInner{}

// CreateEditResponseChoicesInner struct for CreateEditResponseChoicesInner
type CreateEditResponseChoicesInner struct {
	Text *string `json:"text,omitempty"`
	Index *int32 `json:"index,omitempty"`
	Logprobs NullableCreateCompletionResponseChoicesInnerLogprobs `json:"logprobs,omitempty"`
	FinishReason *string `json:"finish_reason,omitempty"`
}

// NewCreateEditResponseChoicesInner instantiates a new CreateEditResponseChoicesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateEditResponseChoicesInner() *CreateEditResponseChoicesInner {
	this := CreateEditResponseChoicesInner{}
	return &this
}

// NewCreateEditResponseChoicesInnerWithDefaults instantiates a new CreateEditResponseChoicesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateEditResponseChoicesInnerWithDefaults() *CreateEditResponseChoicesInner {
	this := CreateEditResponseChoicesInner{}
	return &this
}

// GetText returns the Text field value if set, zero value otherwise.
func (o *CreateEditResponseChoicesInner) GetText() string {
	if o == nil || IsNil(o.Text) {
		var ret string
		return ret
	}
	return *o.Text
}

// GetTextOk returns a tuple with the Text field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateEditResponseChoicesInner) GetTextOk() (*string, bool) {
	if o == nil || IsNil(o.Text) {
		return nil, false
	}
	return o.Text, true
}

// HasText returns a boolean if a field has been set.
func (o *CreateEditResponseChoicesInner) HasText() bool {
	if o != nil && !IsNil(o.Text) {
		return true
	}

	return false
}

// SetText gets a reference to the given string and assigns it to the Text field.
func (o *CreateEditResponseChoicesInner) SetText(v string) {
	o.Text = &v
}

// GetIndex returns the Index field value if set, zero value otherwise.
func (o *CreateEditResponseChoicesInner) GetIndex() int32 {
	if o == nil || IsNil(o.Index) {
		var ret int32
		return ret
	}
	return *o.Index
}

// GetIndexOk returns a tuple with the Index field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateEditResponseChoicesInner) GetIndexOk() (*int32, bool) {
	if o == nil || IsNil(o.Index) {
		return nil, false
	}
	return o.Index, true
}

// HasIndex returns a boolean if a field has been set.
func (o *CreateEditResponseChoicesInner) HasIndex() bool {
	if o != nil && !IsNil(o.Index) {
		return true
	}

	return false
}

// SetIndex gets a reference to the given int32 and assigns it to the Index field.
func (o *CreateEditResponseChoicesInner) SetIndex(v int32) {
	o.Index = &v
}

// GetLogprobs returns the Logprobs field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateEditResponseChoicesInner) GetLogprobs() CreateCompletionResponseChoicesInnerLogprobs {
	if o == nil || IsNil(o.Logprobs.Get()) {
		var ret CreateCompletionResponseChoicesInnerLogprobs
		return ret
	}
	return *o.Logprobs.Get()
}

// GetLogprobsOk returns a tuple with the Logprobs field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateEditResponseChoicesInner) GetLogprobsOk() (*CreateCompletionResponseChoicesInnerLogprobs, bool) {
	if o == nil {
		return nil, false
	}
	return o.Logprobs.Get(), o.Logprobs.IsSet()
}

// HasLogprobs returns a boolean if a field has been set.
func (o *CreateEditResponseChoicesInner) HasLogprobs() bool {
	if o != nil && o.Logprobs.IsSet() {
		return true
	}

	return false
}

// SetLogprobs gets a reference to the given NullableCreateCompletionResponseChoicesInnerLogprobs and assigns it to the Logprobs field.
func (o *CreateEditResponseChoicesInner) SetLogprobs(v CreateCompletionResponseChoicesInnerLogprobs) {
	o.Logprobs.Set(&v)
}
// SetLogprobsNil sets the value for Logprobs to be an explicit nil
func (o *CreateEditResponseChoicesInner) SetLogprobsNil() {
	o.Logprobs.Set(nil)
}

// UnsetLogprobs ensures that no value is present for Logprobs, not even an explicit nil
func (o *CreateEditResponseChoicesInner) UnsetLogprobs() {
	o.Logprobs.Unset()
}

// GetFinishReason returns the FinishReason field value if set, zero value otherwise.
func (o *CreateEditResponseChoicesInner) GetFinishReason() string {
	if o == nil || IsNil(o.FinishReason) {
		var ret string
		return ret
	}
	return *o.FinishReason
}

// GetFinishReasonOk returns a tuple with the FinishReason field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateEditResponseChoicesInner) GetFinishReasonOk() (*string, bool) {
	if o == nil || IsNil(o.FinishReason) {
		return nil, false
	}
	return o.FinishReason, true
}

// HasFinishReason returns a boolean if a field has been set.
func (o *CreateEditResponseChoicesInner) HasFinishReason() bool {
	if o != nil && !IsNil(o.FinishReason) {
		return true
	}

	return false
}

// SetFinishReason gets a reference to the given string and assigns it to the FinishReason field.
func (o *CreateEditResponseChoicesInner) SetFinishReason(v string) {
	o.FinishReason = &v
}

func (o CreateEditResponseChoicesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CreateEditResponseChoicesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Text) {
		toSerialize["text"] = o.Text
	}
	if !IsNil(o.Index) {
		toSerialize["index"] = o.Index
	}
	if o.Logprobs.IsSet() {
		toSerialize["logprobs"] = o.Logprobs.Get()
	}
	if !IsNil(o.FinishReason) {
		toSerialize["finish_reason"] = o.FinishReason
	}
	return toSerialize, nil
}

type NullableCreateEditResponseChoicesInner struct {
	value *CreateEditResponseChoicesInner
	isSet bool
}

func (v NullableCreateEditResponseChoicesInner) Get() *CreateEditResponseChoicesInner {
	return v.value
}

func (v *NullableCreateEditResponseChoicesInner) Set(val *CreateEditResponseChoicesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateEditResponseChoicesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateEditResponseChoicesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateEditResponseChoicesInner(val *CreateEditResponseChoicesInner) *NullableCreateEditResponseChoicesInner {
	return &NullableCreateEditResponseChoicesInner{value: val, isSet: true}
}

func (v NullableCreateEditResponseChoicesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateEditResponseChoicesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

