

#include "RealtimeServerEventResponseDone.h"

using namespace Tiny;

RealtimeServerEventResponseDone::RealtimeServerEventResponseDone()
{
	event_id = std::string();
	type = std::string();
	response = RealtimeResponse();
}

RealtimeServerEventResponseDone::RealtimeServerEventResponseDone(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventResponseDone::~RealtimeServerEventResponseDone()
{

}

void
RealtimeServerEventResponseDone::fromJson(std::string jsonObj)
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

    const char *responseKey = "response";

    if(object.has_key(responseKey))
    {
        bourne::json value = object[responseKey];




        RealtimeResponse* obj = &response;
		obj->fromJson(value.dump());

    }


}

bourne::json
RealtimeServerEventResponseDone::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();







	object["response"] = getResponse().toJson();


    return object;

}

std::string
RealtimeServerEventResponseDone::getEventId()
{
	return event_id;
}

void
RealtimeServerEventResponseDone::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventResponseDone::getType()
{
	return type;
}

void
RealtimeServerEventResponseDone::setType(std::string  type)
{
	this->type = type;
}

RealtimeResponse
RealtimeServerEventResponseDone::getResponse()
{
	return response;
}

void
RealtimeServerEventResponseDone::setResponse(RealtimeResponse  response)
{
	this->response = response;
}



