

#include "RealtimeServerEventInputAudioBufferCleared.h"

using namespace Tiny;

RealtimeServerEventInputAudioBufferCleared::RealtimeServerEventInputAudioBufferCleared()
{
	event_id = std::string();
	type = std::string();
}

RealtimeServerEventInputAudioBufferCleared::RealtimeServerEventInputAudioBufferCleared(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventInputAudioBufferCleared::~RealtimeServerEventInputAudioBufferCleared()
{

}

void
RealtimeServerEventInputAudioBufferCleared::fromJson(std::string jsonObj)
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


}

bourne::json
RealtimeServerEventInputAudioBufferCleared::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();



    return object;

}

std::string
RealtimeServerEventInputAudioBufferCleared::getEventId()
{
	return event_id;
}

void
RealtimeServerEventInputAudioBufferCleared::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventInputAudioBufferCleared::getType()
{
	return type;
}

void
RealtimeServerEventInputAudioBufferCleared::setType(std::string  type)
{
	this->type = type;
}



