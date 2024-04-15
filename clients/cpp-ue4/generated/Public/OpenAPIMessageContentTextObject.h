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
#include "OpenAPIMessageContentTextObjectText.h"

namespace OpenAPI
{

/*
 * OpenAPIMessageContentTextObject
 *
 * The text content that is part of a message.
 */
class OPENAPI_API OpenAPIMessageContentTextObject : public Model
{
public:
    virtual ~OpenAPIMessageContentTextObject() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class TypeEnum
	{
		Text,
  	};

	static FString EnumToString(const TypeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, TypeEnum& EnumValue);
	/* Always `text`. */
	TypeEnum Type;
	OpenAPIMessageContentTextObjectText Text;
};

}