

#include "RealtimeServerEventResponseFunctionCallArgumentsDelta.h"

using namespace Tiny;

RealtimeServerEventResponseFunctionCallArgumentsDelta::RealtimeServerEventResponseFunctionCallArgumentsDelta()
{
	event_id = std::string();
	type = std::string();
	response_id = std::string();
	item_id = std::string();
	output_index = int(0);
	call_id = std::string();
	delta = std::string();
}

RealtimeServerEventResponseFunctionCallArgumentsDelta::RealtimeServerEventResponseFunctionCallArgumentsDelta(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventResponseFunctionCallArgumentsDelta::~RealtimeServerEventResponseFunctionCallArgumentsDelta()
{

}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::fromJson(std::string jsonObj)
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

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }

    const char *output_indexKey = "output_index";

    if(object.has_key(output_indexKey))
    {
        bourne::json value = object[output_indexKey];



        jsonToValue(&output_index, value, "int");


    }

    const char *call_idKey = "call_id";

    if(object.has_key(call_idKey))
    {
        bourne::json value = object[call_idKey];



        jsonToValue(&call_id, value, "std::string");


    }

    const char *deltaKey = "delta";

    if(object.has_key(deltaKey))
    {
        bourne::json value = object[deltaKey];



        jsonToValue(&delta, value, "std::string");


    }


}

bourne::json
RealtimeServerEventResponseFunctionCallArgumentsDelta::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();






    object["response_id"] = getResponseId();






    object["item_id"] = getItemId();






    object["output_index"] = getOutputIndex();






    object["call_id"] = getCallId();






    object["delta"] = getDelta();



    return object;

}

std::string
RealtimeServerEventResponseFunctionCallArgumentsDelta::getEventId()
{
	return event_id;
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventResponseFunctionCallArgumentsDelta::getType()
{
	return type;
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventResponseFunctionCallArgumentsDelta::getResponseId()
{
	return response_id;
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::setResponseId(std::string  response_id)
{
	this->response_id = response_id;
}

std::string
RealtimeServerEventResponseFunctionCallArgumentsDelta::getItemId()
{
	return item_id;
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

int
RealtimeServerEventResponseFunctionCallArgumentsDelta::getOutputIndex()
{
	return output_index;
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::setOutputIndex(int  output_index)
{
	this->output_index = output_index;
}

std::string
RealtimeServerEventResponseFunctionCallArgumentsDelta::getCallId()
{
	return call_id;
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::setCallId(std::string  call_id)
{
	this->call_id = call_id;
}

std::string
RealtimeServerEventResponseFunctionCallArgumentsDelta::getDelta()
{
	return delta;
}

void
RealtimeServerEventResponseFunctionCallArgumentsDelta::setDelta(std::string  delta)
{
	this->delta = delta;
}



