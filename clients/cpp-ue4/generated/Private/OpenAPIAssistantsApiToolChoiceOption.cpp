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

#include "OpenAPIAssistantsApiToolChoiceOption.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIAssistantsApiToolChoiceOption::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIAssistantsApiToolChoiceOption::TypeEnum::Function:
		return TEXT("function");
	case OpenAPIAssistantsApiToolChoiceOption::TypeEnum::CodeInterpreter:
		return TEXT("code_interpreter");
	case OpenAPIAssistantsApiToolChoiceOption::TypeEnum::Retrieval:
		return TEXT("retrieval");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIAssistantsApiToolChoiceOption::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIAssistantsApiToolChoiceOption::EnumToString(const OpenAPIAssistantsApiToolChoiceOption::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIAssistantsApiToolChoiceOption::TypeEnum& Value)
{
	static TMap<FString, OpenAPIAssistantsApiToolChoiceOption::TypeEnum> StringToEnum = { 
		{ TEXT("function"), OpenAPIAssistantsApiToolChoiceOption::TypeEnum::Function },
		{ TEXT("code_interpreter"), OpenAPIAssistantsApiToolChoiceOption::TypeEnum::CodeInterpreter },
		{ TEXT("retrieval"), OpenAPIAssistantsApiToolChoiceOption::TypeEnum::Retrieval }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIAssistantsApiToolChoiceOption::EnumFromString(const FString& EnumAsString, OpenAPIAssistantsApiToolChoiceOption::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIAssistantsApiToolChoiceOption::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIAssistantsApiToolChoiceOption::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIAssistantsApiToolChoiceOption::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	if (Function.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("function")); WriteJsonValue(Writer, Function.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIAssistantsApiToolChoiceOption::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("function"), Function);

	return ParseSuccess;
}

}
