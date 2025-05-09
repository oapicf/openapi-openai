// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi


import (
	"fmt"
)


// ChatCompletionRole : The role of the author of a message
type ChatCompletionRole string

// List of ChatCompletionRole
const (
	SYSTEM ChatCompletionRole = "system"
	USER ChatCompletionRole = "user"
	ASSISTANT ChatCompletionRole = "assistant"
	TOOL ChatCompletionRole = "tool"
	FUNCTION ChatCompletionRole = "function"
)

// AllowedChatCompletionRoleEnumValues is all the allowed values of ChatCompletionRole enum
var AllowedChatCompletionRoleEnumValues = []ChatCompletionRole{
	"system",
	"user",
	"assistant",
	"tool",
	"function",
}

// validChatCompletionRoleEnumValue provides a map of ChatCompletionRoles for fast verification of use input
var validChatCompletionRoleEnumValues = map[ChatCompletionRole]struct{}{
	"system": {},
	"user": {},
	"assistant": {},
	"tool": {},
	"function": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v ChatCompletionRole) IsValid() bool {
	_, ok := validChatCompletionRoleEnumValues[v]
	return ok
}

// NewChatCompletionRoleFromValue returns a pointer to a valid ChatCompletionRole
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewChatCompletionRoleFromValue(v string) (ChatCompletionRole, error) {
	ev := ChatCompletionRole(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for ChatCompletionRole: valid values are %v", v, AllowedChatCompletionRoleEnumValues)
}



// AssertChatCompletionRoleRequired checks if the required fields are not zero-ed
func AssertChatCompletionRoleRequired(obj ChatCompletionRole) error {
	return nil
}

// AssertChatCompletionRoleConstraints checks if the values respects the defined constraints
func AssertChatCompletionRoleConstraints(obj ChatCompletionRole) error {
	return nil
}
