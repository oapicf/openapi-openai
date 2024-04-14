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




type ChatCompletionMessageToolCallChunkFunction struct {

	// The name of the function to call.
	Name string `json:"name,omitempty"`

	// The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
	Arguments string `json:"arguments,omitempty"`
}

// AssertChatCompletionMessageToolCallChunkFunctionRequired checks if the required fields are not zero-ed
func AssertChatCompletionMessageToolCallChunkFunctionRequired(obj ChatCompletionMessageToolCallChunkFunction) error {
	return nil
}

// AssertChatCompletionMessageToolCallChunkFunctionConstraints checks if the values respects the defined constraints
func AssertChatCompletionMessageToolCallChunkFunctionConstraints(obj ChatCompletionMessageToolCallChunkFunction) error {
	return nil
}
