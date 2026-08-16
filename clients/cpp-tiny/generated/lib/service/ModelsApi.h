#ifndef TINY_CPP_CLIENT_ModelsApi_H_
#define TINY_CPP_CLIENT_ModelsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "DeleteModelResponse.h"
#include "ListModelsResponse.h"
#include "Model.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ModelsApi : public Service {
public:
    ModelsApi() = default;

    virtual ~ModelsApi() = default;

    /**
    * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model..
    *
    * 
    * \param model The model to delete *Required*
    */
    Response<
                DeleteModelResponse
        >
    deleteModel(
            
            std::string model
            
    );
    /**
    * Lists the currently available models, and provides basic information about each one such as the owner and availability..
    *
    * 
    */
    Response<
                ListModelsResponse
        >
    listModels(
    );
    /**
    * Retrieves a model instance, providing basic information about the model such as the owner and permissioning..
    *
    * 
    * \param model The ID of the model to use for this request *Required*
    */
    Response<
                Model
        >
    retrieveModel(
            
            std::string model
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ModelsApi_H_ */