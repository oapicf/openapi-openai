

#include "ProjectUpdateRequest.h"

using namespace Tiny;

ProjectUpdateRequest::ProjectUpdateRequest()
{
	name = std::string();
}

ProjectUpdateRequest::ProjectUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectUpdateRequest::~ProjectUpdateRequest()
{

}

void
ProjectUpdateRequest::fromJson(std::string jsonObj)
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
ProjectUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();



    return object;

}

std::string
ProjectUpdateRequest::getName()
{
	return name;
}

void
ProjectUpdateRequest::setName(std::string  name)
{
	this->name = name;
}



