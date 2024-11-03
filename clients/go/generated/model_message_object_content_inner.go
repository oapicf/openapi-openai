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
	"gopkg.in/validator.v2"
	"fmt"
)

// MessageObjectContentInner - struct for MessageObjectContentInner
type MessageObjectContentInner struct {
	MessageContentImageFileObject *MessageContentImageFileObject
	MessageContentTextObject *MessageContentTextObject
}

// MessageContentImageFileObjectAsMessageObjectContentInner is a convenience function that returns MessageContentImageFileObject wrapped in MessageObjectContentInner
func MessageContentImageFileObjectAsMessageObjectContentInner(v *MessageContentImageFileObject) MessageObjectContentInner {
	return MessageObjectContentInner{
		MessageContentImageFileObject: v,
	}
}

// MessageContentTextObjectAsMessageObjectContentInner is a convenience function that returns MessageContentTextObject wrapped in MessageObjectContentInner
func MessageContentTextObjectAsMessageObjectContentInner(v *MessageContentTextObject) MessageObjectContentInner {
	return MessageObjectContentInner{
		MessageContentTextObject: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *MessageObjectContentInner) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into MessageContentImageFileObject
	err = newStrictDecoder(data).Decode(&dst.MessageContentImageFileObject)
	if err == nil {
		jsonMessageContentImageFileObject, _ := json.Marshal(dst.MessageContentImageFileObject)
		if string(jsonMessageContentImageFileObject) == "{}" { // empty struct
			dst.MessageContentImageFileObject = nil
		} else {
			if err = validator.Validate(dst.MessageContentImageFileObject); err != nil {
				dst.MessageContentImageFileObject = nil
			} else {
				match++
			}
		}
	} else {
		dst.MessageContentImageFileObject = nil
	}

	// try to unmarshal data into MessageContentTextObject
	err = newStrictDecoder(data).Decode(&dst.MessageContentTextObject)
	if err == nil {
		jsonMessageContentTextObject, _ := json.Marshal(dst.MessageContentTextObject)
		if string(jsonMessageContentTextObject) == "{}" { // empty struct
			dst.MessageContentTextObject = nil
		} else {
			if err = validator.Validate(dst.MessageContentTextObject); err != nil {
				dst.MessageContentTextObject = nil
			} else {
				match++
			}
		}
	} else {
		dst.MessageContentTextObject = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.MessageContentImageFileObject = nil
		dst.MessageContentTextObject = nil

		return fmt.Errorf("data matches more than one schema in oneOf(MessageObjectContentInner)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(MessageObjectContentInner)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src MessageObjectContentInner) MarshalJSON() ([]byte, error) {
	if src.MessageContentImageFileObject != nil {
		return json.Marshal(&src.MessageContentImageFileObject)
	}

	if src.MessageContentTextObject != nil {
		return json.Marshal(&src.MessageContentTextObject)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *MessageObjectContentInner) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.MessageContentImageFileObject != nil {
		return obj.MessageContentImageFileObject
	}

	if obj.MessageContentTextObject != nil {
		return obj.MessageContentTextObject
	}

	// all schemas are nil
	return nil
}

type NullableMessageObjectContentInner struct {
	value *MessageObjectContentInner
	isSet bool
}

func (v NullableMessageObjectContentInner) Get() *MessageObjectContentInner {
	return v.value
}

func (v *NullableMessageObjectContentInner) Set(val *MessageObjectContentInner) {
	v.value = val
	v.isSet = true
}

func (v NullableMessageObjectContentInner) IsSet() bool {
	return v.isSet
}

func (v *NullableMessageObjectContentInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMessageObjectContentInner(val *MessageObjectContentInner) *NullableMessageObjectContentInner {
	return &NullableMessageObjectContentInner{value: val, isSet: true}
}

func (v NullableMessageObjectContentInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMessageObjectContentInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


