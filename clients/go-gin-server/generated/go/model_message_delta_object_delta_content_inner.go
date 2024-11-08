/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"gopkg.in/validator.v2"
)

type MessageDeltaObjectDeltaContentInner struct {

	// The index of the content part in the message.
	Index int32 `json:"index"`

	// Always `image_file`.
	Type string `json:"type"`

	ImageFile MessageDeltaContentImageFileObjectImageFile `json:"image_file,omitempty"`

	Text MessageDeltaContentTextObjectText `json:"text,omitempty"`
}
