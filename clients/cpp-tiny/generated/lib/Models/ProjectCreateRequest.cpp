

#include "ProjectCreateRequest.h"

using namespace Tiny;

ProjectCreateRequest::ProjectCreateRequest()
{
	name = std::string();
}

ProjectCreateRequest::ProjectCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectCreateRequest::~ProjectCreateRequest()
{

}

void
ProjectCreateRequest::fromJson(std::string jsonObj)
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
ProjectCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();



    return object;

}

std::string
ProjectCreateRequest::getName()
{
	return name;
}

void
ProjectCreateRequest::setName(std::string  name)
{
	this->name = name;
}



