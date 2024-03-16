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

#include "OpenAPIChatCompletionResponseMessage.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIChatCompletionResponseMessage::RoleEnum& Value)
{
	switch (Value)
	{
	case OpenAPIChatCompletionResponseMessage::RoleEnum::System:
		return TEXT("system");
	case OpenAPIChatCompletionResponseMessage::RoleEnum::User:
		return TEXT("user");
	case OpenAPIChatCompletionResponseMessage::RoleEnum::Assistant:
		return TEXT("assistant");
	case OpenAPIChatCompletionResponseMessage::RoleEnum::Function:
		return TEXT("function");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIChatCompletionResponseMessage::RoleEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIChatCompletionResponseMessage::EnumToString(const OpenAPIChatCompletionResponseMessage::RoleEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIChatCompletionResponseMessage::RoleEnum& Value)
{
	static TMap<FString, OpenAPIChatCompletionResponseMessage::RoleEnum> StringToEnum = { 
		{ TEXT("system"), OpenAPIChatCompletionResponseMessage::RoleEnum::System },
		{ TEXT("user"), OpenAPIChatCompletionResponseMessage::RoleEnum::User },
		{ TEXT("assistant"), OpenAPIChatCompletionResponseMessage::RoleEnum::Assistant },
		{ TEXT("function"), OpenAPIChatCompletionResponseMessage::RoleEnum::Function }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIChatCompletionResponseMessage::EnumFromString(const FString& EnumAsString, OpenAPIChatCompletionResponseMessage::RoleEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIChatCompletionResponseMessage::RoleEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIChatCompletionResponseMessage::RoleEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIChatCompletionResponseMessage::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("role")); WriteJsonValue(Writer, Role);
	if (Content.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("content")); WriteJsonValue(Writer, Content.GetValue());
	}
	if (FunctionCall.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("function_call")); WriteJsonValue(Writer, FunctionCall.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIChatCompletionResponseMessage::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("role"), Role);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("content"), Content);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("function_call"), FunctionCall);

	return ParseSuccess;
}

}