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

namespace OpenAPI
{

/*
 * OpenAPIChatCompletionRequestToolMessage
 *
 * 
 */
class OPENAPI_API OpenAPIChatCompletionRequestToolMessage : public Model
{
public:
    virtual ~OpenAPIChatCompletionRequestToolMessage() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class RoleEnum
	{
		Tool,
  	};

	static FString EnumToString(const RoleEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, RoleEnum& EnumValue);
	/* The role of the messages author, in this case `tool`. */
	RoleEnum Role;
	/* The contents of the tool message. */
	FString Content;
	/* Tool call that this message is responding to. */
	FString ToolCallId;
};

}