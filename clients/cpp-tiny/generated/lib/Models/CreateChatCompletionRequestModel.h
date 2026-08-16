
/*
 * CreateChatCompletionRequest_model.h
 *
 * ID of the model to use. See the [model endpoint compatibility](/docs/models#model-endpoint-compatibility) table for details on which models work with the Chat API.
 */

#ifndef TINY_CPP_CLIENT_CreateChatCompletionRequest_model_H_
#define TINY_CPP_CLIENT_CreateChatCompletionRequest_model_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief ID of the model to use. See the [model endpoint compatibility](/docs/models#model-endpoint-compatibility) table for details on which models work with the Chat API.
 *
 *  \ingroup Models
 *
 */

class CreateChatCompletionRequest_model{
public:

    /*! \brief Constructor.
	 */
    CreateChatCompletionRequest_model();
    CreateChatCompletionRequest_model(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateChatCompletionRequest_model();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateChatCompletionRequest_model_H_ */
