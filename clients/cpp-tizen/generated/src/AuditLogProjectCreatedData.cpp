#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLog_project_created_data.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLog_project_created_data::AuditLog_project_created_data()
{
	//__init();
}

AuditLog_project_created_data::~AuditLog_project_created_data()
{
	//__cleanup();
}

void
AuditLog_project_created_data::__init()
{
	//name = std::string();
	//title = std::string();
}

void
AuditLog_project_created_data::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//
}

void
AuditLog_project_created_data::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
		} else {
			
		}
	}
}

AuditLog_project_created_data::AuditLog_project_created_data(char* json)
{
	this->fromJson(json);
}

char*
AuditLog_project_created_data::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


