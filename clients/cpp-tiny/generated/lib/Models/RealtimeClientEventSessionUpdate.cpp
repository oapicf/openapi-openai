

#include "RealtimeClientEventSessionUpdate.h"

using namespace Tiny;

RealtimeClientEventSessionUpdate::RealtimeClientEventSessionUpdate()
{
	event_id = std::string();
	type = std::string();
	session = RealtimeSessionCreateRequest();
}

RealtimeClientEventSessionUpdate::RealtimeClientEventSessionUpdate(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeClientEventSessionUpdate::~RealtimeClientEventSessionUpdate()
{

}

void
RealtimeClientEventSessionUpdate::fromJson(std::string jsonObj)
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

    const char *sessionKey = "session";

    if(object.has_key(sessionKey))
    {
        bourne::json value = object[sessionKey];




        RealtimeSessionCreateRequest* obj = &session;
		obj->fromJson(value.dump());

    }


}

bourne::json
RealtimeClientEventSessionUpdate::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();







	object["session"] = getSession().toJson();


    return object;

}

std::string
RealtimeClientEventSessionUpdate::getEventId()
{
	return event_id;
}

void
RealtimeClientEventSessionUpdate::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeClientEventSessionUpdate::getType()
{
	return type;
}

void
RealtimeClientEventSessionUpdate::setType(std::string  type)
{
	this->type = type;
}

RealtimeSessionCreateRequest
RealtimeClientEventSessionUpdate::getSession()
{
	return session;
}

void
RealtimeClientEventSessionUpdate::setSession(RealtimeSessionCreateRequest  session)
{
	this->session = session;
}



