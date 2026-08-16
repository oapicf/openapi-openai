
/*
 * MessageObject_incomplete_details.h
 *
 * On an incomplete message, details about why the message is incomplete.
 */

#ifndef TINY_CPP_CLIENT_MessageObject_incomplete_details_H_
#define TINY_CPP_CLIENT_MessageObject_incomplete_details_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief On an incomplete message, details about why the message is incomplete.
 *
 *  \ingroup Models
 *
 */

class MessageObject_incomplete_details{
public:

    /*! \brief Constructor.
	 */
    MessageObject_incomplete_details();
    MessageObject_incomplete_details(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageObject_incomplete_details();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The reason the message is incomplete.
	 */
	std::string getReason();

	/*! \brief Set The reason the message is incomplete.
	 */
	void setReason(std::string  reason);


    private:
    std::string reason{};
};
}

#endif /* TINY_CPP_CLIENT_MessageObject_incomplete_details_H_ */
