#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLog_organization_updated_changes_requested.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLog_organization_updated_changes_requested::AuditLog_organization_updated_changes_requested()
{
	//__init();
}

AuditLog_organization_updated_changes_requested::~AuditLog_organization_updated_changes_requested()
{
	//__cleanup();
}

void
AuditLog_organization_updated_changes_requested::__init()
{
	//title = std::string();
	//description = std::string();
	//name = std::string();
	//settings = new AuditLog_organization_updated_changes_requested_settings();
}

void
AuditLog_organization_updated_changes_requested::__cleanup()
{
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(settings != NULL) {
	//
	//delete settings;
	//settings = NULL;
	//}
	//
}

void
AuditLog_organization_updated_changes_requested::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *settingsKey = "settings";
	node = json_object_get_member(pJsonObject, settingsKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_organization_updated_changes_requested_settings")) {
			jsonToValue(&settings, node, "AuditLog_organization_updated_changes_requested_settings", "AuditLog_organization_updated_changes_requested_settings");
		} else {
			
			AuditLog_organization_updated_changes_requested_settings* obj = static_cast<AuditLog_organization_updated_changes_requested_settings*> (&settings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AuditLog_organization_updated_changes_requested::AuditLog_organization_updated_changes_requested(char* json)
{
	this->fromJson(json);
}

char*
AuditLog_organization_updated_changes_requested::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("AuditLog_organization_updated_changes_requested_settings")) {
		AuditLog_organization_updated_changes_requested_settings obj = getSettings();
		node = converttoJson(&obj, "AuditLog_organization_updated_changes_requested_settings", "");
	}
	else {
		
		AuditLog_organization_updated_changes_requested_settings obj = static_cast<AuditLog_organization_updated_changes_requested_settings> (getSettings());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *settingsKey = "settings";
	json_object_set_member(pJsonObject, settingsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


