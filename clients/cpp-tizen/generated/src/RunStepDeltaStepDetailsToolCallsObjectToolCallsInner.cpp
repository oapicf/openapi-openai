#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner()
{
	//__init();
}

RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::~RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner()
{
	//__cleanup();
}

void
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::__init()
{
	//index = int(0);
	//id = std::string();
	//type = std::string();
	//code_interpreter = new RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter();
	//file_search = null;
	//function = new RunStepDeltaStepDetailsToolCallsFunctionObject_function();
}

void
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::__cleanup()
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
	//if(file_search != NULL) {
	//
	//delete file_search;
	//file_search = NULL;
	//}
	//if(function != NULL) {
	//
	//delete function;
	//function = NULL;
	//}
	//
}

void
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::fromJson(char* jsonStr)
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
	const gchar *file_searchKey = "file_search";
	node = json_object_get_member(pJsonObject, file_searchKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&file_search, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&file_search);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *functionKey = "function";
	node = json_object_get_member(pJsonObject, functionKey);
	if (node !=NULL) {
	

		if (isprimitive("RunStepDeltaStepDetailsToolCallsFunctionObject_function")) {
			jsonToValue(&function, node, "RunStepDeltaStepDetailsToolCallsFunctionObject_function", "RunStepDeltaStepDetailsToolCallsFunctionObject_function");
		} else {
			
			RunStepDeltaStepDetailsToolCallsFunctionObject_function* obj = static_cast<RunStepDeltaStepDetailsToolCallsFunctionObject_function*> (&function);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner(char* json)
{
	this->fromJson(json);
}

char*
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getFileSearch();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getFileSearch());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *file_searchKey = "file_search";
	json_object_set_member(pJsonObject, file_searchKey, node);
	if (isprimitive("RunStepDeltaStepDetailsToolCallsFunctionObject_function")) {
		RunStepDeltaStepDetailsToolCallsFunctionObject_function obj = getFunction();
		node = converttoJson(&obj, "RunStepDeltaStepDetailsToolCallsFunctionObject_function", "");
	}
	else {
		
		RunStepDeltaStepDetailsToolCallsFunctionObject_function obj = static_cast<RunStepDeltaStepDetailsToolCallsFunctionObject_function> (getFunction());
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

int
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getIndex()
{
	return index;
}

void
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setIndex(int  index)
{
	this->index = index;
}

std::string
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getId()
{
	return id;
}

void
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getType()
{
	return type;
}

void
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setType(std::string  type)
{
	this->type = type;
}

RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getCodeInterpreter()
{
	return code_interpreter;
}

void
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setCodeInterpreter(RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter  code_interpreter)
{
	this->code_interpreter = code_interpreter;
}

std::string
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getFileSearch()
{
	return file_search;
}

void
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setFileSearch(std::string  file_search)
{
	this->file_search = file_search;
}

RunStepDeltaStepDetailsToolCallsFunctionObject_function
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::getFunction()
{
	return function;
}

void
RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner::setFunction(RunStepDeltaStepDetailsToolCallsFunctionObject_function  function)
{
	this->function = function;
}


