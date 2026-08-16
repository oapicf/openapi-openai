

#include "CreateEmbeddingRequest_input.h"

using namespace Tiny;

CreateEmbeddingRequest_input::CreateEmbeddingRequest_input()
{
}

CreateEmbeddingRequest_input::CreateEmbeddingRequest_input(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateEmbeddingRequest_input::~CreateEmbeddingRequest_input()
{

}

void
CreateEmbeddingRequest_input::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateEmbeddingRequest_input::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



