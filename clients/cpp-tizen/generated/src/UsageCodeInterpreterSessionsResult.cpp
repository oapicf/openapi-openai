#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UsageCodeInterpreterSessionsResult.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UsageCodeInterpreterSessionsResult::UsageCodeInterpreterSessionsResult()
{
	//__init();
}

UsageCodeInterpreterSessionsResult::~UsageCodeInterpreterSessionsResult()
{
	//__cleanup();
}

void
UsageCodeInterpreterSessionsResult::__init()
{
	//object = std::string();
	//sessions = int(0);
	//project_id = std::string();
}

void
UsageCodeInterpreterSessionsResult::__cleanup()
{
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(sessions != NULL) {
	//
	//delete sessions;
	//sessions = NULL;
	//}
	//if(project_id != NULL) {
	//
	//delete project_id;
	//project_id = NULL;
	//}
	//
}

void
UsageCodeInterpreterSessionsResult::fromJson(char* jsonStr)
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
	const gchar *sessionsKey = "sessions";
	node = json_object_get_member(pJsonObject, sessionsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&sessions, node, "int", "");
		} else {
			
		}
	}
	const gchar *project_idKey = "project_id";
	node = json_object_get_member(pJsonObject, project_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&project_id, node, "std::string", "");
		} else {
			
		}
	}
}

UsageCodeInterpreterSessionsResult::UsageCodeInterpreterSessionsResult(char* json)
{
	this->fromJson(json);
}

char*
UsageCodeInterpreterSessionsResult::toJson()
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
	if (isprimitive("int")) {
		int obj = getSessions();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sessionsKey = "sessions";
	json_object_set_member(pJsonObject, sessionsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProjectId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *project_idKey = "project_id";
	json_object_set_member(pJsonObject, project_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UsageCodeInterpreterSessionsResult::getObject()
{
	return object;
}

void
UsageCodeInterpreterSessionsResult::setObject(std::string  object)
{
	this->object = object;
}

int
UsageCodeInterpreterSessionsResult::getSessions()
{
	return sessions;
}

void
UsageCodeInterpreterSessionsResult::setSessions(int  sessions)
{
	this->sessions = sessions;
}

std::string
UsageCodeInterpreterSessionsResult::getProjectId()
{
	return project_id;
}

void
UsageCodeInterpreterSessionsResult::setProjectId(std::string  project_id)
{
	this->project_id = project_id;
}


