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
#include "OpenAPIRunStepDetailsToolCallsObjectToolCallsInner.h"

namespace OpenAPI
{

/*
 * OpenAPIRunStepDetailsToolCallsObject
 *
 * Details of the tool call.
 */
class OPENAPI_API OpenAPIRunStepDetailsToolCallsObject : public Model
{
public:
    virtual ~OpenAPIRunStepDetailsToolCallsObject() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class TypeEnum
	{
		ToolCalls,
  	};

	static FString EnumToString(const TypeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, TypeEnum& EnumValue);
	/* Always `tool_calls`. */
	TypeEnum Type;
	/* An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.  */
	TArray<OpenAPIRunStepDetailsToolCallsObjectToolCallsInner> ToolCalls;
};

}
