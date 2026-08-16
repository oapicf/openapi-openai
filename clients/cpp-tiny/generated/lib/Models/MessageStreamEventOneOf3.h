
/*
 * MessageStreamEvent_oneOf_3.h
 *
 * Occurs when a [message](/docs/api-reference/messages/object) is completed.
 */

#ifndef TINY_CPP_CLIENT_MessageStreamEvent_oneOf_3_H_
#define TINY_CPP_CLIENT_MessageStreamEvent_oneOf_3_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageObject.h"

namespace Tiny {


/*! \brief Occurs when a [message](/docs/api-reference/messages/object) is completed.
 *
 *  \ingroup Models
 *
 */

class MessageStreamEvent_oneOf_3{
public:

    /*! \brief Constructor.
	 */
    MessageStreamEvent_oneOf_3();
    MessageStreamEvent_oneOf_3(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageStreamEvent_oneOf_3();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getEvent();

	/*! \brief Set 
	 */
	void setEvent(std::string  event);
	/*! \brief Get 
	 */
	MessageObject getData();

	/*! \brief Set 
	 */
	void setData(MessageObject  data);


    private:
    std::string event{};
    MessageObject data;
};
}

#endif /* TINY_CPP_CLIENT_MessageStreamEvent_oneOf_3_H_ */
