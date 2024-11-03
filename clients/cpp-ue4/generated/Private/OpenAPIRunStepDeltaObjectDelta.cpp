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

#include "OpenAPIRunStepDeltaObjectDelta.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIRunStepDeltaObjectDelta::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (StepDetails.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("step_details")); WriteJsonValue(Writer, StepDetails.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIRunStepDeltaObjectDelta::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("step_details"), StepDetails);

	return ParseSuccess;
}

}
