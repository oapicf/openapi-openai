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
 * OpenAPIChatCompletionMessageToolCallChunkFunction
 *
 * 
 */
class OPENAPI_API OpenAPIChatCompletionMessageToolCallChunkFunction : public Model
{
public:
    virtual ~OpenAPIChatCompletionMessageToolCallChunkFunction() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The name of the function to call. */
	TOptional<FString> Name;
	/* The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function. */
	TOptional<FString> Arguments;
};

}
