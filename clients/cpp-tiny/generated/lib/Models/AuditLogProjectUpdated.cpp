

#include "AuditLog_project_updated.h"

using namespace Tiny;

AuditLog_project_updated::AuditLog_project_updated()
{
	id = std::string();
	changes_requested = AuditLog_project_updated_changes_requested();
}

AuditLog_project_updated::AuditLog_project_updated(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_project_updated::~AuditLog_project_updated()
{

}

void
AuditLog_project_updated::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *changes_requestedKey = "changes_requested";

    if(object.has_key(changes_requestedKey))
    {
        bourne::json value = object[changes_requestedKey];




        AuditLog_project_updated_changes_requested* obj = &changes_requested;
		obj->fromJson(value.dump());

    }


}

bourne::json
AuditLog_project_updated::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["changes_requested"] = getChangesRequested().toJson();


    return object;

}

std::string
AuditLog_project_updated::getId()
{
	return id;
}

void
AuditLog_project_updated::setId(std::string  id)
{
	this->id = id;
}

AuditLog_project_updated_changes_requested
AuditLog_project_updated::getChangesRequested()
{
	return changes_requested;
}

void
AuditLog_project_updated::setChangesRequested(AuditLog_project_updated_changes_requested  changes_requested)
{
	this->changes_requested = changes_requested;
}



