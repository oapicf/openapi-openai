

#include "TruncationObject.h"

using namespace Tiny;

TruncationObject::TruncationObject()
{
	type = std::string();
	last_messages = int(0);
}

TruncationObject::TruncationObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

TruncationObject::~TruncationObject()
{

}

void
TruncationObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *last_messagesKey = "last_messages";

    if(object.has_key(last_messagesKey))
    {
        bourne::json value = object[last_messagesKey];



        jsonToValue(&last_messages, value, "int");


    }


}

bourne::json
TruncationObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["last_messages"] = getLastMessages();



    return object;

}

std::string
TruncationObject::getType()
{
	return type;
}

void
TruncationObject::setType(std::string  type)
{
	this->type = type;
}

int
TruncationObject::getLastMessages()
{
	return last_messages;
}

void
TruncationObject::setLastMessages(int  last_messages)
{
	this->last_messages = last_messages;
}



