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

// checks if the ChatCompletionRequestSystemMessage type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ChatCompletionRequestSystemMessage{}

// ChatCompletionRequestSystemMessage struct for ChatCompletionRequestSystemMessage
type ChatCompletionRequestSystemMessage struct {
	// The contents of the system message.
	Content string `json:"content"`
	// The role of the messages author, in this case `system`.
	Role string `json:"role"`
	// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
	Name *string `json:"name,omitempty"`
}

type _ChatCompletionRequestSystemMessage ChatCompletionRequestSystemMessage

// NewChatCompletionRequestSystemMessage instantiates a new ChatCompletionRequestSystemMessage object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewChatCompletionRequestSystemMessage(content string, role string) *ChatCompletionRequestSystemMessage {
	this := ChatCompletionRequestSystemMessage{}
	this.Content = content
	this.Role = role
	return &this
}

// NewChatCompletionRequestSystemMessageWithDefaults instantiates a new ChatCompletionRequestSystemMessage object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewChatCompletionRequestSystemMessageWithDefaults() *ChatCompletionRequestSystemMessage {
	this := ChatCompletionRequestSystemMessage{}
	return &this
}

// GetContent returns the Content field value
func (o *ChatCompletionRequestSystemMessage) GetContent() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Content
}

// GetContentOk returns a tuple with the Content field value
// and a boolean to check if the value has been set.
func (o *ChatCompletionRequestSystemMessage) GetContentOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Content, true
}

// SetContent sets field value
func (o *ChatCompletionRequestSystemMessage) SetContent(v string) {
	o.Content = v
}

// GetRole returns the Role field value
func (o *ChatCompletionRequestSystemMessage) GetRole() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Role
}

// GetRoleOk returns a tuple with the Role field value
// and a boolean to check if the value has been set.
func (o *ChatCompletionRequestSystemMessage) GetRoleOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Role, true
}

// SetRole sets field value
func (o *ChatCompletionRequestSystemMessage) SetRole(v string) {
	o.Role = v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *ChatCompletionRequestSystemMessage) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ChatCompletionRequestSystemMessage) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *ChatCompletionRequestSystemMessage) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *ChatCompletionRequestSystemMessage) SetName(v string) {
	o.Name = &v
}

func (o ChatCompletionRequestSystemMessage) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ChatCompletionRequestSystemMessage) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["content"] = o.Content
	toSerialize["role"] = o.Role
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	return toSerialize, nil
}

func (o *ChatCompletionRequestSystemMessage) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"content",
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

	varChatCompletionRequestSystemMessage := _ChatCompletionRequestSystemMessage{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varChatCompletionRequestSystemMessage)

	if err != nil {
		return err
	}

	*o = ChatCompletionRequestSystemMessage(varChatCompletionRequestSystemMessage)

	return err
}

type NullableChatCompletionRequestSystemMessage struct {
	value *ChatCompletionRequestSystemMessage
	isSet bool
}

func (v NullableChatCompletionRequestSystemMessage) Get() *ChatCompletionRequestSystemMessage {
	return v.value
}

func (v *NullableChatCompletionRequestSystemMessage) Set(val *ChatCompletionRequestSystemMessage) {
	v.value = val
	v.isSet = true
}

func (v NullableChatCompletionRequestSystemMessage) IsSet() bool {
	return v.isSet
}

func (v *NullableChatCompletionRequestSystemMessage) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableChatCompletionRequestSystemMessage(val *ChatCompletionRequestSystemMessage) *NullableChatCompletionRequestSystemMessage {
	return &NullableChatCompletionRequestSystemMessage{value: val, isSet: true}
}

func (v NullableChatCompletionRequestSystemMessage) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableChatCompletionRequestSystemMessage) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

