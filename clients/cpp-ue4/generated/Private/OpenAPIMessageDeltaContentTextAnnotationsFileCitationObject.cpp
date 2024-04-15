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

#include "OpenAPIMessageDeltaContentTextAnnotationsFileCitationObject.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIMessageDeltaContentTextAnnotationsFileCitationObject::TypeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIMessageDeltaContentTextAnnotationsFileCitationObject::TypeEnum::FileCitation:
		return TEXT("file_citation");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIMessageDeltaContentTextAnnotationsFileCitationObject::TypeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIMessageDeltaContentTextAnnotationsFileCitationObject::EnumToString(const OpenAPIMessageDeltaContentTextAnnotationsFileCitationObject::TypeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIMessageDeltaContentTextAnnotationsFileCitationObject::TypeEnum& Value)
{
	static TMap<FString, OpenAPIMessageDeltaContentTextAnnotationsFileCitationObject::TypeEnum> StringToEnum = { 
		{ TEXT("file_citation"), OpenAPIMessageDeltaContentTextAnnotationsFileCitationObject::TypeEnum::FileCitation }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIMessageDeltaContentTextAnnotationsFileCitationObject::EnumFromString(const FString& EnumAsString, OpenAPIMessageDeltaContentTextAnnotationsFileCitationObject::TypeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIMessageDeltaContentTextAnnotationsFileCitationObject::TypeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIMessageDeltaContentTextAnnotationsFileCitationObject::TypeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIMessageDeltaContentTextAnnotationsFileCitationObject::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("index")); WriteJsonValue(Writer, Index);
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	if (Text.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("text")); WriteJsonValue(Writer, Text.GetValue());
	}
	if (FileCitation.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("file_citation")); WriteJsonValue(Writer, FileCitation.GetValue());
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

bool OpenAPIMessageDeltaContentTextAnnotationsFileCitationObject::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("index"), Index);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("text"), Text);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("file_citation"), FileCitation);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("start_index"), StartIndex);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("end_index"), EndIndex);

	return ParseSuccess;
}

}