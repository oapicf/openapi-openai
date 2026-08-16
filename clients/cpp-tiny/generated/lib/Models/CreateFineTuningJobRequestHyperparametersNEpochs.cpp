

#include "CreateFineTuningJobRequest_hyperparameters_n_epochs.h"

using namespace Tiny;

CreateFineTuningJobRequest_hyperparameters_n_epochs::CreateFineTuningJobRequest_hyperparameters_n_epochs()
{
}

CreateFineTuningJobRequest_hyperparameters_n_epochs::CreateFineTuningJobRequest_hyperparameters_n_epochs(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateFineTuningJobRequest_hyperparameters_n_epochs::~CreateFineTuningJobRequest_hyperparameters_n_epochs()
{

}

void
CreateFineTuningJobRequest_hyperparameters_n_epochs::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateFineTuningJobRequest_hyperparameters_n_epochs::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



