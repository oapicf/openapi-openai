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
#include "OpenAPIMessageDeltaObjectDeltaContentInner.h"

namespace OpenAPI
{

/*
 * OpenAPIMessageDeltaObjectDelta
 *
 * The delta containing the fields that have changed on the Message.
 */
class OPENAPI_API OpenAPIMessageDeltaObjectDelta : public Model
{
public:
    virtual ~OpenAPIMessageDeltaObjectDelta() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class RoleEnum
	{
		User,
		Assistant,
  	};

	static FString EnumToString(const RoleEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, RoleEnum& EnumValue);
	/* The entity that produced the message. One of `user` or `assistant`. */
	TOptional<RoleEnum> Role;
	/* The content of the message in array of text and/or images. */
	TOptional<TArray<OpenAPIMessageDeltaObjectDeltaContentInner>> Content;
	/* A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. */
	TOptional<TArray<FString>> FileIds;
};

}
