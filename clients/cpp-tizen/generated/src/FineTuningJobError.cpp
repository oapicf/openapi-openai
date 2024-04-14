#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTuningJob_error.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTuningJob_error::FineTuningJob_error()
{
	//__init();
}

FineTuningJob_error::~FineTuningJob_error()
{
	//__cleanup();
}

void
FineTuningJob_error::__init()
{
	//code = std::string();
	//message = std::string();
	//param = std::string();
}

void
FineTuningJob_error::__cleanup()
{
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
	//
}

void
FineTuningJob_error::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
}

FineTuningJob_error::FineTuningJob_error(char* json)
{
	this->fromJson(json);
}

char*
FineTuningJob_error::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
FineTuningJob_error::getCode()
{
	return code;
}

void
FineTuningJob_error::setCode(std::string  code)
{
	this->code = code;
}

std::string
FineTuningJob_error::getMessage()
{
	return message;
}

void
FineTuningJob_error::setMessage(std::string  message)
{
	this->message = message;
}

std::string
FineTuningJob_error::getParam()
{
	return param;
}

void
FineTuningJob_error::setParam(std::string  param)
{
	this->param = param;
}


