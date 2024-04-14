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
#include "OpenAPIRunStepObject.h"

namespace OpenAPI
{

/*
 * OpenAPIRunStepStreamEventOneOf4
 *
 * Occurs when a [run step](/docs/api-reference/runs/step-object) fails.
 */
class OPENAPI_API OpenAPIRunStepStreamEventOneOf4 : public Model
{
public:
    virtual ~OpenAPIRunStepStreamEventOneOf4() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class EventEnum
	{
		ThreadRunStepFailed,
  	};

	static FString EnumToString(const EventEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, EventEnum& EnumValue);
	EventEnum Event;
	OpenAPIRunStepObject Data;
};

}
