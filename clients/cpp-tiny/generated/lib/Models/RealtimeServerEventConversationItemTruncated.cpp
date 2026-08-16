

#include "RealtimeServerEventConversationItemTruncated.h"

using namespace Tiny;

RealtimeServerEventConversationItemTruncated::RealtimeServerEventConversationItemTruncated()
{
	event_id = std::string();
	type = std::string();
	item_id = std::string();
	content_index = int(0);
	audio_end_ms = int(0);
}

RealtimeServerEventConversationItemTruncated::RealtimeServerEventConversationItemTruncated(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventConversationItemTruncated::~RealtimeServerEventConversationItemTruncated()
{

}

void
RealtimeServerEventConversationItemTruncated::fromJson(std::string jsonObj)
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
RealtimeServerEventConversationItemTruncated::toJson()
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
RealtimeServerEventConversationItemTruncated::getEventId()
{
	return event_id;
}

void
RealtimeServerEventConversationItemTruncated::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventConversationItemTruncated::getType()
{
	return type;
}

void
RealtimeServerEventConversationItemTruncated::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventConversationItemTruncated::getItemId()
{
	return item_id;
}

void
RealtimeServerEventConversationItemTruncated::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

int
RealtimeServerEventConversationItemTruncated::getContentIndex()
{
	return content_index;
}

void
RealtimeServerEventConversationItemTruncated::setContentIndex(int  content_index)
{
	this->content_index = content_index;
}

int
RealtimeServerEventConversationItemTruncated::getAudioEndMs()
{
	return audio_end_ms;
}

void
RealtimeServerEventConversationItemTruncated::setAudioEndMs(int  audio_end_ms)
{
	this->audio_end_ms = audio_end_ms;
}



