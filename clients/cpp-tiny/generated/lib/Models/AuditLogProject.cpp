

#include "AuditLog_project.h"

using namespace Tiny;

AuditLog_project::AuditLog_project()
{
	id = std::string();
	name = std::string();
}

AuditLog_project::AuditLog_project(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_project::~AuditLog_project()
{

}

void
AuditLog_project::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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


}

bourne::json
AuditLog_project::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();



    return object;

}

std::string
AuditLog_project::getId()
{
	return id;
}

void
AuditLog_project::setId(std::string  id)
{
	this->id = id;
}

std::string
AuditLog_project::getName()
{
	return name;
}

void
AuditLog_project::setName(std::string  name)
{
	this->name = name;
}



