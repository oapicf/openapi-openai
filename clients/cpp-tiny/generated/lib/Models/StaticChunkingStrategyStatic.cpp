

#include "Static_Chunking_Strategy_static.h"

using namespace Tiny;

Static_Chunking_Strategy_static::Static_Chunking_Strategy_static()
{
	max_chunk_size_tokens = int(0);
	chunk_overlap_tokens = int(0);
}

Static_Chunking_Strategy_static::Static_Chunking_Strategy_static(std::string jsonString)
{
	this->fromJson(jsonString);
}

Static_Chunking_Strategy_static::~Static_Chunking_Strategy_static()
{

}

void
Static_Chunking_Strategy_static::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *max_chunk_size_tokensKey = "max_chunk_size_tokens";

    if(object.has_key(max_chunk_size_tokensKey))
    {
        bourne::json value = object[max_chunk_size_tokensKey];



        jsonToValue(&max_chunk_size_tokens, value, "int");


    }

    const char *chunk_overlap_tokensKey = "chunk_overlap_tokens";

    if(object.has_key(chunk_overlap_tokensKey))
    {
        bourne::json value = object[chunk_overlap_tokensKey];



        jsonToValue(&chunk_overlap_tokens, value, "int");


    }


}

bourne::json
Static_Chunking_Strategy_static::toJson()
{
    bourne::json object = bourne::json::object();





    object["max_chunk_size_tokens"] = getMaxChunkSizeTokens();






    object["chunk_overlap_tokens"] = getChunkOverlapTokens();



    return object;

}

int
Static_Chunking_Strategy_static::getMaxChunkSizeTokens()
{
	return max_chunk_size_tokens;
}

void
Static_Chunking_Strategy_static::setMaxChunkSizeTokens(int  max_chunk_size_tokens)
{
	this->max_chunk_size_tokens = max_chunk_size_tokens;
}

int
Static_Chunking_Strategy_static::getChunkOverlapTokens()
{
	return chunk_overlap_tokens;
}

void
Static_Chunking_Strategy_static::setChunkOverlapTokens(int  chunk_overlap_tokens)
{
	this->chunk_overlap_tokens = chunk_overlap_tokens;
}



