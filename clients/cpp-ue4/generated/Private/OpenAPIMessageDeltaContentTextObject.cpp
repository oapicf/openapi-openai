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

#include "OpenAPIMessageDeltaContentTextObject.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIMessageDeltaContentTextObject::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIMessageDeltaContentTextObject::TypeEnum::Text:
		return TEXT("text");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIMessageDeltaContentTextObject::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIMessageDeltaContentTextObject::EnumToString(const OpenAPIMessageDeltaContentTextObject::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIMessageDeltaContentTextObject::TypeEnum& Value)
{
	static TMap<FString, OpenAPIMessageDeltaContentTextObject::TypeEnum> StringToEnum = { 
		{ TEXT("text"), OpenAPIMessageDeltaContentTextObject::TypeEnum::Text }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIMessageDeltaContentTextObject::EnumFromString(const FString& EnumAsString, OpenAPIMessageDeltaContentTextObject::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIMessageDeltaContentTextObject::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIMessageDeltaContentTextObject::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIMessageDeltaContentTextObject::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("index")); WriteJsonValue(Writer, Index);
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	if (Text.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("text")); WriteJsonValue(Writer, Text.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIMessageDeltaContentTextObject::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("index"), Index);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("text"), Text);

	return ParseSuccess;
}

}
