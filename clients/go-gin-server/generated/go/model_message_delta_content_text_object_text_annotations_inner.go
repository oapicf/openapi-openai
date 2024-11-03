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

type MessageDeltaContentTextObjectTextAnnotationsInner struct {

	// The index of the annotation in the text content part.
	Index int32 `json:"index"`

	// Always `file_citation`.
	Type string `json:"type"`

	// The text in the message content that needs to be replaced.
	Text string `json:"text,omitempty"`

	FileCitation MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation `json:"file_citation,omitempty"`

	StartIndex int32 `json:"start_index,omitempty"`

	EndIndex int32 `json:"end_index,omitempty"`

	FilePath MessageDeltaContentTextAnnotationsFilePathObjectFilePath `json:"file_path,omitempty"`
}
