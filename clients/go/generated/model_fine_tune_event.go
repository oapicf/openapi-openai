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

// checks if the FineTuneEvent type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &FineTuneEvent{}

// FineTuneEvent struct for FineTuneEvent
type FineTuneEvent struct {
	Object string `json:"object"`
	CreatedAt int32 `json:"created_at"`
	Level string `json:"level"`
	Message string `json:"message"`
}

type _FineTuneEvent FineTuneEvent

// NewFineTuneEvent instantiates a new FineTuneEvent object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFineTuneEvent(object string, createdAt int32, level string, message string) *FineTuneEvent {
	this := FineTuneEvent{}
	this.Object = object
	this.CreatedAt = createdAt
	this.Level = level
	this.Message = message
	return &this
}

// NewFineTuneEventWithDefaults instantiates a new FineTuneEvent object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFineTuneEventWithDefaults() *FineTuneEvent {
	this := FineTuneEvent{}
	return &this
}

// GetObject returns the Object field value
func (o *FineTuneEvent) GetObject() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Object
}

// GetObjectOk returns a tuple with the Object field value
// and a boolean to check if the value has been set.
func (o *FineTuneEvent) GetObjectOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Object, true
}

// SetObject sets field value
func (o *FineTuneEvent) SetObject(v string) {
	o.Object = v
}

// GetCreatedAt returns the CreatedAt field value
func (o *FineTuneEvent) GetCreatedAt() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value
// and a boolean to check if the value has been set.
func (o *FineTuneEvent) GetCreatedAtOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CreatedAt, true
}

// SetCreatedAt sets field value
func (o *FineTuneEvent) SetCreatedAt(v int32) {
	o.CreatedAt = v
}

// GetLevel returns the Level field value
func (o *FineTuneEvent) GetLevel() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Level
}

// GetLevelOk returns a tuple with the Level field value
// and a boolean to check if the value has been set.
func (o *FineTuneEvent) GetLevelOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Level, true
}

// SetLevel sets field value
func (o *FineTuneEvent) SetLevel(v string) {
	o.Level = v
}

// GetMessage returns the Message field value
func (o *FineTuneEvent) GetMessage() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Message
}

// GetMessageOk returns a tuple with the Message field value
// and a boolean to check if the value has been set.
func (o *FineTuneEvent) GetMessageOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Message, true
}

// SetMessage sets field value
func (o *FineTuneEvent) SetMessage(v string) {
	o.Message = v
}

func (o FineTuneEvent) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o FineTuneEvent) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["object"] = o.Object
	toSerialize["created_at"] = o.CreatedAt
	toSerialize["level"] = o.Level
	toSerialize["message"] = o.Message
	return toSerialize, nil
}

func (o *FineTuneEvent) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"object",
		"created_at",
		"level",
		"message",
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

	varFineTuneEvent := _FineTuneEvent{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varFineTuneEvent)

	if err != nil {
		return err
	}

	*o = FineTuneEvent(varFineTuneEvent)

	return err
}

type NullableFineTuneEvent struct {
	value *FineTuneEvent
	isSet bool
}

func (v NullableFineTuneEvent) Get() *FineTuneEvent {
	return v.value
}

func (v *NullableFineTuneEvent) Set(val *FineTuneEvent) {
	v.value = val
	v.isSet = true
}

func (v NullableFineTuneEvent) IsSet() bool {
	return v.isSet
}

func (v *NullableFineTuneEvent) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFineTuneEvent(val *FineTuneEvent) *NullableFineTuneEvent {
	return &NullableFineTuneEvent{value: val, isSet: true}
}

func (v NullableFineTuneEvent) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFineTuneEvent) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

