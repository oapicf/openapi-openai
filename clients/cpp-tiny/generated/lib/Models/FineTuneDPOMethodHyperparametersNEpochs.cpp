

#include "FineTuneDPOMethod_hyperparameters_n_epochs.h"

using namespace Tiny;

FineTuneDPOMethod_hyperparameters_n_epochs::FineTuneDPOMethod_hyperparameters_n_epochs()
{
}

FineTuneDPOMethod_hyperparameters_n_epochs::FineTuneDPOMethod_hyperparameters_n_epochs(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuneDPOMethod_hyperparameters_n_epochs::~FineTuneDPOMethod_hyperparameters_n_epochs()
{

}

void
FineTuneDPOMethod_hyperparameters_n_epochs::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FineTuneDPOMethod_hyperparameters_n_epochs::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



