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

#include "OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject::TypeEnum::CodeInterpreter:
		return TEXT("code_interpreter");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject::EnumToString(const OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject::TypeEnum& Value)
{
	static TMap<FString, OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject::TypeEnum> StringToEnum = { 
		{ TEXT("code_interpreter"), OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject::TypeEnum::CodeInterpreter }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject::EnumFromString(const FString& EnumAsString, OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("index")); WriteJsonValue(Writer, Index);
	if (Id.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id.GetValue());
	}
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	if (CodeInterpreter.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("code_interpreter")); WriteJsonValue(Writer, CodeInterpreter.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIRunStepDeltaStepDetailsToolCallsCodeObject::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("index"), Index);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("code_interpreter"), CodeInterpreter);

	return ParseSuccess;
}

}
