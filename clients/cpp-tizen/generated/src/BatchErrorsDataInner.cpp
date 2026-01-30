#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Batch_errors_data_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Batch_errors_data_inner::Batch_errors_data_inner()
{
	//__init();
}

Batch_errors_data_inner::~Batch_errors_data_inner()
{
	//__cleanup();
}

void
Batch_errors_data_inner::__init()
{
	//code = std::string();
	//message = std::string();
	//param = std::string();
	//line = int(0);
}

void
Batch_errors_data_inner::__cleanup()
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
	//if(line != NULL) {
	//
	//delete line;
	//line = NULL;
	//}
	//
}

void
Batch_errors_data_inner::fromJson(char* jsonStr)
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
	const gchar *lineKey = "line";
	node = json_object_get_member(pJsonObject, lineKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&line, node, "int", "");
		} else {
			
		}
	}
}

Batch_errors_data_inner::Batch_errors_data_inner(char* json)
{
	this->fromJson(json);
}

char*
Batch_errors_data_inner::toJson()
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
	if (isprimitive("int")) {
		int obj = getLine();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lineKey = "line";
	json_object_set_member(pJsonObject, lineKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Batch_errors_data_inner::getCode()
{
	return code;
}

void
Batch_errors_data_inner::setCode(std::string  code)
{
	this->code = code;
}

std::string
Batch_errors_data_inner::getMessage()
{
	return message;
}

void
Batch_errors_data_inner::setMessage(std::string  message)
{
	this->message = message;
}

std::string
Batch_errors_data_inner::getParam()
{
	return param;
}

void
Batch_errors_data_inner::setParam(std::string  param)
{
	this->param = param;
}

int
Batch_errors_data_inner::getLine()
{
	return line;
}

void
Batch_errors_data_inner::setLine(int  line)
{
	this->line = line;
}


