

#include "AuditLog_login_failed.h"

using namespace Tiny;

AuditLog_login_failed::AuditLog_login_failed()
{
	error_code = std::string();
	error_message = std::string();
}

AuditLog_login_failed::AuditLog_login_failed(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_login_failed::~AuditLog_login_failed()
{

}

void
AuditLog_login_failed::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *error_codeKey = "error_code";

    if(object.has_key(error_codeKey))
    {
        bourne::json value = object[error_codeKey];



        jsonToValue(&error_code, value, "std::string");


    }

    const char *error_messageKey = "error_message";

    if(object.has_key(error_messageKey))
    {
        bourne::json value = object[error_messageKey];



        jsonToValue(&error_message, value, "std::string");


    }


}

bourne::json
AuditLog_login_failed::toJson()
{
    bourne::json object = bourne::json::object();





    object["error_code"] = getErrorCode();






    object["error_message"] = getErrorMessage();



    return object;

}

std::string
AuditLog_login_failed::getErrorCode()
{
	return error_code;
}

void
AuditLog_login_failed::setErrorCode(std::string  error_code)
{
	this->error_code = error_code;
}

std::string
AuditLog_login_failed::getErrorMessage()
{
	return error_message;
}

void
AuditLog_login_failed::setErrorMessage(std::string  error_message)
{
	this->error_message = error_message;
}



