#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssistantToolsFunction.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssistantToolsFunction::AssistantToolsFunction()
{
	//__init();
}

AssistantToolsFunction::~AssistantToolsFunction()
{
	//__cleanup();
}

void
AssistantToolsFunction::__init()
{
	//type = std::string();
	//function = new FunctionObject();
}

void
AssistantToolsFunction::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(function != NULL) {
	//
	//delete function;
	//function = NULL;
	//}
	//
}

void
AssistantToolsFunction::fromJson(char* jsonStr)
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
	const gchar *functionKey = "function";
	node = json_object_get_member(pJsonObject, functionKey);
	if (node !=NULL) {
	

		if (isprimitive("FunctionObject")) {
			jsonToValue(&function, node, "FunctionObject", "FunctionObject");
		} else {
			
			FunctionObject* obj = static_cast<FunctionObject*> (&function);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AssistantToolsFunction::AssistantToolsFunction(char* json)
{
	this->fromJson(json);
}

char*
AssistantToolsFunction::toJson()
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
	if (isprimitive("FunctionObject")) {
		FunctionObject obj = getFunction();
		node = converttoJson(&obj, "FunctionObject", "");
	}
	else {
		
		FunctionObject obj = static_cast<FunctionObject> (getFunction());
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
AssistantToolsFunction::getType()
{
	return type;
}

void
AssistantToolsFunction::setType(std::string  type)
{
	this->type = type;
}

FunctionObject
AssistantToolsFunction::getFunction()
{
	return function;
}

void
AssistantToolsFunction::setFunction(FunctionObject  function)
{
	this->function = function;
}


