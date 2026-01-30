#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdminApiKey_owner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdminApiKey_owner::AdminApiKey_owner()
{
	//__init();
}

AdminApiKey_owner::~AdminApiKey_owner()
{
	//__cleanup();
}

void
AdminApiKey_owner::__init()
{
	//type = std::string();
	//id = std::string();
	//name = std::string();
	//created_at = long(0);
	//role = std::string();
}

void
AdminApiKey_owner::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
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
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//
}

void
AdminApiKey_owner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
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
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&created_at, node, "long long", "");
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

AdminApiKey_owner::AdminApiKey_owner(char* json)
{
	this->fromJson(json);
}

char*
AdminApiKey_owner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
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
	if (isprimitive("long long")) {
		long long obj = getCreatedAt();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
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
AdminApiKey_owner::getType()
{
	return type;
}

void
AdminApiKey_owner::setType(std::string  type)
{
	this->type = type;
}

std::string
AdminApiKey_owner::getId()
{
	return id;
}

void
AdminApiKey_owner::setId(std::string  id)
{
	this->id = id;
}

std::string
AdminApiKey_owner::getName()
{
	return name;
}

void
AdminApiKey_owner::setName(std::string  name)
{
	this->name = name;
}

long long
AdminApiKey_owner::getCreatedAt()
{
	return created_at;
}

void
AdminApiKey_owner::setCreatedAt(long long  created_at)
{
	this->created_at = created_at;
}

std::string
AdminApiKey_owner::getRole()
{
	return role;
}

void
AdminApiKey_owner::setRole(std::string  role)
{
	this->role = role;
}


