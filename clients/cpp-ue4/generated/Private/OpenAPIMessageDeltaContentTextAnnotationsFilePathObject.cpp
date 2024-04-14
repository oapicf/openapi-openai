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

#include "OpenAPIMessageDeltaContentTextAnnotationsFilePathObject.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIMessageDeltaContentTextAnnotationsFilePathObject::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIMessageDeltaContentTextAnnotationsFilePathObject::TypeEnum::FilePath:
		return TEXT("file_path");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIMessageDeltaContentTextAnnotationsFilePathObject::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIMessageDeltaContentTextAnnotationsFilePathObject::EnumToString(const OpenAPIMessageDeltaContentTextAnnotationsFilePathObject::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIMessageDeltaContentTextAnnotationsFilePathObject::TypeEnum& Value)
{
	static TMap<FString, OpenAPIMessageDeltaContentTextAnnotationsFilePathObject::TypeEnum> StringToEnum = { 
		{ TEXT("file_path"), OpenAPIMessageDeltaContentTextAnnotationsFilePathObject::TypeEnum::FilePath }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIMessageDeltaContentTextAnnotationsFilePathObject::EnumFromString(const FString& EnumAsString, OpenAPIMessageDeltaContentTextAnnotationsFilePathObject::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIMessageDeltaContentTextAnnotationsFilePathObject::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIMessageDeltaContentTextAnnotationsFilePathObject::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIMessageDeltaContentTextAnnotationsFilePathObject::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("index")); WriteJsonValue(Writer, Index);
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	if (Text.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("text")); WriteJsonValue(Writer, Text.GetValue());
	}
	if (FilePath.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("file_path")); WriteJsonValue(Writer, FilePath.GetValue());
	}
	if (StartIndex.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("start_index")); WriteJsonValue(Writer, StartIndex.GetValue());
	}
	if (EndIndex.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("end_index")); WriteJsonValue(Writer, EndIndex.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIMessageDeltaContentTextAnnotationsFilePathObject::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("index"), Index);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("text"), Text);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("file_path"), FilePath);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("start_index"), StartIndex);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("end_index"), EndIndex);

	return ParseSuccess;
}

}
