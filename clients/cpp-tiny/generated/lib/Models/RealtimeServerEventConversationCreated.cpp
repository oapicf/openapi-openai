

#include "RealtimeServerEventConversationCreated.h"

using namespace Tiny;

RealtimeServerEventConversationCreated::RealtimeServerEventConversationCreated()
{
	event_id = std::string();
	type = std::string();
	conversation = RealtimeServerEventConversationCreated_conversation();
}

RealtimeServerEventConversationCreated::RealtimeServerEventConversationCreated(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventConversationCreated::~RealtimeServerEventConversationCreated()
{

}

void
RealtimeServerEventConversationCreated::fromJson(std::string jsonObj)
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

    const char *conversationKey = "conversation";

    if(object.has_key(conversationKey))
    {
        bourne::json value = object[conversationKey];




        RealtimeServerEventConversationCreated_conversation* obj = &conversation;
		obj->fromJson(value.dump());

    }


}

bourne::json
RealtimeServerEventConversationCreated::toJson()
{
    bourne::json object = bourne::json::object();





    object["event_id"] = getEventId();






    object["type"] = getType();







	object["conversation"] = getConversation().toJson();


    return object;

}

std::string
RealtimeServerEventConversationCreated::getEventId()
{
	return event_id;
}

void
RealtimeServerEventConversationCreated::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
RealtimeServerEventConversationCreated::getType()
{
	return type;
}

void
RealtimeServerEventConversationCreated::setType(std::string  type)
{
	this->type = type;
}

RealtimeServerEventConversationCreated_conversation
RealtimeServerEventConversationCreated::getConversation()
{
	return conversation;
}

void
RealtimeServerEventConversationCreated::setConversation(RealtimeServerEventConversationCreated_conversation  conversation)
{
	this->conversation = conversation;
}



