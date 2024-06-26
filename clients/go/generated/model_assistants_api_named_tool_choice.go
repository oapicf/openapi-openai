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

// checks if the AssistantsApiNamedToolChoice type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AssistantsApiNamedToolChoice{}

// AssistantsApiNamedToolChoice Specifies a tool the model should use. Use to force the model to call a specific tool.
type AssistantsApiNamedToolChoice struct {
	// The type of the tool. If type is `function`, the function name must be set
	Type string `json:"type"`
	Function *ChatCompletionNamedToolChoiceFunction `json:"function,omitempty"`
}

type _AssistantsApiNamedToolChoice AssistantsApiNamedToolChoice

// NewAssistantsApiNamedToolChoice instantiates a new AssistantsApiNamedToolChoice object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAssistantsApiNamedToolChoice(type_ string) *AssistantsApiNamedToolChoice {
	this := AssistantsApiNamedToolChoice{}
	this.Type = type_
	return &this
}

// NewAssistantsApiNamedToolChoiceWithDefaults instantiates a new AssistantsApiNamedToolChoice object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAssistantsApiNamedToolChoiceWithDefaults() *AssistantsApiNamedToolChoice {
	this := AssistantsApiNamedToolChoice{}
	return &this
}

// GetType returns the Type field value
func (o *AssistantsApiNamedToolChoice) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *AssistantsApiNamedToolChoice) GetTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *AssistantsApiNamedToolChoice) SetType(v string) {
	o.Type = v
}

// GetFunction returns the Function field value if set, zero value otherwise.
func (o *AssistantsApiNamedToolChoice) GetFunction() ChatCompletionNamedToolChoiceFunction {
	if o == nil || IsNil(o.Function) {
		var ret ChatCompletionNamedToolChoiceFunction
		return ret
	}
	return *o.Function
}

// GetFunctionOk returns a tuple with the Function field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AssistantsApiNamedToolChoice) GetFunctionOk() (*ChatCompletionNamedToolChoiceFunction, bool) {
	if o == nil || IsNil(o.Function) {
		return nil, false
	}
	return o.Function, true
}

// HasFunction returns a boolean if a field has been set.
func (o *AssistantsApiNamedToolChoice) HasFunction() bool {
	if o != nil && !IsNil(o.Function) {
		return true
	}

	return false
}

// SetFunction gets a reference to the given ChatCompletionNamedToolChoiceFunction and assigns it to the Function field.
func (o *AssistantsApiNamedToolChoice) SetFunction(v ChatCompletionNamedToolChoiceFunction) {
	o.Function = &v
}

func (o AssistantsApiNamedToolChoice) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AssistantsApiNamedToolChoice) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["type"] = o.Type
	if !IsNil(o.Function) {
		toSerialize["function"] = o.Function
	}
	return toSerialize, nil
}

func (o *AssistantsApiNamedToolChoice) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"type",
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

	varAssistantsApiNamedToolChoice := _AssistantsApiNamedToolChoice{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varAssistantsApiNamedToolChoice)

	if err != nil {
		return err
	}

	*o = AssistantsApiNamedToolChoice(varAssistantsApiNamedToolChoice)

	return err
}

type NullableAssistantsApiNamedToolChoice struct {
	value *AssistantsApiNamedToolChoice
	isSet bool
}

func (v NullableAssistantsApiNamedToolChoice) Get() *AssistantsApiNamedToolChoice {
	return v.value
}

func (v *NullableAssistantsApiNamedToolChoice) Set(val *AssistantsApiNamedToolChoice) {
	v.value = val
	v.isSet = true
}

func (v NullableAssistantsApiNamedToolChoice) IsSet() bool {
	return v.isSet
}

func (v *NullableAssistantsApiNamedToolChoice) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAssistantsApiNamedToolChoice(val *AssistantsApiNamedToolChoice) *NullableAssistantsApiNamedToolChoice {
	return &NullableAssistantsApiNamedToolChoice{value: val, isSet: true}
}

func (v NullableAssistantsApiNamedToolChoice) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAssistantsApiNamedToolChoice) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


