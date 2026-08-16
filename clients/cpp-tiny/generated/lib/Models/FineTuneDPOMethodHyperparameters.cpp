

#include "FineTuneDPOMethod_hyperparameters.h"

using namespace Tiny;

FineTuneDPOMethod_hyperparameters::FineTuneDPOMethod_hyperparameters()
{
	beta = FineTuneDPOMethod_hyperparameters_beta();
	batch_size = FineTuneDPOMethod_hyperparameters_batch_size();
	learning_rate_multiplier = FineTuneDPOMethod_hyperparameters_learning_rate_multiplier();
	n_epochs = FineTuneDPOMethod_hyperparameters_n_epochs();
}

FineTuneDPOMethod_hyperparameters::FineTuneDPOMethod_hyperparameters(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuneDPOMethod_hyperparameters::~FineTuneDPOMethod_hyperparameters()
{

}

void
FineTuneDPOMethod_hyperparameters::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *betaKey = "beta";

    if(object.has_key(betaKey))
    {
        bourne::json value = object[betaKey];




        FineTuneDPOMethod_hyperparameters_beta* obj = &beta;
		obj->fromJson(value.dump());

    }

    const char *batch_sizeKey = "batch_size";

    if(object.has_key(batch_sizeKey))
    {
        bourne::json value = object[batch_sizeKey];




        FineTuneDPOMethod_hyperparameters_batch_size* obj = &batch_size;
		obj->fromJson(value.dump());

    }

    const char *learning_rate_multiplierKey = "learning_rate_multiplier";

    if(object.has_key(learning_rate_multiplierKey))
    {
        bourne::json value = object[learning_rate_multiplierKey];




        FineTuneDPOMethod_hyperparameters_learning_rate_multiplier* obj = &learning_rate_multiplier;
		obj->fromJson(value.dump());

    }

    const char *n_epochsKey = "n_epochs";

    if(object.has_key(n_epochsKey))
    {
        bourne::json value = object[n_epochsKey];




        FineTuneDPOMethod_hyperparameters_n_epochs* obj = &n_epochs;
		obj->fromJson(value.dump());

    }


}

bourne::json
FineTuneDPOMethod_hyperparameters::toJson()
{
    bourne::json object = bourne::json::object();






	object["beta"] = getBeta().toJson();






	object["batch_size"] = getBatchSize().toJson();






	object["learning_rate_multiplier"] = getLearningRateMultiplier().toJson();






	object["n_epochs"] = getNEpochs().toJson();


    return object;

}

FineTuneDPOMethod_hyperparameters_beta
FineTuneDPOMethod_hyperparameters::getBeta()
{
	return beta;
}

void
FineTuneDPOMethod_hyperparameters::setBeta(FineTuneDPOMethod_hyperparameters_beta  beta)
{
	this->beta = beta;
}

FineTuneDPOMethod_hyperparameters_batch_size
FineTuneDPOMethod_hyperparameters::getBatchSize()
{
	return batch_size;
}

void
FineTuneDPOMethod_hyperparameters::setBatchSize(FineTuneDPOMethod_hyperparameters_batch_size  batch_size)
{
	this->batch_size = batch_size;
}

FineTuneDPOMethod_hyperparameters_learning_rate_multiplier
FineTuneDPOMethod_hyperparameters::getLearningRateMultiplier()
{
	return learning_rate_multiplier;
}

void
FineTuneDPOMethod_hyperparameters::setLearningRateMultiplier(FineTuneDPOMethod_hyperparameters_learning_rate_multiplier  learning_rate_multiplier)
{
	this->learning_rate_multiplier = learning_rate_multiplier;
}

FineTuneDPOMethod_hyperparameters_n_epochs
FineTuneDPOMethod_hyperparameters::getNEpochs()
{
	return n_epochs;
}

void
FineTuneDPOMethod_hyperparameters::setNEpochs(FineTuneDPOMethod_hyperparameters_n_epochs  n_epochs)
{
	this->n_epochs = n_epochs;
}



