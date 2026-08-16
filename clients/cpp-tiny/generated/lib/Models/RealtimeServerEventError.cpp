

#include "RealtimeServerEventError.h"

using namespace Tiny;

RealtimeServerEventError::RealtimeServerEventError()
{
	event_id = std::string();
	type = std::string();
	error = RealtimeServerEventError_error();
}

RealtimeServerEventError::RealtimeServerEventError(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventError::~RealtimeServerEventError()
{

}

void
RealtimeServerEventError::fromJson(std::string jsonObj)
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

    const char *errorKey = "error";

    if(object.has_key(errorKey))
    {
        bourne::json value = object[errorKey];




        RealtimeServerEventError_error* obj = &error;
		obj->fromJson(value.dump());

    }


}

bourne::json
RealtimeServerEventError::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();







	object["error"] = getError().toJson();


    return object;

}

std::string
RealtimeServerEventError::getEventId()
{
	return event_id;
}

void
RealtimeServerEventError::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventError::getType()
{
	return type;
}

void
RealtimeServerEventError::setType(std::string  type)
{
	this->type = type;
}

RealtimeServerEventError_error
RealtimeServerEventError::getError()
{
	return error;
}

void
RealtimeServerEventError::setError(RealtimeServerEventError_error  error)
{
	this->error = error;
}



