#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLogActorUser.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLogActorUser::AuditLogActorUser()
{
	//__init();
}

AuditLogActorUser::~AuditLogActorUser()
{
	//__cleanup();
}

void
AuditLogActorUser::__init()
{
	//id = std::string();
	//email = std::string();
}

void
AuditLogActorUser::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(email != NULL) {
	//
	//delete email;
	//email = NULL;
	//}
	//
}

void
AuditLogActorUser::fromJson(char* jsonStr)
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
	const gchar *emailKey = "email";
	node = json_object_get_member(pJsonObject, emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&email, node, "std::string", "");
		} else {
			
		}
	}
}

AuditLogActorUser::AuditLogActorUser(char* json)
{
	this->fromJson(json);
}

char*
AuditLogActorUser::toJson()
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
		std::string obj = getEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *emailKey = "email";
	json_object_set_member(pJsonObject, emailKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AuditLogActorUser::getId()
{
	return id;
}

void
AuditLogActorUser::setId(std::string  id)
{
	this->id = id;
}

std::string
AuditLogActorUser::getEmail()
{
	return email;
}

void
AuditLogActorUser::setEmail(std::string  email)
{
	this->email = email;
}


