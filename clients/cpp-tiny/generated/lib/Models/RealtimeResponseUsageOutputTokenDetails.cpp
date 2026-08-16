

#include "RealtimeResponse_usage_output_token_details.h"

using namespace Tiny;

RealtimeResponse_usage_output_token_details::RealtimeResponse_usage_output_token_details()
{
	text_tokens = int(0);
	audio_tokens = int(0);
}

RealtimeResponse_usage_output_token_details::RealtimeResponse_usage_output_token_details(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeResponse_usage_output_token_details::~RealtimeResponse_usage_output_token_details()
{

}

void
RealtimeResponse_usage_output_token_details::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *text_tokensKey = "text_tokens";

    if(object.has_key(text_tokensKey))
    {
        bourne::json value = object[text_tokensKey];



        jsonToValue(&text_tokens, value, "int");


    }

    const char *audio_tokensKey = "audio_tokens";

    if(object.has_key(audio_tokensKey))
    {
        bourne::json value = object[audio_tokensKey];



        jsonToValue(&audio_tokens, value, "int");


    }


}

bourne::json
RealtimeResponse_usage_output_token_details::toJson()
{
    bourne::json object = bourne::json::object();





    object["text_tokens"] = getTextTokens();






    object["audio_tokens"] = getAudioTokens();



    return object;

}

int
RealtimeResponse_usage_output_token_details::getTextTokens()
{
	return text_tokens;
}

void
RealtimeResponse_usage_output_token_details::setTextTokens(int  text_tokens)
{
	this->text_tokens = text_tokens;
}

int
RealtimeResponse_usage_output_token_details::getAudioTokens()
{
	return audio_tokens;
}

void
RealtimeResponse_usage_output_token_details::setAudioTokens(int  audio_tokens)
{
	this->audio_tokens = audio_tokens;
}



