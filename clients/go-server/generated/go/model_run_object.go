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
	"errors"
)



// RunObject - Represents an execution run on a [thread](/docs/api-reference/threads).
type RunObject struct {

	// The identifier, which can be referenced in API endpoints.
	Id string `json:"id"`

	// The object type, which is always `thread.run`.
	Object string `json:"object"`

	// The Unix timestamp (in seconds) for when the run was created.
	CreatedAt int32 `json:"created_at"`

	// The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
	ThreadId string `json:"thread_id"`

	// The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
	AssistantId string `json:"assistant_id"`

	// The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
	Status string `json:"status"`

	RequiredAction *RunObjectRequiredAction `json:"required_action"`

	LastError *RunObjectLastError `json:"last_error"`

	// The Unix timestamp (in seconds) for when the run will expire.
	ExpiresAt *int32 `json:"expires_at"`

	// The Unix timestamp (in seconds) for when the run was started.
	StartedAt *int32 `json:"started_at"`

	// The Unix timestamp (in seconds) for when the run was cancelled.
	CancelledAt *int32 `json:"cancelled_at"`

	// The Unix timestamp (in seconds) for when the run failed.
	FailedAt *int32 `json:"failed_at"`

	// The Unix timestamp (in seconds) for when the run was completed.
	CompletedAt *int32 `json:"completed_at"`

	IncompleteDetails *RunObjectIncompleteDetails `json:"incomplete_details"`

	// The model that the [assistant](/docs/api-reference/assistants) used for this run.
	Model string `json:"model"`

	// The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
	Instructions string `json:"instructions"`

	// The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
	Tools []AssistantObjectToolsInner `json:"tools"`

	// The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
	FileIds []string `json:"file_ids"`

	// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
	Metadata *map[string]interface{} `json:"metadata"`

	Usage *RunCompletionUsage `json:"usage"`

	// The sampling temperature used for this run. If not set, defaults to 1.
	Temperature *float32 `json:"temperature,omitempty"`

	// The maximum number of prompt tokens specified to have been used over the course of the run. 
	MaxPromptTokens *int32 `json:"max_prompt_tokens"`

	// The maximum number of completion tokens specified to have been used over the course of the run. 
	MaxCompletionTokens *int32 `json:"max_completion_tokens"`

	TruncationStrategy TruncationObject `json:"truncation_strategy"`

	ToolChoice AssistantsApiToolChoiceOption `json:"tool_choice"`

	ResponseFormat AssistantsApiResponseFormatOption `json:"response_format"`
}

// AssertRunObjectRequired checks if the required fields are not zero-ed
func AssertRunObjectRequired(obj RunObject) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"object": obj.Object,
		"created_at": obj.CreatedAt,
		"thread_id": obj.ThreadId,
		"assistant_id": obj.AssistantId,
		"status": obj.Status,
		"required_action": obj.RequiredAction,
		"last_error": obj.LastError,
		"expires_at": obj.ExpiresAt,
		"started_at": obj.StartedAt,
		"cancelled_at": obj.CancelledAt,
		"failed_at": obj.FailedAt,
		"completed_at": obj.CompletedAt,
		"incomplete_details": obj.IncompleteDetails,
		"model": obj.Model,
		"instructions": obj.Instructions,
		"tools": obj.Tools,
		"file_ids": obj.FileIds,
		"metadata": obj.Metadata,
		"usage": obj.Usage,
		"max_prompt_tokens": obj.MaxPromptTokens,
		"max_completion_tokens": obj.MaxCompletionTokens,
		"truncation_strategy": obj.TruncationStrategy,
		"tool_choice": obj.ToolChoice,
		"response_format": obj.ResponseFormat,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if obj.RequiredAction != nil {
		if err := AssertRunObjectRequiredActionRequired(*obj.RequiredAction); err != nil {
			return err
		}
	}
	if obj.LastError != nil {
		if err := AssertRunObjectLastErrorRequired(*obj.LastError); err != nil {
			return err
		}
	}
	if obj.IncompleteDetails != nil {
		if err := AssertRunObjectIncompleteDetailsRequired(*obj.IncompleteDetails); err != nil {
			return err
		}
	}
	for _, el := range obj.Tools {
		if err := AssertAssistantObjectToolsInnerRequired(el); err != nil {
			return err
		}
	}
	if obj.Usage != nil {
		if err := AssertRunCompletionUsageRequired(*obj.Usage); err != nil {
			return err
		}
	}
	if err := AssertTruncationObjectRequired(obj.TruncationStrategy); err != nil {
		return err
	}
	if err := AssertAssistantsApiToolChoiceOptionRequired(obj.ToolChoice); err != nil {
		return err
	}
	if err := AssertAssistantsApiResponseFormatOptionRequired(obj.ResponseFormat); err != nil {
		return err
	}
	return nil
}

// AssertRunObjectConstraints checks if the values respects the defined constraints
func AssertRunObjectConstraints(obj RunObject) error {
	if obj.MaxPromptTokens != nil && *obj.MaxPromptTokens < 256 {
		return &ParsingError{Err: errors.New(errMsgMinValueConstraint)}
	}
	if obj.MaxCompletionTokens != nil && *obj.MaxCompletionTokens < 256 {
		return &ParsingError{Err: errors.New(errMsgMinValueConstraint)}
	}
	return nil
}
