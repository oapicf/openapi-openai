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

// checks if the ChatCompletionRequestFunctionMessage type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ChatCompletionRequestFunctionMessage{}

// ChatCompletionRequestFunctionMessage struct for ChatCompletionRequestFunctionMessage
type ChatCompletionRequestFunctionMessage struct {
	// The role of the messages author, in this case `function`.
	Role string `json:"role"`
	// The contents of the function message.
	Content NullableString `json:"content"`
	// The name of the function to call.
	Name string `json:"name"`
}

type _ChatCompletionRequestFunctionMessage ChatCompletionRequestFunctionMessage

// NewChatCompletionRequestFunctionMessage instantiates a new ChatCompletionRequestFunctionMessage object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewChatCompletionRequestFunctionMessage(role string, content NullableString, name string) *ChatCompletionRequestFunctionMessage {
	this := ChatCompletionRequestFunctionMessage{}
	this.Role = role
	this.Content = content
	this.Name = name
	return &this
}

// NewChatCompletionRequestFunctionMessageWithDefaults instantiates a new ChatCompletionRequestFunctionMessage object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewChatCompletionRequestFunctionMessageWithDefaults() *ChatCompletionRequestFunctionMessage {
	this := ChatCompletionRequestFunctionMessage{}
	return &this
}

// GetRole returns the Role field value
func (o *ChatCompletionRequestFunctionMessage) GetRole() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Role
}

// GetRoleOk returns a tuple with the Role field value
// and a boolean to check if the value has been set.
func (o *ChatCompletionRequestFunctionMessage) GetRoleOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Role, true
}

// SetRole sets field value
func (o *ChatCompletionRequestFunctionMessage) SetRole(v string) {
	o.Role = v
}

// GetContent returns the Content field value
// If the value is explicit nil, the zero value for string will be returned
func (o *ChatCompletionRequestFunctionMessage) GetContent() string {
	if o == nil || o.Content.Get() == nil {
		var ret string
		return ret
	}

	return *o.Content.Get()
}

// GetContentOk returns a tuple with the Content field value
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *ChatCompletionRequestFunctionMessage) GetContentOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Content.Get(), o.Content.IsSet()
}

// SetContent sets field value
func (o *ChatCompletionRequestFunctionMessage) SetContent(v string) {
	o.Content.Set(&v)
}

// GetName returns the Name field value
func (o *ChatCompletionRequestFunctionMessage) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *ChatCompletionRequestFunctionMessage) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *ChatCompletionRequestFunctionMessage) SetName(v string) {
	o.Name = v
}

func (o ChatCompletionRequestFunctionMessage) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ChatCompletionRequestFunctionMessage) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["role"] = o.Role
	toSerialize["content"] = o.Content.Get()
	toSerialize["name"] = o.Name
	return toSerialize, nil
}

func (o *ChatCompletionRequestFunctionMessage) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"role",
		"content",
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

	varChatCompletionRequestFunctionMessage := _ChatCompletionRequestFunctionMessage{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varChatCompletionRequestFunctionMessage)

	if err != nil {
		return err
	}

	*o = ChatCompletionRequestFunctionMessage(varChatCompletionRequestFunctionMessage)

	return err
}

type NullableChatCompletionRequestFunctionMessage struct {
	value *ChatCompletionRequestFunctionMessage
	isSet bool
}

func (v NullableChatCompletionRequestFunctionMessage) Get() *ChatCompletionRequestFunctionMessage {
	return v.value
}

func (v *NullableChatCompletionRequestFunctionMessage) Set(val *ChatCompletionRequestFunctionMessage) {
	v.value = val
	v.isSet = true
}

func (v NullableChatCompletionRequestFunctionMessage) IsSet() bool {
	return v.isSet
}

func (v *NullableChatCompletionRequestFunctionMessage) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableChatCompletionRequestFunctionMessage(val *ChatCompletionRequestFunctionMessage) *NullableChatCompletionRequestFunctionMessage {
	return &NullableChatCompletionRequestFunctionMessage{value: val, isSet: true}
}

func (v NullableChatCompletionRequestFunctionMessage) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableChatCompletionRequestFunctionMessage) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

