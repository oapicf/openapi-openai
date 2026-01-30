#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLog_user_updated_changes_requested.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLog_user_updated_changes_requested::AuditLog_user_updated_changes_requested()
{
	//__init();
}

AuditLog_user_updated_changes_requested::~AuditLog_user_updated_changes_requested()
{
	//__cleanup();
}

void
AuditLog_user_updated_changes_requested::__init()
{
	//role = std::string();
}

void
AuditLog_user_updated_changes_requested::__cleanup()
{
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//
}

void
AuditLog_user_updated_changes_requested::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *roleKey = "role";
	node = json_object_get_member(pJsonObject, roleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&role, node, "std::string", "");
		} else {
			
		}
	}
}

AuditLog_user_updated_changes_requested::AuditLog_user_updated_changes_requested(char* json)
{
	this->fromJson(json);
}

char*
AuditLog_user_updated_changes_requested::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getRole();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *roleKey = "role";
	json_object_set_member(pJsonObject, roleKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AuditLog_user_updated_changes_requested::getRole()
{
	return role;
}

void
AuditLog_user_updated_changes_requested::setRole(std::string  role)
{
	this->role = role;
}


