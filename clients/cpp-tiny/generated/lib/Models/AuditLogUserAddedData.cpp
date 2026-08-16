

#include "AuditLog_user_added_data.h"

using namespace Tiny;

AuditLog_user_added_data::AuditLog_user_added_data()
{
	role = std::string();
}

AuditLog_user_added_data::AuditLog_user_added_data(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_user_added_data::~AuditLog_user_added_data()
{

}

void
AuditLog_user_added_data::fromJson(std::string jsonObj)
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
AuditLog_user_added_data::toJson()
{
    bourne::json object = bourne::json::object();





    object["role"] = getRole();



    return object;

}

std::string
AuditLog_user_added_data::getRole()
{
	return role;
}

void
AuditLog_user_added_data::setRole(std::string  role)
{
	this->role = role;
}



