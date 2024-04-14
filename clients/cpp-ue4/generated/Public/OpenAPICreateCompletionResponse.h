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
#include "OpenAPICreateCompletionResponseChoicesInner.h"
#include "OpenAPICreateCompletionResponseUsage.h"

namespace OpenAPI
{

/*
 * OpenAPICreateCompletionResponse
 *
 * 
 */
class OPENAPI_API OpenAPICreateCompletionResponse : public Model
{
public:
    virtual ~OpenAPICreateCompletionResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	FString Id;
	FString Object;
	int32 Created = 0;
	FString Model;
	TArray<OpenAPICreateCompletionResponseChoicesInner> Choices;
	TOptional<OpenAPICreateCompletionResponseUsage> Usage;
};

}