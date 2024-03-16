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

// checks if the CreateChatCompletionResponseChoicesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CreateChatCompletionResponseChoicesInner{}

// CreateChatCompletionResponseChoicesInner struct for CreateChatCompletionResponseChoicesInner
type CreateChatCompletionResponseChoicesInner struct {
	Index *int32 `json:"index,omitempty"`
	Message *ChatCompletionResponseMessage `json:"message,omitempty"`
	FinishReason *string `json:"finish_reason,omitempty"`
}

// NewCreateChatCompletionResponseChoicesInner instantiates a new CreateChatCompletionResponseChoicesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateChatCompletionResponseChoicesInner() *CreateChatCompletionResponseChoicesInner {
	this := CreateChatCompletionResponseChoicesInner{}
	return &this
}

// NewCreateChatCompletionResponseChoicesInnerWithDefaults instantiates a new CreateChatCompletionResponseChoicesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateChatCompletionResponseChoicesInnerWithDefaults() *CreateChatCompletionResponseChoicesInner {
	this := CreateChatCompletionResponseChoicesInner{}
	return &this
}

// GetIndex returns the Index field value if set, zero value otherwise.
func (o *CreateChatCompletionResponseChoicesInner) GetIndex() int32 {
	if o == nil || IsNil(o.Index) {
		var ret int32
		return ret
	}
	return *o.Index
}

// GetIndexOk returns a tuple with the Index field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateChatCompletionResponseChoicesInner) GetIndexOk() (*int32, bool) {
	if o == nil || IsNil(o.Index) {
		return nil, false
	}
	return o.Index, true
}

// HasIndex returns a boolean if a field has been set.
func (o *CreateChatCompletionResponseChoicesInner) HasIndex() bool {
	if o != nil && !IsNil(o.Index) {
		return true
	}

	return false
}

// SetIndex gets a reference to the given int32 and assigns it to the Index field.
func (o *CreateChatCompletionResponseChoicesInner) SetIndex(v int32) {
	o.Index = &v
}

// GetMessage returns the Message field value if set, zero value otherwise.
func (o *CreateChatCompletionResponseChoicesInner) GetMessage() ChatCompletionResponseMessage {
	if o == nil || IsNil(o.Message) {
		var ret ChatCompletionResponseMessage
		return ret
	}
	return *o.Message
}

// GetMessageOk returns a tuple with the Message field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateChatCompletionResponseChoicesInner) GetMessageOk() (*ChatCompletionResponseMessage, bool) {
	if o == nil || IsNil(o.Message) {
		return nil, false
	}
	return o.Message, true
}

// HasMessage returns a boolean if a field has been set.
func (o *CreateChatCompletionResponseChoicesInner) HasMessage() bool {
	if o != nil && !IsNil(o.Message) {
		return true
	}

	return false
}

// SetMessage gets a reference to the given ChatCompletionResponseMessage and assigns it to the Message field.
func (o *CreateChatCompletionResponseChoicesInner) SetMessage(v ChatCompletionResponseMessage) {
	o.Message = &v
}

// GetFinishReason returns the FinishReason field value if set, zero value otherwise.
func (o *CreateChatCompletionResponseChoicesInner) GetFinishReason() string {
	if o == nil || IsNil(o.FinishReason) {
		var ret string
		return ret
	}
	return *o.FinishReason
}

// GetFinishReasonOk returns a tuple with the FinishReason field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateChatCompletionResponseChoicesInner) GetFinishReasonOk() (*string, bool) {
	if o == nil || IsNil(o.FinishReason) {
		return nil, false
	}
	return o.FinishReason, true
}

// HasFinishReason returns a boolean if a field has been set.
func (o *CreateChatCompletionResponseChoicesInner) HasFinishReason() bool {
	if o != nil && !IsNil(o.FinishReason) {
		return true
	}

	return false
}

// SetFinishReason gets a reference to the given string and assigns it to the FinishReason field.
func (o *CreateChatCompletionResponseChoicesInner) SetFinishReason(v string) {
	o.FinishReason = &v
}

func (o CreateChatCompletionResponseChoicesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CreateChatCompletionResponseChoicesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Index) {
		toSerialize["index"] = o.Index
	}
	if !IsNil(o.Message) {
		toSerialize["message"] = o.Message
	}
	if !IsNil(o.FinishReason) {
		toSerialize["finish_reason"] = o.FinishReason
	}
	return toSerialize, nil
}

type NullableCreateChatCompletionResponseChoicesInner struct {
	value *CreateChatCompletionResponseChoicesInner
	isSet bool
}

func (v NullableCreateChatCompletionResponseChoicesInner) Get() *CreateChatCompletionResponseChoicesInner {
	return v.value
}

func (v *NullableCreateChatCompletionResponseChoicesInner) Set(val *CreateChatCompletionResponseChoicesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateChatCompletionResponseChoicesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateChatCompletionResponseChoicesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateChatCompletionResponseChoicesInner(val *CreateChatCompletionResponseChoicesInner) *NullableCreateChatCompletionResponseChoicesInner {
	return &NullableCreateChatCompletionResponseChoicesInner{value: val, isSet: true}
}

func (v NullableCreateChatCompletionResponseChoicesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateChatCompletionResponseChoicesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


