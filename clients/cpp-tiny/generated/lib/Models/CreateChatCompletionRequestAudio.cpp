

#include "CreateChatCompletionRequest_audio.h"

using namespace Tiny;

CreateChatCompletionRequest_audio::CreateChatCompletionRequest_audio()
{
	voice = std::string();
	format = std::string();
}

CreateChatCompletionRequest_audio::CreateChatCompletionRequest_audio(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatCompletionRequest_audio::~CreateChatCompletionRequest_audio()
{

}

void
CreateChatCompletionRequest_audio::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *voiceKey = "voice";

    if(object.has_key(voiceKey))
    {
        bourne::json value = object[voiceKey];



        jsonToValue(&voice, value, "std::string");


    }

    const char *formatKey = "format";

    if(object.has_key(formatKey))
    {
        bourne::json value = object[formatKey];



        jsonToValue(&format, value, "std::string");


    }


}

bourne::json
CreateChatCompletionRequest_audio::toJson()
{
    bourne::json object = bourne::json::object();





    object["voice"] = getVoice();






    object["format"] = getFormat();



    return object;

}

std::string
CreateChatCompletionRequest_audio::getVoice()
{
	return voice;
}

void
CreateChatCompletionRequest_audio::setVoice(std::string  voice)
{
	this->voice = voice;
}

std::string
CreateChatCompletionRequest_audio::getFormat()
{
	return format;
}

void
CreateChatCompletionRequest_audio::setFormat(std::string  format)
{
	this->format = format;
}



