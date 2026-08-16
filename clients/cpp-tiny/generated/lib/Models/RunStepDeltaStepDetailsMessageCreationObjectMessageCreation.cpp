

#include "RunStepDeltaStepDetailsMessageCreationObject_message_creation.h"

using namespace Tiny;

RunStepDeltaStepDetailsMessageCreationObject_message_creation::RunStepDeltaStepDetailsMessageCreationObject_message_creation()
{
	message_id = std::string();
}

RunStepDeltaStepDetailsMessageCreationObject_message_creation::RunStepDeltaStepDetailsMessageCreationObject_message_creation(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDeltaStepDetailsMessageCreationObject_message_creation::~RunStepDeltaStepDetailsMessageCreationObject_message_creation()
{

}

void
RunStepDeltaStepDetailsMessageCreationObject_message_creation::fromJson(std::string jsonObj)
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
RunStepDeltaStepDetailsMessageCreationObject_message_creation::toJson()
{
    bourne::json object = bourne::json::object();





    object["message_id"] = getMessageId();



    return object;

}

std::string
RunStepDeltaStepDetailsMessageCreationObject_message_creation::getMessageId()
{
	return message_id;
}

void
RunStepDeltaStepDetailsMessageCreationObject_message_creation::setMessageId(std::string  message_id)
{
	this->message_id = message_id;
}



