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

// MessageContentTextAnnotationsFileCitationObject - A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.
type MessageContentTextAnnotationsFileCitationObject struct {

	// Always `file_citation`.
	Type string `json:"type"`

	// The text in the message content that needs to be replaced.
	Text string `json:"text"`

	FileCitation MessageContentTextAnnotationsFileCitationObjectFileCitation `json:"file_citation"`

	StartIndex int32 `json:"start_index"`

	EndIndex int32 `json:"end_index"`
}
