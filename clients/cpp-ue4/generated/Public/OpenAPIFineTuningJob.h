/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIFineTuningJobError.h"
#include "OpenAPIFineTuningJobHyperparameters.h"
#include "OpenAPIFineTuningJobIntegrationsInner.h"

namespace OpenAPI
{

/*
 * OpenAPIFineTuningJob
 *
 * The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
 */
class OPENAPI_API OpenAPIFineTuningJob : public Model
{
public:
    virtual ~OpenAPIFineTuningJob() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The object identifier, which can be referenced in the API endpoints. */
	FString Id;
	/* The Unix timestamp (in seconds) for when the fine-tuning job was created. */
	int32 CreatedAt = 0;
	OpenAPIFineTuningJobError Error;
	/* The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. */
	FString FineTunedModel;
	/* The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. */
	int32 FinishedAt = 0;
	OpenAPIFineTuningJobHyperparameters Hyperparameters;
	/* The base model that is being fine-tuned. */
	FString Model;
	enum class ObjectEnum
	{
		FineTuningJob,
  	};

	static FString EnumToString(const ObjectEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ObjectEnum& EnumValue);
	/* The object type, which is always \"fine_tuning.job\". */
	ObjectEnum Object;
	/* The organization that owns the fine-tuning job. */
	FString OrganizationId;
	/* The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). */
	TArray<FString> ResultFiles;
	enum class StatusEnum
	{
		ValidatingFiles,
		Queued,
		Running,
		Succeeded,
		Failed,
		Cancelled,
  	};

	static FString EnumToString(const StatusEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, StatusEnum& EnumValue);
	/* The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`. */
	StatusEnum Status;
	/* The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. */
	int32 TrainedTokens = 0;
	/* The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). */
	FString TrainingFile;
	/* The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). */
	FString ValidationFile;
	/* A list of integrations to enable for this fine-tuning job. */
	TOptional<TArray<OpenAPIFineTuningJobIntegrationsInner>> Integrations;
	/* The seed used for the fine-tuning job. */
	int32 Seed = 0;
};

}
