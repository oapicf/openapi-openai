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

#include "OpenAPIChatCompletionStreamResponseDelta.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIChatCompletionStreamResponseDelta::RoleEnum& Value)
{
	switch (Value)
	{
	case OpenAPIChatCompletionStreamResponseDelta::RoleEnum::System:
		return TEXT("system");
	case OpenAPIChatCompletionStreamResponseDelta::RoleEnum::User:
		return TEXT("user");
	case OpenAPIChatCompletionStreamResponseDelta::RoleEnum::Assistant:
		return TEXT("assistant");
	case OpenAPIChatCompletionStreamResponseDelta::RoleEnum::Tool:
		return TEXT("tool");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIChatCompletionStreamResponseDelta::RoleEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIChatCompletionStreamResponseDelta::EnumToString(const OpenAPIChatCompletionStreamResponseDelta::RoleEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIChatCompletionStreamResponseDelta::RoleEnum& Value)
{
	static TMap<FString, OpenAPIChatCompletionStreamResponseDelta::RoleEnum> StringToEnum = { 
		{ TEXT("system"), OpenAPIChatCompletionStreamResponseDelta::RoleEnum::System },
		{ TEXT("user"), OpenAPIChatCompletionStreamResponseDelta::RoleEnum::User },
		{ TEXT("assistant"), OpenAPIChatCompletionStreamResponseDelta::RoleEnum::Assistant },
		{ TEXT("tool"), OpenAPIChatCompletionStreamResponseDelta::RoleEnum::Tool }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIChatCompletionStreamResponseDelta::EnumFromString(const FString& EnumAsString, OpenAPIChatCompletionStreamResponseDelta::RoleEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIChatCompletionStreamResponseDelta::RoleEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIChatCompletionStreamResponseDelta::RoleEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIChatCompletionStreamResponseDelta::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Content.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("content")); WriteJsonValue(Writer, Content.GetValue());
	}
	if (FunctionCall.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("function_call")); WriteJsonValue(Writer, FunctionCall.GetValue());
	}
	if (ToolCalls.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("tool_calls")); WriteJsonValue(Writer, ToolCalls.GetValue());
	}
	if (Role.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("role")); WriteJsonValue(Writer, Role.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIChatCompletionStreamResponseDelta::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("content"), Content);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("function_call"), FunctionCall);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("tool_calls"), ToolCalls);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("role"), Role);

	return ParseSuccess;
}

}
