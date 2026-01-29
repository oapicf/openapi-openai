#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateChatCompletionRequest_response_format.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateChatCompletionRequest_response_format::CreateChatCompletionRequest_response_format()
{
	//__init();
}

CreateChatCompletionRequest_response_format::~CreateChatCompletionRequest_response_format()
{
	//__cleanup();
}

void
CreateChatCompletionRequest_response_format::__init()
{
	//type = std::string();
}

void
CreateChatCompletionRequest_response_format::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
CreateChatCompletionRequest_response_format::fromJson(char* jsonStr)
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
}

CreateChatCompletionRequest_response_format::CreateChatCompletionRequest_response_format(char* json)
{
	this->fromJson(json);
}

char*
CreateChatCompletionRequest_response_format::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateChatCompletionRequest_response_format::getType()
{
	return type;
}

void
CreateChatCompletionRequest_response_format::setType(std::string  type)
{
	this->type = type;
}


