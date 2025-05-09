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

#include "OpenAPICreateCompletionRequest.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPICreateCompletionRequest::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("model")); WriteJsonValue(Writer, Model);
	if (Prompt.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("prompt")); WriteJsonValue(Writer, Prompt.GetValue());
	}
	if (BestOf.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("best_of")); WriteJsonValue(Writer, BestOf.GetValue());
	}
	if (Echo.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("echo")); WriteJsonValue(Writer, Echo.GetValue());
	}
	if (FrequencyPenalty.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("frequency_penalty")); WriteJsonValue(Writer, FrequencyPenalty.GetValue());
	}
	if (LogitBias.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("logit_bias")); WriteJsonValue(Writer, LogitBias.GetValue());
	}
	if (Logprobs.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("logprobs")); WriteJsonValue(Writer, Logprobs.GetValue());
	}
	if (MaxTokens.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("max_tokens")); WriteJsonValue(Writer, MaxTokens.GetValue());
	}
	if (N.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("n")); WriteJsonValue(Writer, N.GetValue());
	}
	if (PresencePenalty.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("presence_penalty")); WriteJsonValue(Writer, PresencePenalty.GetValue());
	}
	if (Seed.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("seed")); WriteJsonValue(Writer, Seed.GetValue());
	}
	if (Stop.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("stop")); WriteJsonValue(Writer, Stop.GetValue());
	}
	if (Stream.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("stream")); WriteJsonValue(Writer, Stream.GetValue());
	}
	if (Suffix.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("suffix")); WriteJsonValue(Writer, Suffix.GetValue());
	}
	if (Temperature.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("temperature")); WriteJsonValue(Writer, Temperature.GetValue());
	}
	if (TopP.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("top_p")); WriteJsonValue(Writer, TopP.GetValue());
	}
	if (User.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("user")); WriteJsonValue(Writer, User.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPICreateCompletionRequest::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("model"), Model);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("prompt"), Prompt);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("best_of"), BestOf);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("echo"), Echo);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("frequency_penalty"), FrequencyPenalty);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("logit_bias"), LogitBias);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("logprobs"), Logprobs);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("max_tokens"), MaxTokens);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("n"), N);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("presence_penalty"), PresencePenalty);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("seed"), Seed);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("stop"), Stop);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("stream"), Stream);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("suffix"), Suffix);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("temperature"), Temperature);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("top_p"), TopP);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("user"), User);

	return ParseSuccess;
}

}
