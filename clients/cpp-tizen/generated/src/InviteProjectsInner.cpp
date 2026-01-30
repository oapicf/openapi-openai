#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Invite_projects_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Invite_projects_inner::Invite_projects_inner()
{
	//__init();
}

Invite_projects_inner::~Invite_projects_inner()
{
	//__cleanup();
}

void
Invite_projects_inner::__init()
{
	//id = std::string();
	//role = std::string();
}

void
Invite_projects_inner::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//
}

void
Invite_projects_inner::fromJson(char* jsonStr)
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
	const gchar *roleKey = "role";
	node = json_object_get_member(pJsonObject, roleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&role, node, "std::string", "");
		} else {
			
		}
	}
}

Invite_projects_inner::Invite_projects_inner(char* json)
{
	this->fromJson(json);
}

char*
Invite_projects_inner::toJson()
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
Invite_projects_inner::getId()
{
	return id;
}

void
Invite_projects_inner::setId(std::string  id)
{
	this->id = id;
}

std::string
Invite_projects_inner::getRole()
{
	return role;
}

void
Invite_projects_inner::setRole(std::string  role)
{
	this->role = role;
}


