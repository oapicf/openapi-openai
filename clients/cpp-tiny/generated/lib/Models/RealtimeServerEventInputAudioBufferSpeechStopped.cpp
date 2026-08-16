

#include "RealtimeServerEventInputAudioBufferSpeechStopped.h"

using namespace Tiny;

RealtimeServerEventInputAudioBufferSpeechStopped::RealtimeServerEventInputAudioBufferSpeechStopped()
{
	event_id = std::string();
	type = std::string();
	audio_end_ms = int(0);
	item_id = std::string();
}

RealtimeServerEventInputAudioBufferSpeechStopped::RealtimeServerEventInputAudioBufferSpeechStopped(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventInputAudioBufferSpeechStopped::~RealtimeServerEventInputAudioBufferSpeechStopped()
{

}

void
RealtimeServerEventInputAudioBufferSpeechStopped::fromJson(std::string jsonObj)
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

    const char *audio_end_msKey = "audio_end_ms";

    if(object.has_key(audio_end_msKey))
    {
        bourne::json value = object[audio_end_msKey];



        jsonToValue(&audio_end_ms, value, "int");


    }

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }


}

bourne::json
RealtimeServerEventInputAudioBufferSpeechStopped::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();






    object["audio_end_ms"] = getAudioEndMs();






    object["item_id"] = getItemId();



    return object;

}

std::string
RealtimeServerEventInputAudioBufferSpeechStopped::getEventId()
{
	return event_id;
}

void
RealtimeServerEventInputAudioBufferSpeechStopped::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventInputAudioBufferSpeechStopped::getType()
{
	return type;
}

void
RealtimeServerEventInputAudioBufferSpeechStopped::setType(std::string  type)
{
	this->type = type;
}

int
RealtimeServerEventInputAudioBufferSpeechStopped::getAudioEndMs()
{
	return audio_end_ms;
}

void
RealtimeServerEventInputAudioBufferSpeechStopped::setAudioEndMs(int  audio_end_ms)
{
	this->audio_end_ms = audio_end_ms;
}

std::string
RealtimeServerEventInputAudioBufferSpeechStopped::getItemId()
{
	return item_id;
}

void
RealtimeServerEventInputAudioBufferSpeechStopped::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}



