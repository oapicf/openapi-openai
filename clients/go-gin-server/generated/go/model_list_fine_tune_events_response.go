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

type ListFineTuneEventsResponse struct {

	Object string `json:"object"`

	Data []FineTuneEvent `json:"data"`
}
