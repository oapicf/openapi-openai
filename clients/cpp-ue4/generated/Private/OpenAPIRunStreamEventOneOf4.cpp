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

#include "OpenAPIRunStreamEventOneOf4.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIRunStreamEventOneOf4::EventEnum& Value)
{
	switch (Value)
	{
	case OpenAPIRunStreamEventOneOf4::EventEnum::ThreadRunCompleted:
		return TEXT("thread.run.completed");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIRunStreamEventOneOf4::EventEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIRunStreamEventOneOf4::EnumToString(const OpenAPIRunStreamEventOneOf4::EventEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIRunStreamEventOneOf4::EventEnum& Value)
{
	static TMap<FString, OpenAPIRunStreamEventOneOf4::EventEnum> StringToEnum = { 
		{ TEXT("thread.run.completed"), OpenAPIRunStreamEventOneOf4::EventEnum::ThreadRunCompleted }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIRunStreamEventOneOf4::EnumFromString(const FString& EnumAsString, OpenAPIRunStreamEventOneOf4::EventEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIRunStreamEventOneOf4::EventEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIRunStreamEventOneOf4::EventEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIRunStreamEventOneOf4::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("event")); WriteJsonValue(Writer, Event);
	Writer->WriteIdentifierPrefix(TEXT("data")); WriteJsonValue(Writer, Data);
	Writer->WriteObjectEnd();
}

bool OpenAPIRunStreamEventOneOf4::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
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
