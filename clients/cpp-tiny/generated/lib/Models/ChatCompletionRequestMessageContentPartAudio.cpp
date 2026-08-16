

#include "ChatCompletionRequestMessageContentPartAudio.h"

using namespace Tiny;

ChatCompletionRequestMessageContentPartAudio::ChatCompletionRequestMessageContentPartAudio()
{
	type = std::string();
	input_audio = ChatCompletionRequestMessageContentPartAudio_input_audio();
}

ChatCompletionRequestMessageContentPartAudio::ChatCompletionRequestMessageContentPartAudio(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestMessageContentPartAudio::~ChatCompletionRequestMessageContentPartAudio()
{

}

void
ChatCompletionRequestMessageContentPartAudio::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *input_audioKey = "input_audio";

    if(object.has_key(input_audioKey))
    {
        bourne::json value = object[input_audioKey];




        ChatCompletionRequestMessageContentPartAudio_input_audio* obj = &input_audio;
		obj->fromJson(value.dump());

    }


}

bourne::json
ChatCompletionRequestMessageContentPartAudio::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["input_audio"] = getInputAudio().toJson();


    return object;

}

std::string
ChatCompletionRequestMessageContentPartAudio::getType()
{
	return type;
}

void
ChatCompletionRequestMessageContentPartAudio::setType(std::string  type)
{
	this->type = type;
}

ChatCompletionRequestMessageContentPartAudio_input_audio
ChatCompletionRequestMessageContentPartAudio::getInputAudio()
{
	return input_audio;
}

void
ChatCompletionRequestMessageContentPartAudio::setInputAudio(ChatCompletionRequestMessageContentPartAudio_input_audio  input_audio)
{
	this->input_audio = input_audio;
}



