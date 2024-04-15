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

#include "OpenAPIMessageStreamEventOneOf2.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIMessageStreamEventOneOf2::EventEnum& Value)
{
	switch (Value)
	{
	case OpenAPIMessageStreamEventOneOf2::EventEnum::ThreadMessageDelta:
		return TEXT("thread.message.delta");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIMessageStreamEventOneOf2::EventEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIMessageStreamEventOneOf2::EnumToString(const OpenAPIMessageStreamEventOneOf2::EventEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIMessageStreamEventOneOf2::EventEnum& Value)
{
	static TMap<FString, OpenAPIMessageStreamEventOneOf2::EventEnum> StringToEnum = { 
		{ TEXT("thread.message.delta"), OpenAPIMessageStreamEventOneOf2::EventEnum::ThreadMessageDelta }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIMessageStreamEventOneOf2::EnumFromString(const FString& EnumAsString, OpenAPIMessageStreamEventOneOf2::EventEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIMessageStreamEventOneOf2::EventEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIMessageStreamEventOneOf2::EventEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIMessageStreamEventOneOf2::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("event")); WriteJsonValue(Writer, Event);
	Writer->WriteIdentifierPrefix(TEXT("data")); WriteJsonValue(Writer, Data);
	Writer->WriteObjectEnd();
}

bool OpenAPIMessageStreamEventOneOf2::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
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