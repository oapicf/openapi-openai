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
#include "OpenAPIRunObject.h"

namespace OpenAPI
{

/*
 * OpenAPIRunStreamEventOneOf5
 *
 * Occurs when a [run](/docs/api-reference/runs/object) fails.
 */
class OPENAPI_API OpenAPIRunStreamEventOneOf5 : public Model
{
public:
    virtual ~OpenAPIRunStreamEventOneOf5() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class EventEnum
	{
		ThreadRunFailed,
  	};

	static FString EnumToString(const EventEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, EventEnum& EnumValue);
	EventEnum Event;
	OpenAPIRunObject Data;
};

}
