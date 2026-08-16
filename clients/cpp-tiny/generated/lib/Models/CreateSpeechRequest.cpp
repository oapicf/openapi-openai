

#include "CreateSpeechRequest.h"

using namespace Tiny;

CreateSpeechRequest::CreateSpeechRequest()
{
	model = CreateSpeechRequest_model();
	input = std::string();
	voice = std::string();
	response_format = std::string();
	speed = float(0);
}

CreateSpeechRequest::CreateSpeechRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateSpeechRequest::~CreateSpeechRequest()
{

}

void
CreateSpeechRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];




        CreateSpeechRequest_model* obj = &model;
		obj->fromJson(value.dump());

    }

    const char *inputKey = "input";

    if(object.has_key(inputKey))
    {
        bourne::json value = object[inputKey];



        jsonToValue(&input, value, "std::string");


    }

    const char *voiceKey = "voice";

    if(object.has_key(voiceKey))
    {
        bourne::json value = object[voiceKey];



        jsonToValue(&voice, value, "std::string");


    }

    const char *response_formatKey = "response_format";

    if(object.has_key(response_formatKey))
    {
        bourne::json value = object[response_formatKey];



        jsonToValue(&response_format, value, "std::string");


    }

    const char *speedKey = "speed";

    if(object.has_key(speedKey))
    {
        bourne::json value = object[speedKey];



        jsonToValue(&speed, value, "long");


    }


}

bourne::json
CreateSpeechRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["model"] = getModel().toJson();





    object["input"] = getInput();






    object["voice"] = getVoice();






    object["response_format"] = getResponseFormat();






    object["speed"] = getSpeed();



    return object;

}

CreateSpeechRequest_model
CreateSpeechRequest::getModel()
{
	return model;
}

void
CreateSpeechRequest::setModel(CreateSpeechRequest_model  model)
{
	this->model = model;
}

std::string
CreateSpeechRequest::getInput()
{
	return input;
}

void
CreateSpeechRequest::setInput(std::string  input)
{
	this->input = input;
}

std::string
CreateSpeechRequest::getVoice()
{
	return voice;
}

void
CreateSpeechRequest::setVoice(std::string  voice)
{
	this->voice = voice;
}

std::string
CreateSpeechRequest::getResponseFormat()
{
	return response_format;
}

void
CreateSpeechRequest::setResponseFormat(std::string  response_format)
{
	this->response_format = response_format;
}

long
CreateSpeechRequest::getSpeed()
{
	return speed;
}

void
CreateSpeechRequest::setSpeed(long  speed)
{
	this->speed = speed;
}



