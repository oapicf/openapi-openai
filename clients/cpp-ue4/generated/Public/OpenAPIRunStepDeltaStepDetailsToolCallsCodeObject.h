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
#include "OpenAPIRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.h"

namespace OpenAPI
{

/*
 * OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject
 *
 * Details of the Code Interpreter tool call the run step was involved in.
 */
class OPENAPI_API OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject : public Model
{
public:
    virtual ~OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The index of the tool call in the tool calls array. */
	int32 Index = 0;
	/* The ID of the tool call. */
	TOptional<FString> Id;
	enum class TypeEnum
	{
		CodeInterpreter,
  	};

	static FString EnumToString(const TypeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, TypeEnum& EnumValue);
	/* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
	TypeEnum Type;
	TOptional<OpenAPIRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter> CodeInterpreter;
};

}
