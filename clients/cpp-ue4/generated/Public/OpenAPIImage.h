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

namespace OpenAPI
{

/*
 * OpenAPIImage
 *
 * Represents the url or the content of an image generated by the OpenAI API.
 */
class OPENAPI_API OpenAPIImage : public Model
{
public:
    virtual ~OpenAPIImage() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The base64-encoded JSON of the generated image, if `response_format` is `b64_json`. */
	TOptional<FString> B64Json;
	/* The URL of the generated image, if `response_format` is `url` (default). */
	TOptional<FString> Url;
	/* The prompt that was used to generate the image, if there was any revision to the prompt. */
	TOptional<FString> RevisedPrompt;
};

}