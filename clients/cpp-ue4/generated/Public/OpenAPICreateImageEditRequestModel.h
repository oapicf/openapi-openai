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
 * OpenAPICreateImageEditRequestModel
 *
 * The model to use for image generation. Only &#x60;dall-e-2&#x60; is supported at this time.
 */
class OPENAPI_API OpenAPICreateImageEditRequestModel : public Model
{
public:
    virtual ~OpenAPICreateImageEditRequestModel() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

};

}
