#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProjectUserUpdateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProjectUserUpdateRequest::ProjectUserUpdateRequest()
{
	//__init();
}

ProjectUserUpdateRequest::~ProjectUserUpdateRequest()
{
	//__cleanup();
}

void
ProjectUserUpdateRequest::__init()
{
	//role = std::string();
}

void
ProjectUserUpdateRequest::__cleanup()
{
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//
}

void
ProjectUserUpdateRequest::fromJson(char* jsonStr)
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

ProjectUserUpdateRequest::ProjectUserUpdateRequest(char* json)
{
	this->fromJson(json);
}

char*
ProjectUserUpdateRequest::toJson()
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
ProjectUserUpdateRequest::getRole()
{
	return role;
}

void
ProjectUserUpdateRequest::setRole(std::string  role)
{
	this->role = role;
}


