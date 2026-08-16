

#include "PredictionContent_content.h"

using namespace Tiny;

PredictionContent_content::PredictionContent_content()
{
}

PredictionContent_content::PredictionContent_content(std::string jsonString)
{
	this->fromJson(jsonString);
}

PredictionContent_content::~PredictionContent_content()
{

}

void
PredictionContent_content::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PredictionContent_content::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



