

#include "AuditLog_service_account_created_data.h"

using namespace Tiny;

AuditLog_service_account_created_data::AuditLog_service_account_created_data()
{
	role = std::string();
}

AuditLog_service_account_created_data::AuditLog_service_account_created_data(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_service_account_created_data::~AuditLog_service_account_created_data()
{

}

void
AuditLog_service_account_created_data::fromJson(std::string jsonObj)
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
AuditLog_service_account_created_data::toJson()
{
    bourne::json object = bourne::json::object();





    object["role"] = getRole();



    return object;

}

std::string
AuditLog_service_account_created_data::getRole()
{
	return role;
}

void
AuditLog_service_account_created_data::setRole(std::string  role)
{
	this->role = role;
}



