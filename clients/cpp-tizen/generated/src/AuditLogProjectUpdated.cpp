#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLog_project_updated.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLog_project_updated::AuditLog_project_updated()
{
	//__init();
}

AuditLog_project_updated::~AuditLog_project_updated()
{
	//__cleanup();
}

void
AuditLog_project_updated::__init()
{
	//id = std::string();
	//changes_requested = new AuditLog_project_updated_changes_requested();
}

void
AuditLog_project_updated::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(changes_requested != NULL) {
	//
	//delete changes_requested;
	//changes_requested = NULL;
	//}
	//
}

void
AuditLog_project_updated::fromJson(char* jsonStr)
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
	const gchar *changes_requestedKey = "changes_requested";
	node = json_object_get_member(pJsonObject, changes_requestedKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_project_updated_changes_requested")) {
			jsonToValue(&changes_requested, node, "AuditLog_project_updated_changes_requested", "AuditLog_project_updated_changes_requested");
		} else {
			
			AuditLog_project_updated_changes_requested* obj = static_cast<AuditLog_project_updated_changes_requested*> (&changes_requested);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AuditLog_project_updated::AuditLog_project_updated(char* json)
{
	this->fromJson(json);
}

char*
AuditLog_project_updated::toJson()
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
	if (isprimitive("AuditLog_project_updated_changes_requested")) {
		AuditLog_project_updated_changes_requested obj = getChangesRequested();
		node = converttoJson(&obj, "AuditLog_project_updated_changes_requested", "");
	}
	else {
		
		AuditLog_project_updated_changes_requested obj = static_cast<AuditLog_project_updated_changes_requested> (getChangesRequested());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *changes_requestedKey = "changes_requested";
	json_object_set_member(pJsonObject, changes_requestedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AuditLog_project_updated::getId()
{
	return id;
}

void
AuditLog_project_updated::setId(std::string  id)
{
	this->id = id;
}

AuditLog_project_updated_changes_requested
AuditLog_project_updated::getChangesRequested()
{
	return changes_requested;
}

void
AuditLog_project_updated::setChangesRequested(AuditLog_project_updated_changes_requested  changes_requested)
{
	this->changes_requested = changes_requested;
}


