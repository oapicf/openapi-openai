#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BatchRequestOutput_response.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BatchRequestOutput_response::BatchRequestOutput_response()
{
	//__init();
}

BatchRequestOutput_response::~BatchRequestOutput_response()
{
	//__cleanup();
}

void
BatchRequestOutput_response::__init()
{
	//status_code = int(0);
	//request_id = std::string();
	//body = null;
}

void
BatchRequestOutput_response::__cleanup()
{
	//if(status_code != NULL) {
	//
	//delete status_code;
	//status_code = NULL;
	//}
	//if(request_id != NULL) {
	//
	//delete request_id;
	//request_id = NULL;
	//}
	//if(body != NULL) {
	//
	//delete body;
	//body = NULL;
	//}
	//
}

void
BatchRequestOutput_response::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *status_codeKey = "status_code";
	node = json_object_get_member(pJsonObject, status_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&status_code, node, "int", "");
		} else {
			
		}
	}
	const gchar *request_idKey = "request_id";
	node = json_object_get_member(pJsonObject, request_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&request_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *bodyKey = "body";
	node = json_object_get_member(pJsonObject, bodyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&body, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&body);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BatchRequestOutput_response::BatchRequestOutput_response(char* json)
{
	this->fromJson(json);
}

char*
BatchRequestOutput_response::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getStatusCode();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *status_codeKey = "status_code";
	json_object_set_member(pJsonObject, status_codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRequestId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *request_idKey = "request_id";
	json_object_set_member(pJsonObject, request_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBody();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getBody());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bodyKey = "body";
	json_object_set_member(pJsonObject, bodyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
BatchRequestOutput_response::getStatusCode()
{
	return status_code;
}

void
BatchRequestOutput_response::setStatusCode(int  status_code)
{
	this->status_code = status_code;
}

std::string
BatchRequestOutput_response::getRequestId()
{
	return request_id;
}

void
BatchRequestOutput_response::setRequestId(std::string  request_id)
{
	this->request_id = request_id;
}

std::string
BatchRequestOutput_response::getBody()
{
	return body;
}

void
BatchRequestOutput_response::setBody(std::string  body)
{
	this->body = body;
}


