

#include "Project.h"

using namespace Tiny;

Project::Project()
{
	id = std::string();
	object = std::string();
	name = std::string();
	created_at = int(0);
	archived_at = int(0);
	status = std::string();
}

Project::Project(std::string jsonString)
{
	this->fromJson(jsonString);
}

Project::~Project()
{

}

void
Project::fromJson(std::string jsonObj)
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

    const char *archived_atKey = "archived_at";

    if(object.has_key(archived_atKey))
    {
        bourne::json value = object[archived_atKey];



        jsonToValue(&archived_at, value, "int");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }


}

bourne::json
Project::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["object"] = getObject();






    object["name"] = getName();






    object["created_at"] = getCreatedAt();






    object["archived_at"] = getArchivedAt();






    object["status"] = getStatus();



    return object;

}

std::string
Project::getId()
{
	return id;
}

void
Project::setId(std::string  id)
{
	this->id = id;
}

std::string
Project::getObject()
{
	return object;
}

void
Project::setObject(std::string  object)
{
	this->object = object;
}

std::string
Project::getName()
{
	return name;
}

void
Project::setName(std::string  name)
{
	this->name = name;
}

int
Project::getCreatedAt()
{
	return created_at;
}

void
Project::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

int
Project::getArchivedAt()
{
	return archived_at;
}

void
Project::setArchivedAt(int  archived_at)
{
	this->archived_at = archived_at;
}

std::string
Project::getStatus()
{
	return status;
}

void
Project::setStatus(std::string  status)
{
	this->status = status;
}



