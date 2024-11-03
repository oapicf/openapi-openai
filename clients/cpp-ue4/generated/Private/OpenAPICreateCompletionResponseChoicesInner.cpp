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

#include "OpenAPICreateCompletionResponseChoicesInner.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPICreateCompletionResponseChoicesInner::FinishReasonEnum& Value)
{
	switch (Value)
	{
	case OpenAPICreateCompletionResponseChoicesInner::FinishReasonEnum::Stop:
		return TEXT("stop");
	case OpenAPICreateCompletionResponseChoicesInner::FinishReasonEnum::Length:
		return TEXT("length");
	case OpenAPICreateCompletionResponseChoicesInner::FinishReasonEnum::ContentFilter:
		return TEXT("content_filter");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPICreateCompletionResponseChoicesInner::FinishReasonEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPICreateCompletionResponseChoicesInner::EnumToString(const OpenAPICreateCompletionResponseChoicesInner::FinishReasonEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPICreateCompletionResponseChoicesInner::FinishReasonEnum& Value)
{
	static TMap<FString, OpenAPICreateCompletionResponseChoicesInner::FinishReasonEnum> StringToEnum = { 
		{ TEXT("stop"), OpenAPICreateCompletionResponseChoicesInner::FinishReasonEnum::Stop },
		{ TEXT("length"), OpenAPICreateCompletionResponseChoicesInner::FinishReasonEnum::Length },
		{ TEXT("content_filter"), OpenAPICreateCompletionResponseChoicesInner::FinishReasonEnum::ContentFilter }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPICreateCompletionResponseChoicesInner::EnumFromString(const FString& EnumAsString, OpenAPICreateCompletionResponseChoicesInner::FinishReasonEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPICreateCompletionResponseChoicesInner::FinishReasonEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPICreateCompletionResponseChoicesInner::FinishReasonEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPICreateCompletionResponseChoicesInner::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("finish_reason")); WriteJsonValue(Writer, FinishReason);
	Writer->WriteIdentifierPrefix(TEXT("index")); WriteJsonValue(Writer, Index);
	if (Logprobs.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("logprobs")); WriteJsonValue(Writer, Logprobs.GetValue());
	}
	Writer->WriteIdentifierPrefix(TEXT("text")); WriteJsonValue(Writer, Text);
	Writer->WriteObjectEnd();
}

bool OpenAPICreateCompletionResponseChoicesInner::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("finish_reason"), FinishReason);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("index"), Index);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("logprobs"), Logprobs);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("text"), Text);

	return ParseSuccess;
}

}
