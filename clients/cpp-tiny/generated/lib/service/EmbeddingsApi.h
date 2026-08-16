#ifndef TINY_CPP_CLIENT_EmbeddingsApi_H_
#define TINY_CPP_CLIENT_EmbeddingsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CreateEmbeddingRequest.h"
#include "CreateEmbeddingResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class EmbeddingsApi : public Service {
public:
    EmbeddingsApi() = default;

    virtual ~EmbeddingsApi() = default;

    /**
    * Creates an embedding vector representing the input text..
    *
    * 
    * \param createEmbeddingRequest  *Required*
    */
    Response<
                CreateEmbeddingResponse
        >
    createEmbedding(
            
            CreateEmbeddingRequest createEmbeddingRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_EmbeddingsApi_H_ */