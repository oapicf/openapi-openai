#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject()
{
	//__init();
}

RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::~RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject()
{
	//__cleanup();
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::__init()
{
	//index = int(0);
	//type = std::string();
	//logs = std::string();
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::__cleanup()
{
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(logs != NULL) {
	//
	//delete logs;
	//logs = NULL;
	//}
	//
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *indexKey = "index";
	node = json_object_get_member(pJsonObject, indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&index, node, "int", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *logsKey = "logs";
	node = json_object_get_member(pJsonObject, logsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&logs, node, "std::string", "");
		} else {
			
		}
	}
}

RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(char* json)
{
	this->fromJson(json);
}

char*
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *indexKey = "index";
	json_object_set_member(pJsonObject, indexKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLogs();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *logsKey = "logs";
	json_object_set_member(pJsonObject, logsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::getIndex()
{
	return index;
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::setIndex(int  index)
{
	this->index = index;
}

std::string
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::getType()
{
	return type;
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::setType(std::string  type)
{
	this->type = type;
}

std::string
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::getLogs()
{
	return logs;
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject::setLogs(std::string  logs)
{
	this->logs = logs;
}


