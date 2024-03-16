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
#include "OpenAPICreateCompletionResponseChoicesInnerLogprobs.h"

namespace OpenAPI
{

/*
 * OpenAPICreateEditResponseChoicesInner
 *
 * 
 */
class OPENAPI_API OpenAPICreateEditResponseChoicesInner : public Model
{
public:
    virtual ~OpenAPICreateEditResponseChoicesInner() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<FString> Text;
	TOptional<int32> Index;
	TOptional<OpenAPICreateCompletionResponseChoicesInnerLogprobs> Logprobs;
	enum class FinishReasonEnum
	{
		Stop,
		Length,
  	};

	static FString EnumToString(const FinishReasonEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, FinishReasonEnum& EnumValue);
	TOptional<FinishReasonEnum> FinishReason;
};

}
