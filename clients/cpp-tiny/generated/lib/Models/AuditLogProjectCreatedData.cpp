

#include "AuditLog_project_created_data.h"

using namespace Tiny;

AuditLog_project_created_data::AuditLog_project_created_data()
{
	name = std::string();
	title = std::string();
}

AuditLog_project_created_data::AuditLog_project_created_data(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_project_created_data::~AuditLog_project_created_data()
{

}

void
AuditLog_project_created_data::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }


}

bourne::json
AuditLog_project_created_data::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["title"] = getTitle();



    return object;

}

std::string
AuditLog_project_created_data::getName()
{
	return name;
}

void
AuditLog_project_created_data::setName(std::string  name)
{
	this->name = name;
}

std::string
AuditLog_project_created_data::getTitle()
{
	return title;
}

void
AuditLog_project_created_data::setTitle(std::string  title)
{
	this->title = title;
}



