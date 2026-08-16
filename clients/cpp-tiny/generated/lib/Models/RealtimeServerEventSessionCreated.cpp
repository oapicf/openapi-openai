

#include "RealtimeServerEventSessionCreated.h"

using namespace Tiny;

RealtimeServerEventSessionCreated::RealtimeServerEventSessionCreated()
{
	event_id = std::string();
	type = std::string();
	session = RealtimeSession();
}

RealtimeServerEventSessionCreated::RealtimeServerEventSessionCreated(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventSessionCreated::~RealtimeServerEventSessionCreated()
{

}

void
RealtimeServerEventSessionCreated::fromJson(std::string jsonObj)
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




        RealtimeSession* obj = &session;
		obj->fromJson(value.dump());

    }


}

bourne::json
RealtimeServerEventSessionCreated::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();







	object["session"] = getSession().toJson();


    return object;

}

std::string
RealtimeServerEventSessionCreated::getEventId()
{
	return event_id;
}

void
RealtimeServerEventSessionCreated::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventSessionCreated::getType()
{
	return type;
}

void
RealtimeServerEventSessionCreated::setType(std::string  type)
{
	this->type = type;
}

RealtimeSession
RealtimeServerEventSessionCreated::getSession()
{
	return session;
}

void
RealtimeServerEventSessionCreated::setSession(RealtimeSession  session)
{
	this->session = session;
}



