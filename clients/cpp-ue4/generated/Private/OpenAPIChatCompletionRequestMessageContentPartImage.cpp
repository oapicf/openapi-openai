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

#include "OpenAPIChatCompletionRequestMessageContentPartImage.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIChatCompletionRequestMessageContentPartImage::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIChatCompletionRequestMessageContentPartImage::TypeEnum::ImageUrl:
		return TEXT("image_url");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIChatCompletionRequestMessageContentPartImage::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIChatCompletionRequestMessageContentPartImage::EnumToString(const OpenAPIChatCompletionRequestMessageContentPartImage::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIChatCompletionRequestMessageContentPartImage::TypeEnum& Value)
{
	static TMap<FString, OpenAPIChatCompletionRequestMessageContentPartImage::TypeEnum> StringToEnum = { 
		{ TEXT("image_url"), OpenAPIChatCompletionRequestMessageContentPartImage::TypeEnum::ImageUrl }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIChatCompletionRequestMessageContentPartImage::EnumFromString(const FString& EnumAsString, OpenAPIChatCompletionRequestMessageContentPartImage::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIChatCompletionRequestMessageContentPartImage::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIChatCompletionRequestMessageContentPartImage::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIChatCompletionRequestMessageContentPartImage::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	Writer->WriteIdentifierPrefix(TEXT("image_url")); WriteJsonValue(Writer, ImageUrl);
	Writer->WriteObjectEnd();
}

bool OpenAPIChatCompletionRequestMessageContentPartImage::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("image_url"), ImageUrl);

	return ParseSuccess;
}

}