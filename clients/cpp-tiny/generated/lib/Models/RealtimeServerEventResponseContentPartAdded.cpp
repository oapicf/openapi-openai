

#include "RealtimeServerEventResponseContentPartAdded.h"

using namespace Tiny;

RealtimeServerEventResponseContentPartAdded::RealtimeServerEventResponseContentPartAdded()
{
	event_id = std::string();
	type = std::string();
	response_id = std::string();
	item_id = std::string();
	output_index = int(0);
	content_index = int(0);
	part = RealtimeServerEventResponseContentPartAdded_part();
}

RealtimeServerEventResponseContentPartAdded::RealtimeServerEventResponseContentPartAdded(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventResponseContentPartAdded::~RealtimeServerEventResponseContentPartAdded()
{

}

void
RealtimeServerEventResponseContentPartAdded::fromJson(std::string jsonObj)
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

    const char *partKey = "part";

    if(object.has_key(partKey))
    {
        bourne::json value = object[partKey];




        RealtimeServerEventResponseContentPartAdded_part* obj = &part;
		obj->fromJson(value.dump());

    }


}

bourne::json
RealtimeServerEventResponseContentPartAdded::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();






    object["response_id"] = getResponseId();






    object["item_id"] = getItemId();






    object["output_index"] = getOutputIndex();






    object["content_index"] = getContentIndex();







	object["part"] = getPart().toJson();


    return object;

}

std::string
RealtimeServerEventResponseContentPartAdded::getEventId()
{
	return event_id;
}

void
RealtimeServerEventResponseContentPartAdded::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventResponseContentPartAdded::getType()
{
	return type;
}

void
RealtimeServerEventResponseContentPartAdded::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventResponseContentPartAdded::getResponseId()
{
	return response_id;
}

void
RealtimeServerEventResponseContentPartAdded::setResponseId(std::string  response_id)
{
	this->response_id = response_id;
}

std::string
RealtimeServerEventResponseContentPartAdded::getItemId()
{
	return item_id;
}

void
RealtimeServerEventResponseContentPartAdded::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

int
RealtimeServerEventResponseContentPartAdded::getOutputIndex()
{
	return output_index;
}

void
RealtimeServerEventResponseContentPartAdded::setOutputIndex(int  output_index)
{
	this->output_index = output_index;
}

int
RealtimeServerEventResponseContentPartAdded::getContentIndex()
{
	return content_index;
}

void
RealtimeServerEventResponseContentPartAdded::setContentIndex(int  content_index)
{
	this->content_index = content_index;
}

RealtimeServerEventResponseContentPartAdded_part
RealtimeServerEventResponseContentPartAdded::getPart()
{
	return part;
}

void
RealtimeServerEventResponseContentPartAdded::setPart(RealtimeServerEventResponseContentPartAdded_part  part)
{
	this->part = part;
}



