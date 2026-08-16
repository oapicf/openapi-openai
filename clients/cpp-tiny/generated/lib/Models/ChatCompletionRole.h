
/*
 * ChatCompletionRole.h
 *
 * The role of the author of a message
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionRole_H_
#define TINY_CPP_CLIENT_ChatCompletionRole_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The role of the author of a message
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRole{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionRole();
    ChatCompletionRole(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionRole();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionRole_H_ */
