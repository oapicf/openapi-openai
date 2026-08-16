

#include "AuditLog_project_updated_changes_requested.h"

using namespace Tiny;

AuditLog_project_updated_changes_requested::AuditLog_project_updated_changes_requested()
{
	title = std::string();
}

AuditLog_project_updated_changes_requested::AuditLog_project_updated_changes_requested(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_project_updated_changes_requested::~AuditLog_project_updated_changes_requested()
{

}

void
AuditLog_project_updated_changes_requested::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }


}

bourne::json
AuditLog_project_updated_changes_requested::toJson()
{
    bourne::json object = bourne::json::object();





    object["title"] = getTitle();



    return object;

}

std::string
AuditLog_project_updated_changes_requested::getTitle()
{
	return title;
}

void
AuditLog_project_updated_changes_requested::setTitle(std::string  title)
{
	this->title = title;
}



