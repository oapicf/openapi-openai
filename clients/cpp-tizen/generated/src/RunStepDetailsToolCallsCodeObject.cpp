#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDetailsToolCallsCodeObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDetailsToolCallsCodeObject::RunStepDetailsToolCallsCodeObject()
{
	//__init();
}

RunStepDetailsToolCallsCodeObject::~RunStepDetailsToolCallsCodeObject()
{
	//__cleanup();
}

void
RunStepDetailsToolCallsCodeObject::__init()
{
	//id = std::string();
	//type = std::string();
	//code_interpreter = new RunStepDetailsToolCallsCodeObject_code_interpreter();
}

void
RunStepDetailsToolCallsCodeObject::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(code_interpreter != NULL) {
	//
	//delete code_interpreter;
	//code_interpreter = NULL;
	//}
	//
}

void
RunStepDetailsToolCallsCodeObject::fromJson(char* jsonStr)
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
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *code_interpreterKey = "code_interpreter";
	node = json_object_get_member(pJsonObject, code_interpreterKey);
	if (node !=NULL) {
	

		if (isprimitive("RunStepDetailsToolCallsCodeObject_code_interpreter")) {
			jsonToValue(&code_interpreter, node, "RunStepDetailsToolCallsCodeObject_code_interpreter", "RunStepDetailsToolCallsCodeObject_code_interpreter");
		} else {
			
			RunStepDetailsToolCallsCodeObject_code_interpreter* obj = static_cast<RunStepDetailsToolCallsCodeObject_code_interpreter*> (&code_interpreter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunStepDetailsToolCallsCodeObject::RunStepDetailsToolCallsCodeObject(char* json)
{
	this->fromJson(json);
}

char*
RunStepDetailsToolCallsCodeObject::toJson()
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
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("RunStepDetailsToolCallsCodeObject_code_interpreter")) {
		RunStepDetailsToolCallsCodeObject_code_interpreter obj = getCodeInterpreter();
		node = converttoJson(&obj, "RunStepDetailsToolCallsCodeObject_code_interpreter", "");
	}
	else {
		
		RunStepDetailsToolCallsCodeObject_code_interpreter obj = static_cast<RunStepDetailsToolCallsCodeObject_code_interpreter> (getCodeInterpreter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *code_interpreterKey = "code_interpreter";
	json_object_set_member(pJsonObject, code_interpreterKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RunStepDetailsToolCallsCodeObject::getId()
{
	return id;
}

void
RunStepDetailsToolCallsCodeObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDetailsToolCallsCodeObject::getType()
{
	return type;
}

void
RunStepDetailsToolCallsCodeObject::setType(std::string  type)
{
	this->type = type;
}

RunStepDetailsToolCallsCodeObject_code_interpreter
RunStepDetailsToolCallsCodeObject::getCodeInterpreter()
{
	return code_interpreter;
}

void
RunStepDetailsToolCallsCodeObject::setCodeInterpreter(RunStepDetailsToolCallsCodeObject_code_interpreter  code_interpreter)
{
	this->code_interpreter = code_interpreter;
}


