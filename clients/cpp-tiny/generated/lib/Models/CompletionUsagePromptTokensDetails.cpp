

#include "CompletionUsage_prompt_tokens_details.h"

using namespace Tiny;

CompletionUsage_prompt_tokens_details::CompletionUsage_prompt_tokens_details()
{
	audio_tokens = int(0);
	cached_tokens = int(0);
}

CompletionUsage_prompt_tokens_details::CompletionUsage_prompt_tokens_details(std::string jsonString)
{
	this->fromJson(jsonString);
}

CompletionUsage_prompt_tokens_details::~CompletionUsage_prompt_tokens_details()
{

}

void
CompletionUsage_prompt_tokens_details::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *audio_tokensKey = "audio_tokens";

    if(object.has_key(audio_tokensKey))
    {
        bourne::json value = object[audio_tokensKey];



        jsonToValue(&audio_tokens, value, "int");


    }

    const char *cached_tokensKey = "cached_tokens";

    if(object.has_key(cached_tokensKey))
    {
        bourne::json value = object[cached_tokensKey];



        jsonToValue(&cached_tokens, value, "int");


    }


}

bourne::json
CompletionUsage_prompt_tokens_details::toJson()
{
    bourne::json object = bourne::json::object();





    object["audio_tokens"] = getAudioTokens();






    object["cached_tokens"] = getCachedTokens();



    return object;

}

int
CompletionUsage_prompt_tokens_details::getAudioTokens()
{
	return audio_tokens;
}

void
CompletionUsage_prompt_tokens_details::setAudioTokens(int  audio_tokens)
{
	this->audio_tokens = audio_tokens;
}

int
CompletionUsage_prompt_tokens_details::getCachedTokens()
{
	return cached_tokens;
}

void
CompletionUsage_prompt_tokens_details::setCachedTokens(int  cached_tokens)
{
	this->cached_tokens = cached_tokens;
}



