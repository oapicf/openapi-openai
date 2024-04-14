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

// checks if the MessageContentTextAnnotationsFileCitationObject type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &MessageContentTextAnnotationsFileCitationObject{}

// MessageContentTextAnnotationsFileCitationObject A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.
type MessageContentTextAnnotationsFileCitationObject struct {
	// Always `file_citation`.
	Type string `json:"type"`
	// The text in the message content that needs to be replaced.
	Text string `json:"text"`
	FileCitation MessageContentTextAnnotationsFileCitationObjectFileCitation `json:"file_citation"`
	StartIndex int32 `json:"start_index"`
	EndIndex int32 `json:"end_index"`
}

type _MessageContentTextAnnotationsFileCitationObject MessageContentTextAnnotationsFileCitationObject

// NewMessageContentTextAnnotationsFileCitationObject instantiates a new MessageContentTextAnnotationsFileCitationObject object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMessageContentTextAnnotationsFileCitationObject(type_ string, text string, fileCitation MessageContentTextAnnotationsFileCitationObjectFileCitation, startIndex int32, endIndex int32) *MessageContentTextAnnotationsFileCitationObject {
	this := MessageContentTextAnnotationsFileCitationObject{}
	this.Type = type_
	this.Text = text
	this.FileCitation = fileCitation
	this.StartIndex = startIndex
	this.EndIndex = endIndex
	return &this
}

// NewMessageContentTextAnnotationsFileCitationObjectWithDefaults instantiates a new MessageContentTextAnnotationsFileCitationObject object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMessageContentTextAnnotationsFileCitationObjectWithDefaults() *MessageContentTextAnnotationsFileCitationObject {
	this := MessageContentTextAnnotationsFileCitationObject{}
	return &this
}

// GetType returns the Type field value
func (o *MessageContentTextAnnotationsFileCitationObject) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *MessageContentTextAnnotationsFileCitationObject) GetTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *MessageContentTextAnnotationsFileCitationObject) SetType(v string) {
	o.Type = v
}

// GetText returns the Text field value
func (o *MessageContentTextAnnotationsFileCitationObject) GetText() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Text
}

// GetTextOk returns a tuple with the Text field value
// and a boolean to check if the value has been set.
func (o *MessageContentTextAnnotationsFileCitationObject) GetTextOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Text, true
}

// SetText sets field value
func (o *MessageContentTextAnnotationsFileCitationObject) SetText(v string) {
	o.Text = v
}

// GetFileCitation returns the FileCitation field value
func (o *MessageContentTextAnnotationsFileCitationObject) GetFileCitation() MessageContentTextAnnotationsFileCitationObjectFileCitation {
	if o == nil {
		var ret MessageContentTextAnnotationsFileCitationObjectFileCitation
		return ret
	}

	return o.FileCitation
}

// GetFileCitationOk returns a tuple with the FileCitation field value
// and a boolean to check if the value has been set.
func (o *MessageContentTextAnnotationsFileCitationObject) GetFileCitationOk() (*MessageContentTextAnnotationsFileCitationObjectFileCitation, bool) {
	if o == nil {
		return nil, false
	}
	return &o.FileCitation, true
}

// SetFileCitation sets field value
func (o *MessageContentTextAnnotationsFileCitationObject) SetFileCitation(v MessageContentTextAnnotationsFileCitationObjectFileCitation) {
	o.FileCitation = v
}

// GetStartIndex returns the StartIndex field value
func (o *MessageContentTextAnnotationsFileCitationObject) GetStartIndex() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.StartIndex
}

// GetStartIndexOk returns a tuple with the StartIndex field value
// and a boolean to check if the value has been set.
func (o *MessageContentTextAnnotationsFileCitationObject) GetStartIndexOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.StartIndex, true
}

// SetStartIndex sets field value
func (o *MessageContentTextAnnotationsFileCitationObject) SetStartIndex(v int32) {
	o.StartIndex = v
}

// GetEndIndex returns the EndIndex field value
func (o *MessageContentTextAnnotationsFileCitationObject) GetEndIndex() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.EndIndex
}

// GetEndIndexOk returns a tuple with the EndIndex field value
// and a boolean to check if the value has been set.
func (o *MessageContentTextAnnotationsFileCitationObject) GetEndIndexOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.EndIndex, true
}

// SetEndIndex sets field value
func (o *MessageContentTextAnnotationsFileCitationObject) SetEndIndex(v int32) {
	o.EndIndex = v
}

func (o MessageContentTextAnnotationsFileCitationObject) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o MessageContentTextAnnotationsFileCitationObject) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["type"] = o.Type
	toSerialize["text"] = o.Text
	toSerialize["file_citation"] = o.FileCitation
	toSerialize["start_index"] = o.StartIndex
	toSerialize["end_index"] = o.EndIndex
	return toSerialize, nil
}

func (o *MessageContentTextAnnotationsFileCitationObject) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"type",
		"text",
		"file_citation",
		"start_index",
		"end_index",
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

	varMessageContentTextAnnotationsFileCitationObject := _MessageContentTextAnnotationsFileCitationObject{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varMessageContentTextAnnotationsFileCitationObject)

	if err != nil {
		return err
	}

	*o = MessageContentTextAnnotationsFileCitationObject(varMessageContentTextAnnotationsFileCitationObject)

	return err
}

type NullableMessageContentTextAnnotationsFileCitationObject struct {
	value *MessageContentTextAnnotationsFileCitationObject
	isSet bool
}

func (v NullableMessageContentTextAnnotationsFileCitationObject) Get() *MessageContentTextAnnotationsFileCitationObject {
	return v.value
}

func (v *NullableMessageContentTextAnnotationsFileCitationObject) Set(val *MessageContentTextAnnotationsFileCitationObject) {
	v.value = val
	v.isSet = true
}

func (v NullableMessageContentTextAnnotationsFileCitationObject) IsSet() bool {
	return v.isSet
}

func (v *NullableMessageContentTextAnnotationsFileCitationObject) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMessageContentTextAnnotationsFileCitationObject(val *MessageContentTextAnnotationsFileCitationObject) *NullableMessageContentTextAnnotationsFileCitationObject {
	return &NullableMessageContentTextAnnotationsFileCitationObject{value: val, isSet: true}
}

func (v NullableMessageContentTextAnnotationsFileCitationObject) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMessageContentTextAnnotationsFileCitationObject) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


