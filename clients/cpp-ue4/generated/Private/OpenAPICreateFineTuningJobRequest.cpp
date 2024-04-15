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

#include "OpenAPICreateFineTuningJobRequest.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPICreateFineTuningJobRequest::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("model")); WriteJsonValue(Writer, Model);
	Writer->WriteIdentifierPrefix(TEXT("training_file")); WriteJsonValue(Writer, TrainingFile);
	if (Hyperparameters.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("hyperparameters")); WriteJsonValue(Writer, Hyperparameters.GetValue());
	}
	if (Suffix.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("suffix")); WriteJsonValue(Writer, Suffix.GetValue());
	}
	if (ValidationFile.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("validation_file")); WriteJsonValue(Writer, ValidationFile.GetValue());
	}
	if (Integrations.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("integrations")); WriteJsonValue(Writer, Integrations.GetValue());
	}
	if (Seed.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("seed")); WriteJsonValue(Writer, Seed.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPICreateFineTuningJobRequest::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("model"), Model);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("training_file"), TrainingFile);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("hyperparameters"), Hyperparameters);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("suffix"), Suffix);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("validation_file"), ValidationFile);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("integrations"), Integrations);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("seed"), Seed);

	return ParseSuccess;
}

}