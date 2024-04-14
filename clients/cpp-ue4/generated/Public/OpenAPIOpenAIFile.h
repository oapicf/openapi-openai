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
 * OpenAPIOpenAIFile
 *
 * The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.
 */
class OPENAPI_API OpenAPIOpenAIFile : public Model
{
public:
    virtual ~OpenAPIOpenAIFile() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The file identifier, which can be referenced in the API endpoints. */
	FString Id;
	/* The size of the file, in bytes. */
	int32 Bytes = 0;
	/* The Unix timestamp (in seconds) for when the file was created. */
	int32 CreatedAt = 0;
	/* The name of the file. */
	FString Filename;
	enum class ObjectEnum
	{
		File,
  	};

	static FString EnumToString(const ObjectEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ObjectEnum& EnumValue);
	/* The object type, which is always `file`. */
	ObjectEnum Object;
	enum class PurposeEnum
	{
		FineTune,
		FineTuneResults,
		Assistants,
		AssistantsOutput,
  	};

	static FString EnumToString(const PurposeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, PurposeEnum& EnumValue);
	/* The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`. */
	PurposeEnum Purpose;
	enum class StatusEnum
	{
		Uploaded,
		Processed,
		Error,
  	};

	static FString EnumToString(const StatusEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, StatusEnum& EnumValue);
	/* Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`. */
	StatusEnum Status;
	/* Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`. */
	TOptional<FString> StatusDetails;
};

}
