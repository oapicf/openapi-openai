

#include "VectorStoreFileObject_last_error.h"

using namespace Tiny;

VectorStoreFileObject_last_error::VectorStoreFileObject_last_error()
{
	code = std::string();
	message = std::string();
}

VectorStoreFileObject_last_error::VectorStoreFileObject_last_error(std::string jsonString)
{
	this->fromJson(jsonString);
}

VectorStoreFileObject_last_error::~VectorStoreFileObject_last_error()
{

}

void
VectorStoreFileObject_last_error::fromJson(std::string jsonObj)
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
VectorStoreFileObject_last_error::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();






    object["message"] = getMessage();



    return object;

}

std::string
VectorStoreFileObject_last_error::getCode()
{
	return code;
}

void
VectorStoreFileObject_last_error::setCode(std::string  code)
{
	this->code = code;
}

std::string
VectorStoreFileObject_last_error::getMessage()
{
	return message;
}

void
VectorStoreFileObject_last_error::setMessage(std::string  message)
{
	this->message = message;
}



