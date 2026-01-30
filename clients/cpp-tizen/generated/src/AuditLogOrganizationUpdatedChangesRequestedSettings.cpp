#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLog_organization_updated_changes_requested_settings.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLog_organization_updated_changes_requested_settings::AuditLog_organization_updated_changes_requested_settings()
{
	//__init();
}

AuditLog_organization_updated_changes_requested_settings::~AuditLog_organization_updated_changes_requested_settings()
{
	//__cleanup();
}

void
AuditLog_organization_updated_changes_requested_settings::__init()
{
	//threads_ui_visibility = std::string();
	//usage_dashboard_visibility = std::string();
}

void
AuditLog_organization_updated_changes_requested_settings::__cleanup()
{
	//if(threads_ui_visibility != NULL) {
	//
	//delete threads_ui_visibility;
	//threads_ui_visibility = NULL;
	//}
	//if(usage_dashboard_visibility != NULL) {
	//
	//delete usage_dashboard_visibility;
	//usage_dashboard_visibility = NULL;
	//}
	//
}

void
AuditLog_organization_updated_changes_requested_settings::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *threads_ui_visibilityKey = "threads_ui_visibility";
	node = json_object_get_member(pJsonObject, threads_ui_visibilityKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&threads_ui_visibility, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *usage_dashboard_visibilityKey = "usage_dashboard_visibility";
	node = json_object_get_member(pJsonObject, usage_dashboard_visibilityKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&usage_dashboard_visibility, node, "std::string", "");
		} else {
			
		}
	}
}

AuditLog_organization_updated_changes_requested_settings::AuditLog_organization_updated_changes_requested_settings(char* json)
{
	this->fromJson(json);
}

char*
AuditLog_organization_updated_changes_requested_settings::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getThreadsUiVisibility();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *threads_ui_visibilityKey = "threads_ui_visibility";
	json_object_set_member(pJsonObject, threads_ui_visibilityKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUsageDashboardVisibility();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *usage_dashboard_visibilityKey = "usage_dashboard_visibility";
	json_object_set_member(pJsonObject, usage_dashboard_visibilityKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AuditLog_organization_updated_changes_requested_settings::getThreadsUiVisibility()
{
	return threads_ui_visibility;
}

void
AuditLog_organization_updated_changes_requested_settings::setThreadsUiVisibility(std::string  threads_ui_visibility)
{
	this->threads_ui_visibility = threads_ui_visibility;
}

std::string
AuditLog_organization_updated_changes_requested_settings::getUsageDashboardVisibility()
{
	return usage_dashboard_visibility;
}

void
AuditLog_organization_updated_changes_requested_settings::setUsageDashboardVisibility(std::string  usage_dashboard_visibility)
{
	this->usage_dashboard_visibility = usage_dashboard_visibility;
}


