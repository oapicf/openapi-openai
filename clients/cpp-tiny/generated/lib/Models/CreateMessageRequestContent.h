
/*
 * CreateMessageRequest_content.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateMessageRequest_content_H_
#define TINY_CPP_CLIENT_CreateMessageRequest_content_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Array_of_content_parts_inner.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateMessageRequest_content{
public:

    /*! \brief Constructor.
	 */
    CreateMessageRequest_content();
    CreateMessageRequest_content(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateMessageRequest_content();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateMessageRequest_content_H_ */
