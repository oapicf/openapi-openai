

#include "AuditLog_service_account_updated.h"

using namespace Tiny;

AuditLog_service_account_updated::AuditLog_service_account_updated()
{
	id = std::string();
	changes_requested = AuditLog_service_account_updated_changes_requested();
}

AuditLog_service_account_updated::AuditLog_service_account_updated(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_service_account_updated::~AuditLog_service_account_updated()
{

}

void
AuditLog_service_account_updated::fromJson(std::string jsonObj)
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




        AuditLog_service_account_updated_changes_requested* obj = &changes_requested;
		obj->fromJson(value.dump());

    }


}

bourne::json
AuditLog_service_account_updated::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["changes_requested"] = getChangesRequested().toJson();


    return object;

}

std::string
AuditLog_service_account_updated::getId()
{
	return id;
}

void
AuditLog_service_account_updated::setId(std::string  id)
{
	this->id = id;
}

AuditLog_service_account_updated_changes_requested
AuditLog_service_account_updated::getChangesRequested()
{
	return changes_requested;
}

void
AuditLog_service_account_updated::setChangesRequested(AuditLog_service_account_updated_changes_requested  changes_requested)
{
	this->changes_requested = changes_requested;
}



