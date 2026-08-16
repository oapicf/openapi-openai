

#include "RealtimeServerEventInputAudioBufferCommitted.h"

using namespace Tiny;

RealtimeServerEventInputAudioBufferCommitted::RealtimeServerEventInputAudioBufferCommitted()
{
	event_id = std::string();
	type = std::string();
	previous_item_id = std::string();
	item_id = std::string();
}

RealtimeServerEventInputAudioBufferCommitted::RealtimeServerEventInputAudioBufferCommitted(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventInputAudioBufferCommitted::~RealtimeServerEventInputAudioBufferCommitted()
{

}

void
RealtimeServerEventInputAudioBufferCommitted::fromJson(std::string jsonObj)
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

    const char *previous_item_idKey = "previous_item_id";

    if(object.has_key(previous_item_idKey))
    {
        bourne::json value = object[previous_item_idKey];



        jsonToValue(&previous_item_id, value, "std::string");


    }

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }


}

bourne::json
RealtimeServerEventInputAudioBufferCommitted::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();






    object["previous_item_id"] = getPreviousItemId();






    object["item_id"] = getItemId();



    return object;

}

std::string
RealtimeServerEventInputAudioBufferCommitted::getEventId()
{
	return event_id;
}

void
RealtimeServerEventInputAudioBufferCommitted::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventInputAudioBufferCommitted::getType()
{
	return type;
}

void
RealtimeServerEventInputAudioBufferCommitted::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventInputAudioBufferCommitted::getPreviousItemId()
{
	return previous_item_id;
}

void
RealtimeServerEventInputAudioBufferCommitted::setPreviousItemId(std::string  previous_item_id)
{
	this->previous_item_id = previous_item_id;
}

std::string
RealtimeServerEventInputAudioBufferCommitted::getItemId()
{
	return item_id;
}

void
RealtimeServerEventInputAudioBufferCommitted::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}



