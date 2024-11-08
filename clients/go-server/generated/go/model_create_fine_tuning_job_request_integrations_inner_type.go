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
)



// CreateFineTuningJobRequestIntegrationsInnerType - The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. 
type CreateFineTuningJobRequestIntegrationsInnerType struct {
}

// AssertCreateFineTuningJobRequestIntegrationsInnerTypeRequired checks if the required fields are not zero-ed
func AssertCreateFineTuningJobRequestIntegrationsInnerTypeRequired(obj CreateFineTuningJobRequestIntegrationsInnerType) error {
	return nil
}

// AssertCreateFineTuningJobRequestIntegrationsInnerTypeConstraints checks if the values respects the defined constraints
func AssertCreateFineTuningJobRequestIntegrationsInnerTypeConstraints(obj CreateFineTuningJobRequestIntegrationsInnerType) error {
	return nil
}
