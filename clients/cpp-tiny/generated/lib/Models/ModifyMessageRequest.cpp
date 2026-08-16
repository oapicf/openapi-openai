

#include "ModifyMessageRequest.h"

using namespace Tiny;

ModifyMessageRequest::ModifyMessageRequest()
{
	metadata = null;
}

ModifyMessageRequest::ModifyMessageRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ModifyMessageRequest::~ModifyMessageRequest()
{

}

void
ModifyMessageRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *metadataKey = "metadata";

    if(object.has_key(metadataKey))
    {
        bourne::json value = object[metadataKey];




        Object* obj = &metadata;
		obj->fromJson(value.dump());

    }


}

bourne::json
ModifyMessageRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["metadata"] = getMetadata().toJson();


    return object;

}

Object
ModifyMessageRequest::getMetadata()
{
	return metadata;
}

void
ModifyMessageRequest::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}



