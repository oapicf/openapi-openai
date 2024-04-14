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

#include "OpenAPIAssistantsApiNamedToolChoice.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIAssistantsApiNamedToolChoice::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIAssistantsApiNamedToolChoice::TypeEnum::Function:
		return TEXT("function");
	case OpenAPIAssistantsApiNamedToolChoice::TypeEnum::CodeInterpreter:
		return TEXT("code_interpreter");
	case OpenAPIAssistantsApiNamedToolChoice::TypeEnum::Retrieval:
		return TEXT("retrieval");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIAssistantsApiNamedToolChoice::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIAssistantsApiNamedToolChoice::EnumToString(const OpenAPIAssistantsApiNamedToolChoice::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIAssistantsApiNamedToolChoice::TypeEnum& Value)
{
	static TMap<FString, OpenAPIAssistantsApiNamedToolChoice::TypeEnum> StringToEnum = { 
		{ TEXT("function"), OpenAPIAssistantsApiNamedToolChoice::TypeEnum::Function },
		{ TEXT("code_interpreter"), OpenAPIAssistantsApiNamedToolChoice::TypeEnum::CodeInterpreter },
		{ TEXT("retrieval"), OpenAPIAssistantsApiNamedToolChoice::TypeEnum::Retrieval }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIAssistantsApiNamedToolChoice::EnumFromString(const FString& EnumAsString, OpenAPIAssistantsApiNamedToolChoice::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIAssistantsApiNamedToolChoice::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIAssistantsApiNamedToolChoice::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIAssistantsApiNamedToolChoice::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	if (Function.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("function")); WriteJsonValue(Writer, Function.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIAssistantsApiNamedToolChoice::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
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
