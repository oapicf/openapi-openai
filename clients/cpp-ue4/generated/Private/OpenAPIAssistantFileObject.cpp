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

#include "OpenAPIAssistantFileObject.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIAssistantFileObject::ObjectEnum& Value)
{
	switch (Value)
	{
	case OpenAPIAssistantFileObject::ObjectEnum::AssistantFile:
		return TEXT("assistant.file");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIAssistantFileObject::ObjectEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIAssistantFileObject::EnumToString(const OpenAPIAssistantFileObject::ObjectEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIAssistantFileObject::ObjectEnum& Value)
{
	static TMap<FString, OpenAPIAssistantFileObject::ObjectEnum> StringToEnum = { 
		{ TEXT("assistant.file"), OpenAPIAssistantFileObject::ObjectEnum::AssistantFile }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIAssistantFileObject::EnumFromString(const FString& EnumAsString, OpenAPIAssistantFileObject::ObjectEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIAssistantFileObject::ObjectEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIAssistantFileObject::ObjectEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIAssistantFileObject::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id);
	Writer->WriteIdentifierPrefix(TEXT("object")); WriteJsonValue(Writer, Object);
	Writer->WriteIdentifierPrefix(TEXT("created_at")); WriteJsonValue(Writer, CreatedAt);
	Writer->WriteIdentifierPrefix(TEXT("assistant_id")); WriteJsonValue(Writer, AssistantId);
	Writer->WriteObjectEnd();
}

bool OpenAPIAssistantFileObject::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("object"), Object);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("created_at"), CreatedAt);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("assistant_id"), AssistantId);

	return ParseSuccess;
}

}
