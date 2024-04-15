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

#include "OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::TypeEnum::Logs:
		return TEXT("logs");
	case OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::TypeEnum::Image:
		return TEXT("image");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::EnumToString(const OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::TypeEnum& Value)
{
	static TMap<FString, OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::TypeEnum> StringToEnum = { 
		{ TEXT("logs"), OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::TypeEnum::Logs },
		{ TEXT("image"), OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::TypeEnum::Image }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::EnumFromString(const FString& EnumAsString, OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	Writer->WriteIdentifierPrefix(TEXT("logs")); WriteJsonValue(Writer, Logs);
	Writer->WriteIdentifierPrefix(TEXT("image")); WriteJsonValue(Writer, Image);
	Writer->WriteObjectEnd();
}

bool OpenAPIRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("logs"), Logs);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("image"), Image);

	return ParseSuccess;
}

}