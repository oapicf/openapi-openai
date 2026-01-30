#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageContentRefusalObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageContentRefusalObject::MessageContentRefusalObject()
{
	//__init();
}

MessageContentRefusalObject::~MessageContentRefusalObject()
{
	//__cleanup();
}

void
MessageContentRefusalObject::__init()
{
	//type = std::string();
	//refusal = std::string();
}

void
MessageContentRefusalObject::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(refusal != NULL) {
	//
	//delete refusal;
	//refusal = NULL;
	//}
	//
}

void
MessageContentRefusalObject::fromJson(char* jsonStr)
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
	const gchar *refusalKey = "refusal";
	node = json_object_get_member(pJsonObject, refusalKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&refusal, node, "std::string", "");
		} else {
			
		}
	}
}

MessageContentRefusalObject::MessageContentRefusalObject(char* json)
{
	this->fromJson(json);
}

char*
MessageContentRefusalObject::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getRefusal();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *refusalKey = "refusal";
	json_object_set_member(pJsonObject, refusalKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MessageContentRefusalObject::getType()
{
	return type;
}

void
MessageContentRefusalObject::setType(std::string  type)
{
	this->type = type;
}

std::string
MessageContentRefusalObject::getRefusal()
{
	return refusal;
}

void
MessageContentRefusalObject::setRefusal(std::string  refusal)
{
	this->refusal = refusal;
}


