

#include "AuditLog_organization_updated_changes_requested.h"

using namespace Tiny;

AuditLog_organization_updated_changes_requested::AuditLog_organization_updated_changes_requested()
{
	title = std::string();
	description = std::string();
	name = std::string();
	settings = AuditLog_organization_updated_changes_requested_settings();
}

AuditLog_organization_updated_changes_requested::AuditLog_organization_updated_changes_requested(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_organization_updated_changes_requested::~AuditLog_organization_updated_changes_requested()
{

}

void
AuditLog_organization_updated_changes_requested::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *settingsKey = "settings";

    if(object.has_key(settingsKey))
    {
        bourne::json value = object[settingsKey];




        AuditLog_organization_updated_changes_requested_settings* obj = &settings;
		obj->fromJson(value.dump());

    }


}

bourne::json
AuditLog_organization_updated_changes_requested::toJson()
{
    bourne::json object = bourne::json::object();





    object["title"] = getTitle();






    object["description"] = getDescription();






    object["name"] = getName();







	object["settings"] = getSettings().toJson();


    return object;

}

std::string
AuditLog_organization_updated_changes_requested::getTitle()
{
	return title;
}

void
AuditLog_organization_updated_changes_requested::setTitle(std::string  title)
{
	this->title = title;
}

std::string
AuditLog_organization_updated_changes_requested::getDescription()
{
	return description;
}

void
AuditLog_organization_updated_changes_requested::setDescription(std::string  description)
{
	this->description = description;
}

std::string
AuditLog_organization_updated_changes_requested::getName()
{
	return name;
}

void
AuditLog_organization_updated_changes_requested::setName(std::string  name)
{
	this->name = name;
}

AuditLog_organization_updated_changes_requested_settings
AuditLog_organization_updated_changes_requested::getSettings()
{
	return settings;
}

void
AuditLog_organization_updated_changes_requested::setSettings(AuditLog_organization_updated_changes_requested_settings  settings)
{
	this->settings = settings;
}



