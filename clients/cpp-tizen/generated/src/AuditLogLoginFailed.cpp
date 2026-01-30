#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLog_login_failed.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLog_login_failed::AuditLog_login_failed()
{
	//__init();
}

AuditLog_login_failed::~AuditLog_login_failed()
{
	//__cleanup();
}

void
AuditLog_login_failed::__init()
{
	//error_code = std::string();
	//error_message = std::string();
}

void
AuditLog_login_failed::__cleanup()
{
	//if(error_code != NULL) {
	//
	//delete error_code;
	//error_code = NULL;
	//}
	//if(error_message != NULL) {
	//
	//delete error_message;
	//error_message = NULL;
	//}
	//
}

void
AuditLog_login_failed::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *error_codeKey = "error_code";
	node = json_object_get_member(pJsonObject, error_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&error_code, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *error_messageKey = "error_message";
	node = json_object_get_member(pJsonObject, error_messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&error_message, node, "std::string", "");
		} else {
			
		}
	}
}

AuditLog_login_failed::AuditLog_login_failed(char* json)
{
	this->fromJson(json);
}

char*
AuditLog_login_failed::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getErrorCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *error_codeKey = "error_code";
	json_object_set_member(pJsonObject, error_codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getErrorMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *error_messageKey = "error_message";
	json_object_set_member(pJsonObject, error_messageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AuditLog_login_failed::getErrorCode()
{
	return error_code;
}

void
AuditLog_login_failed::setErrorCode(std::string  error_code)
{
	this->error_code = error_code;
}

std::string
AuditLog_login_failed::getErrorMessage()
{
	return error_message;
}

void
AuditLog_login_failed::setErrorMessage(std::string  error_message)
{
	this->error_message = error_message;
}


