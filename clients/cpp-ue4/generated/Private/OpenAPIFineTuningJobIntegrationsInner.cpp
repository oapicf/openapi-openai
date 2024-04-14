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

#include "OpenAPIFineTuningJobIntegrationsInner.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIFineTuningJobIntegrationsInner::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIFineTuningJobIntegrationsInner::TypeEnum::Wandb:
		return TEXT("wandb");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIFineTuningJobIntegrationsInner::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIFineTuningJobIntegrationsInner::EnumToString(const OpenAPIFineTuningJobIntegrationsInner::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIFineTuningJobIntegrationsInner::TypeEnum& Value)
{
	static TMap<FString, OpenAPIFineTuningJobIntegrationsInner::TypeEnum> StringToEnum = { 
		{ TEXT("wandb"), OpenAPIFineTuningJobIntegrationsInner::TypeEnum::Wandb }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIFineTuningJobIntegrationsInner::EnumFromString(const FString& EnumAsString, OpenAPIFineTuningJobIntegrationsInner::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIFineTuningJobIntegrationsInner::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIFineTuningJobIntegrationsInner::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIFineTuningJobIntegrationsInner::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	Writer->WriteIdentifierPrefix(TEXT("wandb")); WriteJsonValue(Writer, Wandb);
	Writer->WriteObjectEnd();
}

bool OpenAPIFineTuningJobIntegrationsInner::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("wandb"), Wandb);

	return ParseSuccess;
}

}
