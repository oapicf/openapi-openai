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
 * OpenAPIFineTuningJobCheckpointMetrics
 *
 * Metrics at the step number during the fine-tuning job.
 */
class OPENAPI_API OpenAPIFineTuningJobCheckpointMetrics : public Model
{
public:
    virtual ~OpenAPIFineTuningJobCheckpointMetrics() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<double> Step;
	TOptional<double> TrainLoss;
	TOptional<double> TrainMeanTokenAccuracy;
	TOptional<double> ValidLoss;
	TOptional<double> ValidMeanTokenAccuracy;
	TOptional<double> FullValidLoss;
	TOptional<double> FullValidMeanTokenAccuracy;
};

}