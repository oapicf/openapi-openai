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

#include "OpenAPIChatCompletionRole.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIChatCompletionRole::Values& Value)
{
	switch (Value)
	{
	case OpenAPIChatCompletionRole::Values::System:
		return TEXT("system");
	case OpenAPIChatCompletionRole::Values::User:
		return TEXT("user");
	case OpenAPIChatCompletionRole::Values::Assistant:
		return TEXT("assistant");
	case OpenAPIChatCompletionRole::Values::Tool:
		return TEXT("tool");
	case OpenAPIChatCompletionRole::Values::Function:
		return TEXT("function");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIChatCompletionRole::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIChatCompletionRole::EnumToString(const OpenAPIChatCompletionRole::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIChatCompletionRole::Values& Value)
{
	static TMap<FString, OpenAPIChatCompletionRole::Values> StringToEnum = { 
		{ TEXT("system"), OpenAPIChatCompletionRole::Values::System },
		{ TEXT("user"), OpenAPIChatCompletionRole::Values::User },
		{ TEXT("assistant"), OpenAPIChatCompletionRole::Values::Assistant },
		{ TEXT("tool"), OpenAPIChatCompletionRole::Values::Tool },
		{ TEXT("function"), OpenAPIChatCompletionRole::Values::Function }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIChatCompletionRole::EnumFromString(const FString& EnumAsString, OpenAPIChatCompletionRole::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIChatCompletionRole::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIChatCompletionRole::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIChatCompletionRole::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIChatCompletionRole::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
