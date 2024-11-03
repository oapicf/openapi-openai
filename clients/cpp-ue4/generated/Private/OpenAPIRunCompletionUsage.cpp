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

#include "OpenAPIRunCompletionUsage.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIRunCompletionUsage::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("completion_tokens")); WriteJsonValue(Writer, CompletionTokens);
	Writer->WriteIdentifierPrefix(TEXT("prompt_tokens")); WriteJsonValue(Writer, PromptTokens);
	Writer->WriteIdentifierPrefix(TEXT("total_tokens")); WriteJsonValue(Writer, TotalTokens);
	Writer->WriteObjectEnd();
}

bool OpenAPIRunCompletionUsage::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("completion_tokens"), CompletionTokens);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("prompt_tokens"), PromptTokens);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("total_tokens"), TotalTokens);

	return ParseSuccess;
}

}
