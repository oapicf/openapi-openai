#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VectorStoreObject_file_counts.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VectorStoreObject_file_counts::VectorStoreObject_file_counts()
{
	//__init();
}

VectorStoreObject_file_counts::~VectorStoreObject_file_counts()
{
	//__cleanup();
}

void
VectorStoreObject_file_counts::__init()
{
	//in_progress = int(0);
	//completed = int(0);
	//failed = int(0);
	//cancelled = int(0);
	//total = int(0);
}

void
VectorStoreObject_file_counts::__cleanup()
{
	//if(in_progress != NULL) {
	//
	//delete in_progress;
	//in_progress = NULL;
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
	//if(cancelled != NULL) {
	//
	//delete cancelled;
	//cancelled = NULL;
	//}
	//if(total != NULL) {
	//
	//delete total;
	//total = NULL;
	//}
	//
}

void
VectorStoreObject_file_counts::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *in_progressKey = "in_progress";
	node = json_object_get_member(pJsonObject, in_progressKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&in_progress, node, "int", "");
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
	const gchar *cancelledKey = "cancelled";
	node = json_object_get_member(pJsonObject, cancelledKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&cancelled, node, "int", "");
		} else {
			
		}
	}
	const gchar *totalKey = "total";
	node = json_object_get_member(pJsonObject, totalKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&total, node, "int", "");
		} else {
			
		}
	}
}

VectorStoreObject_file_counts::VectorStoreObject_file_counts(char* json)
{
	this->fromJson(json);
}

char*
VectorStoreObject_file_counts::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getInProgress();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *in_progressKey = "in_progress";
	json_object_set_member(pJsonObject, in_progressKey, node);
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
	if (isprimitive("int")) {
		int obj = getCancelled();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *cancelledKey = "cancelled";
	json_object_set_member(pJsonObject, cancelledKey, node);
	if (isprimitive("int")) {
		int obj = getTotal();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *totalKey = "total";
	json_object_set_member(pJsonObject, totalKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
VectorStoreObject_file_counts::getInProgress()
{
	return in_progress;
}

void
VectorStoreObject_file_counts::setInProgress(int  in_progress)
{
	this->in_progress = in_progress;
}

int
VectorStoreObject_file_counts::getCompleted()
{
	return completed;
}

void
VectorStoreObject_file_counts::setCompleted(int  completed)
{
	this->completed = completed;
}

int
VectorStoreObject_file_counts::getFailed()
{
	return failed;
}

void
VectorStoreObject_file_counts::setFailed(int  failed)
{
	this->failed = failed;
}

int
VectorStoreObject_file_counts::getCancelled()
{
	return cancelled;
}

void
VectorStoreObject_file_counts::setCancelled(int  cancelled)
{
	this->cancelled = cancelled;
}

int
VectorStoreObject_file_counts::getTotal()
{
	return total;
}

void
VectorStoreObject_file_counts::setTotal(int  total)
{
	this->total = total;
}


