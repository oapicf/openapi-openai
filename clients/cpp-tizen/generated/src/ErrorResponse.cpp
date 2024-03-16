#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ErrorResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ErrorResponse::ErrorResponse()
{
	//__init();
}

ErrorResponse::~ErrorResponse()
{
	//__cleanup();
}

void
ErrorResponse::__init()
{
	//error = new Error();
}

void
ErrorResponse::__cleanup()
{
	//if(error != NULL) {
	//
	//delete error;
	//error = NULL;
	//}
	//
}

void
ErrorResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *errorKey = "error";
	node = json_object_get_member(pJsonObject, errorKey);
	if (node !=NULL) {
	

		if (isprimitive("Error")) {
			jsonToValue(&error, node, "Error", "Error");
		} else {
			
			Error* obj = static_cast<Error*> (&error);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ErrorResponse::ErrorResponse(char* json)
{
	this->fromJson(json);
}

char*
ErrorResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Error")) {
		Error obj = getError();
		node = converttoJson(&obj, "Error", "");
	}
	else {
		
		Error obj = static_cast<Error> (getError());
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

Error
ErrorResponse::getError()
{
	return error;
}

void
ErrorResponse::setError(Error  error)
{
	this->error = error;
}


