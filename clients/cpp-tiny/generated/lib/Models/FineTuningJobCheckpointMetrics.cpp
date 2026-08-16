

#include "FineTuningJobCheckpoint_metrics.h"

using namespace Tiny;

FineTuningJobCheckpoint_metrics::FineTuningJobCheckpoint_metrics()
{
	step = float(0);
	train_loss = float(0);
	train_mean_token_accuracy = float(0);
	valid_loss = float(0);
	valid_mean_token_accuracy = float(0);
	full_valid_loss = float(0);
	full_valid_mean_token_accuracy = float(0);
}

FineTuningJobCheckpoint_metrics::FineTuningJobCheckpoint_metrics(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuningJobCheckpoint_metrics::~FineTuningJobCheckpoint_metrics()
{

}

void
FineTuningJobCheckpoint_metrics::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *stepKey = "step";

    if(object.has_key(stepKey))
    {
        bourne::json value = object[stepKey];



        jsonToValue(&step, value, "long");


    }

    const char *train_lossKey = "train_loss";

    if(object.has_key(train_lossKey))
    {
        bourne::json value = object[train_lossKey];



        jsonToValue(&train_loss, value, "long");


    }

    const char *train_mean_token_accuracyKey = "train_mean_token_accuracy";

    if(object.has_key(train_mean_token_accuracyKey))
    {
        bourne::json value = object[train_mean_token_accuracyKey];



        jsonToValue(&train_mean_token_accuracy, value, "long");


    }

    const char *valid_lossKey = "valid_loss";

    if(object.has_key(valid_lossKey))
    {
        bourne::json value = object[valid_lossKey];



        jsonToValue(&valid_loss, value, "long");


    }

    const char *valid_mean_token_accuracyKey = "valid_mean_token_accuracy";

    if(object.has_key(valid_mean_token_accuracyKey))
    {
        bourne::json value = object[valid_mean_token_accuracyKey];



        jsonToValue(&valid_mean_token_accuracy, value, "long");


    }

    const char *full_valid_lossKey = "full_valid_loss";

    if(object.has_key(full_valid_lossKey))
    {
        bourne::json value = object[full_valid_lossKey];



        jsonToValue(&full_valid_loss, value, "long");


    }

    const char *full_valid_mean_token_accuracyKey = "full_valid_mean_token_accuracy";

    if(object.has_key(full_valid_mean_token_accuracyKey))
    {
        bourne::json value = object[full_valid_mean_token_accuracyKey];



        jsonToValue(&full_valid_mean_token_accuracy, value, "long");


    }


}

bourne::json
FineTuningJobCheckpoint_metrics::toJson()
{
    bourne::json object = bourne::json::object();





    object["step"] = getStep();






    object["train_loss"] = getTrainLoss();






    object["train_mean_token_accuracy"] = getTrainMeanTokenAccuracy();






    object["valid_loss"] = getValidLoss();






    object["valid_mean_token_accuracy"] = getValidMeanTokenAccuracy();






    object["full_valid_loss"] = getFullValidLoss();






    object["full_valid_mean_token_accuracy"] = getFullValidMeanTokenAccuracy();



    return object;

}

long
FineTuningJobCheckpoint_metrics::getStep()
{
	return step;
}

void
FineTuningJobCheckpoint_metrics::setStep(long  step)
{
	this->step = step;
}

long
FineTuningJobCheckpoint_metrics::getTrainLoss()
{
	return train_loss;
}

void
FineTuningJobCheckpoint_metrics::setTrainLoss(long  train_loss)
{
	this->train_loss = train_loss;
}

long
FineTuningJobCheckpoint_metrics::getTrainMeanTokenAccuracy()
{
	return train_mean_token_accuracy;
}

void
FineTuningJobCheckpoint_metrics::setTrainMeanTokenAccuracy(long  train_mean_token_accuracy)
{
	this->train_mean_token_accuracy = train_mean_token_accuracy;
}

long
FineTuningJobCheckpoint_metrics::getValidLoss()
{
	return valid_loss;
}

void
FineTuningJobCheckpoint_metrics::setValidLoss(long  valid_loss)
{
	this->valid_loss = valid_loss;
}

long
FineTuningJobCheckpoint_metrics::getValidMeanTokenAccuracy()
{
	return valid_mean_token_accuracy;
}

void
FineTuningJobCheckpoint_metrics::setValidMeanTokenAccuracy(long  valid_mean_token_accuracy)
{
	this->valid_mean_token_accuracy = valid_mean_token_accuracy;
}

long
FineTuningJobCheckpoint_metrics::getFullValidLoss()
{
	return full_valid_loss;
}

void
FineTuningJobCheckpoint_metrics::setFullValidLoss(long  full_valid_loss)
{
	this->full_valid_loss = full_valid_loss;
}

long
FineTuningJobCheckpoint_metrics::getFullValidMeanTokenAccuracy()
{
	return full_valid_mean_token_accuracy;
}

void
FineTuningJobCheckpoint_metrics::setFullValidMeanTokenAccuracy(long  full_valid_mean_token_accuracy)
{
	this->full_valid_mean_token_accuracy = full_valid_mean_token_accuracy;
}



