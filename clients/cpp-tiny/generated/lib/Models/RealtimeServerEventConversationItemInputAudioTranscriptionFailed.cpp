

#include "RealtimeServerEventConversationItemInputAudioTranscriptionFailed.h"

using namespace Tiny;

RealtimeServerEventConversationItemInputAudioTranscriptionFailed::RealtimeServerEventConversationItemInputAudioTranscriptionFailed()
{
	event_id = std::string();
	type = std::string();
	item_id = std::string();
	content_index = int(0);
	error = RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error();
}

RealtimeServerEventConversationItemInputAudioTranscriptionFailed::RealtimeServerEventConversationItemInputAudioTranscriptionFailed(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventConversationItemInputAudioTranscriptionFailed::~RealtimeServerEventConversationItemInputAudioTranscriptionFailed()
{

}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::fromJson(std::string jsonObj)
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

    const char *errorKey = "error";

    if(object.has_key(errorKey))
    {
        bourne::json value = object[errorKey];




        RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error* obj = &error;
		obj->fromJson(value.dump());

    }


}

bourne::json
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();






    object["item_id"] = getItemId();






    object["content_index"] = getContentIndex();







	object["error"] = getError().toJson();


    return object;

}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::getEventId()
{
	return event_id;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::getType()
{
	return type;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::getItemId()
{
	return item_id;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

int
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::getContentIndex()
{
	return content_index;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::setContentIndex(int  content_index)
{
	this->content_index = content_index;
}

RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::getError()
{
	return error;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed::setError(RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error  error)
{
	this->error = error;
}



