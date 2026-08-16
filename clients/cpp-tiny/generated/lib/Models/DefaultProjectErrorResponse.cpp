

#include "DefaultProjectErrorResponse.h"

using namespace Tiny;

DefaultProjectErrorResponse::DefaultProjectErrorResponse()
{
	code = int(0);
	message = std::string();
}

DefaultProjectErrorResponse::DefaultProjectErrorResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

DefaultProjectErrorResponse::~DefaultProjectErrorResponse()
{

}

void
DefaultProjectErrorResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "int");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }


}

bourne::json
DefaultProjectErrorResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();






    object["message"] = getMessage();



    return object;

}

int
DefaultProjectErrorResponse::getCode()
{
	return code;
}

void
DefaultProjectErrorResponse::setCode(int  code)
{
	this->code = code;
}

std::string
DefaultProjectErrorResponse::getMessage()
{
	return message;
}

void
DefaultProjectErrorResponse::setMessage(std::string  message)
{
	this->message = message;
}



