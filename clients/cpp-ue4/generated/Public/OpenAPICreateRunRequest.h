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
#include "OpenAPIAssistantObjectToolsInner.h"
#include "OpenAPIAssistantsApiResponseFormatOption.h"
#include "OpenAPIAssistantsApiToolChoiceOption.h"
#include "OpenAPICreateMessageRequest.h"
#include "OpenAPICreateRunRequestModel.h"
#include "OpenAPITruncationObject.h"

namespace OpenAPI
{

/*
 * OpenAPICreateRunRequest
 *
 * 
 */
class OPENAPI_API OpenAPICreateRunRequest : public Model
{
public:
    virtual ~OpenAPICreateRunRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. */
	FString AssistantId;
	TOptional<OpenAPICreateRunRequestModel> Model;
	/* Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis. */
	TOptional<FString> Instructions;
	/* Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions. */
	TOptional<FString> AdditionalInstructions;
	/* Adds additional messages to the thread before creating the run. */
	TOptional<TArray<OpenAPICreateMessageRequest>> AdditionalMessages;
	/* Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. */
	TOptional<TArray<OpenAPIAssistantObjectToolsInner>> Tools;
	/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
	TOptional<TSharedPtr<FJsonObject>> Metadata;
	/* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  */
	TOptional<double> Temperature;
	/* If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.  */
	TOptional<bool> Stream;
	/* The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.  */
	TOptional<int32> MaxPromptTokens;
	/* The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.  */
	TOptional<int32> MaxCompletionTokens;
	TOptional<OpenAPITruncationObject> TruncationStrategy;
	TOptional<OpenAPIAssistantsApiToolChoiceOption> ToolChoice;
	TOptional<OpenAPIAssistantsApiResponseFormatOption> ResponseFormat;
};

}
