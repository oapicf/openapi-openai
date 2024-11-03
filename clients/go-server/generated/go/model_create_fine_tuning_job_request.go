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
	"errors"
)



type CreateFineTuningJobRequest struct {

	Model CreateFineTuningJobRequestModel `json:"model"`

	// The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
	TrainingFile string `json:"training_file"`

	Hyperparameters CreateFineTuningJobRequestHyperparameters `json:"hyperparameters,omitempty"`

	// A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`. 
	Suffix *string `json:"suffix,omitempty"`

	// The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
	ValidationFile *string `json:"validation_file,omitempty"`

	// A list of integrations to enable for your fine-tuning job.
	Integrations *[]CreateFineTuningJobRequestIntegrationsInner `json:"integrations,omitempty"`

	// The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
	Seed *int32 `json:"seed,omitempty"`
}

// AssertCreateFineTuningJobRequestRequired checks if the required fields are not zero-ed
func AssertCreateFineTuningJobRequestRequired(obj CreateFineTuningJobRequest) error {
	elements := map[string]interface{}{
		"model": obj.Model,
		"training_file": obj.TrainingFile,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertCreateFineTuningJobRequestModelRequired(obj.Model); err != nil {
		return err
	}
	if err := AssertCreateFineTuningJobRequestHyperparametersRequired(obj.Hyperparameters); err != nil {
		return err
	}
	if obj.Integrations != nil {
		for _, el := range *obj.Integrations {
			if err := AssertCreateFineTuningJobRequestIntegrationsInnerRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertCreateFineTuningJobRequestConstraints checks if the values respects the defined constraints
func AssertCreateFineTuningJobRequestConstraints(obj CreateFineTuningJobRequest) error {
	if err := AssertCreateFineTuningJobRequestModelConstraints(obj.Model); err != nil {
		return err
	}
	if err := AssertCreateFineTuningJobRequestHyperparametersConstraints(obj.Hyperparameters); err != nil {
		return err
	}
    if obj.Integrations != nil {
     	for _, el := range *obj.Integrations {
     		if err := AssertCreateFineTuningJobRequestIntegrationsInnerConstraints(el); err != nil {
     			return err
     		}
     	}
    }
	if obj.Seed != nil && *obj.Seed < 0 {
		return &ParsingError{Param: "Seed", Err: errors.New(errMsgMinValueConstraint)}
	}
	if obj.Seed != nil && *obj.Seed > 2147483647 {
		return &ParsingError{Param: "Seed", Err: errors.New(errMsgMaxValueConstraint)}
	}
	return nil
}
