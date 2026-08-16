

#include "VectorStoreFileBatchObject.h"

using namespace Tiny;

VectorStoreFileBatchObject::VectorStoreFileBatchObject()
{
	id = std::string();
	object = std::string();
	created_at = int(0);
	vector_store_id = std::string();
	status = std::string();
	file_counts = VectorStoreFileBatchObject_file_counts();
}

VectorStoreFileBatchObject::VectorStoreFileBatchObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

VectorStoreFileBatchObject::~VectorStoreFileBatchObject()
{

}

void
VectorStoreFileBatchObject::fromJson(std::string jsonObj)
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

    const char *file_countsKey = "file_counts";

    if(object.has_key(file_countsKey))
    {
        bourne::json value = object[file_countsKey];




        VectorStoreFileBatchObject_file_counts* obj = &file_counts;
		obj->fromJson(value.dump());

    }


}

bourne::json
VectorStoreFileBatchObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["object"] = getObject();






    object["created_at"] = getCreatedAt();






    object["vector_store_id"] = getVectorStoreId();






    object["status"] = getStatus();







	object["file_counts"] = getFileCounts().toJson();


    return object;

}

std::string
VectorStoreFileBatchObject::getId()
{
	return id;
}

void
VectorStoreFileBatchObject::setId(std::string  id)
{
	this->id = id;
}

std::string
VectorStoreFileBatchObject::getObject()
{
	return object;
}

void
VectorStoreFileBatchObject::setObject(std::string  object)
{
	this->object = object;
}

int
VectorStoreFileBatchObject::getCreatedAt()
{
	return created_at;
}

void
VectorStoreFileBatchObject::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
VectorStoreFileBatchObject::getVectorStoreId()
{
	return vector_store_id;
}

void
VectorStoreFileBatchObject::setVectorStoreId(std::string  vector_store_id)
{
	this->vector_store_id = vector_store_id;
}

std::string
VectorStoreFileBatchObject::getStatus()
{
	return status;
}

void
VectorStoreFileBatchObject::setStatus(std::string  status)
{
	this->status = status;
}

VectorStoreFileBatchObject_file_counts
VectorStoreFileBatchObject::getFileCounts()
{
	return file_counts;
}

void
VectorStoreFileBatchObject::setFileCounts(VectorStoreFileBatchObject_file_counts  file_counts)
{
	this->file_counts = file_counts;
}



