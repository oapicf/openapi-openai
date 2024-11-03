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
 * OpenAPICreateMessageRequest
 *
 * 
 */
class OPENAPI_API OpenAPICreateMessageRequest : public Model
{
public:
    virtual ~OpenAPICreateMessageRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class RoleEnum
	{
		User,
		Assistant,
  	};

	static FString EnumToString(const RoleEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, RoleEnum& EnumValue);
	/* The role of the entity that is creating the message. Allowed values include: - `user`: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - `assistant`: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation.  */
	RoleEnum Role;
	/* The content of the message. */
	FString Content;
	/* A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like `retrieval` and `code_interpreter` that can access and use files. */
	TOptional<TArray<FString>> FileIds;
	/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
	TOptional<TSharedPtr<FJsonObject>> Metadata;
};

}
