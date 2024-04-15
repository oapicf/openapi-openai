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

#include "OpenAPIRunStepStreamEventOneOf3.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIRunStepStreamEventOneOf3::EventEnum& Value)
{
	switch (Value)
	{
	case OpenAPIRunStepStreamEventOneOf3::EventEnum::ThreadRunStepCompleted:
		return TEXT("thread.run.step.completed");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIRunStepStreamEventOneOf3::EventEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIRunStepStreamEventOneOf3::EnumToString(const OpenAPIRunStepStreamEventOneOf3::EventEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIRunStepStreamEventOneOf3::EventEnum& Value)
{
	static TMap<FString, OpenAPIRunStepStreamEventOneOf3::EventEnum> StringToEnum = { 
		{ TEXT("thread.run.step.completed"), OpenAPIRunStepStreamEventOneOf3::EventEnum::ThreadRunStepCompleted }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIRunStepStreamEventOneOf3::EnumFromString(const FString& EnumAsString, OpenAPIRunStepStreamEventOneOf3::EventEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIRunStepStreamEventOneOf3::EventEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIRunStepStreamEventOneOf3::EventEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIRunStepStreamEventOneOf3::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("event")); WriteJsonValue(Writer, Event);
	Writer->WriteIdentifierPrefix(TEXT("data")); WriteJsonValue(Writer, Data);
	Writer->WriteObjectEnd();
}

bool OpenAPIRunStepStreamEventOneOf3::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("event"), Event);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("data"), Data);

	return ParseSuccess;
}

}