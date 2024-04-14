/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
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
 * OpenAPICreateCompletionResponseUsage
 *
 * 
 */
class OPENAPI_API OpenAPICreateCompletionResponseUsage : public Model
{
public:
    virtual ~OpenAPICreateCompletionResponseUsage() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	int32 PromptTokens = 0;
	int32 CompletionTokens = 0;
	int32 TotalTokens = 0;
};

}