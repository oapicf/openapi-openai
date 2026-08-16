

#include "Model.h"

using namespace Tiny;

Model::Model()
{
	id = std::string();
	created = int(0);
	object = std::string();
	owned_by = std::string();
}

Model::Model(std::string jsonString)
{
	this->fromJson(jsonString);
}

Model::~Model()
{

}

void
Model::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *createdKey = "created";

    if(object.has_key(createdKey))
    {
        bourne::json value = object[createdKey];



        jsonToValue(&created, value, "int");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *owned_byKey = "owned_by";

    if(object.has_key(owned_byKey))
    {
        bourne::json value = object[owned_byKey];



        jsonToValue(&owned_by, value, "std::string");


    }


}

bourne::json
Model::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["created"] = getCreated();






    object["object"] = getObject();






    object["owned_by"] = getOwnedBy();



    return object;

}

std::string
Model::getId()
{
	return id;
}

void
Model::setId(std::string  id)
{
	this->id = id;
}

int
Model::getCreated()
{
	return created;
}

void
Model::setCreated(int  created)
{
	this->created = created;
}

std::string
Model::getObject()
{
	return object;
}

void
Model::setObject(std::string  object)
{
	this->object = object;
}

std::string
Model::getOwnedBy()
{
	return owned_by;
}

void
Model::setOwnedBy(std::string  owned_by)
{
	this->owned_by = owned_by;
}



