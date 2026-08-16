

#include "BatchRequestOutput_error.h"

using namespace Tiny;

BatchRequestOutput_error::BatchRequestOutput_error()
{
	code = std::string();
	message = std::string();
}

BatchRequestOutput_error::BatchRequestOutput_error(std::string jsonString)
{
	this->fromJson(jsonString);
}

BatchRequestOutput_error::~BatchRequestOutput_error()
{

}

void
BatchRequestOutput_error::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "std::string");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }


}

bourne::json
BatchRequestOutput_error::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();






    object["message"] = getMessage();



    return object;

}

std::string
BatchRequestOutput_error::getCode()
{
	return code;
}

void
BatchRequestOutput_error::setCode(std::string  code)
{
	this->code = code;
}

std::string
BatchRequestOutput_error::getMessage()
{
	return message;
}

void
BatchRequestOutput_error::setMessage(std::string  message)
{
	this->message = message;
}



