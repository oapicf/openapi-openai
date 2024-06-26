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
#include "OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreter.h"

namespace OpenAPI
{

/*
 * OpenAPIRunStepDetailsToolCallsCodeObject
 *
 * Details of the Code Interpreter tool call the run step was involved in.
 */
class OPENAPI_API OpenAPIRunStepDetailsToolCallsCodeObject : public Model
{
public:
    virtual ~OpenAPIRunStepDetailsToolCallsCodeObject() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The ID of the tool call. */
	FString Id;
	enum class TypeEnum
	{
		CodeInterpreter,
  	};

	static FString EnumToString(const TypeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, TypeEnum& EnumValue);
	/* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
	TypeEnum Type;
	OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreter CodeInterpreter;
};

}
