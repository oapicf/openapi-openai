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
#include "OpenAPIMessageObjectContentInner.h"
#include "OpenAPIMessageObjectIncompleteDetails.h"

namespace OpenAPI
{

/*
 * OpenAPIMessageObject
 *
 * Represents a message within a [thread](/docs/api-reference/threads).
 */
class OPENAPI_API OpenAPIMessageObject : public Model
{
public:
    virtual ~OpenAPIMessageObject() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The identifier, which can be referenced in API endpoints. */
	FString Id;
	enum class ObjectEnum
	{
		ThreadMessage,
  	};

	static FString EnumToString(const ObjectEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ObjectEnum& EnumValue);
	/* The object type, which is always `thread.message`. */
	ObjectEnum Object;
	/* The Unix timestamp (in seconds) for when the message was created. */
	int32 CreatedAt = 0;
	/* The [thread](/docs/api-reference/threads) ID that this message belongs to. */
	FString ThreadId;
	enum class StatusEnum
	{
		InProgress,
		Incomplete,
		Completed,
  	};

	static FString EnumToString(const StatusEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, StatusEnum& EnumValue);
	/* The status of the message, which can be either `in_progress`, `incomplete`, or `completed`. */
	StatusEnum Status;
	OpenAPIMessageObjectIncompleteDetails IncompleteDetails;
	/* The Unix timestamp (in seconds) for when the message was completed. */
	int32 CompletedAt = 0;
	/* The Unix timestamp (in seconds) for when the message was marked as incomplete. */
	int32 IncompleteAt = 0;
	enum class RoleEnum
	{
		User,
		Assistant,
  	};

	static FString EnumToString(const RoleEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, RoleEnum& EnumValue);
	/* The entity that produced the message. One of `user` or `assistant`. */
	RoleEnum Role;
	/* The content of the message in array of text and/or images. */
	TArray<OpenAPIMessageObjectContentInner> Content;
	/* If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. */
	FString AssistantId;
	/* The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints. */
	FString RunId;
	/* A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. */
	TArray<FString> FileIds;
	/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
	TSharedPtr<FJsonObject> Metadata;
};

}
