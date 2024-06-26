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

#include "OpenAPICreateModerationResponseResultsInner.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPICreateModerationResponseResultsInner::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("flagged")); WriteJsonValue(Writer, Flagged);
	Writer->WriteIdentifierPrefix(TEXT("categories")); WriteJsonValue(Writer, Categories);
	Writer->WriteIdentifierPrefix(TEXT("category_scores")); WriteJsonValue(Writer, CategoryScores);
	Writer->WriteObjectEnd();
}

bool OpenAPICreateModerationResponseResultsInner::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("flagged"), Flagged);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("categories"), Categories);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("category_scores"), CategoryScores);

	return ParseSuccess;
}

}
