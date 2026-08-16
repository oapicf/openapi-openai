
/*
 * CreateModerationRequest_input.h
 *
 * Input (or inputs) to classify. Can be a single string, an array of strings, or an array of multi-modal input objects similar to other models. 
 */

#ifndef TINY_CPP_CLIENT_CreateModerationRequest_input_H_
#define TINY_CPP_CLIENT_CreateModerationRequest_input_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateModerationRequest_input_oneOf_inner.h"

namespace Tiny {


/*! \brief Input (or inputs) to classify. Can be a single string, an array of strings, or an array of multi-modal input objects similar to other models. 
 *
 *  \ingroup Models
 *
 */

class CreateModerationRequest_input{
public:

    /*! \brief Constructor.
	 */
    CreateModerationRequest_input();
    CreateModerationRequest_input(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateModerationRequest_input();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateModerationRequest_input_H_ */
