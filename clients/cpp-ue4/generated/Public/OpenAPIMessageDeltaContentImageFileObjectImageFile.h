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
 * OpenAPIMessageDeltaContentImageFileObjectImageFile
 *
 * 
 */
class OPENAPI_API OpenAPIMessageDeltaContentImageFileObjectImageFile : public Model
{
public:
    virtual ~OpenAPIMessageDeltaContentImageFileObjectImageFile() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The [File](/docs/api-reference/files) ID of the image in the message content. */
	TOptional<FString> FileId;
};

}