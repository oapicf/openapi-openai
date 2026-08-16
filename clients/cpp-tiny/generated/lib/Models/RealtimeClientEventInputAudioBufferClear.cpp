

#include "RealtimeClientEventInputAudioBufferClear.h"

using namespace Tiny;

RealtimeClientEventInputAudioBufferClear::RealtimeClientEventInputAudioBufferClear()
{
	event_id = std::string();
	type = std::string();
}

RealtimeClientEventInputAudioBufferClear::RealtimeClientEventInputAudioBufferClear(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeClientEventInputAudioBufferClear::~RealtimeClientEventInputAudioBufferClear()
{

}

void
RealtimeClientEventInputAudioBufferClear::fromJson(std::string jsonObj)
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
RealtimeClientEventInputAudioBufferClear::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();



    return object;

}

std::string
RealtimeClientEventInputAudioBufferClear::getEventId()
{
	return event_id;
}

void
RealtimeClientEventInputAudioBufferClear::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeClientEventInputAudioBufferClear::getType()
{
	return type;
}

void
RealtimeClientEventInputAudioBufferClear::setType(std::string  type)
{
	this->type = type;
}



