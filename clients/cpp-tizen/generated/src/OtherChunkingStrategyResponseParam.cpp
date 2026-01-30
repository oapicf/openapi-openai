#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OtherChunkingStrategyResponseParam.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OtherChunkingStrategyResponseParam::OtherChunkingStrategyResponseParam()
{
	//__init();
}

OtherChunkingStrategyResponseParam::~OtherChunkingStrategyResponseParam()
{
	//__cleanup();
}

void
OtherChunkingStrategyResponseParam::__init()
{
	//type = std::string();
}

void
OtherChunkingStrategyResponseParam::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
OtherChunkingStrategyResponseParam::fromJson(char* jsonStr)
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

OtherChunkingStrategyResponseParam::OtherChunkingStrategyResponseParam(char* json)
{
	this->fromJson(json);
}

char*
OtherChunkingStrategyResponseParam::toJson()
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
OtherChunkingStrategyResponseParam::getType()
{
	return type;
}

void
OtherChunkingStrategyResponseParam::setType(std::string  type)
{
	this->type = type;
}


