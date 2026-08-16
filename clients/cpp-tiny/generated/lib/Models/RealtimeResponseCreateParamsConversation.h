
/*
 * RealtimeResponseCreateParams_conversation.h
 *
 * Controls which conversation the response is added to. Currently supports &#x60;auto&#x60; and &#x60;none&#x60;, with &#x60;auto&#x60; as the default value. The &#x60;auto&#x60; value means that the contents of the response will be added to the default conversation. Set this to &#x60;none&#x60; to create an out-of-band response which  will not add items to default conversation. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeResponseCreateParams_conversation_H_
#define TINY_CPP_CLIENT_RealtimeResponseCreateParams_conversation_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Controls which conversation the response is added to. Currently supports `auto` and `none`, with `auto` as the default value. The `auto` value means that the contents of the response will be added to the default conversation. Set this to `none` to create an out-of-band response which  will not add items to default conversation. 
 *
 *  \ingroup Models
 *
 */

class RealtimeResponseCreateParams_conversation{
public:

    /*! \brief Constructor.
	 */
    RealtimeResponseCreateParams_conversation();
    RealtimeResponseCreateParams_conversation(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeResponseCreateParams_conversation();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_RealtimeResponseCreateParams_conversation_H_ */
