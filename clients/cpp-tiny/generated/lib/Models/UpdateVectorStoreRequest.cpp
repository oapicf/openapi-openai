

#include "UpdateVectorStoreRequest.h"

using namespace Tiny;

UpdateVectorStoreRequest::UpdateVectorStoreRequest()
{
	name = std::string();
	expires_after = VectorStoreExpirationAfter();
	metadata = null;
}

UpdateVectorStoreRequest::UpdateVectorStoreRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateVectorStoreRequest::~UpdateVectorStoreRequest()
{

}

void
UpdateVectorStoreRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *expires_afterKey = "expires_after";

    if(object.has_key(expires_afterKey))
    {
        bourne::json value = object[expires_afterKey];




        VectorStoreExpirationAfter* obj = &expires_after;
		obj->fromJson(value.dump());

    }

    const char *metadataKey = "metadata";

    if(object.has_key(metadataKey))
    {
        bourne::json value = object[metadataKey];




        Object* obj = &metadata;
		obj->fromJson(value.dump());

    }


}

bourne::json
UpdateVectorStoreRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["expires_after"] = getExpiresAfter().toJson();






	object["metadata"] = getMetadata().toJson();


    return object;

}

std::string
UpdateVectorStoreRequest::getName()
{
	return name;
}

void
UpdateVectorStoreRequest::setName(std::string  name)
{
	this->name = name;
}

VectorStoreExpirationAfter
UpdateVectorStoreRequest::getExpiresAfter()
{
	return expires_after;
}

void
UpdateVectorStoreRequest::setExpiresAfter(VectorStoreExpirationAfter  expires_after)
{
	this->expires_after = expires_after;
}

Object
UpdateVectorStoreRequest::getMetadata()
{
	return metadata;
}

void
UpdateVectorStoreRequest::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}



