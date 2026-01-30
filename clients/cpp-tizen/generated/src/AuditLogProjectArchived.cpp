#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLog_project_archived.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLog_project_archived::AuditLog_project_archived()
{
	//__init();
}

AuditLog_project_archived::~AuditLog_project_archived()
{
	//__cleanup();
}

void
AuditLog_project_archived::__init()
{
	//id = std::string();
}

void
AuditLog_project_archived::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
AuditLog_project_archived::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
}

AuditLog_project_archived::AuditLog_project_archived(char* json)
{
	this->fromJson(json);
}

char*
AuditLog_project_archived::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AuditLog_project_archived::getId()
{
	return id;
}

void
AuditLog_project_archived::setId(std::string  id)
{
	this->id = id;
}


