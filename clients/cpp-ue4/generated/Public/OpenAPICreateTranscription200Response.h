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

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPICreateTranscriptionResponseJson.h"
#include "OpenAPICreateTranscriptionResponseVerboseJson.h"
#include "OpenAPITranscriptionSegment.h"
#include "OpenAPITranscriptionWord.h"

namespace OpenAPI
{

/*
 * OpenAPICreateTranscription200Response
 *
 * 
 */
class OPENAPI_API OpenAPICreateTranscription200Response : public Model
{
public:
    virtual ~OpenAPICreateTranscription200Response() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The transcribed text. */
	FString Text;
	/* The language of the input audio. */
	FString Language;
	/* The duration of the input audio. */
	FString Duration;
	/* Extracted words and their corresponding timestamps. */
	TOptional<TArray<OpenAPITranscriptionWord>> Words;
	/* Segments of the transcribed text and their corresponding details. */
	TOptional<TArray<OpenAPITranscriptionSegment>> Segments;
};

}
