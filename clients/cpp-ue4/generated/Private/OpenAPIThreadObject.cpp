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

#include "OpenAPIThreadObject.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIThreadObject::ObjectEnum& Value)
{
	switch (Value)
	{
	case OpenAPIThreadObject::ObjectEnum::Thread:
		return TEXT("thread");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIThreadObject::ObjectEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIThreadObject::EnumToString(const OpenAPIThreadObject::ObjectEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIThreadObject::ObjectEnum& Value)
{
	static TMap<FString, OpenAPIThreadObject::ObjectEnum> StringToEnum = { 
		{ TEXT("thread"), OpenAPIThreadObject::ObjectEnum::Thread }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIThreadObject::EnumFromString(const FString& EnumAsString, OpenAPIThreadObject::ObjectEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIThreadObject::ObjectEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIThreadObject::ObjectEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIThreadObject::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id);
	Writer->WriteIdentifierPrefix(TEXT("object")); WriteJsonValue(Writer, Object);
	Writer->WriteIdentifierPrefix(TEXT("created_at")); WriteJsonValue(Writer, CreatedAt);
	Writer->WriteIdentifierPrefix(TEXT("metadata")); WriteJsonValue(Writer, Metadata);
	Writer->WriteObjectEnd();
}

bool OpenAPIThreadObject::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("object"), Object);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("created_at"), CreatedAt);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("metadata"), Metadata);

	return ParseSuccess;
}

}
