/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type CreateCompletionResponseChoicesInner struct {

	Text string `json:"text"`

	Index int32 `json:"index"`

	Logprobs *CreateCompletionResponseChoicesInnerLogprobs `json:"logprobs"`

	FinishReason string `json:"finish_reason"`
}