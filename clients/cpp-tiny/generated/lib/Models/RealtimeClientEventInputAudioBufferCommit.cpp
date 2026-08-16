

#include "RealtimeClientEventInputAudioBufferCommit.h"

using namespace Tiny;

RealtimeClientEventInputAudioBufferCommit::RealtimeClientEventInputAudioBufferCommit()
{
	event_id = std::string();
	type = std::string();
}

RealtimeClientEventInputAudioBufferCommit::RealtimeClientEventInputAudioBufferCommit(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeClientEventInputAudioBufferCommit::~RealtimeClientEventInputAudioBufferCommit()
{

}

void
RealtimeClientEventInputAudioBufferCommit::fromJson(std::string jsonObj)
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
RealtimeClientEventInputAudioBufferCommit::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();



    return object;

}

std::string
RealtimeClientEventInputAudioBufferCommit::getEventId()
{
	return event_id;
}

void
RealtimeClientEventInputAudioBufferCommit::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeClientEventInputAudioBufferCommit::getType()
{
	return type;
}

void
RealtimeClientEventInputAudioBufferCommit::setType(std::string  type)
{
	this->type = type;
}



