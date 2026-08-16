

#include "FineTuningJob_hyperparameters.h"

using namespace Tiny;

FineTuningJob_hyperparameters::FineTuningJob_hyperparameters()
{
	batch_size = CreateFineTuningJobRequest_hyperparameters_batch_size();
	learning_rate_multiplier = CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier();
	n_epochs = CreateFineTuningJobRequest_hyperparameters_n_epochs();
}

FineTuningJob_hyperparameters::FineTuningJob_hyperparameters(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuningJob_hyperparameters::~FineTuningJob_hyperparameters()
{

}

void
FineTuningJob_hyperparameters::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *batch_sizeKey = "batch_size";

    if(object.has_key(batch_sizeKey))
    {
        bourne::json value = object[batch_sizeKey];




        CreateFineTuningJobRequest_hyperparameters_batch_size* obj = &batch_size;
		obj->fromJson(value.dump());

    }

    const char *learning_rate_multiplierKey = "learning_rate_multiplier";

    if(object.has_key(learning_rate_multiplierKey))
    {
        bourne::json value = object[learning_rate_multiplierKey];




        CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier* obj = &learning_rate_multiplier;
		obj->fromJson(value.dump());

    }

    const char *n_epochsKey = "n_epochs";

    if(object.has_key(n_epochsKey))
    {
        bourne::json value = object[n_epochsKey];




        CreateFineTuningJobRequest_hyperparameters_n_epochs* obj = &n_epochs;
		obj->fromJson(value.dump());

    }


}

bourne::json
FineTuningJob_hyperparameters::toJson()
{
    bourne::json object = bourne::json::object();






	object["batch_size"] = getBatchSize().toJson();






	object["learning_rate_multiplier"] = getLearningRateMultiplier().toJson();






	object["n_epochs"] = getNEpochs().toJson();


    return object;

}

CreateFineTuningJobRequest_hyperparameters_batch_size
FineTuningJob_hyperparameters::getBatchSize()
{
	return batch_size;
}

void
FineTuningJob_hyperparameters::setBatchSize(CreateFineTuningJobRequest_hyperparameters_batch_size  batch_size)
{
	this->batch_size = batch_size;
}

CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier
FineTuningJob_hyperparameters::getLearningRateMultiplier()
{
	return learning_rate_multiplier;
}

void
FineTuningJob_hyperparameters::setLearningRateMultiplier(CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier  learning_rate_multiplier)
{
	this->learning_rate_multiplier = learning_rate_multiplier;
}

CreateFineTuningJobRequest_hyperparameters_n_epochs
FineTuningJob_hyperparameters::getNEpochs()
{
	return n_epochs;
}

void
FineTuningJob_hyperparameters::setNEpochs(CreateFineTuningJobRequest_hyperparameters_n_epochs  n_epochs)
{
	this->n_epochs = n_epochs;
}



