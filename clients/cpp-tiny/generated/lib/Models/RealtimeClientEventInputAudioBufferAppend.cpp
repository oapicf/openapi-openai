

#include "RealtimeClientEventInputAudioBufferAppend.h"

using namespace Tiny;

RealtimeClientEventInputAudioBufferAppend::RealtimeClientEventInputAudioBufferAppend()
{
	event_id = std::string();
	type = std::string();
	audio = std::string();
}

RealtimeClientEventInputAudioBufferAppend::RealtimeClientEventInputAudioBufferAppend(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeClientEventInputAudioBufferAppend::~RealtimeClientEventInputAudioBufferAppend()
{

}

void
RealtimeClientEventInputAudioBufferAppend::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *event_idKey = "event_id";

    if(object.has_key(event_idKey))
    {
        bourne::json value = object[event_idKey];



        jsonToValue(&event_id, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *audioKey = "audio";

    if(object.has_key(audioKey))
    {
        bourne::json value = object[audioKey];



        jsonToValue(&audio, value, "std::string");


    }


}

bourne::json
RealtimeClientEventInputAudioBufferAppend::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();






    object["audio"] = getAudio();



    return object;

}

std::string
RealtimeClientEventInputAudioBufferAppend::getEventId()
{
	return event_id;
}

void
RealtimeClientEventInputAudioBufferAppend::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeClientEventInputAudioBufferAppend::getType()
{
	return type;
}

void
RealtimeClientEventInputAudioBufferAppend::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeClientEventInputAudioBufferAppend::getAudio()
{
	return audio;
}

void
RealtimeClientEventInputAudioBufferAppend::setAudio(std::string  audio)
{
	this->audio = audio;
}



