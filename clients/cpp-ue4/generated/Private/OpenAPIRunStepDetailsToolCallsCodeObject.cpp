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

#include "OpenAPIRunStepDetailsToolCallsCodeObject.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIRunStepDetailsToolCallsCodeObject::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIRunStepDetailsToolCallsCodeObject::TypeEnum::CodeInterpreter:
		return TEXT("code_interpreter");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIRunStepDetailsToolCallsCodeObject::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIRunStepDetailsToolCallsCodeObject::EnumToString(const OpenAPIRunStepDetailsToolCallsCodeObject::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIRunStepDetailsToolCallsCodeObject::TypeEnum& Value)
{
	static TMap<FString, OpenAPIRunStepDetailsToolCallsCodeObject::TypeEnum> StringToEnum = { 
		{ TEXT("code_interpreter"), OpenAPIRunStepDetailsToolCallsCodeObject::TypeEnum::CodeInterpreter }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIRunStepDetailsToolCallsCodeObject::EnumFromString(const FString& EnumAsString, OpenAPIRunStepDetailsToolCallsCodeObject::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIRunStepDetailsToolCallsCodeObject::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIRunStepDetailsToolCallsCodeObject::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIRunStepDetailsToolCallsCodeObject::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id);
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	Writer->WriteIdentifierPrefix(TEXT("code_interpreter")); WriteJsonValue(Writer, CodeInterpreter);
	Writer->WriteObjectEnd();
}

bool OpenAPIRunStepDetailsToolCallsCodeObject::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("code_interpreter"), CodeInterpreter);

	return ParseSuccess;
}

}