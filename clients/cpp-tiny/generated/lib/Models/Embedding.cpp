

#include "Embedding.h"

using namespace Tiny;

Embedding::Embedding()
{
	index = int(0);
	embedding = std::list<long>();
	object = std::string();
}

Embedding::Embedding(std::string jsonString)
{
	this->fromJson(jsonString);
}

Embedding::~Embedding()
{

}

void
Embedding::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "int");


    }

    const char *embeddingKey = "embedding";

    if(object.has_key(embeddingKey))
    {
        bourne::json value = object[embeddingKey];


        std::list<long> embedding_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            embedding_list.push_back(element);
        }
        embedding = embedding_list;


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }


}

bourne::json
Embedding::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();





    std::list<long> embedding_list = getEmbedding();
    bourne::json embedding_arr = bourne::json::array();

    for(auto& var : embedding_list)
    {
        embedding_arr.append(var);
    }
    object["embedding"] = embedding_arr;









    object["object"] = getObject();



    return object;

}

int
Embedding::getIndex()
{
	return index;
}

void
Embedding::setIndex(int  index)
{
	this->index = index;
}

std::list<long>
Embedding::getEmbedding()
{
	return embedding;
}

void
Embedding::setEmbedding(std::list <long> embedding)
{
	this->embedding = embedding;
}

std::string
Embedding::getObject()
{
	return object;
}

void
Embedding::setObject(std::string  object)
{
	this->object = object;
}



