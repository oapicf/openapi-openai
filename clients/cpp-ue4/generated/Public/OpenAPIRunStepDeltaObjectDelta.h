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
#include "OpenAPIRunStepDeltaObjectDeltaStepDetails.h"

namespace OpenAPI
{

/*
 * OpenAPIRunStepDeltaObjectDelta
 *
 * The delta containing the fields that have changed on the run step.
 */
class OPENAPI_API OpenAPIRunStepDeltaObjectDelta : public Model
{
public:
    virtual ~OpenAPIRunStepDeltaObjectDelta() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<OpenAPIRunStepDeltaObjectDeltaStepDetails> StepDetails;
};

}
