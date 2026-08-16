

#include "AuditLog_invite_sent_data.h"

using namespace Tiny;

AuditLog_invite_sent_data::AuditLog_invite_sent_data()
{
	email = std::string();
	role = std::string();
}

AuditLog_invite_sent_data::AuditLog_invite_sent_data(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_invite_sent_data::~AuditLog_invite_sent_data()
{

}

void
AuditLog_invite_sent_data::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *emailKey = "email";

    if(object.has_key(emailKey))
    {
        bourne::json value = object[emailKey];



        jsonToValue(&email, value, "std::string");


    }

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];



        jsonToValue(&role, value, "std::string");


    }


}

bourne::json
AuditLog_invite_sent_data::toJson()
{
    bourne::json object = bourne::json::object();





    object["email"] = getEmail();






    object["role"] = getRole();



    return object;

}

std::string
AuditLog_invite_sent_data::getEmail()
{
	return email;
}

void
AuditLog_invite_sent_data::setEmail(std::string  email)
{
	this->email = email;
}

std::string
AuditLog_invite_sent_data::getRole()
{
	return role;
}

void
AuditLog_invite_sent_data::setRole(std::string  role)
{
	this->role = role;
}



