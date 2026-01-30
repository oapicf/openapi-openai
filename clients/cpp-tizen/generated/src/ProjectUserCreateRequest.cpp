#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProjectUserCreateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProjectUserCreateRequest::ProjectUserCreateRequest()
{
	//__init();
}

ProjectUserCreateRequest::~ProjectUserCreateRequest()
{
	//__cleanup();
}

void
ProjectUserCreateRequest::__init()
{
	//user_id = std::string();
	//role = std::string();
}

void
ProjectUserCreateRequest::__cleanup()
{
	//if(user_id != NULL) {
	//
	//delete user_id;
	//user_id = NULL;
	//}
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//
}

void
ProjectUserCreateRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *user_idKey = "user_id";
	node = json_object_get_member(pJsonObject, user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&user_id, node, "std::string", "");
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

ProjectUserCreateRequest::ProjectUserCreateRequest(char* json)
{
	this->fromJson(json);
}

char*
ProjectUserCreateRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getUserId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *user_idKey = "user_id";
	json_object_set_member(pJsonObject, user_idKey, node);
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
ProjectUserCreateRequest::getUserId()
{
	return user_id;
}

void
ProjectUserCreateRequest::setUserId(std::string  user_id)
{
	this->user_id = user_id;
}

std::string
ProjectUserCreateRequest::getRole()
{
	return role;
}

void
ProjectUserCreateRequest::setRole(std::string  role)
{
	this->role = role;
}


