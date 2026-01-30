#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BatchRequestOutput.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BatchRequestOutput::BatchRequestOutput()
{
	//__init();
}

BatchRequestOutput::~BatchRequestOutput()
{
	//__cleanup();
}

void
BatchRequestOutput::__init()
{
	//id = std::string();
	//custom_id = std::string();
	//response = new BatchRequestOutput_response();
	//error = new BatchRequestOutput_error();
}

void
BatchRequestOutput::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(custom_id != NULL) {
	//
	//delete custom_id;
	//custom_id = NULL;
	//}
	//if(response != NULL) {
	//
	//delete response;
	//response = NULL;
	//}
	//if(error != NULL) {
	//
	//delete error;
	//error = NULL;
	//}
	//
}

void
BatchRequestOutput::fromJson(char* jsonStr)
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
	const gchar *custom_idKey = "custom_id";
	node = json_object_get_member(pJsonObject, custom_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *responseKey = "response";
	node = json_object_get_member(pJsonObject, responseKey);
	if (node !=NULL) {
	

		if (isprimitive("BatchRequestOutput_response")) {
			jsonToValue(&response, node, "BatchRequestOutput_response", "BatchRequestOutput_response");
		} else {
			
			BatchRequestOutput_response* obj = static_cast<BatchRequestOutput_response*> (&response);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *errorKey = "error";
	node = json_object_get_member(pJsonObject, errorKey);
	if (node !=NULL) {
	

		if (isprimitive("BatchRequestOutput_error")) {
			jsonToValue(&error, node, "BatchRequestOutput_error", "BatchRequestOutput_error");
		} else {
			
			BatchRequestOutput_error* obj = static_cast<BatchRequestOutput_error*> (&error);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BatchRequestOutput::BatchRequestOutput(char* json)
{
	this->fromJson(json);
}

char*
BatchRequestOutput::toJson()
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
		std::string obj = getCustomId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_idKey = "custom_id";
	json_object_set_member(pJsonObject, custom_idKey, node);
	if (isprimitive("BatchRequestOutput_response")) {
		BatchRequestOutput_response obj = getResponse();
		node = converttoJson(&obj, "BatchRequestOutput_response", "");
	}
	else {
		
		BatchRequestOutput_response obj = static_cast<BatchRequestOutput_response> (getResponse());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *responseKey = "response";
	json_object_set_member(pJsonObject, responseKey, node);
	if (isprimitive("BatchRequestOutput_error")) {
		BatchRequestOutput_error obj = getError();
		node = converttoJson(&obj, "BatchRequestOutput_error", "");
	}
	else {
		
		BatchRequestOutput_error obj = static_cast<BatchRequestOutput_error> (getError());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *errorKey = "error";
	json_object_set_member(pJsonObject, errorKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BatchRequestOutput::getId()
{
	return id;
}

void
BatchRequestOutput::setId(std::string  id)
{
	this->id = id;
}

std::string
BatchRequestOutput::getCustomId()
{
	return custom_id;
}

void
BatchRequestOutput::setCustomId(std::string  custom_id)
{
	this->custom_id = custom_id;
}

BatchRequestOutput_response
BatchRequestOutput::getResponse()
{
	return response;
}

void
BatchRequestOutput::setResponse(BatchRequestOutput_response  response)
{
	this->response = response;
}

BatchRequestOutput_error
BatchRequestOutput::getError()
{
	return error;
}

void
BatchRequestOutput::setError(BatchRequestOutput_error  error)
{
	this->error = error;
}


