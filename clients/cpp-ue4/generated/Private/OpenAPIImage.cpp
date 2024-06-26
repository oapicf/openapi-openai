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

#include "OpenAPIImage.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIImage::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (B64Json.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("b64_json")); WriteJsonValue(Writer, B64Json.GetValue());
	}
	if (Url.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("url")); WriteJsonValue(Writer, Url.GetValue());
	}
	if (RevisedPrompt.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("revised_prompt")); WriteJsonValue(Writer, RevisedPrompt.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIImage::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("b64_json"), B64Json);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("url"), Url);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("revised_prompt"), RevisedPrompt);

	return ParseSuccess;
}

}
