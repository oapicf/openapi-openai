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
	"gopkg.in/validator.v2"
	"errors"
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

// AssertMessageDeltaContentTextObjectTextAnnotationsInnerRequired checks if the required fields are not zero-ed
func AssertMessageDeltaContentTextObjectTextAnnotationsInnerRequired(obj MessageDeltaContentTextObjectTextAnnotationsInner) error {
	elements := map[string]interface{}{
		"index": obj.Index,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertMessageDeltaContentTextAnnotationsFileCitationObjectFileCitationRequired(obj.FileCitation); err != nil {
		return err
	}
	if err := AssertMessageDeltaContentTextAnnotationsFilePathObjectFilePathRequired(obj.FilePath); err != nil {
		return err
	}
	return nil
}

// AssertMessageDeltaContentTextObjectTextAnnotationsInnerConstraints checks if the values respects the defined constraints
func AssertMessageDeltaContentTextObjectTextAnnotationsInnerConstraints(obj MessageDeltaContentTextObjectTextAnnotationsInner) error {
	if err := AssertMessageDeltaContentTextAnnotationsFileCitationObjectFileCitationConstraints(obj.FileCitation); err != nil {
		return err
	}
	if obj.StartIndex < 0 {
		return &ParsingError{Param: "StartIndex", Err: errors.New(errMsgMinValueConstraint)}
	}
	if obj.EndIndex < 0 {
		return &ParsingError{Param: "EndIndex", Err: errors.New(errMsgMinValueConstraint)}
	}
	if err := AssertMessageDeltaContentTextAnnotationsFilePathObjectFilePathConstraints(obj.FilePath); err != nil {
		return err
	}
	return nil
}
