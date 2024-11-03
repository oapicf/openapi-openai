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

#include "OpenAPIAssistantObjectToolsInner.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIAssistantObjectToolsInner::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIAssistantObjectToolsInner::TypeEnum::CodeInterpreter:
		return TEXT("code_interpreter");
	case OpenAPIAssistantObjectToolsInner::TypeEnum::Retrieval:
		return TEXT("retrieval");
	case OpenAPIAssistantObjectToolsInner::TypeEnum::Function:
		return TEXT("function");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIAssistantObjectToolsInner::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIAssistantObjectToolsInner::EnumToString(const OpenAPIAssistantObjectToolsInner::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIAssistantObjectToolsInner::TypeEnum& Value)
{
	static TMap<FString, OpenAPIAssistantObjectToolsInner::TypeEnum> StringToEnum = { 
		{ TEXT("code_interpreter"), OpenAPIAssistantObjectToolsInner::TypeEnum::CodeInterpreter },
		{ TEXT("retrieval"), OpenAPIAssistantObjectToolsInner::TypeEnum::Retrieval },
		{ TEXT("function"), OpenAPIAssistantObjectToolsInner::TypeEnum::Function }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIAssistantObjectToolsInner::EnumFromString(const FString& EnumAsString, OpenAPIAssistantObjectToolsInner::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIAssistantObjectToolsInner::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIAssistantObjectToolsInner::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIAssistantObjectToolsInner::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	Writer->WriteIdentifierPrefix(TEXT("function")); WriteJsonValue(Writer, Function);
	Writer->WriteObjectEnd();
}

bool OpenAPIAssistantObjectToolsInner::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
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
