

#include "RealtimeServerEventError_error.h"

using namespace Tiny;

RealtimeServerEventError_error::RealtimeServerEventError_error()
{
	type = std::string();
	code = std::string();
	message = std::string();
	param = std::string();
	event_id = std::string();
}

RealtimeServerEventError_error::RealtimeServerEventError_error(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventError_error::~RealtimeServerEventError_error()
{

}

void
RealtimeServerEventError_error::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "std::string");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }

    const char *paramKey = "param";

    if(object.has_key(paramKey))
    {
        bourne::json value = object[paramKey];



        jsonToValue(&param, value, "std::string");


    }

    const char *event_idKey = "event_id";

    if(object.has_key(event_idKey))
    {
        bourne::json value = object[event_idKey];



        jsonToValue(&event_id, value, "std::string");


    }


}

bourne::json
RealtimeServerEventError_error::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["code"] = getCode();






    object["message"] = getMessage();






    object["param"] = getParam();






    object["event_id"] = getEventId();



    return object;

}

std::string
RealtimeServerEventError_error::getType()
{
	return type;
}

void
RealtimeServerEventError_error::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventError_error::getCode()
{
	return code;
}

void
RealtimeServerEventError_error::setCode(std::string  code)
{
	this->code = code;
}

std::string
RealtimeServerEventError_error::getMessage()
{
	return message;
}

void
RealtimeServerEventError_error::setMessage(std::string  message)
{
	this->message = message;
}

std::string
RealtimeServerEventError_error::getParam()
{
	return param;
}

void
RealtimeServerEventError_error::setParam(std::string  param)
{
	this->param = param;
}

std::string
RealtimeServerEventError_error::getEventId()
{
	return event_id;
}

void
RealtimeServerEventError_error::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}



