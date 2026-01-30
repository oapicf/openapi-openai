#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Batch_request_counts.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Batch_request_counts::Batch_request_counts()
{
	//__init();
}

Batch_request_counts::~Batch_request_counts()
{
	//__cleanup();
}

void
Batch_request_counts::__init()
{
	//total = int(0);
	//completed = int(0);
	//failed = int(0);
}

void
Batch_request_counts::__cleanup()
{
	//if(total != NULL) {
	//
	//delete total;
	//total = NULL;
	//}
	//if(completed != NULL) {
	//
	//delete completed;
	//completed = NULL;
	//}
	//if(failed != NULL) {
	//
	//delete failed;
	//failed = NULL;
	//}
	//
}

void
Batch_request_counts::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *totalKey = "total";
	node = json_object_get_member(pJsonObject, totalKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&total, node, "int", "");
		} else {
			
		}
	}
	const gchar *completedKey = "completed";
	node = json_object_get_member(pJsonObject, completedKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&completed, node, "int", "");
		} else {
			
		}
	}
	const gchar *failedKey = "failed";
	node = json_object_get_member(pJsonObject, failedKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&failed, node, "int", "");
		} else {
			
		}
	}
}

Batch_request_counts::Batch_request_counts(char* json)
{
	this->fromJson(json);
}

char*
Batch_request_counts::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getTotal();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *totalKey = "total";
	json_object_set_member(pJsonObject, totalKey, node);
	if (isprimitive("int")) {
		int obj = getCompleted();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *completedKey = "completed";
	json_object_set_member(pJsonObject, completedKey, node);
	if (isprimitive("int")) {
		int obj = getFailed();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *failedKey = "failed";
	json_object_set_member(pJsonObject, failedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
Batch_request_counts::getTotal()
{
	return total;
}

void
Batch_request_counts::setTotal(int  total)
{
	this->total = total;
}

int
Batch_request_counts::getCompleted()
{
	return completed;
}

void
Batch_request_counts::setCompleted(int  completed)
{
	this->completed = completed;
}

int
Batch_request_counts::getFailed()
{
	return failed;
}

void
Batch_request_counts::setFailed(int  failed)
{
	this->failed = failed;
}


