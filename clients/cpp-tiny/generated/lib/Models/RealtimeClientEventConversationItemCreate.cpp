

#include "RealtimeClientEventConversationItemCreate.h"

using namespace Tiny;

RealtimeClientEventConversationItemCreate::RealtimeClientEventConversationItemCreate()
{
	event_id = std::string();
	type = std::string();
	previous_item_id = std::string();
	item = RealtimeConversationItem();
}

RealtimeClientEventConversationItemCreate::RealtimeClientEventConversationItemCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeClientEventConversationItemCreate::~RealtimeClientEventConversationItemCreate()
{

}

void
RealtimeClientEventConversationItemCreate::fromJson(std::string jsonObj)
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

    const char *itemKey = "item";

    if(object.has_key(itemKey))
    {
        bourne::json value = object[itemKey];




        RealtimeConversationItem* obj = &item;
		obj->fromJson(value.dump());

    }


}

bourne::json
RealtimeClientEventConversationItemCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();






    object["previous_item_id"] = getPreviousItemId();







	object["item"] = getItem().toJson();


    return object;

}

std::string
RealtimeClientEventConversationItemCreate::getEventId()
{
	return event_id;
}

void
RealtimeClientEventConversationItemCreate::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeClientEventConversationItemCreate::getType()
{
	return type;
}

void
RealtimeClientEventConversationItemCreate::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeClientEventConversationItemCreate::getPreviousItemId()
{
	return previous_item_id;
}

void
RealtimeClientEventConversationItemCreate::setPreviousItemId(std::string  previous_item_id)
{
	this->previous_item_id = previous_item_id;
}

RealtimeConversationItem
RealtimeClientEventConversationItemCreate::getItem()
{
	return item;
}

void
RealtimeClientEventConversationItemCreate::setItem(RealtimeConversationItem  item)
{
	this->item = item;
}



