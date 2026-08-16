

#include "CreateImageRequest_model.h"

using namespace Tiny;

CreateImageRequest_model::CreateImageRequest_model()
{
}

CreateImageRequest_model::CreateImageRequest_model(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateImageRequest_model::~CreateImageRequest_model()
{

}

void
CreateImageRequest_model::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateImageRequest_model::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



