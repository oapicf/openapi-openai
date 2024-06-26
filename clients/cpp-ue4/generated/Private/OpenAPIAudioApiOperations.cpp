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

#include "OpenAPIAudioApiOperations.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace OpenAPI
{

FString OpenAPIAudioApi::CreateSpeechRequest::ComputePath() const
{
	FString Path(TEXT("/audio/speech"));
	return Path;
}

void OpenAPIAudioApi::CreateSpeechRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = { TEXT("application/json") };
	//static const TArray<FString> Produces = { TEXT("application/octet-stream") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
		// Body parameters
		FString JsonBody;
		JsonWriter Writer = TJsonWriterFactory<>::Create(&JsonBody);

		WriteJsonValue(Writer, OpenAPICreateSpeechRequest);
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPICreateSpeechRequest) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPICreateSpeechRequest) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIAudioApi::CreateSpeechResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("OK"));
		break;
	}
}

bool OpenAPIAudioApi::CreateSpeechResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

inline FString ToString(const OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum& Value)
{
	switch (Value)
	{
	case OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum::Json:
		return TEXT("json");
	case OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum::Text:
		return TEXT("text");
	case OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum::Srt:
		return TEXT("srt");
	case OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum::VerboseJson:
		return TEXT("verbose_json");
	case OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum::Vtt:
		return TEXT("vtt");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIAudioApi::CreateTranscriptionRequest::EnumToString(const OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum& Value)
{
	static TMap<FString, OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum> StringToEnum = { 
		{ TEXT("json"), OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum::Json },
		{ TEXT("text"), OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum::Text },
		{ TEXT("srt"), OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum::Srt },
		{ TEXT("verbose_json"), OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum::VerboseJson },
		{ TEXT("vtt"), OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum::Vtt }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIAudioApi::CreateTranscriptionRequest::EnumFromString(const FString& EnumAsString, OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIAudioApi::CreateTranscriptionRequest::ResponseFormatEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

inline FString ToString(const OpenAPIAudioApi::CreateTranscriptionRequest::TimestampGranularitiesEnum& Value)
{
	switch (Value)
	{
	case OpenAPIAudioApi::CreateTranscriptionRequest::TimestampGranularitiesEnum::Word:
		return TEXT("word");
	case OpenAPIAudioApi::CreateTranscriptionRequest::TimestampGranularitiesEnum::Segment:
		return TEXT("segment");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIAudioApi::CreateTranscriptionRequest::TimestampGranularitiesEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIAudioApi::CreateTranscriptionRequest::EnumToString(const OpenAPIAudioApi::CreateTranscriptionRequest::TimestampGranularitiesEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIAudioApi::CreateTranscriptionRequest::TimestampGranularitiesEnum& Value)
{
	static TMap<FString, OpenAPIAudioApi::CreateTranscriptionRequest::TimestampGranularitiesEnum> StringToEnum = { 
		{ TEXT("word"), OpenAPIAudioApi::CreateTranscriptionRequest::TimestampGranularitiesEnum::Word },
		{ TEXT("segment"), OpenAPIAudioApi::CreateTranscriptionRequest::TimestampGranularitiesEnum::Segment }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIAudioApi::CreateTranscriptionRequest::EnumFromString(const FString& EnumAsString, OpenAPIAudioApi::CreateTranscriptionRequest::TimestampGranularitiesEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIAudioApi::CreateTranscriptionRequest::TimestampGranularitiesEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIAudioApi::CreateTranscriptionRequest::TimestampGranularitiesEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

FString OpenAPIAudioApi::CreateTranscriptionRequest::ComputePath() const
{
	FString Path(TEXT("/audio/transcriptions"));
	return Path;
}

void OpenAPIAudioApi::CreateTranscriptionRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = { TEXT("multipart/form-data") };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
		// Form parameters added to try to generate a json body when no body parameters are specified.
		FString JsonBody;
		JsonWriter Writer = TJsonWriterFactory<>::Create(&JsonBody);
		Writer->WriteObjectStart();
		UE_LOG(LogOpenAPI, Error, TEXT("Form parameter (file) was ignored, Files are not supported in json body"));
		Writer->WriteIdentifierPrefix(TEXT("model"));
		WriteJsonValue(Writer, Model);
		if (Language.IsSet()){
			Writer->WriteIdentifierPrefix(TEXT("language"));
			WriteJsonValue(Writer, Language.GetValue());
		}
		if (Prompt.IsSet()){
			Writer->WriteIdentifierPrefix(TEXT("prompt"));
			WriteJsonValue(Writer, Prompt.GetValue());
		}
		if (ResponseFormat.IsSet()){
			Writer->WriteIdentifierPrefix(TEXT("response_format"));
			WriteJsonValue(Writer, ResponseFormat.GetValue());
		}
		if (Temperature.IsSet()){
			Writer->WriteIdentifierPrefix(TEXT("temperature"));
			WriteJsonValue(Writer, Temperature.GetValue());
		}
		if (TimestampGranularities.IsSet()){
			Writer->WriteIdentifierPrefix(TEXT("timestamp_granularities[]"));
			WriteJsonValue(Writer, TimestampGranularities.GetValue());
		}
		Writer->WriteObjectEnd();
		Writer->Close();
		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		HttpMultipartFormData FormData;
		FormData.AddFilePart(TEXT("file"), File);
		FormData.AddStringPart(TEXT("model"), *ToUrlString(Model));
		if(Language.IsSet())
		{
			FormData.AddStringPart(TEXT("language"), *ToUrlString(Language.GetValue()));
		}
		if(Prompt.IsSet())
		{
			FormData.AddStringPart(TEXT("prompt"), *ToUrlString(Prompt.GetValue()));
		}
		if(ResponseFormat.IsSet())
		{
			FormData.AddStringPart(TEXT("response_format"), *ToUrlString(ResponseFormat.GetValue()));
		}
		if(Temperature.IsSet())
		{
			FormData.AddStringPart(TEXT("temperature"), *ToUrlString(Temperature.GetValue()));
		}
		UE_LOG(LogOpenAPI, Error, TEXT("Form parameter (timestamp_granularities[]) was ignored, Collections are not supported in multipart form"));

		FormData.SetupHttpRequest(HttpRequest);
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		TArray<FString> FormParams;
		UE_LOG(LogOpenAPI, Error, TEXT("Form parameter (file) was ignored, Files are not supported in urlencoded requests"));
		FormParams.Add(FString(TEXT("model=")) + ToUrlString(Model));
		if(Language.IsSet())
		{
			FormParams.Add(FString(TEXT("language=")) + ToUrlString(Language.GetValue()));
		}
		if(Prompt.IsSet())
		{
			FormParams.Add(FString(TEXT("prompt=")) + ToUrlString(Prompt.GetValue()));
		}
		if(ResponseFormat.IsSet())
		{
			FormParams.Add(FString(TEXT("response_format=")) + ToUrlString(ResponseFormat.GetValue()));
		}
		if(Temperature.IsSet())
		{
			FormParams.Add(FString(TEXT("temperature=")) + ToUrlString(Temperature.GetValue()));
		}
		UE_LOG(LogOpenAPI, Error, TEXT("Form parameter (timestamp_granularities[]) was ignored, Collections are not supported in urlencoded requests"));

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/x-www-form-urlencoded; charset=utf-8"));
		HttpRequest->SetContentAsString(FString::Join(FormParams, TEXT("&")));
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIAudioApi::CreateTranscriptionResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("OK"));
		break;
	}
}

bool OpenAPIAudioApi::CreateTranscriptionResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIAudioApi::CreateTranslationRequest::ComputePath() const
{
	FString Path(TEXT("/audio/translations"));
	return Path;
}

void OpenAPIAudioApi::CreateTranslationRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = { TEXT("multipart/form-data") };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
		// Form parameters added to try to generate a json body when no body parameters are specified.
		FString JsonBody;
		JsonWriter Writer = TJsonWriterFactory<>::Create(&JsonBody);
		Writer->WriteObjectStart();
		UE_LOG(LogOpenAPI, Error, TEXT("Form parameter (file) was ignored, Files are not supported in json body"));
		Writer->WriteIdentifierPrefix(TEXT("model"));
		WriteJsonValue(Writer, Model);
		if (Prompt.IsSet()){
			Writer->WriteIdentifierPrefix(TEXT("prompt"));
			WriteJsonValue(Writer, Prompt.GetValue());
		}
		if (ResponseFormat.IsSet()){
			Writer->WriteIdentifierPrefix(TEXT("response_format"));
			WriteJsonValue(Writer, ResponseFormat.GetValue());
		}
		if (Temperature.IsSet()){
			Writer->WriteIdentifierPrefix(TEXT("temperature"));
			WriteJsonValue(Writer, Temperature.GetValue());
		}
		Writer->WriteObjectEnd();
		Writer->Close();
		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		HttpMultipartFormData FormData;
		FormData.AddFilePart(TEXT("file"), File);
		FormData.AddStringPart(TEXT("model"), *ToUrlString(Model));
		if(Prompt.IsSet())
		{
			FormData.AddStringPart(TEXT("prompt"), *ToUrlString(Prompt.GetValue()));
		}
		if(ResponseFormat.IsSet())
		{
			FormData.AddStringPart(TEXT("response_format"), *ToUrlString(ResponseFormat.GetValue()));
		}
		if(Temperature.IsSet())
		{
			FormData.AddStringPart(TEXT("temperature"), *ToUrlString(Temperature.GetValue()));
		}

		FormData.SetupHttpRequest(HttpRequest);
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		TArray<FString> FormParams;
		UE_LOG(LogOpenAPI, Error, TEXT("Form parameter (file) was ignored, Files are not supported in urlencoded requests"));
		FormParams.Add(FString(TEXT("model=")) + ToUrlString(Model));
		if(Prompt.IsSet())
		{
			FormParams.Add(FString(TEXT("prompt=")) + ToUrlString(Prompt.GetValue()));
		}
		if(ResponseFormat.IsSet())
		{
			FormParams.Add(FString(TEXT("response_format=")) + ToUrlString(ResponseFormat.GetValue()));
		}
		if(Temperature.IsSet())
		{
			FormParams.Add(FString(TEXT("temperature=")) + ToUrlString(Temperature.GetValue()));
		}

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/x-www-form-urlencoded; charset=utf-8"));
		HttpRequest->SetContentAsString(FString::Join(FormParams, TEXT("&")));
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIAudioApi::CreateTranslationResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("OK"));
		break;
	}
}

bool OpenAPIAudioApi::CreateTranslationResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

}
