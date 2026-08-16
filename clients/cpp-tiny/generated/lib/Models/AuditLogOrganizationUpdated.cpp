

#include "AuditLog_organization_updated.h"

using namespace Tiny;

AuditLog_organization_updated::AuditLog_organization_updated()
{
	id = std::string();
	changes_requested = AuditLog_organization_updated_changes_requested();
}

AuditLog_organization_updated::AuditLog_organization_updated(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_organization_updated::~AuditLog_organization_updated()
{

}

void
AuditLog_organization_updated::fromJson(std::string jsonObj)
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




        AuditLog_organization_updated_changes_requested* obj = &changes_requested;
		obj->fromJson(value.dump());

    }


}

bourne::json
AuditLog_organization_updated::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["changes_requested"] = getChangesRequested().toJson();


    return object;

}

std::string
AuditLog_organization_updated::getId()
{
	return id;
}

void
AuditLog_organization_updated::setId(std::string  id)
{
	this->id = id;
}

AuditLog_organization_updated_changes_requested
AuditLog_organization_updated::getChangesRequested()
{
	return changes_requested;
}

void
AuditLog_organization_updated::setChangesRequested(AuditLog_organization_updated_changes_requested  changes_requested)
{
	this->changes_requested = changes_requested;
}



