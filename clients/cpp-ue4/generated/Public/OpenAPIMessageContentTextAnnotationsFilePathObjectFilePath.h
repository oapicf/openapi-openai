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
 * OpenAPIMessageContentTextAnnotationsFilePathObjectFilePath
 *
 * 
 */
class OPENAPI_API OpenAPIMessageContentTextAnnotationsFilePathObjectFilePath : public Model
{
public:
    virtual ~OpenAPIMessageContentTextAnnotationsFilePathObjectFilePath() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The ID of the file that was generated. */
	FString FileId;
};

}
