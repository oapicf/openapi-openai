

#include "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.h"

using namespace Tiny;

RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::RealtimeServerEventConversationItemInputAudioTranscriptionCompleted()
{
	event_id = std::string();
	type = std::string();
	item_id = std::string();
	content_index = int(0);
	transcript = std::string();
}

RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::RealtimeServerEventConversationItemInputAudioTranscriptionCompleted(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::~RealtimeServerEventConversationItemInputAudioTranscriptionCompleted()
{

}

void
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::fromJson(std::string jsonObj)
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

    const char *transcriptKey = "transcript";

    if(object.has_key(transcriptKey))
    {
        bourne::json value = object[transcriptKey];



        jsonToValue(&transcript, value, "std::string");


    }


}

bourne::json
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();






    object["item_id"] = getItemId();






    object["content_index"] = getContentIndex();






    object["transcript"] = getTranscript();



    return object;

}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::getEventId()
{
	return event_id;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::getType()
{
	return type;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::getItemId()
{
	return item_id;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

int
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::getContentIndex()
{
	return content_index;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::setContentIndex(int  content_index)
{
	this->content_index = content_index;
}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::getTranscript()
{
	return transcript;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted::setTranscript(std::string  transcript)
{
	this->transcript = transcript;
}



