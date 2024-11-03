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

#include "OpenAPIChatCompletionRequestUserMessage.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIChatCompletionRequestUserMessage::RoleEnum& Value)
{
	switch (Value)
	{
	case OpenAPIChatCompletionRequestUserMessage::RoleEnum::User:
		return TEXT("user");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIChatCompletionRequestUserMessage::RoleEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIChatCompletionRequestUserMessage::EnumToString(const OpenAPIChatCompletionRequestUserMessage::RoleEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIChatCompletionRequestUserMessage::RoleEnum& Value)
{
	static TMap<FString, OpenAPIChatCompletionRequestUserMessage::RoleEnum> StringToEnum = { 
		{ TEXT("user"), OpenAPIChatCompletionRequestUserMessage::RoleEnum::User }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIChatCompletionRequestUserMessage::EnumFromString(const FString& EnumAsString, OpenAPIChatCompletionRequestUserMessage::RoleEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIChatCompletionRequestUserMessage::RoleEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIChatCompletionRequestUserMessage::RoleEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIChatCompletionRequestUserMessage::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("content")); WriteJsonValue(Writer, Content);
	Writer->WriteIdentifierPrefix(TEXT("role")); WriteJsonValue(Writer, Role);
	if (Name.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIChatCompletionRequestUserMessage::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("content"), Content);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("role"), Role);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("name"), Name);

	return ParseSuccess;
}

}
