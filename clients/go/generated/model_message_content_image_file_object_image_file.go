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

// checks if the MessageContentImageFileObjectImageFile type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &MessageContentImageFileObjectImageFile{}

// MessageContentImageFileObjectImageFile struct for MessageContentImageFileObjectImageFile
type MessageContentImageFileObjectImageFile struct {
	// The [File](/docs/api-reference/files) ID of the image in the message content.
	FileId string `json:"file_id"`
}

type _MessageContentImageFileObjectImageFile MessageContentImageFileObjectImageFile

// NewMessageContentImageFileObjectImageFile instantiates a new MessageContentImageFileObjectImageFile object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMessageContentImageFileObjectImageFile(fileId string) *MessageContentImageFileObjectImageFile {
	this := MessageContentImageFileObjectImageFile{}
	this.FileId = fileId
	return &this
}

// NewMessageContentImageFileObjectImageFileWithDefaults instantiates a new MessageContentImageFileObjectImageFile object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMessageContentImageFileObjectImageFileWithDefaults() *MessageContentImageFileObjectImageFile {
	this := MessageContentImageFileObjectImageFile{}
	return &this
}

// GetFileId returns the FileId field value
func (o *MessageContentImageFileObjectImageFile) GetFileId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.FileId
}

// GetFileIdOk returns a tuple with the FileId field value
// and a boolean to check if the value has been set.
func (o *MessageContentImageFileObjectImageFile) GetFileIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.FileId, true
}

// SetFileId sets field value
func (o *MessageContentImageFileObjectImageFile) SetFileId(v string) {
	o.FileId = v
}

func (o MessageContentImageFileObjectImageFile) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o MessageContentImageFileObjectImageFile) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["file_id"] = o.FileId
	return toSerialize, nil
}

func (o *MessageContentImageFileObjectImageFile) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"file_id",
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

	varMessageContentImageFileObjectImageFile := _MessageContentImageFileObjectImageFile{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varMessageContentImageFileObjectImageFile)

	if err != nil {
		return err
	}

	*o = MessageContentImageFileObjectImageFile(varMessageContentImageFileObjectImageFile)

	return err
}

type NullableMessageContentImageFileObjectImageFile struct {
	value *MessageContentImageFileObjectImageFile
	isSet bool
}

func (v NullableMessageContentImageFileObjectImageFile) Get() *MessageContentImageFileObjectImageFile {
	return v.value
}

func (v *NullableMessageContentImageFileObjectImageFile) Set(val *MessageContentImageFileObjectImageFile) {
	v.value = val
	v.isSet = true
}

func (v NullableMessageContentImageFileObjectImageFile) IsSet() bool {
	return v.isSet
}

func (v *NullableMessageContentImageFileObjectImageFile) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMessageContentImageFileObjectImageFile(val *MessageContentImageFileObjectImageFile) *NullableMessageContentImageFileObjectImageFile {
	return &NullableMessageContentImageFileObjectImageFile{value: val, isSet: true}
}

func (v NullableMessageContentImageFileObjectImageFile) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMessageContentImageFileObjectImageFile) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


