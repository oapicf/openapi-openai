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
#include "OpenAPIMessageStreamEventOneOf.h"
#include "OpenAPIMessageStreamEventOneOf1.h"
#include "OpenAPIMessageStreamEventOneOf2.h"
#include "OpenAPIMessageStreamEventOneOf3.h"
#include "OpenAPIMessageStreamEventOneOf4.h"

namespace OpenAPI
{

/*
 * OpenAPIMessageStreamEvent
 *
 * 
 */
class OPENAPI_API OpenAPIMessageStreamEvent : public Model
{
public:
    virtual ~OpenAPIMessageStreamEvent() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class EventEnum
	{
		ThreadMessageIncomplete,
  	};

	static FString EnumToString(const EventEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, EventEnum& EnumValue);
	EventEnum Event;
	OpenAPIMessageObject Data;
};

}