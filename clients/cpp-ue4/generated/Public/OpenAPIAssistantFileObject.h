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
 * OpenAPIAssistantFileObject
 *
 * A list of [Files](/docs/api-reference/files) attached to an &#x60;assistant&#x60;.
 */
class OPENAPI_API OpenAPIAssistantFileObject : public Model
{
public:
    virtual ~OpenAPIAssistantFileObject() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The identifier, which can be referenced in API endpoints. */
	FString Id;
	enum class ObjectEnum
	{
		AssistantFile,
  	};

	static FString EnumToString(const ObjectEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ObjectEnum& EnumValue);
	/* The object type, which is always `assistant.file`. */
	ObjectEnum Object;
	/* The Unix timestamp (in seconds) for when the assistant file was created. */
	int32 CreatedAt = 0;
	/* The assistant ID that the file is attached to. */
	FString AssistantId;
};

}