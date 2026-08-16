

#include "RealtimeClientEventConversationItemTruncate.h"

using namespace Tiny;

RealtimeClientEventConversationItemTruncate::RealtimeClientEventConversationItemTruncate()
{
	event_id = std::string();
	type = std::string();
	item_id = std::string();
	content_index = int(0);
	audio_end_ms = int(0);
}

RealtimeClientEventConversationItemTruncate::RealtimeClientEventConversationItemTruncate(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeClientEventConversationItemTruncate::~RealtimeClientEventConversationItemTruncate()
{

}

void
RealtimeClientEventConversationItemTruncate::fromJson(std::string jsonObj)
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

    const char *content_indexKey = "content_index";

    if(object.has_key(content_indexKey))
    {
        bourne::json value = object[content_indexKey];



        jsonToValue(&content_index, value, "int");


    }

    const char *audio_end_msKey = "audio_end_ms";

    if(object.has_key(audio_end_msKey))
    {
        bourne::json value = object[audio_end_msKey];



        jsonToValue(&audio_end_ms, value, "int");


    }


}

bourne::json
RealtimeClientEventConversationItemTruncate::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();






    object["item_id"] = getItemId();






    object["content_index"] = getContentIndex();






    object["audio_end_ms"] = getAudioEndMs();



    return object;

}

std::string
RealtimeClientEventConversationItemTruncate::getEventId()
{
	return event_id;
}

void
RealtimeClientEventConversationItemTruncate::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeClientEventConversationItemTruncate::getType()
{
	return type;
}

void
RealtimeClientEventConversationItemTruncate::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeClientEventConversationItemTruncate::getItemId()
{
	return item_id;
}

void
RealtimeClientEventConversationItemTruncate::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

int
RealtimeClientEventConversationItemTruncate::getContentIndex()
{
	return content_index;
}

void
RealtimeClientEventConversationItemTruncate::setContentIndex(int  content_index)
{
	this->content_index = content_index;
}

int
RealtimeClientEventConversationItemTruncate::getAudioEndMs()
{
	return audio_end_ms;
}

void
RealtimeClientEventConversationItemTruncate::setAudioEndMs(int  audio_end_ms)
{
	this->audio_end_ms = audio_end_ms;
}



