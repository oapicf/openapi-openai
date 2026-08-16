
/*
 * CreateCompletionRequest_stop.h
 *
 * Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 
 */

#ifndef TINY_CPP_CLIENT_CreateCompletionRequest_stop_H_
#define TINY_CPP_CLIENT_CreateCompletionRequest_stop_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 
 *
 *  \ingroup Models
 *
 */

class CreateCompletionRequest_stop{
public:

    /*! \brief Constructor.
	 */
    CreateCompletionRequest_stop();
    CreateCompletionRequest_stop(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateCompletionRequest_stop();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateCompletionRequest_stop_H_ */
