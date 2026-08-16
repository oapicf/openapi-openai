

#include "Error.h"

using namespace Tiny;

Error::Error()
{
	code = std::string();
	message = std::string();
	param = std::string();
	type = std::string();
}

Error::Error(std::string jsonString)
{
	this->fromJson(jsonString);
}

Error::~Error()
{

}

void
Error::fromJson(std::string jsonObj)
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

    const char *paramKey = "param";

    if(object.has_key(paramKey))
    {
        bourne::json value = object[paramKey];



        jsonToValue(&param, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }


}

bourne::json
Error::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();






    object["message"] = getMessage();






    object["param"] = getParam();






    object["type"] = getType();



    return object;

}

std::string
Error::getCode()
{
	return code;
}

void
Error::setCode(std::string  code)
{
	this->code = code;
}

std::string
Error::getMessage()
{
	return message;
}

void
Error::setMessage(std::string  message)
{
	this->message = message;
}

std::string
Error::getParam()
{
	return param;
}

void
Error::setParam(std::string  param)
{
	this->param = param;
}

std::string
Error::getType()
{
	return type;
}

void
Error::setType(std::string  type)
{
	this->type = type;
}



