#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDetailsToolCallsObject_tool_calls_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDetailsToolCallsObject_tool_calls_inner::RunStepDetailsToolCallsObject_tool_calls_inner()
{
	//__init();
}

RunStepDetailsToolCallsObject_tool_calls_inner::~RunStepDetailsToolCallsObject_tool_calls_inner()
{
	//__cleanup();
}

void
RunStepDetailsToolCallsObject_tool_calls_inner::__init()
{
	//id = std::string();
	//type = std::string();
	//code_interpreter = new RunStepDetailsToolCallsCodeObject_code_interpreter();
	//retrieval = null;
	//function = new RunStepDetailsToolCallsFunctionObject_function();
}

void
RunStepDetailsToolCallsObject_tool_calls_inner::__cleanup()
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
	//if(retrieval != NULL) {
	//
	//delete retrieval;
	//retrieval = NULL;
	//}
	//if(function != NULL) {
	//
	//delete function;
	//function = NULL;
	//}
	//
}

void
RunStepDetailsToolCallsObject_tool_calls_inner::fromJson(char* jsonStr)
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
	const gchar *retrievalKey = "retrieval";
	node = json_object_get_member(pJsonObject, retrievalKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&retrieval, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&retrieval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *functionKey = "function";
	node = json_object_get_member(pJsonObject, functionKey);
	if (node !=NULL) {
	

		if (isprimitive("RunStepDetailsToolCallsFunctionObject_function")) {
			jsonToValue(&function, node, "RunStepDetailsToolCallsFunctionObject_function", "RunStepDetailsToolCallsFunctionObject_function");
		} else {
			
			RunStepDetailsToolCallsFunctionObject_function* obj = static_cast<RunStepDetailsToolCallsFunctionObject_function*> (&function);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunStepDetailsToolCallsObject_tool_calls_inner::RunStepDetailsToolCallsObject_tool_calls_inner(char* json)
{
	this->fromJson(json);
}

char*
RunStepDetailsToolCallsObject_tool_calls_inner::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getRetrieval();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getRetrieval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *retrievalKey = "retrieval";
	json_object_set_member(pJsonObject, retrievalKey, node);
	if (isprimitive("RunStepDetailsToolCallsFunctionObject_function")) {
		RunStepDetailsToolCallsFunctionObject_function obj = getFunction();
		node = converttoJson(&obj, "RunStepDetailsToolCallsFunctionObject_function", "");
	}
	else {
		
		RunStepDetailsToolCallsFunctionObject_function obj = static_cast<RunStepDetailsToolCallsFunctionObject_function> (getFunction());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *functionKey = "function";
	json_object_set_member(pJsonObject, functionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RunStepDetailsToolCallsObject_tool_calls_inner::getId()
{
	return id;
}

void
RunStepDetailsToolCallsObject_tool_calls_inner::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDetailsToolCallsObject_tool_calls_inner::getType()
{
	return type;
}

void
RunStepDetailsToolCallsObject_tool_calls_inner::setType(std::string  type)
{
	this->type = type;
}

RunStepDetailsToolCallsCodeObject_code_interpreter
RunStepDetailsToolCallsObject_tool_calls_inner::getCodeInterpreter()
{
	return code_interpreter;
}

void
RunStepDetailsToolCallsObject_tool_calls_inner::setCodeInterpreter(RunStepDetailsToolCallsCodeObject_code_interpreter  code_interpreter)
{
	this->code_interpreter = code_interpreter;
}

std::string
RunStepDetailsToolCallsObject_tool_calls_inner::getRetrieval()
{
	return retrieval;
}

void
RunStepDetailsToolCallsObject_tool_calls_inner::setRetrieval(std::string  retrieval)
{
	this->retrieval = retrieval;
}

RunStepDetailsToolCallsFunctionObject_function
RunStepDetailsToolCallsObject_tool_calls_inner::getFunction()
{
	return function;
}

void
RunStepDetailsToolCallsObject_tool_calls_inner::setFunction(RunStepDetailsToolCallsFunctionObject_function  function)
{
	this->function = function;
}


