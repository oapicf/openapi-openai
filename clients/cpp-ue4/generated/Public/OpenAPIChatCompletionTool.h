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
#include "OpenAPIFunctionObject.h"

namespace OpenAPI
{

/*
 * OpenAPIChatCompletionTool
 *
 * 
 */
class OPENAPI_API OpenAPIChatCompletionTool : public Model
{
public:
    virtual ~OpenAPIChatCompletionTool() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class TypeEnum
	{
		Function,
  	};

	static FString EnumToString(const TypeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, TypeEnum& EnumValue);
	/* The type of the tool. Currently, only `function` is supported. */
	TypeEnum Type;
	OpenAPIFunctionObject Function;
};

}
