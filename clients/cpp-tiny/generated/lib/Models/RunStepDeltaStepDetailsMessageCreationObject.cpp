

#include "RunStepDeltaStepDetailsMessageCreationObject.h"

using namespace Tiny;

RunStepDeltaStepDetailsMessageCreationObject::RunStepDeltaStepDetailsMessageCreationObject()
{
	type = std::string();
	message_creation = RunStepDeltaStepDetailsMessageCreationObject_message_creation();
}

RunStepDeltaStepDetailsMessageCreationObject::RunStepDeltaStepDetailsMessageCreationObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDeltaStepDetailsMessageCreationObject::~RunStepDeltaStepDetailsMessageCreationObject()
{

}

void
RunStepDeltaStepDetailsMessageCreationObject::fromJson(std::string jsonObj)
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




        RunStepDeltaStepDetailsMessageCreationObject_message_creation* obj = &message_creation;
		obj->fromJson(value.dump());

    }


}

bourne::json
RunStepDeltaStepDetailsMessageCreationObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["message_creation"] = getMessageCreation().toJson();


    return object;

}

std::string
RunStepDeltaStepDetailsMessageCreationObject::getType()
{
	return type;
}

void
RunStepDeltaStepDetailsMessageCreationObject::setType(std::string  type)
{
	this->type = type;
}

RunStepDeltaStepDetailsMessageCreationObject_message_creation
RunStepDeltaStepDetailsMessageCreationObject::getMessageCreation()
{
	return message_creation;
}

void
RunStepDeltaStepDetailsMessageCreationObject::setMessageCreation(RunStepDeltaStepDetailsMessageCreationObject_message_creation  message_creation)
{
	this->message_creation = message_creation;
}



