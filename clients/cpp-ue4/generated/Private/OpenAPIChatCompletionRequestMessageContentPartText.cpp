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

#include "OpenAPIChatCompletionRequestMessageContentPartText.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIChatCompletionRequestMessageContentPartText::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIChatCompletionRequestMessageContentPartText::TypeEnum::Text:
		return TEXT("text");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIChatCompletionRequestMessageContentPartText::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIChatCompletionRequestMessageContentPartText::EnumToString(const OpenAPIChatCompletionRequestMessageContentPartText::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIChatCompletionRequestMessageContentPartText::TypeEnum& Value)
{
	static TMap<FString, OpenAPIChatCompletionRequestMessageContentPartText::TypeEnum> StringToEnum = { 
		{ TEXT("text"), OpenAPIChatCompletionRequestMessageContentPartText::TypeEnum::Text }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIChatCompletionRequestMessageContentPartText::EnumFromString(const FString& EnumAsString, OpenAPIChatCompletionRequestMessageContentPartText::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIChatCompletionRequestMessageContentPartText::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIChatCompletionRequestMessageContentPartText::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIChatCompletionRequestMessageContentPartText::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	Writer->WriteIdentifierPrefix(TEXT("text")); WriteJsonValue(Writer, Text);
	Writer->WriteObjectEnd();
}

bool OpenAPIChatCompletionRequestMessageContentPartText::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("text"), Text);

	return ParseSuccess;
}

}
