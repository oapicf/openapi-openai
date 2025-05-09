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



type MessageContentTextObjectTextAnnotationsInner struct {

	// Always `file_citation`.
	Type string `json:"type"`

	// The text in the message content that needs to be replaced.
	Text string `json:"text"`

	FileCitation MessageContentTextAnnotationsFileCitationObjectFileCitation `json:"file_citation"`

	StartIndex int32 `json:"start_index"`

	EndIndex int32 `json:"end_index"`

	FilePath MessageContentTextAnnotationsFilePathObjectFilePath `json:"file_path"`
}

// AssertMessageContentTextObjectTextAnnotationsInnerRequired checks if the required fields are not zero-ed
func AssertMessageContentTextObjectTextAnnotationsInnerRequired(obj MessageContentTextObjectTextAnnotationsInner) error {
	elements := map[string]interface{}{
		"type": obj.Type,
		"text": obj.Text,
		"file_citation": obj.FileCitation,
		"start_index": obj.StartIndex,
		"end_index": obj.EndIndex,
		"file_path": obj.FilePath,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertMessageContentTextAnnotationsFileCitationObjectFileCitationRequired(obj.FileCitation); err != nil {
		return err
	}
	if err := AssertMessageContentTextAnnotationsFilePathObjectFilePathRequired(obj.FilePath); err != nil {
		return err
	}
	return nil
}

// AssertMessageContentTextObjectTextAnnotationsInnerConstraints checks if the values respects the defined constraints
func AssertMessageContentTextObjectTextAnnotationsInnerConstraints(obj MessageContentTextObjectTextAnnotationsInner) error {
	if err := AssertMessageContentTextAnnotationsFileCitationObjectFileCitationConstraints(obj.FileCitation); err != nil {
		return err
	}
	if obj.StartIndex < 0 {
		return &ParsingError{Param: "StartIndex", Err: errors.New(errMsgMinValueConstraint)}
	}
	if obj.EndIndex < 0 {
		return &ParsingError{Param: "EndIndex", Err: errors.New(errMsgMinValueConstraint)}
	}
	if err := AssertMessageContentTextAnnotationsFilePathObjectFilePathConstraints(obj.FilePath); err != nil {
		return err
	}
	return nil
}
