

#include "RealtimeClientEventResponseCancel.h"

using namespace Tiny;

RealtimeClientEventResponseCancel::RealtimeClientEventResponseCancel()
{
	event_id = std::string();
	type = std::string();
	response_id = std::string();
}

RealtimeClientEventResponseCancel::RealtimeClientEventResponseCancel(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeClientEventResponseCancel::~RealtimeClientEventResponseCancel()
{

}

void
RealtimeClientEventResponseCancel::fromJson(std::string jsonObj)
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

    const char *response_idKey = "response_id";

    if(object.has_key(response_idKey))
    {
        bourne::json value = object[response_idKey];



        jsonToValue(&response_id, value, "std::string");


    }


}

bourne::json
RealtimeClientEventResponseCancel::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();






    object["response_id"] = getResponseId();



    return object;

}

std::string
RealtimeClientEventResponseCancel::getEventId()
{
	return event_id;
}

void
RealtimeClientEventResponseCancel::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeClientEventResponseCancel::getType()
{
	return type;
}

void
RealtimeClientEventResponseCancel::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeClientEventResponseCancel::getResponseId()
{
	return response_id;
}

void
RealtimeClientEventResponseCancel::setResponseId(std::string  response_id)
{
	this->response_id = response_id;
}



