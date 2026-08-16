

#include "AdminApiKey.h"

using namespace Tiny;

AdminApiKey::AdminApiKey()
{
	object = std::string();
	id = std::string();
	name = std::string();
	redacted_value = std::string();
	value = std::string();
	created_at = long(0);
	owner = AdminApiKey_owner();
}

AdminApiKey::AdminApiKey(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdminApiKey::~AdminApiKey()
{

}

void
AdminApiKey::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *redacted_valueKey = "redacted_value";

    if(object.has_key(redacted_valueKey))
    {
        bourne::json value = object[redacted_valueKey];



        jsonToValue(&redacted_value, value, "std::string");


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "long");


    }

    const char *ownerKey = "owner";

    if(object.has_key(ownerKey))
    {
        bourne::json value = object[ownerKey];




        AdminApiKey_owner* obj = &owner;
		obj->fromJson(value.dump());

    }


}

bourne::json
AdminApiKey::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["id"] = getId();






    object["name"] = getName();






    object["redacted_value"] = getRedactedValue();






    object["value"] = getValue();






    object["created_at"] = getCreatedAt();







	object["owner"] = getOwner().toJson();


    return object;

}

std::string
AdminApiKey::getObject()
{
	return object;
}

void
AdminApiKey::setObject(std::string  object)
{
	this->object = object;
}

std::string
AdminApiKey::getId()
{
	return id;
}

void
AdminApiKey::setId(std::string  id)
{
	this->id = id;
}

std::string
AdminApiKey::getName()
{
	return name;
}

void
AdminApiKey::setName(std::string  name)
{
	this->name = name;
}

std::string
AdminApiKey::getRedactedValue()
{
	return redacted_value;
}

void
AdminApiKey::setRedactedValue(std::string  redacted_value)
{
	this->redacted_value = redacted_value;
}

std::string
AdminApiKey::getValue()
{
	return value;
}

void
AdminApiKey::setValue(std::string  value)
{
	this->value = value;
}

long
AdminApiKey::getCreatedAt()
{
	return created_at;
}

void
AdminApiKey::setCreatedAt(long  created_at)
{
	this->created_at = created_at;
}

AdminApiKey_owner
AdminApiKey::getOwner()
{
	return owner;
}

void
AdminApiKey::setOwner(AdminApiKey_owner  owner)
{
	this->owner = owner;
}



