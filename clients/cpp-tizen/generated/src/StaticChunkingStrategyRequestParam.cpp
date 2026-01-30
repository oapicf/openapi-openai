#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "StaticChunkingStrategyRequestParam.h"

using namespace std;
using namespace Tizen::ArtikCloud;

StaticChunkingStrategyRequestParam::StaticChunkingStrategyRequestParam()
{
	//__init();
}

StaticChunkingStrategyRequestParam::~StaticChunkingStrategyRequestParam()
{
	//__cleanup();
}

void
StaticChunkingStrategyRequestParam::__init()
{
	//type = std::string();
	//r_static = new StaticChunkingStrategy();
}

void
StaticChunkingStrategyRequestParam::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(r_static != NULL) {
	//
	//delete r_static;
	//r_static = NULL;
	//}
	//
}

void
StaticChunkingStrategyRequestParam::fromJson(char* jsonStr)
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
	const gchar *r_staticKey = "static";
	node = json_object_get_member(pJsonObject, r_staticKey);
	if (node !=NULL) {
	

		if (isprimitive("StaticChunkingStrategy")) {
			jsonToValue(&r_static, node, "StaticChunkingStrategy", "StaticChunkingStrategy");
		} else {
			
			StaticChunkingStrategy* obj = static_cast<StaticChunkingStrategy*> (&r_static);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

StaticChunkingStrategyRequestParam::StaticChunkingStrategyRequestParam(char* json)
{
	this->fromJson(json);
}

char*
StaticChunkingStrategyRequestParam::toJson()
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
	if (isprimitive("StaticChunkingStrategy")) {
		StaticChunkingStrategy obj = getRStatic();
		node = converttoJson(&obj, "StaticChunkingStrategy", "");
	}
	else {
		
		StaticChunkingStrategy obj = static_cast<StaticChunkingStrategy> (getRStatic());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *r_staticKey = "static";
	json_object_set_member(pJsonObject, r_staticKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
StaticChunkingStrategyRequestParam::getType()
{
	return type;
}

void
StaticChunkingStrategyRequestParam::setType(std::string  type)
{
	this->type = type;
}

StaticChunkingStrategy
StaticChunkingStrategyRequestParam::getRStatic()
{
	return r_static;
}

void
StaticChunkingStrategyRequestParam::setRStatic(StaticChunkingStrategy  r_static)
{
	this->r_static = r_static;
}


