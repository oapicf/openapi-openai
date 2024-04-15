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

// checks if the MessageDeltaContentImageFileObject type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &MessageDeltaContentImageFileObject{}

// MessageDeltaContentImageFileObject References an image [File](/docs/api-reference/files) in the content of a message.
type MessageDeltaContentImageFileObject struct {
	// The index of the content part in the message.
	Index int32 `json:"index"`
	// Always `image_file`.
	Type string `json:"type"`
	ImageFile *MessageDeltaContentImageFileObjectImageFile `json:"image_file,omitempty"`
}

type _MessageDeltaContentImageFileObject MessageDeltaContentImageFileObject

// NewMessageDeltaContentImageFileObject instantiates a new MessageDeltaContentImageFileObject object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMessageDeltaContentImageFileObject(index int32, type_ string) *MessageDeltaContentImageFileObject {
	this := MessageDeltaContentImageFileObject{}
	this.Index = index
	this.Type = type_
	return &this
}

// NewMessageDeltaContentImageFileObjectWithDefaults instantiates a new MessageDeltaContentImageFileObject object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMessageDeltaContentImageFileObjectWithDefaults() *MessageDeltaContentImageFileObject {
	this := MessageDeltaContentImageFileObject{}
	return &this
}

// GetIndex returns the Index field value
func (o *MessageDeltaContentImageFileObject) GetIndex() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Index
}

// GetIndexOk returns a tuple with the Index field value
// and a boolean to check if the value has been set.
func (o *MessageDeltaContentImageFileObject) GetIndexOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Index, true
}

// SetIndex sets field value
func (o *MessageDeltaContentImageFileObject) SetIndex(v int32) {
	o.Index = v
}

// GetType returns the Type field value
func (o *MessageDeltaContentImageFileObject) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *MessageDeltaContentImageFileObject) GetTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *MessageDeltaContentImageFileObject) SetType(v string) {
	o.Type = v
}

// GetImageFile returns the ImageFile field value if set, zero value otherwise.
func (o *MessageDeltaContentImageFileObject) GetImageFile() MessageDeltaContentImageFileObjectImageFile {
	if o == nil || IsNil(o.ImageFile) {
		var ret MessageDeltaContentImageFileObjectImageFile
		return ret
	}
	return *o.ImageFile
}

// GetImageFileOk returns a tuple with the ImageFile field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessageDeltaContentImageFileObject) GetImageFileOk() (*MessageDeltaContentImageFileObjectImageFile, bool) {
	if o == nil || IsNil(o.ImageFile) {
		return nil, false
	}
	return o.ImageFile, true
}

// HasImageFile returns a boolean if a field has been set.
func (o *MessageDeltaContentImageFileObject) HasImageFile() bool {
	if o != nil && !IsNil(o.ImageFile) {
		return true
	}

	return false
}

// SetImageFile gets a reference to the given MessageDeltaContentImageFileObjectImageFile and assigns it to the ImageFile field.
func (o *MessageDeltaContentImageFileObject) SetImageFile(v MessageDeltaContentImageFileObjectImageFile) {
	o.ImageFile = &v
}

func (o MessageDeltaContentImageFileObject) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o MessageDeltaContentImageFileObject) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["index"] = o.Index
	toSerialize["type"] = o.Type
	if !IsNil(o.ImageFile) {
		toSerialize["image_file"] = o.ImageFile
	}
	return toSerialize, nil
}

func (o *MessageDeltaContentImageFileObject) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"index",
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

	varMessageDeltaContentImageFileObject := _MessageDeltaContentImageFileObject{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varMessageDeltaContentImageFileObject)

	if err != nil {
		return err
	}

	*o = MessageDeltaContentImageFileObject(varMessageDeltaContentImageFileObject)

	return err
}

type NullableMessageDeltaContentImageFileObject struct {
	value *MessageDeltaContentImageFileObject
	isSet bool
}

func (v NullableMessageDeltaContentImageFileObject) Get() *MessageDeltaContentImageFileObject {
	return v.value
}

func (v *NullableMessageDeltaContentImageFileObject) Set(val *MessageDeltaContentImageFileObject) {
	v.value = val
	v.isSet = true
}

func (v NullableMessageDeltaContentImageFileObject) IsSet() bool {
	return v.isSet
}

func (v *NullableMessageDeltaContentImageFileObject) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMessageDeltaContentImageFileObject(val *MessageDeltaContentImageFileObject) *NullableMessageDeltaContentImageFileObject {
	return &NullableMessageDeltaContentImageFileObject{value: val, isSet: true}
}

func (v NullableMessageDeltaContentImageFileObject) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMessageDeltaContentImageFileObject) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

