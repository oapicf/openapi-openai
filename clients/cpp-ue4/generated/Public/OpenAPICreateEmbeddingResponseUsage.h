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
 * OpenAPICreateEmbeddingResponseUsage
 *
 * The usage information for the request.
 */
class OPENAPI_API OpenAPICreateEmbeddingResponseUsage : public Model
{
public:
    virtual ~OpenAPICreateEmbeddingResponseUsage() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The number of tokens used by the prompt. */
	int32 PromptTokens = 0;
	/* The total number of tokens used by the request. */
	int32 TotalTokens = 0;
};

}