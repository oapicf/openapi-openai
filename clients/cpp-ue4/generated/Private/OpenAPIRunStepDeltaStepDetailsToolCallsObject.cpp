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

#include "OpenAPIRunStepDeltaStepDetailsToolCallsObject.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIRunStepDeltaStepDetailsToolCallsObject::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIRunStepDeltaStepDetailsToolCallsObject::TypeEnum::ToolCalls:
		return TEXT("tool_calls");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIRunStepDeltaStepDetailsToolCallsObject::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIRunStepDeltaStepDetailsToolCallsObject::EnumToString(const OpenAPIRunStepDeltaStepDetailsToolCallsObject::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIRunStepDeltaStepDetailsToolCallsObject::TypeEnum& Value)
{
	static TMap<FString, OpenAPIRunStepDeltaStepDetailsToolCallsObject::TypeEnum> StringToEnum = { 
		{ TEXT("tool_calls"), OpenAPIRunStepDeltaStepDetailsToolCallsObject::TypeEnum::ToolCalls }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIRunStepDeltaStepDetailsToolCallsObject::EnumFromString(const FString& EnumAsString, OpenAPIRunStepDeltaStepDetailsToolCallsObject::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIRunStepDeltaStepDetailsToolCallsObject::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIRunStepDeltaStepDetailsToolCallsObject::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIRunStepDeltaStepDetailsToolCallsObject::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	if (ToolCalls.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("tool_calls")); WriteJsonValue(Writer, ToolCalls.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIRunStepDeltaStepDetailsToolCallsObject::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("tool_calls"), ToolCalls);

	return ParseSuccess;
}

}