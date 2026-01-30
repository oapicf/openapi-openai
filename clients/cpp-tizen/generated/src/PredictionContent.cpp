#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PredictionContent.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PredictionContent::PredictionContent()
{
	//__init();
}

PredictionContent::~PredictionContent()
{
	//__cleanup();
}

void
PredictionContent::__init()
{
	//type = std::string();
	//content = new PredictionContent_content();
}

void
PredictionContent::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(content != NULL) {
	//
	//delete content;
	//content = NULL;
	//}
	//
}

void
PredictionContent::fromJson(char* jsonStr)
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
	const gchar *contentKey = "content";
	node = json_object_get_member(pJsonObject, contentKey);
	if (node !=NULL) {
	

		if (isprimitive("PredictionContent_content")) {
			jsonToValue(&content, node, "PredictionContent_content", "PredictionContent_content");
		} else {
			
			PredictionContent_content* obj = static_cast<PredictionContent_content*> (&content);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PredictionContent::PredictionContent(char* json)
{
	this->fromJson(json);
}

char*
PredictionContent::toJson()
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
	if (isprimitive("PredictionContent_content")) {
		PredictionContent_content obj = getContent();
		node = converttoJson(&obj, "PredictionContent_content", "");
	}
	else {
		
		PredictionContent_content obj = static_cast<PredictionContent_content> (getContent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *contentKey = "content";
	json_object_set_member(pJsonObject, contentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PredictionContent::getType()
{
	return type;
}

void
PredictionContent::setType(std::string  type)
{
	this->type = type;
}

PredictionContent_content
PredictionContent::getContent()
{
	return content;
}

void
PredictionContent::setContent(PredictionContent_content  content)
{
	this->content = content;
}


