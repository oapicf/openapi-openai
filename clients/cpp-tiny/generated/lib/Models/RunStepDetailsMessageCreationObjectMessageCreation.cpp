

#include "RunStepDetailsMessageCreationObject_message_creation.h"

using namespace Tiny;

RunStepDetailsMessageCreationObject_message_creation::RunStepDetailsMessageCreationObject_message_creation()
{
	message_id = std::string();
}

RunStepDetailsMessageCreationObject_message_creation::RunStepDetailsMessageCreationObject_message_creation(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDetailsMessageCreationObject_message_creation::~RunStepDetailsMessageCreationObject_message_creation()
{

}

void
RunStepDetailsMessageCreationObject_message_creation::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *message_idKey = "message_id";

    if(object.has_key(message_idKey))
    {
        bourne::json value = object[message_idKey];



        jsonToValue(&message_id, value, "std::string");


    }


}

bourne::json
RunStepDetailsMessageCreationObject_message_creation::toJson()
{
    bourne::json object = bourne::json::object();





    object["message_id"] = getMessageId();



    return object;

}

std::string
RunStepDetailsMessageCreationObject_message_creation::getMessageId()
{
	return message_id;
}

void
RunStepDetailsMessageCreationObject_message_creation::setMessageId(std::string  message_id)
{
	this->message_id = message_id;
}



