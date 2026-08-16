

#include "ProjectServiceAccountApiKey.h"

using namespace Tiny;

ProjectServiceAccountApiKey::ProjectServiceAccountApiKey()
{
	object = std::string();
	value = std::string();
	name = std::string();
	created_at = int(0);
	id = std::string();
}

ProjectServiceAccountApiKey::ProjectServiceAccountApiKey(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectServiceAccountApiKey::~ProjectServiceAccountApiKey()
{

}

void
ProjectServiceAccountApiKey::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "int");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }


}

bourne::json
ProjectServiceAccountApiKey::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["value"] = getValue();






    object["name"] = getName();






    object["created_at"] = getCreatedAt();






    object["id"] = getId();



    return object;

}

std::string
ProjectServiceAccountApiKey::getObject()
{
	return object;
}

void
ProjectServiceAccountApiKey::setObject(std::string  object)
{
	this->object = object;
}

std::string
ProjectServiceAccountApiKey::getValue()
{
	return value;
}

void
ProjectServiceAccountApiKey::setValue(std::string  value)
{
	this->value = value;
}

std::string
ProjectServiceAccountApiKey::getName()
{
	return name;
}

void
ProjectServiceAccountApiKey::setName(std::string  name)
{
	this->name = name;
}

int
ProjectServiceAccountApiKey::getCreatedAt()
{
	return created_at;
}

void
ProjectServiceAccountApiKey::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
ProjectServiceAccountApiKey::getId()
{
	return id;
}

void
ProjectServiceAccountApiKey::setId(std::string  id)
{
	this->id = id;
}



