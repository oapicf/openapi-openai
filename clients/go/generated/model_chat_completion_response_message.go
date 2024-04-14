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
	"bytes"
	"fmt"
)

// checks if the ChatCompletionResponseMessage type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ChatCompletionResponseMessage{}

// ChatCompletionResponseMessage struct for ChatCompletionResponseMessage
type ChatCompletionResponseMessage struct {
	// The role of the author of this message.
	Role string `json:"role"`
	// The contents of the message.
	Content NullableString `json:"content,omitempty"`
	FunctionCall *ChatCompletionRequestMessageFunctionCall `json:"function_call,omitempty"`
}

type _ChatCompletionResponseMessage ChatCompletionResponseMessage

// NewChatCompletionResponseMessage instantiates a new ChatCompletionResponseMessage object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewChatCompletionResponseMessage(role string) *ChatCompletionResponseMessage {
	this := ChatCompletionResponseMessage{}
	this.Role = role
	return &this
}

// NewChatCompletionResponseMessageWithDefaults instantiates a new ChatCompletionResponseMessage object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewChatCompletionResponseMessageWithDefaults() *ChatCompletionResponseMessage {
	this := ChatCompletionResponseMessage{}
	return &this
}

// GetRole returns the Role field value
func (o *ChatCompletionResponseMessage) GetRole() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Role
}

// GetRoleOk returns a tuple with the Role field value
// and a boolean to check if the value has been set.
func (o *ChatCompletionResponseMessage) GetRoleOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Role, true
}

// SetRole sets field value
func (o *ChatCompletionResponseMessage) SetRole(v string) {
	o.Role = v
}

// GetContent returns the Content field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *ChatCompletionResponseMessage) GetContent() string {
	if o == nil || IsNil(o.Content.Get()) {
		var ret string
		return ret
	}
	return *o.Content.Get()
}

// GetContentOk returns a tuple with the Content field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *ChatCompletionResponseMessage) GetContentOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Content.Get(), o.Content.IsSet()
}

// HasContent returns a boolean if a field has been set.
func (o *ChatCompletionResponseMessage) HasContent() bool {
	if o != nil && o.Content.IsSet() {
		return true
	}

	return false
}

// SetContent gets a reference to the given NullableString and assigns it to the Content field.
func (o *ChatCompletionResponseMessage) SetContent(v string) {
	o.Content.Set(&v)
}
// SetContentNil sets the value for Content to be an explicit nil
func (o *ChatCompletionResponseMessage) SetContentNil() {
	o.Content.Set(nil)
}

// UnsetContent ensures that no value is present for Content, not even an explicit nil
func (o *ChatCompletionResponseMessage) UnsetContent() {
	o.Content.Unset()
}

// GetFunctionCall returns the FunctionCall field value if set, zero value otherwise.
func (o *ChatCompletionResponseMessage) GetFunctionCall() ChatCompletionRequestMessageFunctionCall {
	if o == nil || IsNil(o.FunctionCall) {
		var ret ChatCompletionRequestMessageFunctionCall
		return ret
	}
	return *o.FunctionCall
}

// GetFunctionCallOk returns a tuple with the FunctionCall field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ChatCompletionResponseMessage) GetFunctionCallOk() (*ChatCompletionRequestMessageFunctionCall, bool) {
	if o == nil || IsNil(o.FunctionCall) {
		return nil, false
	}
	return o.FunctionCall, true
}

// HasFunctionCall returns a boolean if a field has been set.
func (o *ChatCompletionResponseMessage) HasFunctionCall() bool {
	if o != nil && !IsNil(o.FunctionCall) {
		return true
	}

	return false
}

// SetFunctionCall gets a reference to the given ChatCompletionRequestMessageFunctionCall and assigns it to the FunctionCall field.
func (o *ChatCompletionResponseMessage) SetFunctionCall(v ChatCompletionRequestMessageFunctionCall) {
	o.FunctionCall = &v
}

func (o ChatCompletionResponseMessage) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ChatCompletionResponseMessage) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["role"] = o.Role
	if o.Content.IsSet() {
		toSerialize["content"] = o.Content.Get()
	}
	if !IsNil(o.FunctionCall) {
		toSerialize["function_call"] = o.FunctionCall
	}
	return toSerialize, nil
}

func (o *ChatCompletionResponseMessage) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"role",
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

	varChatCompletionResponseMessage := _ChatCompletionResponseMessage{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varChatCompletionResponseMessage)

	if err != nil {
		return err
	}

	*o = ChatCompletionResponseMessage(varChatCompletionResponseMessage)

	return err
}

type NullableChatCompletionResponseMessage struct {
	value *ChatCompletionResponseMessage
	isSet bool
}

func (v NullableChatCompletionResponseMessage) Get() *ChatCompletionResponseMessage {
	return v.value
}

func (v *NullableChatCompletionResponseMessage) Set(val *ChatCompletionResponseMessage) {
	v.value = val
	v.isSet = true
}

func (v NullableChatCompletionResponseMessage) IsSet() bool {
	return v.isSet
}

func (v *NullableChatCompletionResponseMessage) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableChatCompletionResponseMessage(val *ChatCompletionResponseMessage) *NullableChatCompletionResponseMessage {
	return &NullableChatCompletionResponseMessage{value: val, isSet: true}
}

func (v NullableChatCompletionResponseMessage) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableChatCompletionResponseMessage) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

