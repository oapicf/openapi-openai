#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UserRoleUpdateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UserRoleUpdateRequest::UserRoleUpdateRequest()
{
	//__init();
}

UserRoleUpdateRequest::~UserRoleUpdateRequest()
{
	//__cleanup();
}

void
UserRoleUpdateRequest::__init()
{
	//role = std::string();
}

void
UserRoleUpdateRequest::__cleanup()
{
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//
}

void
UserRoleUpdateRequest::fromJson(char* jsonStr)
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

UserRoleUpdateRequest::UserRoleUpdateRequest(char* json)
{
	this->fromJson(json);
}

char*
UserRoleUpdateRequest::toJson()
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
UserRoleUpdateRequest::getRole()
{
	return role;
}

void
UserRoleUpdateRequest::setRole(std::string  role)
{
	this->role = role;
}


