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
#include "OpenAPICompletionUsage.h"
#include "OpenAPICreateChatCompletionResponseChoicesInner.h"

namespace OpenAPI
{

/*
 * OpenAPICreateChatCompletionResponse
 *
 * Represents a chat completion response returned by model, based on the provided input.
 */
class OPENAPI_API OpenAPICreateChatCompletionResponse : public Model
{
public:
    virtual ~OpenAPICreateChatCompletionResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* A unique identifier for the chat completion. */
	FString Id;
	/* A list of chat completion choices. Can be more than one if `n` is greater than 1. */
	TArray<OpenAPICreateChatCompletionResponseChoicesInner> Choices;
	/* The Unix timestamp (in seconds) of when the chat completion was created. */
	int32 Created = 0;
	/* The model used for the chat completion. */
	FString Model;
	/* This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */
	TOptional<FString> SystemFingerprint;
	enum class ObjectEnum
	{
		ChatCompletion,
  	};

	static FString EnumToString(const ObjectEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ObjectEnum& EnumValue);
	/* The object type, which is always `chat.completion`. */
	ObjectEnum Object;
	TOptional<OpenAPICompletionUsage> Usage;
};

}