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

#include "OpenAPIAssistantStreamEvent.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIAssistantStreamEvent::EventEnum& Value)
{
	switch (Value)
	{
	case OpenAPIAssistantStreamEvent::EventEnum::Done:
		return TEXT("done");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIAssistantStreamEvent::EventEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIAssistantStreamEvent::EnumToString(const OpenAPIAssistantStreamEvent::EventEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIAssistantStreamEvent::EventEnum& Value)
{
	static TMap<FString, OpenAPIAssistantStreamEvent::EventEnum> StringToEnum = { 
		{ TEXT("done"), OpenAPIAssistantStreamEvent::EventEnum::Done }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIAssistantStreamEvent::EnumFromString(const FString& EnumAsString, OpenAPIAssistantStreamEvent::EventEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIAssistantStreamEvent::EventEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIAssistantStreamEvent::EventEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

inline FString ToString(const OpenAPIAssistantStreamEvent::DataEnum& Value)
{
	switch (Value)
	{
	case OpenAPIAssistantStreamEvent::DataEnum::Done:
		return TEXT("[DONE]");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIAssistantStreamEvent::DataEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIAssistantStreamEvent::EnumToString(const OpenAPIAssistantStreamEvent::DataEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIAssistantStreamEvent::DataEnum& Value)
{
	static TMap<FString, OpenAPIAssistantStreamEvent::DataEnum> StringToEnum = { 
		{ TEXT("[DONE]"), OpenAPIAssistantStreamEvent::DataEnum::Done }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIAssistantStreamEvent::EnumFromString(const FString& EnumAsString, OpenAPIAssistantStreamEvent::DataEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIAssistantStreamEvent::DataEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIAssistantStreamEvent::DataEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIAssistantStreamEvent::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("event")); WriteJsonValue(Writer, Event);
	Writer->WriteIdentifierPrefix(TEXT("data")); WriteJsonValue(Writer, Data);
	Writer->WriteObjectEnd();
}

bool OpenAPIAssistantStreamEvent::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
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
