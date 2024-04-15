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

#include "OpenAPIRunStepDetailsToolCallsFunctionObject.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIRunStepDetailsToolCallsFunctionObject::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIRunStepDetailsToolCallsFunctionObject::TypeEnum::Function:
		return TEXT("function");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIRunStepDetailsToolCallsFunctionObject::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIRunStepDetailsToolCallsFunctionObject::EnumToString(const OpenAPIRunStepDetailsToolCallsFunctionObject::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIRunStepDetailsToolCallsFunctionObject::TypeEnum& Value)
{
	static TMap<FString, OpenAPIRunStepDetailsToolCallsFunctionObject::TypeEnum> StringToEnum = { 
		{ TEXT("function"), OpenAPIRunStepDetailsToolCallsFunctionObject::TypeEnum::Function }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIRunStepDetailsToolCallsFunctionObject::EnumFromString(const FString& EnumAsString, OpenAPIRunStepDetailsToolCallsFunctionObject::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIRunStepDetailsToolCallsFunctionObject::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIRunStepDetailsToolCallsFunctionObject::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIRunStepDetailsToolCallsFunctionObject::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id);
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	Writer->WriteIdentifierPrefix(TEXT("function")); WriteJsonValue(Writer, Function);
	Writer->WriteObjectEnd();
}

bool OpenAPIRunStepDetailsToolCallsFunctionObject::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("function"), Function);

	return ParseSuccess;
}

}