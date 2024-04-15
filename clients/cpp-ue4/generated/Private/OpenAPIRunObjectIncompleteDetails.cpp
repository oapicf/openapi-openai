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

#include "OpenAPIRunObjectIncompleteDetails.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIRunObjectIncompleteDetails::ReasonEnum& Value)
{
	switch (Value)
	{
	case OpenAPIRunObjectIncompleteDetails::ReasonEnum::CompletionTokens:
		return TEXT("max_completion_tokens");
	case OpenAPIRunObjectIncompleteDetails::ReasonEnum::PromptTokens:
		return TEXT("max_prompt_tokens");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIRunObjectIncompleteDetails::ReasonEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIRunObjectIncompleteDetails::EnumToString(const OpenAPIRunObjectIncompleteDetails::ReasonEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIRunObjectIncompleteDetails::ReasonEnum& Value)
{
	static TMap<FString, OpenAPIRunObjectIncompleteDetails::ReasonEnum> StringToEnum = { 
		{ TEXT("max_completion_tokens"), OpenAPIRunObjectIncompleteDetails::ReasonEnum::CompletionTokens },
		{ TEXT("max_prompt_tokens"), OpenAPIRunObjectIncompleteDetails::ReasonEnum::PromptTokens }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIRunObjectIncompleteDetails::EnumFromString(const FString& EnumAsString, OpenAPIRunObjectIncompleteDetails::ReasonEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIRunObjectIncompleteDetails::ReasonEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIRunObjectIncompleteDetails::ReasonEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIRunObjectIncompleteDetails::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Reason.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("reason")); WriteJsonValue(Writer, Reason.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIRunObjectIncompleteDetails::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("reason"), Reason);

	return ParseSuccess;
}

}