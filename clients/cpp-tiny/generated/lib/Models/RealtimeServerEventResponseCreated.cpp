

#include "RealtimeServerEventResponseCreated.h"

using namespace Tiny;

RealtimeServerEventResponseCreated::RealtimeServerEventResponseCreated()
{
	event_id = std::string();
	type = std::string();
	response = RealtimeResponse();
}

RealtimeServerEventResponseCreated::RealtimeServerEventResponseCreated(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventResponseCreated::~RealtimeServerEventResponseCreated()
{

}

void
RealtimeServerEventResponseCreated::fromJson(std::string jsonObj)
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
RealtimeServerEventResponseCreated::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();







	object["response"] = getResponse().toJson();


    return object;

}

std::string
RealtimeServerEventResponseCreated::getEventId()
{
	return event_id;
}

void
RealtimeServerEventResponseCreated::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventResponseCreated::getType()
{
	return type;
}

void
RealtimeServerEventResponseCreated::setType(std::string  type)
{
	this->type = type;
}

RealtimeResponse
RealtimeServerEventResponseCreated::getResponse()
{
	return response;
}

void
RealtimeServerEventResponseCreated::setResponse(RealtimeResponse  response)
{
	this->response = response;
}



