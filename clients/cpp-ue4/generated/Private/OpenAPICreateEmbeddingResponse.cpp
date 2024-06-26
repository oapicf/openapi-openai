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

#include "OpenAPICreateEmbeddingResponse.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPICreateEmbeddingResponse::ObjectEnum& Value)
{
	switch (Value)
	{
	case OpenAPICreateEmbeddingResponse::ObjectEnum::List:
		return TEXT("list");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPICreateEmbeddingResponse::ObjectEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPICreateEmbeddingResponse::EnumToString(const OpenAPICreateEmbeddingResponse::ObjectEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPICreateEmbeddingResponse::ObjectEnum& Value)
{
	static TMap<FString, OpenAPICreateEmbeddingResponse::ObjectEnum> StringToEnum = { 
		{ TEXT("list"), OpenAPICreateEmbeddingResponse::ObjectEnum::List }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPICreateEmbeddingResponse::EnumFromString(const FString& EnumAsString, OpenAPICreateEmbeddingResponse::ObjectEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPICreateEmbeddingResponse::ObjectEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPICreateEmbeddingResponse::ObjectEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPICreateEmbeddingResponse::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("data")); WriteJsonValue(Writer, Data);
	Writer->WriteIdentifierPrefix(TEXT("model")); WriteJsonValue(Writer, Model);
	Writer->WriteIdentifierPrefix(TEXT("object")); WriteJsonValue(Writer, Object);
	Writer->WriteIdentifierPrefix(TEXT("usage")); WriteJsonValue(Writer, Usage);
	Writer->WriteObjectEnd();
}

bool OpenAPICreateEmbeddingResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("data"), Data);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("model"), Model);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("object"), Object);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("usage"), Usage);

	return ParseSuccess;
}

}
