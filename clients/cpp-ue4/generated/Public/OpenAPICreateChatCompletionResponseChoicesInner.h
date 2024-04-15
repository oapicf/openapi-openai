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
#include "OpenAPIChatCompletionResponseMessage.h"
#include "OpenAPICreateChatCompletionResponseChoicesInnerLogprobs.h"

namespace OpenAPI
{

/*
 * OpenAPICreateChatCompletionResponseChoicesInner
 *
 * 
 */
class OPENAPI_API OpenAPICreateChatCompletionResponseChoicesInner : public Model
{
public:
    virtual ~OpenAPICreateChatCompletionResponseChoicesInner() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class FinishReasonEnum
	{
		Stop,
		Length,
		ToolCalls,
		ContentFilter,
		FunctionCall,
  	};

	static FString EnumToString(const FinishReasonEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, FinishReasonEnum& EnumValue);
	/* The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.  */
	FinishReasonEnum FinishReason;
	/* The index of the choice in the list of choices. */
	int32 Index = 0;
	OpenAPIChatCompletionResponseMessage Message;
	OpenAPICreateChatCompletionResponseChoicesInnerLogprobs Logprobs;
};

}