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
#include "OpenAPICreateChatCompletionResponseChoicesInner.h"
#include "OpenAPICreateCompletionResponseUsage.h"

namespace OpenAPI
{

/*
 * OpenAPICreateChatCompletionResponse
 *
 * 
 */
class OPENAPI_API OpenAPICreateChatCompletionResponse : public Model
{
public:
    virtual ~OpenAPICreateChatCompletionResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	FString Id;
	FString Object;
	int32 Created = 0;
	FString Model;
	TArray<OpenAPICreateChatCompletionResponseChoicesInner> Choices;
	TOptional<OpenAPICreateCompletionResponseUsage> Usage;
};

}