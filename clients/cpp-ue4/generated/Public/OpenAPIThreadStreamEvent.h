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
#include "OpenAPIThreadObject.h"
#include "OpenAPIThreadStreamEventOneOf.h"

namespace OpenAPI
{

/*
 * OpenAPIThreadStreamEvent
 *
 * 
 */
class OPENAPI_API OpenAPIThreadStreamEvent : public Model
{
public:
    virtual ~OpenAPIThreadStreamEvent() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class EventEnum
	{
		ThreadCreated,
  	};

	static FString EnumToString(const EventEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, EventEnum& EnumValue);
	EventEnum Event;
	OpenAPIThreadObject Data;
};

}
