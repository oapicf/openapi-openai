

#include "MessageContentRefusalObject.h"

using namespace Tiny;

MessageContentRefusalObject::MessageContentRefusalObject()
{
	type = std::string();
	refusal = std::string();
}

MessageContentRefusalObject::MessageContentRefusalObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageContentRefusalObject::~MessageContentRefusalObject()
{

}

void
MessageContentRefusalObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *refusalKey = "refusal";

    if(object.has_key(refusalKey))
    {
        bourne::json value = object[refusalKey];



        jsonToValue(&refusal, value, "std::string");


    }


}

bourne::json
MessageContentRefusalObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["refusal"] = getRefusal();



    return object;

}

std::string
MessageContentRefusalObject::getType()
{
	return type;
}

void
MessageContentRefusalObject::setType(std::string  type)
{
	this->type = type;
}

std::string
MessageContentRefusalObject::getRefusal()
{
	return refusal;
}

void
MessageContentRefusalObject::setRefusal(std::string  refusal)
{
	this->refusal = refusal;
}



