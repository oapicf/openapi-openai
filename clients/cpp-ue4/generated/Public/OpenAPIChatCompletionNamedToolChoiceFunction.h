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
 * OpenAPIChatCompletionNamedToolChoiceFunction
 *
 * 
 */
class OPENAPI_API OpenAPIChatCompletionNamedToolChoiceFunction : public Model
{
public:
    virtual ~OpenAPIChatCompletionNamedToolChoiceFunction() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The name of the function to call. */
	FString Name;
};

}
