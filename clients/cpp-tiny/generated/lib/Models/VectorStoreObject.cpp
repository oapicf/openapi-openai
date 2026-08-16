

#include "VectorStoreObject.h"

using namespace Tiny;

VectorStoreObject::VectorStoreObject()
{
	id = std::string();
	object = std::string();
	created_at = int(0);
	name = std::string();
	usage_bytes = int(0);
	file_counts = VectorStoreObject_file_counts();
	status = std::string();
	expires_after = VectorStoreExpirationAfter();
	expires_at = int(0);
	last_active_at = int(0);
	metadata = null;
}

VectorStoreObject::VectorStoreObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

VectorStoreObject::~VectorStoreObject()
{

}

void
VectorStoreObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *usage_bytesKey = "usage_bytes";

    if(object.has_key(usage_bytesKey))
    {
        bourne::json value = object[usage_bytesKey];



        jsonToValue(&usage_bytes, value, "int");


    }

    const char *file_countsKey = "file_counts";

    if(object.has_key(file_countsKey))
    {
        bourne::json value = object[file_countsKey];




        VectorStoreObject_file_counts* obj = &file_counts;
		obj->fromJson(value.dump());

    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }

    const char *expires_afterKey = "expires_after";

    if(object.has_key(expires_afterKey))
    {
        bourne::json value = object[expires_afterKey];




        VectorStoreExpirationAfter* obj = &expires_after;
		obj->fromJson(value.dump());

    }

    const char *expires_atKey = "expires_at";

    if(object.has_key(expires_atKey))
    {
        bourne::json value = object[expires_atKey];



        jsonToValue(&expires_at, value, "int");


    }

    const char *last_active_atKey = "last_active_at";

    if(object.has_key(last_active_atKey))
    {
        bourne::json value = object[last_active_atKey];



        jsonToValue(&last_active_at, value, "int");


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
VectorStoreObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["object"] = getObject();






    object["created_at"] = getCreatedAt();






    object["name"] = getName();






    object["usage_bytes"] = getUsageBytes();







	object["file_counts"] = getFileCounts().toJson();





    object["status"] = getStatus();







	object["expires_after"] = getExpiresAfter().toJson();





    object["expires_at"] = getExpiresAt();






    object["last_active_at"] = getLastActiveAt();







	object["metadata"] = getMetadata().toJson();


    return object;

}

std::string
VectorStoreObject::getId()
{
	return id;
}

void
VectorStoreObject::setId(std::string  id)
{
	this->id = id;
}

std::string
VectorStoreObject::getObject()
{
	return object;
}

void
VectorStoreObject::setObject(std::string  object)
{
	this->object = object;
}

int
VectorStoreObject::getCreatedAt()
{
	return created_at;
}

void
VectorStoreObject::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
VectorStoreObject::getName()
{
	return name;
}

void
VectorStoreObject::setName(std::string  name)
{
	this->name = name;
}

int
VectorStoreObject::getUsageBytes()
{
	return usage_bytes;
}

void
VectorStoreObject::setUsageBytes(int  usage_bytes)
{
	this->usage_bytes = usage_bytes;
}

VectorStoreObject_file_counts
VectorStoreObject::getFileCounts()
{
	return file_counts;
}

void
VectorStoreObject::setFileCounts(VectorStoreObject_file_counts  file_counts)
{
	this->file_counts = file_counts;
}

std::string
VectorStoreObject::getStatus()
{
	return status;
}

void
VectorStoreObject::setStatus(std::string  status)
{
	this->status = status;
}

VectorStoreExpirationAfter
VectorStoreObject::getExpiresAfter()
{
	return expires_after;
}

void
VectorStoreObject::setExpiresAfter(VectorStoreExpirationAfter  expires_after)
{
	this->expires_after = expires_after;
}

int
VectorStoreObject::getExpiresAt()
{
	return expires_at;
}

void
VectorStoreObject::setExpiresAt(int  expires_at)
{
	this->expires_at = expires_at;
}

int
VectorStoreObject::getLastActiveAt()
{
	return last_active_at;
}

void
VectorStoreObject::setLastActiveAt(int  last_active_at)
{
	this->last_active_at = last_active_at;
}

Object
VectorStoreObject::getMetadata()
{
	return metadata;
}

void
VectorStoreObject::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}



