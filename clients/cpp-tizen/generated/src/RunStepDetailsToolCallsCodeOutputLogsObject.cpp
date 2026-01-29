#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDetailsToolCallsCodeOutputLogsObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDetailsToolCallsCodeOutputLogsObject::RunStepDetailsToolCallsCodeOutputLogsObject()
{
	//__init();
}

RunStepDetailsToolCallsCodeOutputLogsObject::~RunStepDetailsToolCallsCodeOutputLogsObject()
{
	//__cleanup();
}

void
RunStepDetailsToolCallsCodeOutputLogsObject::__init()
{
	//type = std::string();
	//logs = std::string();
}

void
RunStepDetailsToolCallsCodeOutputLogsObject::__cleanup()
{
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
RunStepDetailsToolCallsCodeOutputLogsObject::fromJson(char* jsonStr)
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
	const gchar *logsKey = "logs";
	node = json_object_get_member(pJsonObject, logsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&logs, node, "std::string", "");
		} else {
			
		}
	}
}

RunStepDetailsToolCallsCodeOutputLogsObject::RunStepDetailsToolCallsCodeOutputLogsObject(char* json)
{
	this->fromJson(json);
}

char*
RunStepDetailsToolCallsCodeOutputLogsObject::toJson()
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

std::string
RunStepDetailsToolCallsCodeOutputLogsObject::getType()
{
	return type;
}

void
RunStepDetailsToolCallsCodeOutputLogsObject::setType(std::string  type)
{
	this->type = type;
}

std::string
RunStepDetailsToolCallsCodeOutputLogsObject::getLogs()
{
	return logs;
}

void
RunStepDetailsToolCallsCodeOutputLogsObject::setLogs(std::string  logs)
{
	this->logs = logs;
}


