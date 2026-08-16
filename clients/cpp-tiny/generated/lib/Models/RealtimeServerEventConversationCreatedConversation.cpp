

#include "RealtimeServerEventConversationCreated_conversation.h"

using namespace Tiny;

RealtimeServerEventConversationCreated_conversation::RealtimeServerEventConversationCreated_conversation()
{
	id = std::string();
	object = std::string();
}

RealtimeServerEventConversationCreated_conversation::RealtimeServerEventConversationCreated_conversation(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventConversationCreated_conversation::~RealtimeServerEventConversationCreated_conversation()
{

}

void
RealtimeServerEventConversationCreated_conversation::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }


}

bourne::json
RealtimeServerEventConversationCreated_conversation::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["object"] = getObject();



    return object;

}

std::string
RealtimeServerEventConversationCreated_conversation::getId()
{
	return id;
}

void
RealtimeServerEventConversationCreated_conversation::setId(std::string  id)
{
	this->id = id;
}

std::string
RealtimeServerEventConversationCreated_conversation::getObject()
{
	return object;
}

void
RealtimeServerEventConversationCreated_conversation::setObject(std::string  object)
{
	this->object = object;
}



