

#include "ProjectApiKey.h"

using namespace Tiny;

ProjectApiKey::ProjectApiKey()
{
	object = std::string();
	redacted_value = std::string();
	name = std::string();
	created_at = int(0);
	id = std::string();
	owner = ProjectApiKey_owner();
}

ProjectApiKey::ProjectApiKey(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectApiKey::~ProjectApiKey()
{

}

void
ProjectApiKey::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *redacted_valueKey = "redacted_value";

    if(object.has_key(redacted_valueKey))
    {
        bourne::json value = object[redacted_valueKey];



        jsonToValue(&redacted_value, value, "std::string");


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

    const char *ownerKey = "owner";

    if(object.has_key(ownerKey))
    {
        bourne::json value = object[ownerKey];




        ProjectApiKey_owner* obj = &owner;
		obj->fromJson(value.dump());

    }


}

bourne::json
ProjectApiKey::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["redacted_value"] = getRedactedValue();






    object["name"] = getName();






    object["created_at"] = getCreatedAt();






    object["id"] = getId();







	object["owner"] = getOwner().toJson();


    return object;

}

std::string
ProjectApiKey::getObject()
{
	return object;
}

void
ProjectApiKey::setObject(std::string  object)
{
	this->object = object;
}

std::string
ProjectApiKey::getRedactedValue()
{
	return redacted_value;
}

void
ProjectApiKey::setRedactedValue(std::string  redacted_value)
{
	this->redacted_value = redacted_value;
}

std::string
ProjectApiKey::getName()
{
	return name;
}

void
ProjectApiKey::setName(std::string  name)
{
	this->name = name;
}

int
ProjectApiKey::getCreatedAt()
{
	return created_at;
}

void
ProjectApiKey::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
ProjectApiKey::getId()
{
	return id;
}

void
ProjectApiKey::setId(std::string  id)
{
	this->id = id;
}

ProjectApiKey_owner
ProjectApiKey::getOwner()
{
	return owner;
}

void
ProjectApiKey::setOwner(ProjectApiKey_owner  owner)
{
	this->owner = owner;
}



