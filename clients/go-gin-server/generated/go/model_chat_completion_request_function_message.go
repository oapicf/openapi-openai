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

type ChatCompletionRequestFunctionMessage struct {

	// The role of the messages author, in this case `function`.
	Role string `json:"role"`

	// The contents of the function message.
	Content *string `json:"content"`

	// The name of the function to call.
	Name string `json:"name"`
}