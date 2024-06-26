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

#include "OpenAPIRunStepDetailsToolCallsRetrievalObject.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIRunStepDetailsToolCallsRetrievalObject::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIRunStepDetailsToolCallsRetrievalObject::TypeEnum::Retrieval:
		return TEXT("retrieval");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIRunStepDetailsToolCallsRetrievalObject::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIRunStepDetailsToolCallsRetrievalObject::EnumToString(const OpenAPIRunStepDetailsToolCallsRetrievalObject::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIRunStepDetailsToolCallsRetrievalObject::TypeEnum& Value)
{
	static TMap<FString, OpenAPIRunStepDetailsToolCallsRetrievalObject::TypeEnum> StringToEnum = { 
		{ TEXT("retrieval"), OpenAPIRunStepDetailsToolCallsRetrievalObject::TypeEnum::Retrieval }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIRunStepDetailsToolCallsRetrievalObject::EnumFromString(const FString& EnumAsString, OpenAPIRunStepDetailsToolCallsRetrievalObject::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIRunStepDetailsToolCallsRetrievalObject::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIRunStepDetailsToolCallsRetrievalObject::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIRunStepDetailsToolCallsRetrievalObject::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id);
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	Writer->WriteIdentifierPrefix(TEXT("retrieval")); WriteJsonValue(Writer, Retrieval);
	Writer->WriteObjectEnd();
}

bool OpenAPIRunStepDetailsToolCallsRetrievalObject::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("retrieval"), Retrieval);

	return ParseSuccess;
}

}
