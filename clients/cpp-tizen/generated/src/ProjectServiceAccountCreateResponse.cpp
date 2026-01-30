#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProjectServiceAccountCreateResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProjectServiceAccountCreateResponse::ProjectServiceAccountCreateResponse()
{
	//__init();
}

ProjectServiceAccountCreateResponse::~ProjectServiceAccountCreateResponse()
{
	//__cleanup();
}

void
ProjectServiceAccountCreateResponse::__init()
{
	//object = std::string();
	//id = std::string();
	//name = std::string();
	//role = std::string();
	//created_at = int(0);
	//api_key = new ProjectServiceAccountApiKey();
}

void
ProjectServiceAccountCreateResponse::__cleanup()
{
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(api_key != NULL) {
	//
	//delete api_key;
	//api_key = NULL;
	//}
	//
}

void
ProjectServiceAccountCreateResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
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
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *api_keyKey = "api_key";
	node = json_object_get_member(pJsonObject, api_keyKey);
	if (node !=NULL) {
	

		if (isprimitive("ProjectServiceAccountApiKey")) {
			jsonToValue(&api_key, node, "ProjectServiceAccountApiKey", "ProjectServiceAccountApiKey");
		} else {
			
			ProjectServiceAccountApiKey* obj = static_cast<ProjectServiceAccountApiKey*> (&api_key);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ProjectServiceAccountCreateResponse::ProjectServiceAccountCreateResponse(char* json)
{
	this->fromJson(json);
}

char*
ProjectServiceAccountCreateResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRole();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *roleKey = "role";
	json_object_set_member(pJsonObject, roleKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("ProjectServiceAccountApiKey")) {
		ProjectServiceAccountApiKey obj = getApiKey();
		node = converttoJson(&obj, "ProjectServiceAccountApiKey", "");
	}
	else {
		
		ProjectServiceAccountApiKey obj = static_cast<ProjectServiceAccountApiKey> (getApiKey());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *api_keyKey = "api_key";
	json_object_set_member(pJsonObject, api_keyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ProjectServiceAccountCreateResponse::getObject()
{
	return object;
}

void
ProjectServiceAccountCreateResponse::setObject(std::string  object)
{
	this->object = object;
}

std::string
ProjectServiceAccountCreateResponse::getId()
{
	return id;
}

void
ProjectServiceAccountCreateResponse::setId(std::string  id)
{
	this->id = id;
}

std::string
ProjectServiceAccountCreateResponse::getName()
{
	return name;
}

void
ProjectServiceAccountCreateResponse::setName(std::string  name)
{
	this->name = name;
}

std::string
ProjectServiceAccountCreateResponse::getRole()
{
	return role;
}

void
ProjectServiceAccountCreateResponse::setRole(std::string  role)
{
	this->role = role;
}

int
ProjectServiceAccountCreateResponse::getCreatedAt()
{
	return created_at;
}

void
ProjectServiceAccountCreateResponse::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

ProjectServiceAccountApiKey
ProjectServiceAccountCreateResponse::getApiKey()
{
	return api_key;
}

void
ProjectServiceAccountCreateResponse::setApiKey(ProjectServiceAccountApiKey  api_key)
{
	this->api_key = api_key;
}


