

#include "ModifyRunRequest.h"

using namespace Tiny;

ModifyRunRequest::ModifyRunRequest()
{
	metadata = null;
}

ModifyRunRequest::ModifyRunRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ModifyRunRequest::~ModifyRunRequest()
{

}

void
ModifyRunRequest::fromJson(std::string jsonObj)
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
ModifyRunRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["metadata"] = getMetadata().toJson();


    return object;

}

Object
ModifyRunRequest::getMetadata()
{
	return metadata;
}

void
ModifyRunRequest::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}



