
/*
 * MessageStreamEvent_oneOf_2.h
 *
 * Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
 */

#ifndef TINY_CPP_CLIENT_MessageStreamEvent_oneOf_2_H_
#define TINY_CPP_CLIENT_MessageStreamEvent_oneOf_2_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageDeltaObject.h"

namespace Tiny {


/*! \brief Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
 *
 *  \ingroup Models
 *
 */

class MessageStreamEvent_oneOf_2{
public:

    /*! \brief Constructor.
	 */
    MessageStreamEvent_oneOf_2();
    MessageStreamEvent_oneOf_2(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageStreamEvent_oneOf_2();


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
	MessageDeltaObject getData();

	/*! \brief Set 
	 */
	void setData(MessageDeltaObject  data);


    private:
    std::string event{};
    MessageDeltaObject data;
};
}

#endif /* TINY_CPP_CLIENT_MessageStreamEvent_oneOf_2_H_ */
