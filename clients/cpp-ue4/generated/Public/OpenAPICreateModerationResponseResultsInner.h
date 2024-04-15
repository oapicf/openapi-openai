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
#include "OpenAPICreateModerationResponseResultsInnerCategories.h"
#include "OpenAPICreateModerationResponseResultsInnerCategoryScores.h"

namespace OpenAPI
{

/*
 * OpenAPICreateModerationResponseResultsInner
 *
 * 
 */
class OPENAPI_API OpenAPICreateModerationResponseResultsInner : public Model
{
public:
    virtual ~OpenAPICreateModerationResponseResultsInner() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Whether any of the below categories are flagged. */
	bool Flagged = false;
	OpenAPICreateModerationResponseResultsInnerCategories Categories;
	OpenAPICreateModerationResponseResultsInnerCategoryScores CategoryScores;
};

}