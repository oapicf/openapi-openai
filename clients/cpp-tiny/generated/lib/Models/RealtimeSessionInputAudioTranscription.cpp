

#include "RealtimeSession_input_audio_transcription.h"

using namespace Tiny;

RealtimeSession_input_audio_transcription::RealtimeSession_input_audio_transcription()
{
	model = std::string();
}

RealtimeSession_input_audio_transcription::RealtimeSession_input_audio_transcription(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeSession_input_audio_transcription::~RealtimeSession_input_audio_transcription()
{

}

void
RealtimeSession_input_audio_transcription::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];



        jsonToValue(&model, value, "std::string");


    }


}

bourne::json
RealtimeSession_input_audio_transcription::toJson()
{
    bourne::json object = bourne::json::object();





    object["model"] = getModel();



    return object;

}

std::string
RealtimeSession_input_audio_transcription::getModel()
{
	return model;
}

void
RealtimeSession_input_audio_transcription::setModel(std::string  model)
{
	this->model = model;
}



