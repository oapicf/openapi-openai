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

// checks if the ChatCompletionNamedToolChoiceFunction type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ChatCompletionNamedToolChoiceFunction{}

// ChatCompletionNamedToolChoiceFunction struct for ChatCompletionNamedToolChoiceFunction
type ChatCompletionNamedToolChoiceFunction struct {
	// The name of the function to call.
	Name string `json:"name"`
}

type _ChatCompletionNamedToolChoiceFunction ChatCompletionNamedToolChoiceFunction

// NewChatCompletionNamedToolChoiceFunction instantiates a new ChatCompletionNamedToolChoiceFunction object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewChatCompletionNamedToolChoiceFunction(name string) *ChatCompletionNamedToolChoiceFunction {
	this := ChatCompletionNamedToolChoiceFunction{}
	this.Name = name
	return &this
}

// NewChatCompletionNamedToolChoiceFunctionWithDefaults instantiates a new ChatCompletionNamedToolChoiceFunction object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewChatCompletionNamedToolChoiceFunctionWithDefaults() *ChatCompletionNamedToolChoiceFunction {
	this := ChatCompletionNamedToolChoiceFunction{}
	return &this
}

// GetName returns the Name field value
func (o *ChatCompletionNamedToolChoiceFunction) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *ChatCompletionNamedToolChoiceFunction) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *ChatCompletionNamedToolChoiceFunction) SetName(v string) {
	o.Name = v
}

func (o ChatCompletionNamedToolChoiceFunction) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ChatCompletionNamedToolChoiceFunction) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["name"] = o.Name
	return toSerialize, nil
}

func (o *ChatCompletionNamedToolChoiceFunction) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"name",
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

	varChatCompletionNamedToolChoiceFunction := _ChatCompletionNamedToolChoiceFunction{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varChatCompletionNamedToolChoiceFunction)

	if err != nil {
		return err
	}

	*o = ChatCompletionNamedToolChoiceFunction(varChatCompletionNamedToolChoiceFunction)

	return err
}

type NullableChatCompletionNamedToolChoiceFunction struct {
	value *ChatCompletionNamedToolChoiceFunction
	isSet bool
}

func (v NullableChatCompletionNamedToolChoiceFunction) Get() *ChatCompletionNamedToolChoiceFunction {
	return v.value
}

func (v *NullableChatCompletionNamedToolChoiceFunction) Set(val *ChatCompletionNamedToolChoiceFunction) {
	v.value = val
	v.isSet = true
}

func (v NullableChatCompletionNamedToolChoiceFunction) IsSet() bool {
	return v.isSet
}

func (v *NullableChatCompletionNamedToolChoiceFunction) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableChatCompletionNamedToolChoiceFunction(val *ChatCompletionNamedToolChoiceFunction) *NullableChatCompletionNamedToolChoiceFunction {
	return &NullableChatCompletionNamedToolChoiceFunction{value: val, isSet: true}
}

func (v NullableChatCompletionNamedToolChoiceFunction) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableChatCompletionNamedToolChoiceFunction) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

