

#include "RealtimeClientEventResponseCreate.h"

using namespace Tiny;

RealtimeClientEventResponseCreate::RealtimeClientEventResponseCreate()
{
	event_id = std::string();
	type = std::string();
	response = RealtimeResponseCreateParams();
}

RealtimeClientEventResponseCreate::RealtimeClientEventResponseCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeClientEventResponseCreate::~RealtimeClientEventResponseCreate()
{

}

void
RealtimeClientEventResponseCreate::fromJson(std::string jsonObj)
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




        RealtimeResponseCreateParams* obj = &response;
		obj->fromJson(value.dump());

    }


}

bourne::json
RealtimeClientEventResponseCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();







	object["response"] = getResponse().toJson();


    return object;

}

std::string
RealtimeClientEventResponseCreate::getEventId()
{
	return event_id;
}

void
RealtimeClientEventResponseCreate::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeClientEventResponseCreate::getType()
{
	return type;
}

void
RealtimeClientEventResponseCreate::setType(std::string  type)
{
	this->type = type;
}

RealtimeResponseCreateParams
RealtimeClientEventResponseCreate::getResponse()
{
	return response;
}

void
RealtimeClientEventResponseCreate::setResponse(RealtimeResponseCreateParams  response)
{
	this->response = response;
}



