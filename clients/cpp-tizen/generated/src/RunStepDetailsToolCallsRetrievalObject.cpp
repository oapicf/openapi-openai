#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDetailsToolCallsRetrievalObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDetailsToolCallsRetrievalObject::RunStepDetailsToolCallsRetrievalObject()
{
	//__init();
}

RunStepDetailsToolCallsRetrievalObject::~RunStepDetailsToolCallsRetrievalObject()
{
	//__cleanup();
}

void
RunStepDetailsToolCallsRetrievalObject::__init()
{
	//id = std::string();
	//type = std::string();
	//retrieval = null;
}

void
RunStepDetailsToolCallsRetrievalObject::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(retrieval != NULL) {
	//
	//delete retrieval;
	//retrieval = NULL;
	//}
	//
}

void
RunStepDetailsToolCallsRetrievalObject::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
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
	const gchar *retrievalKey = "retrieval";
	node = json_object_get_member(pJsonObject, retrievalKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&retrieval, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&retrieval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunStepDetailsToolCallsRetrievalObject::RunStepDetailsToolCallsRetrievalObject(char* json)
{
	this->fromJson(json);
}

char*
RunStepDetailsToolCallsRetrievalObject::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRetrieval();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getRetrieval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *retrievalKey = "retrieval";
	json_object_set_member(pJsonObject, retrievalKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RunStepDetailsToolCallsRetrievalObject::getId()
{
	return id;
}

void
RunStepDetailsToolCallsRetrievalObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDetailsToolCallsRetrievalObject::getType()
{
	return type;
}

void
RunStepDetailsToolCallsRetrievalObject::setType(std::string  type)
{
	this->type = type;
}

std::string
RunStepDetailsToolCallsRetrievalObject::getRetrieval()
{
	return retrieval;
}

void
RunStepDetailsToolCallsRetrievalObject::setRetrieval(std::string  retrieval)
{
	this->retrieval = retrieval;
}


