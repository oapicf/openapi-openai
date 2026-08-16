

#include "RunStepDetailsMessageCreationObject.h"

using namespace Tiny;

RunStepDetailsMessageCreationObject::RunStepDetailsMessageCreationObject()
{
	type = std::string();
	message_creation = RunStepDetailsMessageCreationObject_message_creation();
}

RunStepDetailsMessageCreationObject::RunStepDetailsMessageCreationObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDetailsMessageCreationObject::~RunStepDetailsMessageCreationObject()
{

}

void
RunStepDetailsMessageCreationObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *message_creationKey = "message_creation";

    if(object.has_key(message_creationKey))
    {
        bourne::json value = object[message_creationKey];




        RunStepDetailsMessageCreationObject_message_creation* obj = &message_creation;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepDetailsMessageCreationObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["message_creation"] = getMessageCreation().toJson();


    return object;

}

std::string
RunStepDetailsMessageCreationObject::getType()
{
	return type;
}

void
RunStepDetailsMessageCreationObject::setType(std::string  type)
{
	this->type = type;
}

RunStepDetailsMessageCreationObject_message_creation
RunStepDetailsMessageCreationObject::getMessageCreation()
{
	return message_creation;
}

void
RunStepDetailsMessageCreationObject::setMessageCreation(RunStepDetailsMessageCreationObject_message_creation  message_creation)
{
	this->message_creation = message_creation;
}



