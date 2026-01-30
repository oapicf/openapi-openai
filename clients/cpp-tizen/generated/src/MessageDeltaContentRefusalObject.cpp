#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageDeltaContentRefusalObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageDeltaContentRefusalObject::MessageDeltaContentRefusalObject()
{
	//__init();
}

MessageDeltaContentRefusalObject::~MessageDeltaContentRefusalObject()
{
	//__cleanup();
}

void
MessageDeltaContentRefusalObject::__init()
{
	//index = int(0);
	//type = std::string();
	//refusal = std::string();
}

void
MessageDeltaContentRefusalObject::__cleanup()
{
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
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
MessageDeltaContentRefusalObject::fromJson(char* jsonStr)
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

MessageDeltaContentRefusalObject::MessageDeltaContentRefusalObject(char* json)
{
	this->fromJson(json);
}

char*
MessageDeltaContentRefusalObject::toJson()
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

int
MessageDeltaContentRefusalObject::getIndex()
{
	return index;
}

void
MessageDeltaContentRefusalObject::setIndex(int  index)
{
	this->index = index;
}

std::string
MessageDeltaContentRefusalObject::getType()
{
	return type;
}

void
MessageDeltaContentRefusalObject::setType(std::string  type)
{
	this->type = type;
}

std::string
MessageDeltaContentRefusalObject::getRefusal()
{
	return refusal;
}

void
MessageDeltaContentRefusalObject::setRefusal(std::string  refusal)
{
	this->refusal = refusal;
}


