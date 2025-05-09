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
#include "OpenAPIRunStepCompletionUsage.h"
#include "OpenAPIRunStepObjectLastError.h"
#include "OpenAPIRunStepObjectStepDetails.h"

namespace OpenAPI
{

/*
 * OpenAPIRunStepObject
 *
 * Represents a step in execution of a run. 
 */
class OPENAPI_API OpenAPIRunStepObject : public Model
{
public:
    virtual ~OpenAPIRunStepObject() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The identifier of the run step, which can be referenced in API endpoints. */
	FString Id;
	enum class ObjectEnum
	{
		ThreadRunStep,
  	};

	static FString EnumToString(const ObjectEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ObjectEnum& EnumValue);
	/* The object type, which is always `thread.run.step`. */
	ObjectEnum Object;
	/* The Unix timestamp (in seconds) for when the run step was created. */
	int32 CreatedAt = 0;
	/* The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. */
	FString AssistantId;
	/* The ID of the [thread](/docs/api-reference/threads) that was run. */
	FString ThreadId;
	/* The ID of the [run](/docs/api-reference/runs) that this run step is a part of. */
	FString RunId;
	enum class TypeEnum
	{
		MessageCreation,
		ToolCalls,
  	};

	static FString EnumToString(const TypeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, TypeEnum& EnumValue);
	/* The type of run step, which can be either `message_creation` or `tool_calls`. */
	TypeEnum Type;
	enum class StatusEnum
	{
		InProgress,
		Cancelled,
		Failed,
		Completed,
		Expired,
  	};

	static FString EnumToString(const StatusEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, StatusEnum& EnumValue);
	/* The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`. */
	StatusEnum Status;
	OpenAPIRunStepObjectStepDetails StepDetails;
	TOptional<OpenAPIRunStepObjectLastError> LastError;
	/* The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. */
	TOptional<int32> ExpiredAt;
	/* The Unix timestamp (in seconds) for when the run step was cancelled. */
	TOptional<int32> CancelledAt;
	/* The Unix timestamp (in seconds) for when the run step failed. */
	TOptional<int32> FailedAt;
	/* The Unix timestamp (in seconds) for when the run step completed. */
	TOptional<int32> CompletedAt;
	/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
	TOptional<TSharedPtr<FJsonObject>> Metadata;
	TOptional<OpenAPIRunStepCompletionUsage> Usage;
};

}
