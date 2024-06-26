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

// MessageObject - Represents a message within a [thread](/docs/api-reference/threads).
type MessageObject struct {

	// The identifier, which can be referenced in API endpoints.
	Id string `json:"id"`

	// The object type, which is always `thread.message`.
	Object string `json:"object"`

	// The Unix timestamp (in seconds) for when the message was created.
	CreatedAt int32 `json:"created_at"`

	// The [thread](/docs/api-reference/threads) ID that this message belongs to.
	ThreadId string `json:"thread_id"`

	// The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
	Status string `json:"status"`

	IncompleteDetails *MessageObjectIncompleteDetails `json:"incomplete_details"`

	// The Unix timestamp (in seconds) for when the message was completed.
	CompletedAt *int32 `json:"completed_at"`

	// The Unix timestamp (in seconds) for when the message was marked as incomplete.
	IncompleteAt *int32 `json:"incomplete_at"`

	// The entity that produced the message. One of `user` or `assistant`.
	Role string `json:"role"`

	// The content of the message in array of text and/or images.
	Content []MessageObjectContentInner `json:"content"`

	// If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
	AssistantId *string `json:"assistant_id"`

	// The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
	RunId *string `json:"run_id"`

	// A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
	FileIds []string `json:"file_ids"`

	// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
	Metadata *map[string]interface{} `json:"metadata"`
}
