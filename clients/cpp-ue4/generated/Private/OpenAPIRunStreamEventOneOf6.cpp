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

#include "OpenAPIRunStreamEventOneOf6.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIRunStreamEventOneOf6::EventEnum& Value)
{
	switch (Value)
	{
	case OpenAPIRunStreamEventOneOf6::EventEnum::ThreadRunCancelling:
		return TEXT("thread.run.cancelling");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIRunStreamEventOneOf6::EventEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIRunStreamEventOneOf6::EnumToString(const OpenAPIRunStreamEventOneOf6::EventEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIRunStreamEventOneOf6::EventEnum& Value)
{
	static TMap<FString, OpenAPIRunStreamEventOneOf6::EventEnum> StringToEnum = { 
		{ TEXT("thread.run.cancelling"), OpenAPIRunStreamEventOneOf6::EventEnum::ThreadRunCancelling }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIRunStreamEventOneOf6::EnumFromString(const FString& EnumAsString, OpenAPIRunStreamEventOneOf6::EventEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIRunStreamEventOneOf6::EventEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIRunStreamEventOneOf6::EventEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIRunStreamEventOneOf6::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("event")); WriteJsonValue(Writer, Event);
	Writer->WriteIdentifierPrefix(TEXT("data")); WriteJsonValue(Writer, Data);
	Writer->WriteObjectEnd();
}

bool OpenAPIRunStreamEventOneOf6::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
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
