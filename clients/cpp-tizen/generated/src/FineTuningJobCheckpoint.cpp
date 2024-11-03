#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTuningJobCheckpoint.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTuningJobCheckpoint::FineTuningJobCheckpoint()
{
	//__init();
}

FineTuningJobCheckpoint::~FineTuningJobCheckpoint()
{
	//__cleanup();
}

void
FineTuningJobCheckpoint::__init()
{
	//id = std::string();
	//created_at = int(0);
	//fine_tuned_model_checkpoint = std::string();
	//step_number = int(0);
	//metrics = new FineTuningJobCheckpoint_metrics();
	//fine_tuning_job_id = std::string();
	//object = std::string();
}

void
FineTuningJobCheckpoint::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(fine_tuned_model_checkpoint != NULL) {
	//
	//delete fine_tuned_model_checkpoint;
	//fine_tuned_model_checkpoint = NULL;
	//}
	//if(step_number != NULL) {
	//
	//delete step_number;
	//step_number = NULL;
	//}
	//if(metrics != NULL) {
	//
	//delete metrics;
	//metrics = NULL;
	//}
	//if(fine_tuning_job_id != NULL) {
	//
	//delete fine_tuning_job_id;
	//fine_tuning_job_id = NULL;
	//}
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//
}

void
FineTuningJobCheckpoint::fromJson(char* jsonStr)
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
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *fine_tuned_model_checkpointKey = "fine_tuned_model_checkpoint";
	node = json_object_get_member(pJsonObject, fine_tuned_model_checkpointKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&fine_tuned_model_checkpoint, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *step_numberKey = "step_number";
	node = json_object_get_member(pJsonObject, step_numberKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&step_number, node, "int", "");
		} else {
			
		}
	}
	const gchar *metricsKey = "metrics";
	node = json_object_get_member(pJsonObject, metricsKey);
	if (node !=NULL) {
	

		if (isprimitive("FineTuningJobCheckpoint_metrics")) {
			jsonToValue(&metrics, node, "FineTuningJobCheckpoint_metrics", "FineTuningJobCheckpoint_metrics");
		} else {
			
			FineTuningJobCheckpoint_metrics* obj = static_cast<FineTuningJobCheckpoint_metrics*> (&metrics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *fine_tuning_job_idKey = "fine_tuning_job_id";
	node = json_object_get_member(pJsonObject, fine_tuning_job_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&fine_tuning_job_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
}

FineTuningJobCheckpoint::FineTuningJobCheckpoint(char* json)
{
	this->fromJson(json);
}

char*
FineTuningJobCheckpoint::toJson()
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
	if (isprimitive("int")) {
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFineTunedModelCheckpoint();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fine_tuned_model_checkpointKey = "fine_tuned_model_checkpoint";
	json_object_set_member(pJsonObject, fine_tuned_model_checkpointKey, node);
	if (isprimitive("int")) {
		int obj = getStepNumber();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *step_numberKey = "step_number";
	json_object_set_member(pJsonObject, step_numberKey, node);
	if (isprimitive("FineTuningJobCheckpoint_metrics")) {
		FineTuningJobCheckpoint_metrics obj = getMetrics();
		node = converttoJson(&obj, "FineTuningJobCheckpoint_metrics", "");
	}
	else {
		
		FineTuningJobCheckpoint_metrics obj = static_cast<FineTuningJobCheckpoint_metrics> (getMetrics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *metricsKey = "metrics";
	json_object_set_member(pJsonObject, metricsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFineTuningJobId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fine_tuning_job_idKey = "fine_tuning_job_id";
	json_object_set_member(pJsonObject, fine_tuning_job_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
FineTuningJobCheckpoint::getId()
{
	return id;
}

void
FineTuningJobCheckpoint::setId(std::string  id)
{
	this->id = id;
}

int
FineTuningJobCheckpoint::getCreatedAt()
{
	return created_at;
}

void
FineTuningJobCheckpoint::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
FineTuningJobCheckpoint::getFineTunedModelCheckpoint()
{
	return fine_tuned_model_checkpoint;
}

void
FineTuningJobCheckpoint::setFineTunedModelCheckpoint(std::string  fine_tuned_model_checkpoint)
{
	this->fine_tuned_model_checkpoint = fine_tuned_model_checkpoint;
}

int
FineTuningJobCheckpoint::getStepNumber()
{
	return step_number;
}

void
FineTuningJobCheckpoint::setStepNumber(int  step_number)
{
	this->step_number = step_number;
}

FineTuningJobCheckpoint_metrics
FineTuningJobCheckpoint::getMetrics()
{
	return metrics;
}

void
FineTuningJobCheckpoint::setMetrics(FineTuningJobCheckpoint_metrics  metrics)
{
	this->metrics = metrics;
}

std::string
FineTuningJobCheckpoint::getFineTuningJobId()
{
	return fine_tuning_job_id;
}

void
FineTuningJobCheckpoint::setFineTuningJobId(std::string  fine_tuning_job_id)
{
	this->fine_tuning_job_id = fine_tuning_job_id;
}

std::string
FineTuningJobCheckpoint::getObject()
{
	return object;
}

void
FineTuningJobCheckpoint::setObject(std::string  object)
{
	this->object = object;
}


