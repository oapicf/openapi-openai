

#include "RealtimeClientEventConversationItemDelete.h"

using namespace Tiny;

RealtimeClientEventConversationItemDelete::RealtimeClientEventConversationItemDelete()
{
	event_id = std::string();
	type = std::string();
	item_id = std::string();
}

RealtimeClientEventConversationItemDelete::RealtimeClientEventConversationItemDelete(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeClientEventConversationItemDelete::~RealtimeClientEventConversationItemDelete()
{

}

void
RealtimeClientEventConversationItemDelete::fromJson(std::string jsonObj)
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
RealtimeClientEventConversationItemDelete::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();






    object["item_id"] = getItemId();



    return object;

}

std::string
RealtimeClientEventConversationItemDelete::getEventId()
{
	return event_id;
}

void
RealtimeClientEventConversationItemDelete::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeClientEventConversationItemDelete::getType()
{
	return type;
}

void
RealtimeClientEventConversationItemDelete::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeClientEventConversationItemDelete::getItemId()
{
	return item_id;
}

void
RealtimeClientEventConversationItemDelete::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}



