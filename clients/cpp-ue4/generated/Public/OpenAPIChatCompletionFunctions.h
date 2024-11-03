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
 * OpenAPIChatCompletionFunctions
 *
 * 
 */
class OPENAPI_API OpenAPIChatCompletionFunctions : public Model
{
public:
    virtual ~OpenAPIChatCompletionFunctions() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* A description of what the function does, used by the model to choose when and how to call the function. */
	TOptional<FString> Description;
	/* The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. */
	FString Name;
	/* The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list. */
	TOptional<TMap<FString, TSharedPtr<FJsonValue>>> Parameters;
};

}
