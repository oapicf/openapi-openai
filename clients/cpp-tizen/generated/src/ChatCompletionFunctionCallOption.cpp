#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionFunctionCallOption.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionFunctionCallOption::ChatCompletionFunctionCallOption()
{
	//__init();
}

ChatCompletionFunctionCallOption::~ChatCompletionFunctionCallOption()
{
	//__cleanup();
}

void
ChatCompletionFunctionCallOption::__init()
{
	//name = std::string();
}

void
ChatCompletionFunctionCallOption::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
ChatCompletionFunctionCallOption::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

ChatCompletionFunctionCallOption::ChatCompletionFunctionCallOption(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionFunctionCallOption::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ChatCompletionFunctionCallOption::getName()
{
	return name;
}

void
ChatCompletionFunctionCallOption::setName(std::string  name)
{
	this->name = name;
}


