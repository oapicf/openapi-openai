

#include "BatchRequestInput.h"

using namespace Tiny;

BatchRequestInput::BatchRequestInput()
{
	custom_id = std::string();
	method = std::string();
	url = std::string();
}

BatchRequestInput::BatchRequestInput(std::string jsonString)
{
	this->fromJson(jsonString);
}

BatchRequestInput::~BatchRequestInput()
{

}

void
BatchRequestInput::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *custom_idKey = "custom_id";

    if(object.has_key(custom_idKey))
    {
        bourne::json value = object[custom_idKey];



        jsonToValue(&custom_id, value, "std::string");


    }

    const char *methodKey = "method";

    if(object.has_key(methodKey))
    {
        bourne::json value = object[methodKey];



        jsonToValue(&method, value, "std::string");


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }


}

bourne::json
BatchRequestInput::toJson()
{
    bourne::json object = bourne::json::object();





    object["custom_id"] = getCustomId();






    object["method"] = getMethod();






    object["url"] = getUrl();



    return object;

}

std::string
BatchRequestInput::getCustomId()
{
	return custom_id;
}

void
BatchRequestInput::setCustomId(std::string  custom_id)
{
	this->custom_id = custom_id;
}

std::string
BatchRequestInput::getMethod()
{
	return method;
}

void
BatchRequestInput::setMethod(std::string  method)
{
	this->method = method;
}

std::string
BatchRequestInput::getUrl()
{
	return url;
}

void
BatchRequestInput::setUrl(std::string  url)
{
	this->url = url;
}



