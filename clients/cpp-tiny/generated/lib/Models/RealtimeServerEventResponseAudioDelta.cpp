

#include "RealtimeServerEventResponseAudioDelta.h"

using namespace Tiny;

RealtimeServerEventResponseAudioDelta::RealtimeServerEventResponseAudioDelta()
{
	event_id = std::string();
	type = std::string();
	response_id = std::string();
	item_id = std::string();
	output_index = int(0);
	content_index = int(0);
	delta = std::string();
}

RealtimeServerEventResponseAudioDelta::RealtimeServerEventResponseAudioDelta(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventResponseAudioDelta::~RealtimeServerEventResponseAudioDelta()
{

}

void
RealtimeServerEventResponseAudioDelta::fromJson(std::string jsonObj)
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

    const char *content_indexKey = "content_index";

    if(object.has_key(content_indexKey))
    {
        bourne::json value = object[content_indexKey];



        jsonToValue(&content_index, value, "int");


    }

    const char *deltaKey = "delta";

    if(object.has_key(deltaKey))
    {
        bourne::json value = object[deltaKey];



        jsonToValue(&delta, value, "std::string");


    }


}

bourne::json
RealtimeServerEventResponseAudioDelta::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();






    object["response_id"] = getResponseId();






    object["item_id"] = getItemId();






    object["output_index"] = getOutputIndex();






    object["content_index"] = getContentIndex();






    object["delta"] = getDelta();



    return object;

}

std::string
RealtimeServerEventResponseAudioDelta::getEventId()
{
	return event_id;
}

void
RealtimeServerEventResponseAudioDelta::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventResponseAudioDelta::getType()
{
	return type;
}

void
RealtimeServerEventResponseAudioDelta::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventResponseAudioDelta::getResponseId()
{
	return response_id;
}

void
RealtimeServerEventResponseAudioDelta::setResponseId(std::string  response_id)
{
	this->response_id = response_id;
}

std::string
RealtimeServerEventResponseAudioDelta::getItemId()
{
	return item_id;
}

void
RealtimeServerEventResponseAudioDelta::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

int
RealtimeServerEventResponseAudioDelta::getOutputIndex()
{
	return output_index;
}

void
RealtimeServerEventResponseAudioDelta::setOutputIndex(int  output_index)
{
	this->output_index = output_index;
}

int
RealtimeServerEventResponseAudioDelta::getContentIndex()
{
	return content_index;
}

void
RealtimeServerEventResponseAudioDelta::setContentIndex(int  content_index)
{
	this->content_index = content_index;
}

std::string
RealtimeServerEventResponseAudioDelta::getDelta()
{
	return delta;
}

void
RealtimeServerEventResponseAudioDelta::setDelta(std::string  delta)
{
	this->delta = delta;
}



