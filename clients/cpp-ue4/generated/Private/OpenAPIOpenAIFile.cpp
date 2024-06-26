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

#include "OpenAPIOpenAIFile.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIOpenAIFile::ObjectEnum& Value)
{
	switch (Value)
	{
	case OpenAPIOpenAIFile::ObjectEnum::File:
		return TEXT("file");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIOpenAIFile::ObjectEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIOpenAIFile::EnumToString(const OpenAPIOpenAIFile::ObjectEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIOpenAIFile::ObjectEnum& Value)
{
	static TMap<FString, OpenAPIOpenAIFile::ObjectEnum> StringToEnum = { 
		{ TEXT("file"), OpenAPIOpenAIFile::ObjectEnum::File }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIOpenAIFile::EnumFromString(const FString& EnumAsString, OpenAPIOpenAIFile::ObjectEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIOpenAIFile::ObjectEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIOpenAIFile::ObjectEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

inline FString ToString(const OpenAPIOpenAIFile::PurposeEnum& Value)
{
	switch (Value)
	{
	case OpenAPIOpenAIFile::PurposeEnum::FineTune:
		return TEXT("fine-tune");
	case OpenAPIOpenAIFile::PurposeEnum::FineTuneResults:
		return TEXT("fine-tune-results");
	case OpenAPIOpenAIFile::PurposeEnum::Assistants:
		return TEXT("assistants");
	case OpenAPIOpenAIFile::PurposeEnum::AssistantsOutput:
		return TEXT("assistants_output");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIOpenAIFile::PurposeEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIOpenAIFile::EnumToString(const OpenAPIOpenAIFile::PurposeEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIOpenAIFile::PurposeEnum& Value)
{
	static TMap<FString, OpenAPIOpenAIFile::PurposeEnum> StringToEnum = { 
		{ TEXT("fine-tune"), OpenAPIOpenAIFile::PurposeEnum::FineTune },
		{ TEXT("fine-tune-results"), OpenAPIOpenAIFile::PurposeEnum::FineTuneResults },
		{ TEXT("assistants"), OpenAPIOpenAIFile::PurposeEnum::Assistants },
		{ TEXT("assistants_output"), OpenAPIOpenAIFile::PurposeEnum::AssistantsOutput }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIOpenAIFile::EnumFromString(const FString& EnumAsString, OpenAPIOpenAIFile::PurposeEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIOpenAIFile::PurposeEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIOpenAIFile::PurposeEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

inline FString ToString(const OpenAPIOpenAIFile::StatusEnum& Value)
{
	switch (Value)
	{
	case OpenAPIOpenAIFile::StatusEnum::Uploaded:
		return TEXT("uploaded");
	case OpenAPIOpenAIFile::StatusEnum::Processed:
		return TEXT("processed");
	case OpenAPIOpenAIFile::StatusEnum::Error:
		return TEXT("error");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIOpenAIFile::StatusEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIOpenAIFile::EnumToString(const OpenAPIOpenAIFile::StatusEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIOpenAIFile::StatusEnum& Value)
{
	static TMap<FString, OpenAPIOpenAIFile::StatusEnum> StringToEnum = { 
		{ TEXT("uploaded"), OpenAPIOpenAIFile::StatusEnum::Uploaded },
		{ TEXT("processed"), OpenAPIOpenAIFile::StatusEnum::Processed },
		{ TEXT("error"), OpenAPIOpenAIFile::StatusEnum::Error }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIOpenAIFile::EnumFromString(const FString& EnumAsString, OpenAPIOpenAIFile::StatusEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIOpenAIFile::StatusEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIOpenAIFile::StatusEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIOpenAIFile::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id);
	Writer->WriteIdentifierPrefix(TEXT("bytes")); WriteJsonValue(Writer, Bytes);
	Writer->WriteIdentifierPrefix(TEXT("created_at")); WriteJsonValue(Writer, CreatedAt);
	Writer->WriteIdentifierPrefix(TEXT("filename")); WriteJsonValue(Writer, Filename);
	Writer->WriteIdentifierPrefix(TEXT("object")); WriteJsonValue(Writer, Object);
	Writer->WriteIdentifierPrefix(TEXT("purpose")); WriteJsonValue(Writer, Purpose);
	Writer->WriteIdentifierPrefix(TEXT("status")); WriteJsonValue(Writer, Status);
	if (StatusDetails.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("status_details")); WriteJsonValue(Writer, StatusDetails.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIOpenAIFile::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("bytes"), Bytes);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("created_at"), CreatedAt);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("filename"), Filename);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("object"), Object);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("purpose"), Purpose);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("status"), Status);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("status_details"), StatusDetails);

	return ParseSuccess;
}

}
