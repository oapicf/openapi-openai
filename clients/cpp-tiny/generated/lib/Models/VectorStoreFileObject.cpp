

#include "VectorStoreFileObject.h"

using namespace Tiny;

VectorStoreFileObject::VectorStoreFileObject()
{
	id = std::string();
	object = std::string();
	usage_bytes = int(0);
	created_at = int(0);
	vector_store_id = std::string();
	status = std::string();
	last_error = VectorStoreFileObject_last_error();
	chunking_strategy = VectorStoreFileObject_chunking_strategy();
}

VectorStoreFileObject::VectorStoreFileObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

VectorStoreFileObject::~VectorStoreFileObject()
{

}

void
VectorStoreFileObject::fromJson(std::string jsonObj)
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

    const char *usage_bytesKey = "usage_bytes";

    if(object.has_key(usage_bytesKey))
    {
        bourne::json value = object[usage_bytesKey];



        jsonToValue(&usage_bytes, value, "int");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "int");


    }

    const char *vector_store_idKey = "vector_store_id";

    if(object.has_key(vector_store_idKey))
    {
        bourne::json value = object[vector_store_idKey];



        jsonToValue(&vector_store_id, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }

    const char *last_errorKey = "last_error";

    if(object.has_key(last_errorKey))
    {
        bourne::json value = object[last_errorKey];




        VectorStoreFileObject_last_error* obj = &last_error;
		obj->fromJson(value.dump());

    }

    const char *chunking_strategyKey = "chunking_strategy";

    if(object.has_key(chunking_strategyKey))
    {
        bourne::json value = object[chunking_strategyKey];




        VectorStoreFileObject_chunking_strategy* obj = &chunking_strategy;
		obj->fromJson(value.dump());

    }


}

bourne::json
VectorStoreFileObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["object"] = getObject();






    object["usage_bytes"] = getUsageBytes();






    object["created_at"] = getCreatedAt();






    object["vector_store_id"] = getVectorStoreId();






    object["status"] = getStatus();







	object["last_error"] = getLastError().toJson();






	object["chunking_strategy"] = getChunkingStrategy().toJson();


    return object;

}

std::string
VectorStoreFileObject::getId()
{
	return id;
}

void
VectorStoreFileObject::setId(std::string  id)
{
	this->id = id;
}

std::string
VectorStoreFileObject::getObject()
{
	return object;
}

void
VectorStoreFileObject::setObject(std::string  object)
{
	this->object = object;
}

int
VectorStoreFileObject::getUsageBytes()
{
	return usage_bytes;
}

void
VectorStoreFileObject::setUsageBytes(int  usage_bytes)
{
	this->usage_bytes = usage_bytes;
}

int
VectorStoreFileObject::getCreatedAt()
{
	return created_at;
}

void
VectorStoreFileObject::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
VectorStoreFileObject::getVectorStoreId()
{
	return vector_store_id;
}

void
VectorStoreFileObject::setVectorStoreId(std::string  vector_store_id)
{
	this->vector_store_id = vector_store_id;
}

std::string
VectorStoreFileObject::getStatus()
{
	return status;
}

void
VectorStoreFileObject::setStatus(std::string  status)
{
	this->status = status;
}

VectorStoreFileObject_last_error
VectorStoreFileObject::getLastError()
{
	return last_error;
}

void
VectorStoreFileObject::setLastError(VectorStoreFileObject_last_error  last_error)
{
	this->last_error = last_error;
}

VectorStoreFileObject_chunking_strategy
VectorStoreFileObject::getChunkingStrategy()
{
	return chunking_strategy;
}

void
VectorStoreFileObject::setChunkingStrategy(VectorStoreFileObject_chunking_strategy  chunking_strategy)
{
	this->chunking_strategy = chunking_strategy;
}



