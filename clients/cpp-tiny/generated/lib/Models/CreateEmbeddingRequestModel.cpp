

#include "CreateEmbeddingRequest_model.h"

using namespace Tiny;

CreateEmbeddingRequest_model::CreateEmbeddingRequest_model()
{
}

CreateEmbeddingRequest_model::CreateEmbeddingRequest_model(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateEmbeddingRequest_model::~CreateEmbeddingRequest_model()
{

}

void
CreateEmbeddingRequest_model::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateEmbeddingRequest_model::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



