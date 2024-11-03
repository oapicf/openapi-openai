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

#include "OpenAPIChatCompletionRequestMessage.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIChatCompletionRequestMessage::RoleEnum& Value)
{
	switch (Value)
	{
	case OpenAPIChatCompletionRequestMessage::RoleEnum::Function:
		return TEXT("function");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIChatCompletionRequestMessage::RoleEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIChatCompletionRequestMessage::EnumToString(const OpenAPIChatCompletionRequestMessage::RoleEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIChatCompletionRequestMessage::RoleEnum& Value)
{
	static TMap<FString, OpenAPIChatCompletionRequestMessage::RoleEnum> StringToEnum = { 
		{ TEXT("function"), OpenAPIChatCompletionRequestMessage::RoleEnum::Function }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIChatCompletionRequestMessage::EnumFromString(const FString& EnumAsString, OpenAPIChatCompletionRequestMessage::RoleEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIChatCompletionRequestMessage::RoleEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIChatCompletionRequestMessage::RoleEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIChatCompletionRequestMessage::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Content.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("content")); WriteJsonValue(Writer, Content.GetValue());
	}
	Writer->WriteIdentifierPrefix(TEXT("role")); WriteJsonValue(Writer, Role);
	Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name);
	if (ToolCalls.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("tool_calls")); WriteJsonValue(Writer, ToolCalls.GetValue());
	}
	if (FunctionCall.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("function_call")); WriteJsonValue(Writer, FunctionCall.GetValue());
	}
	Writer->WriteIdentifierPrefix(TEXT("tool_call_id")); WriteJsonValue(Writer, ToolCallId);
	Writer->WriteObjectEnd();
}

bool OpenAPIChatCompletionRequestMessage::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("content"), Content);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("role"), Role);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("name"), Name);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("tool_calls"), ToolCalls);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("function_call"), FunctionCall);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("tool_call_id"), ToolCallId);

	return ParseSuccess;
}

}
