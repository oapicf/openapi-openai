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

// checks if the MessageStreamEventOneOf2 type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &MessageStreamEventOneOf2{}

// MessageStreamEventOneOf2 Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
type MessageStreamEventOneOf2 struct {
	Event string `json:"event"`
	Data MessageDeltaObject `json:"data"`
}

type _MessageStreamEventOneOf2 MessageStreamEventOneOf2

// NewMessageStreamEventOneOf2 instantiates a new MessageStreamEventOneOf2 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMessageStreamEventOneOf2(event string, data MessageDeltaObject) *MessageStreamEventOneOf2 {
	this := MessageStreamEventOneOf2{}
	this.Event = event
	this.Data = data
	return &this
}

// NewMessageStreamEventOneOf2WithDefaults instantiates a new MessageStreamEventOneOf2 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMessageStreamEventOneOf2WithDefaults() *MessageStreamEventOneOf2 {
	this := MessageStreamEventOneOf2{}
	return &this
}

// GetEvent returns the Event field value
func (o *MessageStreamEventOneOf2) GetEvent() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Event
}

// GetEventOk returns a tuple with the Event field value
// and a boolean to check if the value has been set.
func (o *MessageStreamEventOneOf2) GetEventOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Event, true
}

// SetEvent sets field value
func (o *MessageStreamEventOneOf2) SetEvent(v string) {
	o.Event = v
}

// GetData returns the Data field value
func (o *MessageStreamEventOneOf2) GetData() MessageDeltaObject {
	if o == nil {
		var ret MessageDeltaObject
		return ret
	}

	return o.Data
}

// GetDataOk returns a tuple with the Data field value
// and a boolean to check if the value has been set.
func (o *MessageStreamEventOneOf2) GetDataOk() (*MessageDeltaObject, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Data, true
}

// SetData sets field value
func (o *MessageStreamEventOneOf2) SetData(v MessageDeltaObject) {
	o.Data = v
}

func (o MessageStreamEventOneOf2) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o MessageStreamEventOneOf2) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["event"] = o.Event
	toSerialize["data"] = o.Data
	return toSerialize, nil
}

func (o *MessageStreamEventOneOf2) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"event",
		"data",
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

	varMessageStreamEventOneOf2 := _MessageStreamEventOneOf2{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varMessageStreamEventOneOf2)

	if err != nil {
		return err
	}

	*o = MessageStreamEventOneOf2(varMessageStreamEventOneOf2)

	return err
}

type NullableMessageStreamEventOneOf2 struct {
	value *MessageStreamEventOneOf2
	isSet bool
}

func (v NullableMessageStreamEventOneOf2) Get() *MessageStreamEventOneOf2 {
	return v.value
}

func (v *NullableMessageStreamEventOneOf2) Set(val *MessageStreamEventOneOf2) {
	v.value = val
	v.isSet = true
}

func (v NullableMessageStreamEventOneOf2) IsSet() bool {
	return v.isSet
}

func (v *NullableMessageStreamEventOneOf2) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMessageStreamEventOneOf2(val *MessageStreamEventOneOf2) *NullableMessageStreamEventOneOf2 {
	return &NullableMessageStreamEventOneOf2{value: val, isSet: true}
}

func (v NullableMessageStreamEventOneOf2) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMessageStreamEventOneOf2) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

