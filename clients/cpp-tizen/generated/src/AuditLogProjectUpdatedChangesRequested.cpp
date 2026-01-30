#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLog_project_updated_changes_requested.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLog_project_updated_changes_requested::AuditLog_project_updated_changes_requested()
{
	//__init();
}

AuditLog_project_updated_changes_requested::~AuditLog_project_updated_changes_requested()
{
	//__cleanup();
}

void
AuditLog_project_updated_changes_requested::__init()
{
	//title = std::string();
}

void
AuditLog_project_updated_changes_requested::__cleanup()
{
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//
}

void
AuditLog_project_updated_changes_requested::fromJson(char* jsonStr)
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
}

AuditLog_project_updated_changes_requested::AuditLog_project_updated_changes_requested(char* json)
{
	this->fromJson(json);
}

char*
AuditLog_project_updated_changes_requested::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


