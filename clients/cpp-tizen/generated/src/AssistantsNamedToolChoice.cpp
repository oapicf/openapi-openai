#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssistantsNamedToolChoice.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssistantsNamedToolChoice::AssistantsNamedToolChoice()
{
	//__init();
}

AssistantsNamedToolChoice::~AssistantsNamedToolChoice()
{
	//__cleanup();
}

void
AssistantsNamedToolChoice::__init()
{
	//type = std::string();
	//function = new AssistantsNamedToolChoice_function();
}

void
AssistantsNamedToolChoice::__cleanup()
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
AssistantsNamedToolChoice::fromJson(char* jsonStr)
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
	

		if (isprimitive("AssistantsNamedToolChoice_function")) {
			jsonToValue(&function, node, "AssistantsNamedToolChoice_function", "AssistantsNamedToolChoice_function");
		} else {
			
			AssistantsNamedToolChoice_function* obj = static_cast<AssistantsNamedToolChoice_function*> (&function);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AssistantsNamedToolChoice::AssistantsNamedToolChoice(char* json)
{
	this->fromJson(json);
}

char*
AssistantsNamedToolChoice::toJson()
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
	if (isprimitive("AssistantsNamedToolChoice_function")) {
		AssistantsNamedToolChoice_function obj = getFunction();
		node = converttoJson(&obj, "AssistantsNamedToolChoice_function", "");
	}
	else {
		
		AssistantsNamedToolChoice_function obj = static_cast<AssistantsNamedToolChoice_function> (getFunction());
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
AssistantsNamedToolChoice::getType()
{
	return type;
}

void
AssistantsNamedToolChoice::setType(std::string  type)
{
	this->type = type;
}

AssistantsNamedToolChoice_function
AssistantsNamedToolChoice::getFunction()
{
	return function;
}

void
AssistantsNamedToolChoice::setFunction(AssistantsNamedToolChoice_function  function)
{
	this->function = function;
}


