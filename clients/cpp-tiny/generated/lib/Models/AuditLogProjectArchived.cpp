

#include "AuditLog_project_archived.h"

using namespace Tiny;

AuditLog_project_archived::AuditLog_project_archived()
{
	id = std::string();
}

AuditLog_project_archived::AuditLog_project_archived(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_project_archived::~AuditLog_project_archived()
{

}

void
AuditLog_project_archived::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }


}

bourne::json
AuditLog_project_archived::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();



    return object;

}

std::string
AuditLog_project_archived::getId()
{
	return id;
}

void
AuditLog_project_archived::setId(std::string  id)
{
	this->id = id;
}



