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

// ChatCompletionRequestMessageContentPart - struct for ChatCompletionRequestMessageContentPart
type ChatCompletionRequestMessageContentPart struct {
	ChatCompletionRequestMessageContentPartImage *ChatCompletionRequestMessageContentPartImage
	ChatCompletionRequestMessageContentPartText *ChatCompletionRequestMessageContentPartText
}

// ChatCompletionRequestMessageContentPartImageAsChatCompletionRequestMessageContentPart is a convenience function that returns ChatCompletionRequestMessageContentPartImage wrapped in ChatCompletionRequestMessageContentPart
func ChatCompletionRequestMessageContentPartImageAsChatCompletionRequestMessageContentPart(v *ChatCompletionRequestMessageContentPartImage) ChatCompletionRequestMessageContentPart {
	return ChatCompletionRequestMessageContentPart{
		ChatCompletionRequestMessageContentPartImage: v,
	}
}

// ChatCompletionRequestMessageContentPartTextAsChatCompletionRequestMessageContentPart is a convenience function that returns ChatCompletionRequestMessageContentPartText wrapped in ChatCompletionRequestMessageContentPart
func ChatCompletionRequestMessageContentPartTextAsChatCompletionRequestMessageContentPart(v *ChatCompletionRequestMessageContentPartText) ChatCompletionRequestMessageContentPart {
	return ChatCompletionRequestMessageContentPart{
		ChatCompletionRequestMessageContentPartText: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *ChatCompletionRequestMessageContentPart) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into ChatCompletionRequestMessageContentPartImage
	err = newStrictDecoder(data).Decode(&dst.ChatCompletionRequestMessageContentPartImage)
	if err == nil {
		jsonChatCompletionRequestMessageContentPartImage, _ := json.Marshal(dst.ChatCompletionRequestMessageContentPartImage)
		if string(jsonChatCompletionRequestMessageContentPartImage) == "{}" { // empty struct
			dst.ChatCompletionRequestMessageContentPartImage = nil
		} else {
			if err = validator.Validate(dst.ChatCompletionRequestMessageContentPartImage); err != nil {
				dst.ChatCompletionRequestMessageContentPartImage = nil
			} else {
				match++
			}
		}
	} else {
		dst.ChatCompletionRequestMessageContentPartImage = nil
	}

	// try to unmarshal data into ChatCompletionRequestMessageContentPartText
	err = newStrictDecoder(data).Decode(&dst.ChatCompletionRequestMessageContentPartText)
	if err == nil {
		jsonChatCompletionRequestMessageContentPartText, _ := json.Marshal(dst.ChatCompletionRequestMessageContentPartText)
		if string(jsonChatCompletionRequestMessageContentPartText) == "{}" { // empty struct
			dst.ChatCompletionRequestMessageContentPartText = nil
		} else {
			if err = validator.Validate(dst.ChatCompletionRequestMessageContentPartText); err != nil {
				dst.ChatCompletionRequestMessageContentPartText = nil
			} else {
				match++
			}
		}
	} else {
		dst.ChatCompletionRequestMessageContentPartText = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.ChatCompletionRequestMessageContentPartImage = nil
		dst.ChatCompletionRequestMessageContentPartText = nil

		return fmt.Errorf("data matches more than one schema in oneOf(ChatCompletionRequestMessageContentPart)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(ChatCompletionRequestMessageContentPart)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src ChatCompletionRequestMessageContentPart) MarshalJSON() ([]byte, error) {
	if src.ChatCompletionRequestMessageContentPartImage != nil {
		return json.Marshal(&src.ChatCompletionRequestMessageContentPartImage)
	}

	if src.ChatCompletionRequestMessageContentPartText != nil {
		return json.Marshal(&src.ChatCompletionRequestMessageContentPartText)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *ChatCompletionRequestMessageContentPart) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.ChatCompletionRequestMessageContentPartImage != nil {
		return obj.ChatCompletionRequestMessageContentPartImage
	}

	if obj.ChatCompletionRequestMessageContentPartText != nil {
		return obj.ChatCompletionRequestMessageContentPartText
	}

	// all schemas are nil
	return nil
}

type NullableChatCompletionRequestMessageContentPart struct {
	value *ChatCompletionRequestMessageContentPart
	isSet bool
}

func (v NullableChatCompletionRequestMessageContentPart) Get() *ChatCompletionRequestMessageContentPart {
	return v.value
}

func (v *NullableChatCompletionRequestMessageContentPart) Set(val *ChatCompletionRequestMessageContentPart) {
	v.value = val
	v.isSet = true
}

func (v NullableChatCompletionRequestMessageContentPart) IsSet() bool {
	return v.isSet
}

func (v *NullableChatCompletionRequestMessageContentPart) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableChatCompletionRequestMessageContentPart(val *ChatCompletionRequestMessageContentPart) *NullableChatCompletionRequestMessageContentPart {
	return &NullableChatCompletionRequestMessageContentPart{value: val, isSet: true}
}

func (v NullableChatCompletionRequestMessageContentPart) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableChatCompletionRequestMessageContentPart) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


