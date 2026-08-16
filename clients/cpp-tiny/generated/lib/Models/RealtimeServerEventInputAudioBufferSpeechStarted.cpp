

#include "RealtimeServerEventInputAudioBufferSpeechStarted.h"

using namespace Tiny;

RealtimeServerEventInputAudioBufferSpeechStarted::RealtimeServerEventInputAudioBufferSpeechStarted()
{
	event_id = std::string();
	type = std::string();
	audio_start_ms = int(0);
	item_id = std::string();
}

RealtimeServerEventInputAudioBufferSpeechStarted::RealtimeServerEventInputAudioBufferSpeechStarted(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventInputAudioBufferSpeechStarted::~RealtimeServerEventInputAudioBufferSpeechStarted()
{

}

void
RealtimeServerEventInputAudioBufferSpeechStarted::fromJson(std::string jsonObj)
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

    const char *audio_start_msKey = "audio_start_ms";

    if(object.has_key(audio_start_msKey))
    {
        bourne::json value = object[audio_start_msKey];



        jsonToValue(&audio_start_ms, value, "int");


    }

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }


}

bourne::json
RealtimeServerEventInputAudioBufferSpeechStarted::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();






    object["audio_start_ms"] = getAudioStartMs();






    object["item_id"] = getItemId();



    return object;

}

std::string
RealtimeServerEventInputAudioBufferSpeechStarted::getEventId()
{
	return event_id;
}

void
RealtimeServerEventInputAudioBufferSpeechStarted::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventInputAudioBufferSpeechStarted::getType()
{
	return type;
}

void
RealtimeServerEventInputAudioBufferSpeechStarted::setType(std::string  type)
{
	this->type = type;
}

int
RealtimeServerEventInputAudioBufferSpeechStarted::getAudioStartMs()
{
	return audio_start_ms;
}

void
RealtimeServerEventInputAudioBufferSpeechStarted::setAudioStartMs(int  audio_start_ms)
{
	this->audio_start_ms = audio_start_ms;
}

std::string
RealtimeServerEventInputAudioBufferSpeechStarted::getItemId()
{
	return item_id;
}

void
RealtimeServerEventInputAudioBufferSpeechStarted::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}



