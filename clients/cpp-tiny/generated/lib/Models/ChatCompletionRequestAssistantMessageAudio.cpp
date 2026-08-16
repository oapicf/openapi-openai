

#include "ChatCompletionRequestAssistantMessage_audio.h"

using namespace Tiny;

ChatCompletionRequestAssistantMessage_audio::ChatCompletionRequestAssistantMessage_audio()
{
	id = std::string();
}

ChatCompletionRequestAssistantMessage_audio::ChatCompletionRequestAssistantMessage_audio(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestAssistantMessage_audio::~ChatCompletionRequestAssistantMessage_audio()
{

}

void
ChatCompletionRequestAssistantMessage_audio::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }


}

bourne::json
ChatCompletionRequestAssistantMessage_audio::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();



    return object;

}

std::string
ChatCompletionRequestAssistantMessage_audio::getId()
{
	return id;
}

void
ChatCompletionRequestAssistantMessage_audio::setId(std::string  id)
{
	this->id = id;
}



