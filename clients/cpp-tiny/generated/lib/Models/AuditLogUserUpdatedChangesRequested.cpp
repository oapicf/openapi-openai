

#include "AuditLog_user_updated_changes_requested.h"

using namespace Tiny;

AuditLog_user_updated_changes_requested::AuditLog_user_updated_changes_requested()
{
	role = std::string();
}

AuditLog_user_updated_changes_requested::AuditLog_user_updated_changes_requested(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_user_updated_changes_requested::~AuditLog_user_updated_changes_requested()
{

}

void
AuditLog_user_updated_changes_requested::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];



        jsonToValue(&role, value, "std::string");


    }


}

bourne::json
AuditLog_user_updated_changes_requested::toJson()
{
    bourne::json object = bourne::json::object();





    object["role"] = getRole();



    return object;

}

std::string
AuditLog_user_updated_changes_requested::getRole()
{
	return role;
}

void
AuditLog_user_updated_changes_requested::setRole(std::string  role)
{
	this->role = role;
}



