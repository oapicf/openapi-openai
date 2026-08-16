

#include "FineTuneDPOMethod_hyperparameters_learning_rate_multiplier.h"

using namespace Tiny;

FineTuneDPOMethod_hyperparameters_learning_rate_multiplier::FineTuneDPOMethod_hyperparameters_learning_rate_multiplier()
{
}

FineTuneDPOMethod_hyperparameters_learning_rate_multiplier::FineTuneDPOMethod_hyperparameters_learning_rate_multiplier(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuneDPOMethod_hyperparameters_learning_rate_multiplier::~FineTuneDPOMethod_hyperparameters_learning_rate_multiplier()
{

}

void
FineTuneDPOMethod_hyperparameters_learning_rate_multiplier::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FineTuneDPOMethod_hyperparameters_learning_rate_multiplier::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



