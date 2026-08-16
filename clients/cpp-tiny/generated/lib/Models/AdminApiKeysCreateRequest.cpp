

#include "Admin_api_keys_create_request.h"

using namespace Tiny;

Admin_api_keys_create_request::Admin_api_keys_create_request()
{
	name = std::string();
}

Admin_api_keys_create_request::Admin_api_keys_create_request(std::string jsonString)
{
	this->fromJson(jsonString);
}

Admin_api_keys_create_request::~Admin_api_keys_create_request()
{

}

void
Admin_api_keys_create_request::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
Admin_api_keys_create_request::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();



    return object;

}

std::string
Admin_api_keys_create_request::getName()
{
	return name;
}

void
Admin_api_keys_create_request::setName(std::string  name)
{
	this->name = name;
}



