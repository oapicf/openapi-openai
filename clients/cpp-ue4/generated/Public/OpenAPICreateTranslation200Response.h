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
#include "OpenAPICreateTranslationResponseJson.h"
#include "OpenAPICreateTranslationResponseVerboseJson.h"
#include "OpenAPITranscriptionSegment.h"

namespace OpenAPI
{

/*
 * OpenAPICreateTranslation200Response
 *
 * 
 */
class OPENAPI_API OpenAPICreateTranslation200Response : public Model
{
public:
    virtual ~OpenAPICreateTranslation200Response() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The translated text. */
	FString Text;
	/* The language of the output translation (always `english`). */
	FString Language;
	/* The duration of the input audio. */
	FString Duration;
	/* Segments of the translated text and their corresponding details. */
	TOptional<TArray<OpenAPITranscriptionSegment>> Segments;
};

}
