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

#include "OpenAPIModel.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIModel::ObjectEnum& Value)
{
	switch (Value)
	{
	case OpenAPIModel::ObjectEnum::Model:
		return TEXT("model");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIModel::ObjectEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIModel::EnumToString(const OpenAPIModel::ObjectEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIModel::ObjectEnum& Value)
{
	static TMap<FString, OpenAPIModel::ObjectEnum> StringToEnum = { 
		{ TEXT("model"), OpenAPIModel::ObjectEnum::Model }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIModel::EnumFromString(const FString& EnumAsString, OpenAPIModel::ObjectEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIModel::ObjectEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIModel::ObjectEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIModel::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id);
	Writer->WriteIdentifierPrefix(TEXT("created")); WriteJsonValue(Writer, Created);
	Writer->WriteIdentifierPrefix(TEXT("object")); WriteJsonValue(Writer, Object);
	Writer->WriteIdentifierPrefix(TEXT("owned_by")); WriteJsonValue(Writer, OwnedBy);
	Writer->WriteObjectEnd();
}

bool OpenAPIModel::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("created"), Created);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("object"), Object);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("owned_by"), OwnedBy);

	return ParseSuccess;
}

}
