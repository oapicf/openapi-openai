
/*
 * CreateChatCompletionRequest_stop.h
 *
 * Up to 4 sequences where the API will stop generating further tokens. 
 */

#ifndef TINY_CPP_CLIENT_CreateChatCompletionRequest_stop_H_
#define TINY_CPP_CLIENT_CreateChatCompletionRequest_stop_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Up to 4 sequences where the API will stop generating further tokens. 
 *
 *  \ingroup Models
 *
 */

class CreateChatCompletionRequest_stop{
public:

    /*! \brief Constructor.
	 */
    CreateChatCompletionRequest_stop();
    CreateChatCompletionRequest_stop(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateChatCompletionRequest_stop();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateChatCompletionRequest_stop_H_ */
