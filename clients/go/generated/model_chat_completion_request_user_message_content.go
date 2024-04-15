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
	"fmt"
)

// ChatCompletionRequestUserMessageContent - The contents of the user message. 
type ChatCompletionRequestUserMessageContent struct {
	ArrayOfChatCompletionRequestMessageContentPart *[]ChatCompletionRequestMessageContentPart
	String *string
}

// []ChatCompletionRequestMessageContentPartAsChatCompletionRequestUserMessageContent is a convenience function that returns []ChatCompletionRequestMessageContentPart wrapped in ChatCompletionRequestUserMessageContent
func ArrayOfChatCompletionRequestMessageContentPartAsChatCompletionRequestUserMessageContent(v *[]ChatCompletionRequestMessageContentPart) ChatCompletionRequestUserMessageContent {
	return ChatCompletionRequestUserMessageContent{
		ArrayOfChatCompletionRequestMessageContentPart: v,
	}
}

// stringAsChatCompletionRequestUserMessageContent is a convenience function that returns string wrapped in ChatCompletionRequestUserMessageContent
func StringAsChatCompletionRequestUserMessageContent(v *string) ChatCompletionRequestUserMessageContent {
	return ChatCompletionRequestUserMessageContent{
		String: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *ChatCompletionRequestUserMessageContent) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into ArrayOfChatCompletionRequestMessageContentPart
	err = newStrictDecoder(data).Decode(&dst.ArrayOfChatCompletionRequestMessageContentPart)
	if err == nil {
		jsonArrayOfChatCompletionRequestMessageContentPart, _ := json.Marshal(dst.ArrayOfChatCompletionRequestMessageContentPart)
		if string(jsonArrayOfChatCompletionRequestMessageContentPart) == "{}" { // empty struct
			dst.ArrayOfChatCompletionRequestMessageContentPart = nil
		} else {
			match++
		}
	} else {
		dst.ArrayOfChatCompletionRequestMessageContentPart = nil
	}

	// try to unmarshal data into String
	err = newStrictDecoder(data).Decode(&dst.String)
	if err == nil {
		jsonString, _ := json.Marshal(dst.String)
		if string(jsonString) == "{}" { // empty struct
			dst.String = nil
		} else {
			match++
		}
	} else {
		dst.String = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.ArrayOfChatCompletionRequestMessageContentPart = nil
		dst.String = nil

		return fmt.Errorf("data matches more than one schema in oneOf(ChatCompletionRequestUserMessageContent)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(ChatCompletionRequestUserMessageContent)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src ChatCompletionRequestUserMessageContent) MarshalJSON() ([]byte, error) {
	if src.ArrayOfChatCompletionRequestMessageContentPart != nil {
		return json.Marshal(&src.ArrayOfChatCompletionRequestMessageContentPart)
	}

	if src.String != nil {
		return json.Marshal(&src.String)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *ChatCompletionRequestUserMessageContent) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.ArrayOfChatCompletionRequestMessageContentPart != nil {
		return obj.ArrayOfChatCompletionRequestMessageContentPart
	}

	if obj.String != nil {
		return obj.String
	}

	// all schemas are nil
	return nil
}

type NullableChatCompletionRequestUserMessageContent struct {
	value *ChatCompletionRequestUserMessageContent
	isSet bool
}

func (v NullableChatCompletionRequestUserMessageContent) Get() *ChatCompletionRequestUserMessageContent {
	return v.value
}

func (v *NullableChatCompletionRequestUserMessageContent) Set(val *ChatCompletionRequestUserMessageContent) {
	v.value = val
	v.isSet = true
}

func (v NullableChatCompletionRequestUserMessageContent) IsSet() bool {
	return v.isSet
}

func (v *NullableChatCompletionRequestUserMessageContent) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableChatCompletionRequestUserMessageContent(val *ChatCompletionRequestUserMessageContent) *NullableChatCompletionRequestUserMessageContent {
	return &NullableChatCompletionRequestUserMessageContent{value: val, isSet: true}
}

func (v NullableChatCompletionRequestUserMessageContent) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableChatCompletionRequestUserMessageContent) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

