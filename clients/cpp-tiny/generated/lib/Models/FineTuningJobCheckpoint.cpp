

#include "FineTuningJobCheckpoint.h"

using namespace Tiny;

FineTuningJobCheckpoint::FineTuningJobCheckpoint()
{
	id = std::string();
	created_at = int(0);
	fine_tuned_model_checkpoint = std::string();
	step_number = int(0);
	metrics = FineTuningJobCheckpoint_metrics();
	fine_tuning_job_id = std::string();
	object = std::string();
}

FineTuningJobCheckpoint::FineTuningJobCheckpoint(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuningJobCheckpoint::~FineTuningJobCheckpoint()
{

}

void
FineTuningJobCheckpoint::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "int");


    }

    const char *fine_tuned_model_checkpointKey = "fine_tuned_model_checkpoint";

    if(object.has_key(fine_tuned_model_checkpointKey))
    {
        bourne::json value = object[fine_tuned_model_checkpointKey];



        jsonToValue(&fine_tuned_model_checkpoint, value, "std::string");


    }

    const char *step_numberKey = "step_number";

    if(object.has_key(step_numberKey))
    {
        bourne::json value = object[step_numberKey];



        jsonToValue(&step_number, value, "int");


    }

    const char *metricsKey = "metrics";

    if(object.has_key(metricsKey))
    {
        bourne::json value = object[metricsKey];




        FineTuningJobCheckpoint_metrics* obj = &metrics;
		obj->fromJson(value.dump());

    }

    const char *fine_tuning_job_idKey = "fine_tuning_job_id";

    if(object.has_key(fine_tuning_job_idKey))
    {
        bourne::json value = object[fine_tuning_job_idKey];



        jsonToValue(&fine_tuning_job_id, value, "std::string");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }


}

bourne::json
FineTuningJobCheckpoint::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["created_at"] = getCreatedAt();






    object["fine_tuned_model_checkpoint"] = getFineTunedModelCheckpoint();






    object["step_number"] = getStepNumber();







	object["metrics"] = getMetrics().toJson();





    object["fine_tuning_job_id"] = getFineTuningJobId();






    object["object"] = getObject();



    return object;

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



