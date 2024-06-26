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

#include "OpenAPIMessageContentTextObject.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIMessageContentTextObject::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIMessageContentTextObject::TypeEnum::Text:
		return TEXT("text");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIMessageContentTextObject::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIMessageContentTextObject::EnumToString(const OpenAPIMessageContentTextObject::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIMessageContentTextObject::TypeEnum& Value)
{
	static TMap<FString, OpenAPIMessageContentTextObject::TypeEnum> StringToEnum = { 
		{ TEXT("text"), OpenAPIMessageContentTextObject::TypeEnum::Text }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIMessageContentTextObject::EnumFromString(const FString& EnumAsString, OpenAPIMessageContentTextObject::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIMessageContentTextObject::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIMessageContentTextObject::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIMessageContentTextObject::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	Writer->WriteIdentifierPrefix(TEXT("text")); WriteJsonValue(Writer, Text);
	Writer->WriteObjectEnd();
}

bool OpenAPIMessageContentTextObject::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("text"), Text);

	return ParseSuccess;
}

}
