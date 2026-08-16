

#include "RealtimeServerEventResponseOutputItemDone.h"

using namespace Tiny;

RealtimeServerEventResponseOutputItemDone::RealtimeServerEventResponseOutputItemDone()
{
	event_id = std::string();
	type = std::string();
	response_id = std::string();
	output_index = int(0);
	item = RealtimeConversationItem();
}

RealtimeServerEventResponseOutputItemDone::RealtimeServerEventResponseOutputItemDone(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventResponseOutputItemDone::~RealtimeServerEventResponseOutputItemDone()
{

}

void
RealtimeServerEventResponseOutputItemDone::fromJson(std::string jsonObj)
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

    const char *output_indexKey = "output_index";

    if(object.has_key(output_indexKey))
    {
        bourne::json value = object[output_indexKey];



        jsonToValue(&output_index, value, "int");


    }

    const char *itemKey = "item";

    if(object.has_key(itemKey))
    {
        bourne::json value = object[itemKey];




        RealtimeConversationItem* obj = &item;
		obj->fromJson(value.dump());

    }


}

bourne::json
RealtimeServerEventResponseOutputItemDone::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();






    object["response_id"] = getResponseId();






    object["output_index"] = getOutputIndex();







	object["item"] = getItem().toJson();


    return object;

}

std::string
RealtimeServerEventResponseOutputItemDone::getEventId()
{
	return event_id;
}

void
RealtimeServerEventResponseOutputItemDone::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventResponseOutputItemDone::getType()
{
	return type;
}

void
RealtimeServerEventResponseOutputItemDone::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventResponseOutputItemDone::getResponseId()
{
	return response_id;
}

void
RealtimeServerEventResponseOutputItemDone::setResponseId(std::string  response_id)
{
	this->response_id = response_id;
}

int
RealtimeServerEventResponseOutputItemDone::getOutputIndex()
{
	return output_index;
}

void
RealtimeServerEventResponseOutputItemDone::setOutputIndex(int  output_index)
{
	this->output_index = output_index;
}

RealtimeConversationItem
RealtimeServerEventResponseOutputItemDone::getItem()
{
	return item;
}

void
RealtimeServerEventResponseOutputItemDone::setItem(RealtimeConversationItem  item)
{
	this->item = item;
}



