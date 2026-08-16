

#include "ProjectServiceAccountCreateRequest.h"

using namespace Tiny;

ProjectServiceAccountCreateRequest::ProjectServiceAccountCreateRequest()
{
	name = std::string();
}

ProjectServiceAccountCreateRequest::ProjectServiceAccountCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectServiceAccountCreateRequest::~ProjectServiceAccountCreateRequest()
{

}

void
ProjectServiceAccountCreateRequest::fromJson(std::string jsonObj)
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
ProjectServiceAccountCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();



    return object;

}

std::string
ProjectServiceAccountCreateRequest::getName()
{
	return name;
}

void
ProjectServiceAccountCreateRequest::setName(std::string  name)
{
	this->name = name;
}



