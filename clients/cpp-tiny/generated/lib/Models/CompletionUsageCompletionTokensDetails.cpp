

#include "CompletionUsage_completion_tokens_details.h"

using namespace Tiny;

CompletionUsage_completion_tokens_details::CompletionUsage_completion_tokens_details()
{
	accepted_prediction_tokens = int(0);
	audio_tokens = int(0);
	reasoning_tokens = int(0);
	rejected_prediction_tokens = int(0);
}

CompletionUsage_completion_tokens_details::CompletionUsage_completion_tokens_details(std::string jsonString)
{
	this->fromJson(jsonString);
}

CompletionUsage_completion_tokens_details::~CompletionUsage_completion_tokens_details()
{

}

void
CompletionUsage_completion_tokens_details::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *accepted_prediction_tokensKey = "accepted_prediction_tokens";

    if(object.has_key(accepted_prediction_tokensKey))
    {
        bourne::json value = object[accepted_prediction_tokensKey];



        jsonToValue(&accepted_prediction_tokens, value, "int");


    }

    const char *audio_tokensKey = "audio_tokens";

    if(object.has_key(audio_tokensKey))
    {
        bourne::json value = object[audio_tokensKey];



        jsonToValue(&audio_tokens, value, "int");


    }

    const char *reasoning_tokensKey = "reasoning_tokens";

    if(object.has_key(reasoning_tokensKey))
    {
        bourne::json value = object[reasoning_tokensKey];



        jsonToValue(&reasoning_tokens, value, "int");


    }

    const char *rejected_prediction_tokensKey = "rejected_prediction_tokens";

    if(object.has_key(rejected_prediction_tokensKey))
    {
        bourne::json value = object[rejected_prediction_tokensKey];



        jsonToValue(&rejected_prediction_tokens, value, "int");


    }


}

bourne::json
CompletionUsage_completion_tokens_details::toJson()
{
    bourne::json object = bourne::json::object();





    object["accepted_prediction_tokens"] = getAcceptedPredictionTokens();






    object["audio_tokens"] = getAudioTokens();






    object["reasoning_tokens"] = getReasoningTokens();






    object["rejected_prediction_tokens"] = getRejectedPredictionTokens();



    return object;

}

int
CompletionUsage_completion_tokens_details::getAcceptedPredictionTokens()
{
	return accepted_prediction_tokens;
}

void
CompletionUsage_completion_tokens_details::setAcceptedPredictionTokens(int  accepted_prediction_tokens)
{
	this->accepted_prediction_tokens = accepted_prediction_tokens;
}

int
CompletionUsage_completion_tokens_details::getAudioTokens()
{
	return audio_tokens;
}

void
CompletionUsage_completion_tokens_details::setAudioTokens(int  audio_tokens)
{
	this->audio_tokens = audio_tokens;
}

int
CompletionUsage_completion_tokens_details::getReasoningTokens()
{
	return reasoning_tokens;
}

void
CompletionUsage_completion_tokens_details::setReasoningTokens(int  reasoning_tokens)
{
	this->reasoning_tokens = reasoning_tokens;
}

int
CompletionUsage_completion_tokens_details::getRejectedPredictionTokens()
{
	return rejected_prediction_tokens;
}

void
CompletionUsage_completion_tokens_details::setRejectedPredictionTokens(int  rejected_prediction_tokens)
{
	this->rejected_prediction_tokens = rejected_prediction_tokens;
}



