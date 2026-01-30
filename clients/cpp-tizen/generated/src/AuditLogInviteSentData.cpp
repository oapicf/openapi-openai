#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLog_invite_sent_data.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLog_invite_sent_data::AuditLog_invite_sent_data()
{
	//__init();
}

AuditLog_invite_sent_data::~AuditLog_invite_sent_data()
{
	//__cleanup();
}

void
AuditLog_invite_sent_data::__init()
{
	//email = std::string();
	//role = std::string();
}

void
AuditLog_invite_sent_data::__cleanup()
{
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
	//
}

void
AuditLog_invite_sent_data::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
}

AuditLog_invite_sent_data::AuditLog_invite_sent_data(char* json)
{
	this->fromJson(json);
}

char*
AuditLog_invite_sent_data::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AuditLog_invite_sent_data::getEmail()
{
	return email;
}

void
AuditLog_invite_sent_data::setEmail(std::string  email)
{
	this->email = email;
}

std::string
AuditLog_invite_sent_data::getRole()
{
	return role;
}

void
AuditLog_invite_sent_data::setRole(std::string  role)
{
	this->role = role;
}


