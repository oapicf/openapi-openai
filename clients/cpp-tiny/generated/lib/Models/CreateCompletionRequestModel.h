
/*
 * CreateCompletionRequest_model.h
 *
 * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
 */

#ifndef TINY_CPP_CLIENT_CreateCompletionRequest_model_H_
#define TINY_CPP_CLIENT_CreateCompletionRequest_model_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
 *
 *  \ingroup Models
 *
 */

class CreateCompletionRequest_model{
public:

    /*! \brief Constructor.
	 */
    CreateCompletionRequest_model();
    CreateCompletionRequest_model(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateCompletionRequest_model();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateCompletionRequest_model_H_ */
