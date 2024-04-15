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

#include "OpenAPICreateChatCompletionResponseChoicesInner.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum& Value)
{
	switch (Value)
	{
	case OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum::Stop:
		return TEXT("stop");
	case OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum::Length:
		return TEXT("length");
	case OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum::ToolCalls:
		return TEXT("tool_calls");
	case OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum::ContentFilter:
		return TEXT("content_filter");
	case OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum::FunctionCall:
		return TEXT("function_call");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPICreateChatCompletionResponseChoicesInner::EnumToString(const OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum& Value)
{
	static TMap<FString, OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum> StringToEnum = { 
		{ TEXT("stop"), OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum::Stop },
		{ TEXT("length"), OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum::Length },
		{ TEXT("tool_calls"), OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum::ToolCalls },
		{ TEXT("content_filter"), OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum::ContentFilter },
		{ TEXT("function_call"), OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum::FunctionCall }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPICreateChatCompletionResponseChoicesInner::EnumFromString(const FString& EnumAsString, OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPICreateChatCompletionResponseChoicesInner::FinishReasonEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPICreateChatCompletionResponseChoicesInner::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("finish_reason")); WriteJsonValue(Writer, FinishReason);
	Writer->WriteIdentifierPrefix(TEXT("index")); WriteJsonValue(Writer, Index);
	Writer->WriteIdentifierPrefix(TEXT("message")); WriteJsonValue(Writer, Message);
	Writer->WriteIdentifierPrefix(TEXT("logprobs")); WriteJsonValue(Writer, Logprobs);
	Writer->WriteObjectEnd();
}

bool OpenAPICreateChatCompletionResponseChoicesInner::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("finish_reason"), FinishReason);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("index"), Index);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("message"), Message);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("logprobs"), Logprobs);

	return ParseSuccess;
}

}