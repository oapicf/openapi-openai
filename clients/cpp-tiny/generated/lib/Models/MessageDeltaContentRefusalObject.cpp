

#include "MessageDeltaContentRefusalObject.h"

using namespace Tiny;

MessageDeltaContentRefusalObject::MessageDeltaContentRefusalObject()
{
	index = int(0);
	type = std::string();
	refusal = std::string();
}

MessageDeltaContentRefusalObject::MessageDeltaContentRefusalObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageDeltaContentRefusalObject::~MessageDeltaContentRefusalObject()
{

}

void
MessageDeltaContentRefusalObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "int");


    }

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
MessageDeltaContentRefusalObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();






    object["type"] = getType();






    object["refusal"] = getRefusal();



    return object;

}

int
MessageDeltaContentRefusalObject::getIndex()
{
	return index;
}

void
MessageDeltaContentRefusalObject::setIndex(int  index)
{
	this->index = index;
}

std::string
MessageDeltaContentRefusalObject::getType()
{
	return type;
}

void
MessageDeltaContentRefusalObject::setType(std::string  type)
{
	this->type = type;
}

std::string
MessageDeltaContentRefusalObject::getRefusal()
{
	return refusal;
}

void
MessageDeltaContentRefusalObject::setRefusal(std::string  refusal)
{
	this->refusal = refusal;
}



