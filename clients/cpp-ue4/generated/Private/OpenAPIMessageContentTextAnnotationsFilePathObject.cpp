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

#include "OpenAPIMessageContentTextAnnotationsFilePathObject.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIMessageContentTextAnnotationsFilePathObject::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIMessageContentTextAnnotationsFilePathObject::TypeEnum::FilePath:
		return TEXT("file_path");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIMessageContentTextAnnotationsFilePathObject::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIMessageContentTextAnnotationsFilePathObject::EnumToString(const OpenAPIMessageContentTextAnnotationsFilePathObject::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIMessageContentTextAnnotationsFilePathObject::TypeEnum& Value)
{
	static TMap<FString, OpenAPIMessageContentTextAnnotationsFilePathObject::TypeEnum> StringToEnum = { 
		{ TEXT("file_path"), OpenAPIMessageContentTextAnnotationsFilePathObject::TypeEnum::FilePath }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIMessageContentTextAnnotationsFilePathObject::EnumFromString(const FString& EnumAsString, OpenAPIMessageContentTextAnnotationsFilePathObject::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIMessageContentTextAnnotationsFilePathObject::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIMessageContentTextAnnotationsFilePathObject::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIMessageContentTextAnnotationsFilePathObject::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	Writer->WriteIdentifierPrefix(TEXT("text")); WriteJsonValue(Writer, Text);
	Writer->WriteIdentifierPrefix(TEXT("file_path")); WriteJsonValue(Writer, FilePath);
	Writer->WriteIdentifierPrefix(TEXT("start_index")); WriteJsonValue(Writer, StartIndex);
	Writer->WriteIdentifierPrefix(TEXT("end_index")); WriteJsonValue(Writer, EndIndex);
	Writer->WriteObjectEnd();
}

bool OpenAPIMessageContentTextAnnotationsFilePathObject::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("text"), Text);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("file_path"), FilePath);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("start_index"), StartIndex);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("end_index"), EndIndex);

	return ParseSuccess;
}

}
