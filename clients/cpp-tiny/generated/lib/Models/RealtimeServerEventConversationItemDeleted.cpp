

#include "RealtimeServerEventConversationItemDeleted.h"

using namespace Tiny;

RealtimeServerEventConversationItemDeleted::RealtimeServerEventConversationItemDeleted()
{
	event_id = std::string();
	type = std::string();
	item_id = std::string();
}

RealtimeServerEventConversationItemDeleted::RealtimeServerEventConversationItemDeleted(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventConversationItemDeleted::~RealtimeServerEventConversationItemDeleted()
{

}

void
RealtimeServerEventConversationItemDeleted::fromJson(std::string jsonObj)
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

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }


}

bourne::json
RealtimeServerEventConversationItemDeleted::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();






    object["item_id"] = getItemId();



    return object;

}

std::string
RealtimeServerEventConversationItemDeleted::getEventId()
{
	return event_id;
}

void
RealtimeServerEventConversationItemDeleted::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventConversationItemDeleted::getType()
{
	return type;
}

void
RealtimeServerEventConversationItemDeleted::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventConversationItemDeleted::getItemId()
{
	return item_id;
}

void
RealtimeServerEventConversationItemDeleted::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}



