#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionTool.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionTool::ChatCompletionTool()
{
	//__init();
}

ChatCompletionTool::~ChatCompletionTool()
{
	//__cleanup();
}

void
ChatCompletionTool::__init()
{
	//type = std::string();
	//function = new FunctionObject();
}

void
ChatCompletionTool::__cleanup()
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
ChatCompletionTool::fromJson(char* jsonStr)
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

ChatCompletionTool::ChatCompletionTool(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionTool::toJson()
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
ChatCompletionTool::getType()
{
	return type;
}

void
ChatCompletionTool::setType(std::string  type)
{
	this->type = type;
}

FunctionObject
ChatCompletionTool::getFunction()
{
	return function;
}

void
ChatCompletionTool::setFunction(FunctionObject  function)
{
	this->function = function;
}


