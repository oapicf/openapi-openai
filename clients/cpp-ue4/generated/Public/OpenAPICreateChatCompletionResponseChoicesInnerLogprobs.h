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
#include "OpenAPIChatCompletionTokenLogprob.h"

namespace OpenAPI
{

/*
 * OpenAPICreateChatCompletionResponseChoicesInnerLogprobs
 *
 * Log probability information for the choice.
 */
class OPENAPI_API OpenAPICreateChatCompletionResponseChoicesInnerLogprobs : public Model
{
public:
    virtual ~OpenAPICreateChatCompletionResponseChoicesInnerLogprobs() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* A list of message content tokens with log probability information. */
	TOptional<TArray<OpenAPIChatCompletionTokenLogprob>> Content;
};

}
