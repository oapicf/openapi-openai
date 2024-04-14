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
#include "OpenAPIMessageObject.h"

namespace OpenAPI
{

/*
 * OpenAPIMessageStreamEventOneOf1
 *
 * Occurs when a [message](/docs/api-reference/messages/object) moves to an &#x60;in_progress&#x60; state.
 */
class OPENAPI_API OpenAPIMessageStreamEventOneOf1 : public Model
{
public:
    virtual ~OpenAPIMessageStreamEventOneOf1() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class EventEnum
	{
		ThreadMessageInProgress,
  	};

	static FString EnumToString(const EventEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, EventEnum& EnumValue);
	EventEnum Event;
	OpenAPIMessageObject Data;
};

}
