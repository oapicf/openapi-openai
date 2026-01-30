#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProjectUser.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProjectUser::ProjectUser()
{
	//__init();
}

ProjectUser::~ProjectUser()
{
	//__cleanup();
}

void
ProjectUser::__init()
{
	//object = std::string();
	//id = std::string();
	//name = std::string();
	//email = std::string();
	//role = std::string();
	//added_at = int(0);
}

void
ProjectUser::__cleanup()
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
	//if(email != NULL) {
	//
	//delete email;
	//email = NULL;
	//}
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//if(added_at != NULL) {
	//
	//delete added_at;
	//added_at = NULL;
	//}
	//
}

void
ProjectUser::fromJson(char* jsonStr)
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
	const gchar *emailKey = "email";
	node = json_object_get_member(pJsonObject, emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&email, node, "std::string", "");
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
	const gchar *added_atKey = "added_at";
	node = json_object_get_member(pJsonObject, added_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&added_at, node, "int", "");
		} else {
			
		}
	}
}

ProjectUser::ProjectUser(char* json)
{
	this->fromJson(json);
}

char*
ProjectUser::toJson()
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
		std::string obj = getEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *emailKey = "email";
	json_object_set_member(pJsonObject, emailKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRole();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *roleKey = "role";
	json_object_set_member(pJsonObject, roleKey, node);
	if (isprimitive("int")) {
		int obj = getAddedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *added_atKey = "added_at";
	json_object_set_member(pJsonObject, added_atKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ProjectUser::getObject()
{
	return object;
}

void
ProjectUser::setObject(std::string  object)
{
	this->object = object;
}

std::string
ProjectUser::getId()
{
	return id;
}

void
ProjectUser::setId(std::string  id)
{
	this->id = id;
}

std::string
ProjectUser::getName()
{
	return name;
}

void
ProjectUser::setName(std::string  name)
{
	this->name = name;
}

std::string
ProjectUser::getEmail()
{
	return email;
}

void
ProjectUser::setEmail(std::string  email)
{
	this->email = email;
}

std::string
ProjectUser::getRole()
{
	return role;
}

void
ProjectUser::setRole(std::string  role)
{
	this->role = role;
}

int
ProjectUser::getAddedAt()
{
	return added_at;
}

void
ProjectUser::setAddedAt(int  added_at)
{
	this->added_at = added_at;
}


