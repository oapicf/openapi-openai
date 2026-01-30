#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventError_error.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventError_error::RealtimeServerEventError_error()
{
	//__init();
}

RealtimeServerEventError_error::~RealtimeServerEventError_error()
{
	//__cleanup();
}

void
RealtimeServerEventError_error::__init()
{
	//type = std::string();
	//code = std::string();
	//message = std::string();
	//param = std::string();
	//event_id = std::string();
}

void
RealtimeServerEventError_error::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(code != NULL) {
	//
	//delete code;
	//code = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//if(param != NULL) {
	//
	//delete param;
	//param = NULL;
	//}
	//if(event_id != NULL) {
	//
	//delete event_id;
	//event_id = NULL;
	//}
	//
}

void
RealtimeServerEventError_error::fromJson(char* jsonStr)
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
	const gchar *codeKey = "code";
	node = json_object_get_member(pJsonObject, codeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&code, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *paramKey = "param";
	node = json_object_get_member(pJsonObject, paramKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&param, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *event_idKey = "event_id";
	node = json_object_get_member(pJsonObject, event_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&event_id, node, "std::string", "");
		} else {
			
		}
	}
}

RealtimeServerEventError_error::RealtimeServerEventError_error(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventError_error::toJson()
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
		std::string obj = getCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *codeKey = "code";
	json_object_set_member(pJsonObject, codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getParam();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *paramKey = "param";
	json_object_set_member(pJsonObject, paramKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEventId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *event_idKey = "event_id";
	json_object_set_member(pJsonObject, event_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventError_error::getType()
{
	return type;
}

void
RealtimeServerEventError_error::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventError_error::getCode()
{
	return code;
}

void
RealtimeServerEventError_error::setCode(std::string  code)
{
	this->code = code;
}

std::string
RealtimeServerEventError_error::getMessage()
{
	return message;
}

void
RealtimeServerEventError_error::setMessage(std::string  message)
{
	this->message = message;
}

std::string
RealtimeServerEventError_error::getParam()
{
	return param;
}

void
RealtimeServerEventError_error::setParam(std::string  param)
{
	this->param = param;
}

std::string
RealtimeServerEventError_error::getEventId()
{
	return event_id;
}

void
RealtimeServerEventError_error::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}


