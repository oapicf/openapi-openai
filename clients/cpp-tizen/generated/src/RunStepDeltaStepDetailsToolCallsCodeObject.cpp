#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDeltaStepDetailsToolCallsCodeObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDeltaStepDetailsToolCallsCodeObject::RunStepDeltaStepDetailsToolCallsCodeObject()
{
	//__init();
}

RunStepDeltaStepDetailsToolCallsCodeObject::~RunStepDeltaStepDetailsToolCallsCodeObject()
{
	//__cleanup();
}

void
RunStepDeltaStepDetailsToolCallsCodeObject::__init()
{
	//index = int(0);
	//id = std::string();
	//type = std::string();
	//code_interpreter = new RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter();
}

void
RunStepDeltaStepDetailsToolCallsCodeObject::__cleanup()
{
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
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
RunStepDeltaStepDetailsToolCallsCodeObject::fromJson(char* jsonStr)
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
	

		if (isprimitive("RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter")) {
			jsonToValue(&code_interpreter, node, "RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter", "RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter");
		} else {
			
			RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter* obj = static_cast<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter*> (&code_interpreter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunStepDeltaStepDetailsToolCallsCodeObject::RunStepDeltaStepDetailsToolCallsCodeObject(char* json)
{
	this->fromJson(json);
}

char*
RunStepDeltaStepDetailsToolCallsCodeObject::toJson()
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
	if (isprimitive("RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter")) {
		RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter obj = getCodeInterpreter();
		node = converttoJson(&obj, "RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter", "");
	}
	else {
		
		RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter obj = static_cast<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter> (getCodeInterpreter());
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

int
RunStepDeltaStepDetailsToolCallsCodeObject::getIndex()
{
	return index;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject::setIndex(int  index)
{
	this->index = index;
}

std::string
RunStepDeltaStepDetailsToolCallsCodeObject::getId()
{
	return id;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDeltaStepDetailsToolCallsCodeObject::getType()
{
	return type;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject::setType(std::string  type)
{
	this->type = type;
}

RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter
RunStepDeltaStepDetailsToolCallsCodeObject::getCodeInterpreter()
{
	return code_interpreter;
}

void
RunStepDeltaStepDetailsToolCallsCodeObject::setCodeInterpreter(RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter  code_interpreter)
{
	this->code_interpreter = code_interpreter;
}


