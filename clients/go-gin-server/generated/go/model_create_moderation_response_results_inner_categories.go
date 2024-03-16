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

type CreateModerationResponseResultsInnerCategories struct {

	Hate bool `json:"hate"`

	HateThreatening bool `json:"hate/threatening"`

	SelfHarm bool `json:"self-harm"`

	Sexual bool `json:"sexual"`

	SexualMinors bool `json:"sexual/minors"`

	Violence bool `json:"violence"`

	ViolenceGraphic bool `json:"violence/graphic"`
}