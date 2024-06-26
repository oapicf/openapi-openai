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
 * OpenAPIDeleteFileResponse
 *
 * 
 */
class OPENAPI_API OpenAPIDeleteFileResponse : public Model
{
public:
    virtual ~OpenAPIDeleteFileResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	FString Id;
	enum class ObjectEnum
	{
		File,
  	};

	static FString EnumToString(const ObjectEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, ObjectEnum& EnumValue);
	ObjectEnum Object;
	bool Deleted = false;
};

}
